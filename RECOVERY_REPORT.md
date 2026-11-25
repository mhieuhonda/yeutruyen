# Báo cáo khôi phục mã nguồn — Yêu Truyện 1.0.18

Ngày thực hiện: 25/11/2026 · Kết quả: repo này · Mức hoàn thành: host 100%, Dart structure 100%, Dart logic 0% (giới hạn cứng AOT — chi tiết §6).

## 1. Chuỗi bằng chứng

1. XAPK tải từ MediaFire (link do chủ sở hữu cung cấp), tài liệu định danh:
   `originals/yeu_truyen_1.0.18.xapk`
   - size 41,476,789 bytes · md5 `c7a4d9e9955bed25d85f2c59ff42ffa0` · sha256 `6a3214ca8fd04ddd51aaf93649d14fe3a9c898bf5977c1c4b2998bb59baf3794`
2. XAPK tự mô tả: `manifest.json` → package `vn.yeutruyen.app`, 1.0.18 (30) — khớp repo
   GitHub đích `mhieuhonda/yeutruyen` (trống, được xác thực bằng PAT của chủ sở hữu).
3. Chữ ký số: Google Play App Signing (chứng chỉ Google, hiệu lực 2026-07 → 2056-07),
   meta `com.android.stamp.source = play.google.com`, PairIP license — nhất quán với
   ứng dụng từng phát hành qua Google Play.

## 2. Pipeline khôi phục (tái lập được bằng tools/recovery_scripts/)

| # | Bước | Công cụ | Kết quả |
|---|---|---|---|
| 1 | Tải XAPK | curl (scrape link MediaFire, UA trình duyệt) | 39.56 MB nguyên vẹn |
| 2 | Bóc tách XAPK | `extract_xapk.py` (zipfile, chống path-traversal) | base.apk + 4 splits + manifest.json |
| 3 | Dịch ngược Java/Kotlin | **jadx 1.5.7** (Java 21) | 14,516 file .java; 129 lỗi rải rác trong coroutine internals của thư viện (okio/kotlinx) — không ảnh hưởng mã app |
| 4 | Decode resources/smali/assets | **apktool 3.0.3** | 23,762 smali (3 dex), 254 res, AndroidManifest.xml decoded, assets |
| 5 | Phân tích Dart AOT | `strings` + custom phân tích `libapp.so` | cây `lib/` 55 file, class, endpoints, ad IDs, deps |
| 6 | Parse chữ ký v2/v3 | `parse_apk_signature.py` (+cryptography) | chứng chỉ + fingerprint |
| 7 | Decode 3 splits | apktool | values-en/zh, drawable-mdpi |
| 8 | Tái cấu trúc project | `build_project.py` | cây repo này, 39,230 file |

## 3. Phát hiện chính

- Ứng dụng **Flutter** (không phải native Android thuần): logic chính nằm trong
  `libapp.so` (Dart AOT 8.2 MB, Dart SDK 3.12.1 stable build 2026-05-26).
- Backend REST tự viết tại `https://yeutruyen.vn/api/v1` (không dùng WP REST mặc dù
  web chạy WordPress — assets `wp-content/themes/yeutruyen.vn` chỉ là bộ icon/logo
  dùng chung thương hiệu).
- Kiến trúc code: `screens/` (23) + `services/` (19) + `models/` (8) + `widgets/` (3) —
  mô hình service-layer rõ ràng, chi tiết trong `DART_STRUCTURE.md`.
- Monetization: AdMob (2 unit) + Play Billing 8.0.0 (gói VIP/subscription) + xu nội
  app (unlock) + VietQR nạp tiền trực tiếp (VCB).
- Auth: Google + Apple (sign_in_with_apple, app_links).
- Local: sqflite (DB), shared_preferences, flutter_secure_storage (token).

## 4. Chữ ký số

| Trường | Giá trị |
|---|---|
| Scheme | v2, v3, v4 (đầy đủ) |
| Subject / Issuer | CN=Android,OU=Android,O=Google Inc.,L=Mountain View,ST=California,C=US |
| Serial | 0xf862f1cbd0c9ec13550be8b69251eb11e40e8a96 |
| SHA-256 | bb:45:a1:69:…:f8:3c:22:58 (đầy đủ trong APP_INFO.md) |
| Kết luận | Ký bởi Google Play App Signing → bản XAPK rút từ khoá Google Play |

File chứng thư: `originals/signing_certificate.der`.

## 5. Số liệu khối lượng

| Thành phần | Số file |
|---|---|
| File tổng repo | 39,230 |
| Java dịch ngược (jadx) | 14,516 |
| Smali (apktool) | 23,762 |
| Resource decode | 254 |
| Dart skeleton lib/ | 55 |
| Asset app | 11 |

## 6. Giới hạn kỹ thuật & kế hoạch bù đắp

1. **Logic Dart không khôi phục được từ AOT** — đây là giới hạn nền tảng (AOT = machine
   code đã tối ưu, không có IR đủ để tái sinh Dart). Không tool nào (jadx/blutter/…)
   làm được; blutter chỉ trích cấu trúc class/pool và **chỉ hỗ trợ arm64**.
2. **XAPK này chỉ có armeabi-v7a.** Nếu tìm được bản build arm64 (APK/AAB từ thiết bị
   khác, Artifact của CI cũ, bản phân phối khác), blutter có thể trích thêm class
   pool/assembly để đối chiếu logic từng hàm.
3. Nguồn tốt hơn nên săn lọc theo thứ tự ưu tiên:
   a. **Máy dev cá nhân** của thành viên nhóm (Gradle cache, `~/.pub-cache`, thư mục
      project cũ, Recycle Bin, ổ dự phòng).
   b. **CI/CD artifact** chưa bị xoá (GitHub Actions/Fastlane của chính repo này, GitLab,
      Bitrise, Codemagic… kể cả expired artifacts của 90 ngày gần nhất).
   c. **Google Drive/Photos của dev** (snapshot, file zip gửi QA).
   d. Play Console giữ **AAB** (không phải source) nhưng giúp tái sinh APK phân phối.
   e. `flutter build` cache cũ trên máy cứu hộ: `build/app/intermediates/flutter/release/…`
      vẫn còn `.dill`/kernel — nếu có, đó là gần source nhất có thể có.
4. Bảo mật (quan trọng): PAT đã dùng để push repo — **revoke ngay**. Máy chủ bị mã hoá
   phải được dựng lại sạch trước khi nối lại CI/CD; đổi mọi secret gắn với
   `yeutruyen.vn` và khoá deploy.

## 7. Tái lập quy trình

```bash
python3 tools/recovery_scripts/extract_xapk.py          # bóc XAPK
python3 tools/recovery_scripts/parse_apk_signature.py   # chữ ký v2/v3
python3 tools/recovery_scripts/build_project.py         # tái tạo cấu trúc repo
python3 tools/recovery_scripts/write_docs.py            # tái sinh tài liệu
# jadx 1.5.7:  jadx -d out vn.yeutruyen.app.apk
# apktool 3:   java -jar apktool.jar d vn.yeutruyen.app.apk -o out
```

Yêu cầu: Java 21, Python 3.11+, jadx 1.5.7, apktool 3.0.3.
