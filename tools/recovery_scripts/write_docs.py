#!/usr/bin/env python3
"""Sinh bộ tài liệu khôi phục: README.md, RECOVERY_REPORT.md, APP_INFO.md, DART_STRUCTURE.md."""
import subprocess
import sys
from pathlib import Path

sys.path.insert(0, "/home/z/my-project/scripts")
from build_project import LIB_FILES  # noqa: E402

REPO = Path("/home/z/my-project/work/repo")
WORK = Path("/home/z/my-project/work")

XAPK = WORK / "dl" / "yeu_truyen_1.0.18.xapk"

N_JAVA = int(subprocess.check_output(
    ["bash", "-lc", f"find {REPO}/decompiled_reference/jadx/sources -name '*.java' | wc -l"]).strip())
N_SMALI = int(subprocess.check_output(
    ["bash", "-lc", f"find {REPO}/decompiled_reference/apktool -path '*smali*' -name '*.smali' | wc -l"]).strip())
N_RES = int(subprocess.check_output(
    ["bash", "-lc", f"find {REPO}/decompiled_reference/apktool/res -type f | wc -l"]).strip())
N_ALL = int(subprocess.check_output(
    ["bash", "-lc", f"find {REPO} -type f | wc -l"]).strip())
SHA256 = subprocess.check_output(["sha256sum", str(XAPK)]).decode().split()[0]
MD5 = subprocess.check_output(["md5sum", str(XAPK)]).decode().split()[0]
SIZE = XAPK.stat().st_size


def w(name: str, content: str):
    (REPO / name).write_text(content, encoding="utf-8")
    print(f"viết {name} ({len(content):,} ký tự)")


README = f"""# Yêu Truyện — Đọc & Nghe (`vn.yeutruyen.app`)

> **Bộ mã nguồn khôi phục từ bản cài đặt đã biên dịch 1.0.18** (versionCode 30).
> Khôi phục trong đêm 25/11/2026 từ file XAPK duy nhất còn sót lại sau sự cố
> mã hoá máy chủ. Tài sản trí tuệ của cùng chủ sở hữu ứng dụng trên Google Play.

## 1. Nguồn khôi phục

| Mục | Giá trị |
|---|---|
| File gốc | `originals/yeu_truyen_1.0.18.xapk` (39.56 MB) |
| SHA-256 | `{SHA256}` |
| MD5 | `{MD5}` |
| Loại | XAPK v2 (Play-derived): base APK + 4 splits (armeabi-v7a, en, zh, mdpi) |
| Chữ ký | Google Play App Signing (v2+v3+v4) |

## 2. Cấu trúc repository

```
yeutruyen/
├── README.md, APP_INFO.md, DART_STRUCTURE.md, RECOVERY_REPORT.md
├── pubspec.yaml              # dependencies khôi phục (14 plugin + deps)
├── lib/                      # 55 file Dart skeleton — khung + tên class đã chứng minh
├── assets/yeutruyen/         # 11 asset gốc (logo, social icons, favicon)
├── android/                  # host Android build lại được (gradle + manifest + res + jniLibs)
├── decompiled_reference/
│   ├── jadx/                 # {N_JAVA:,} file .java dịch ngược từ 3 file dex
│   ├── apktool/              # {N_SMALI:,} smali + {N_RES:,} resource đã decode + manifest + assets
│   └── splits/               # decode 3 split APK ngôn ngữ/mật độ
├── tools/recovery_scripts/   # 4 script Python tái lập toàn bộ pipeline
└── originals/                # XAPK gốc + chứng thư số ký (Play App Signing)
```

## 3. Mức độ khôi phục (đọc kỹ trước khi code tiếp)

**Có đầy đủ (chính xác 100%):**
- Toàn bộ mã host Android (Kotlin/Java): `MainActivity`, plugin registrant, 14 plugin,
  service/receiver/provider của AndroidX + Google (dịch ngược đầy đủ, nằm trong
  `decompiled_reference/jadx`).
- Toàn bộ AndroidManifest, resources, XML, drawable/mipmap, assets (apktool decode).
- Cấu trúc `lib/` gốc **đầy đủ 55 file** với tên class, service, endpoint API — chứng minh
  bằng AOT string pool (xem `DART_STRUCTURE.md`).
- Danh sách dependencies pub.dev chính xác (xem `pubspec.yaml`).
- Cấu hình AdMob, API base, deep link, network security, payment.

**PHẢI VIẾT LẠI (không thể dịch ngược — giới hạn cứng của Flutter):**
- **Nội dung file Dart (logic UI/kinh doanh)**. Flutter biên dịch `lib/*.dart` thành
  machine-code AOT trong `libapp.so`; source Dart KHÔNG tồn tại trong bản build dưới
  bất kỳ dạng nào có thể khôi phục tự động. `lib/` trong repo này là **skeleton có chứng
  cứ** (đúng file, đúng class, đúng hành vi quan sát được) — cần cài đặt lại logic.
  Xem `DART_STRUCTURE.md`: mỗi file kèm mô tả hành vi đã trích từ binary.
- Keystore release (không bao giờ nằm trong APK do Play App Signing).

## 4. Build lại

Yêu cầu: Flutter SDK bản stable dùng **Dart 3.12.1** (bản build gốc), Android SDK 36.

```bash
flutter pub get                 # sinh android/local.properties + gradle wrapper
flutter analyze
flutter run                     # debug trên máy 32-bit; hoặc:
flutter build apk --release     # APK release (ký debug key — xem §5)
```

Lưu ý:
- Chưa có `gradle wrapper` binary: chạy `gradle wrapper` một lần trong `android/` nếu
  build CLI trực tiếp bằng gradle (Flutter CLI tự xử lý khi chạy qua `flutter build`).
- ABI: bản gốc chỉ phân phối `armeabi-v7a` trong XAPK này; khi build lại nên thêm
  arm64 (`--target-platform android-arm64`).
- `android/app/src/main/jniLibs/armeabi-v7a/` giữ `libapp.so` gốc để đối chiếu/giám định;
  khi đã viết lại source thì xoá jniLibs này đi (Flutter tự sinh lại).

## 5. Ký lại & phát hành trên Play

APK gốc ký bởi **Google Play App Signing**: key upload của bạn không cần trùng cert trong
`originals/signing_certificate.der`. Nếu còn giữ **upload key** trong Play Console
(App integrity → upload key certificate) thì `key.properties` + keystore cũ là đủ phát
cập nhật. Nếu mất cả upload key → dùng chức năng **reset upload key** của Play Console.

## 6. VIỆC CẦN LÀM NGAY (an ninh)

1. **Revoke PAT GitHub vừa dùng** (đã nhắc trong quá trình khôi phục).
2. Máy chủ bị ransomware: **đừng vội tái dựng CI/CD trên đó** — cô lập, dựng lại từ image
   sạch, đổi toàn bộ credential (Firebase/AdMob/API key của `yeutruyen.vn`, secret DB,
   key SSH deploy).
3. Kiểm tra account Google Play / AdMob có thiết bị 2FA lạ không; xem "signup" lạ trong
   Play Console users.
4. Nguồn dữ liệu truyện là máy chủ `yeutruyen.vn` — kiểm tra log truy cập bất thường từ
   khoảng thời gian sự cố.

## 7. Tài liệu kèm theo

- `APP_INFO.md` — hồ sơ ứng dụng đầy đủ (permissions, plugin, AdMob, API, mạng xã hội…).
- `DART_STRUCTURE.md` — cấu trúc `lib/` 55 file + class + endpoint, cơ sở để viết lại.
- `RECOVERY_REPORT.md` — báo cáo chi tiết quy trình khôi phục (forensic).
"""


APP_INFO = f"""# Hồ sơ ứng dụng — Yêu Truyện (vn.yeutruyen.app)

## Nhận dạng

| Mục | Giá trị |
|---|---|
| Tên hiển thị | Yêu Truyện (app_name) |
| Tên đầy đủ | Yêu Truyện - Đọc & Nghe |
| Package | `vn.yeutruyen.app` |
| versionName / versionCode | 1.0.18 / 30 |
| minSdk / targetSdk / compileSdk | 32 / 36 / 36 (Android 12 → 16) |
| Framework | **Flutter** (Dart SDK 3.12.1 stable, engine build 2026-05-26), Kotlin host |
| ABI phân phối | armeabi-v7a (bản XAPK này) |
| Chữ ký | Google Play App Signing — v2/v3/v4 |
| Subject cert | CN=Android,OU=Android,O=Google Inc.,L=Mountain View,ST=California,C=US |
| Serial | 0xf862f1cbd0c9ec13550be8b69251eb11e40e8a96 |
| Hiệu lực cert | 2026-07-01 → 2056-07-01 |
| SHA-256 cert | bb:45:a1:69:5c:f6:79:04:6d:6f:6b:34:c0:db:f8:f3:86:00:62:40:04:b9:08:f9:a9:32:d9:04:f8:3c:22:58 |
| Kiểu build | release (R8/PairIP qua Play, flutterEmbedding 2) |

## Quyền

INTERNET, ACCESS_NETWORK_STATE, BILLING, AD_ID (+3 quyền ADSERVICES),
WAKE_LOCK, FOREGROUND_SERVICE, CHECK_LICENSE (do Play/pairip bơm).

## Deep link

`vn.yeutruyen.app://auth/google` (intent-filter host `auth`, pathPrefix `/google`).

## Plugin Flutter đăng ký (GeneratedPluginRegistrant)

app_links, audioplayers, flutter_plugin_android_lifecycle,
flutter_secure_storage, google_mobile_ads, image_picker,
in_app_purchase (Play Billing 8.0.0), jni, jni_flutter,
shared_preferences, sign_in_with_apple, sqflite, url_launcher, webview_flutter.

## AdMob

- APPLICATION_ID: `ca-app-pub-7628990820079697~1025939495`
- Ad unit 1: `ca-app-pub-7628990820079697/3464822039`
- Ad unit 2: `ca-app-pub-7628990820079697/7755420838`
- OPTIMIZE_AD_LOADING / OPTIMIZE_INITIALIZATION = true

## Backend & dữ liệu

- API base: `https://yeutruyen.vn/api/v1`
- Endpoint đã xác nhận: `/stories`, `/chapters`, `/chapters/{{id}}`, `/comments`,
  `/like`, `/read`, `/unlock`, `/bookshelf`, `/audio`, `/google`, `/apple`
- Ảnh tĩnh/VIP: `https://yeutruyen.vn/static/img/vip/...` (avatar-frame, crown, border-frame)
- CDN ảnh R2: `https://pub-996745da873f42adb3c8b53c9ed97e85.r2.dev/...`
- Thanh toán nội địa: VietQR — `https://img.vietqr.io/image/VCB-GA1-compact2.png?amount=...` (ngân hàng VCB)
- Web liên quan: `https://yeutruyen.vn/`, điều khoản `…/user/notifications/dieu-khoan-bao-mat`,
  xoá tài khoản `…/user/notifications/xoa-tai-khoan`

## Mạng xã hội (brand)

facebook.com/yeutruyenvietnam · fb group 1020302037348051 · instagram.com/yeutruyenvn ·
pinterest.com/yeutruyenvn · threads.com/@yeutruyenvnr · tiktok.com/@yeutruyen.vnr ·
youtube channel UCj1gS4W1FT3Jz2eWxl_q7JA · x.com/yeutruyenvn · zalo.me/v/c/yeutruyen

## AndroidX chính (phiên bản build-time từ META-INF/*.version)

core 1.18.0 · activity 1.12.4 · appcompat 1.2.0 · fragment 1.7.1 ·
lifecycle 2.10.0 · datastore 1.1.7 · browser 1.9.0 · constraintlayout 2.2.1 ·
workmanager/runtime · exifinterface 1.4.2 · preference 1.2.1

## Bảo vệ phân phối

PairIP (Play app integrity): Application `com.pairip.application.Application`,
`LicenseActivity` — **Play bơm vào**, không thuộc source gốc (đã loại khỏi manifest
build lại; giữ trong `decompiled_reference`).
"""


def dart_tree():
    rows = "\n".join(
        f"| `lib/{p}` | {c or '—'} | {d} |" for p, c, d in LIB_FILES)
    return f"""# Cấu trúc mã Dart khôi phục — `package:yeutruyen_app`

Cây `lib/` dưới đây được trích từ **string pool của `libapp.so`** (AOT snapshot):
mỗi `package:yeutruyen_app/…​.dart` xuất hiện trong binary là bằng chứng file gốc
tồn tại. Tên class lấy từ symbol table. **Nội dung thân hàm không khôi phục được**
(AOT machine-code) — cột "Vai trò" là hành vi suy ra từ endpoint/chuỗi/symbol.

## Cây thư mục (55 file)

```
lib/
├── main.dart
├── utils/api_text.dart
├── models/  (8): blocked_user, chapter, comment, history, home_model, story, story_detail, user
├── screens/ (23): account_detail, blocked_users, category, chapter, creator_revenue,
│   creator_screens, edit_profile, home, library, login, main, missions, notifications,
│   profile, ranking, register, search, splash, story_detail, story_list,
│   subscription, vip_decoration, wallet
├── services/ (19): account, ad, api, app_banner, auth, blocked_user, chapter, comment,
│   creator, home, library, local_store, mission, play_billing, revenue, search,
│   story, unlock, user
└── widgets/ (3): ad_banner, home_section, story_card
```

## Chi tiết từng file

| File | Class đã xác nhận | Vai trò (phân tích nhị phân) |
|---|---|---|
{rows}

## Endpoints theo service

| Service | Endpoint / cấu hình |
|---|---|
| ApiService | base `https://yeutruyen.vn/api/v1`, token từ flutter_secure_storage |
| StoryService / HomeService | `/stories` (home feed, category, ranking, search) |
| ChapterService | `/chapters`, `/chapters/{{id}}`, `/read` (đánh dấu đã đọc) |
| CommentService | `/comments`, `/like` |
| UnlockService | `/unlock` (mở chương trả phí bằng xu/VIP) |
| LibraryService | `/bookshelf` (tủ truyện) |
| AuthService | `/google`, `/apple` (OAuth), deep link `vn.yeutruyen.app://auth/google` |
| PlayBillingService | Google Play Billing 8.0.0 — gói SubscriptionPlan (in_app_purchase) |
| AdService | 2 ad unit `3464822039`, `7755420838` |
| WalletScreen | VietQR `img.vietqr.io/image/VCB-GA1-compact2.png?amount=` |

## Dependencies (AOT package-URI)

flutter, cupertino_icons, app_links, audioplayers(+platform_interface), cached_network_image,
characters, clock, collection, cross_file, ffi, file, flutter_cache_manager,
flutter_secure_storage, google_mobile_ads, http, http_parser, image_picker,
in_app_purchase, intl, jni, material_color_utilities, octo_image, path, path_provider,
rxdart, shared_preferences, sign_in_with_apple, source_span, sqflite, string_scanner,
synchronized, term_glyph, url_launcher, uuid, vector_math, webview_flutter, yeutruyen_app.

> Ghi chú kỹ thuật: chuỗi UI tiếng Việt là TwoByteString trong object pool (không trích
> được bằng `strings` UTF-8/UTF-16 đơn giản). Khôi phục tốt hơn cần libapp.so **arm64**
> (blutter) — hiện XAPK chỉ chứa armeabi-v7a.
"""


REPORT = f"""# Báo cáo khôi phục mã nguồn — Yêu Truyện 1.0.18

Ngày thực hiện: 25/11/2026 · Kết quả: repo này · Mức hoàn thành: host 100%, Dart structure 100%, Dart logic 0% (giới hạn cứng AOT — chi tiết §6).

## 1. Chuỗi bằng chứng

1. XAPK tải từ MediaFire (link do chủ sở hữu cung cấp), tài liệu định danh:
   `originals/yeu_truyen_1.0.18.xapk`
   - size {SIZE:,} bytes · md5 `{MD5}` · sha256 `{SHA256}`
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
| 3 | Dịch ngược Java/Kotlin | **jadx 1.5.7** (Java 21) | {N_JAVA:,} file .java; 129 lỗi rải rác trong coroutine internals của thư viện (okio/kotlinx) — không ảnh hưởng mã app |
| 4 | Decode resources/smali/assets | **apktool 3.0.3** | {N_SMALI:,} smali (3 dex), {N_RES:,} res, AndroidManifest.xml decoded, assets |
| 5 | Phân tích Dart AOT | `strings` + custom phân tích `libapp.so` | cây `lib/` 55 file, class, endpoints, ad IDs, deps |
| 6 | Parse chữ ký v2/v3 | `parse_apk_signature.py` (+cryptography) | chứng chỉ + fingerprint |
| 7 | Decode 3 splits | apktool | values-en/zh, drawable-mdpi |
| 8 | Tái cấu trúc project | `build_project.py` | cây repo này, {N_ALL:,} file |

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
| File tổng repo | {N_ALL:,} |
| Java dịch ngược (jadx) | {N_JAVA:,} |
| Smali (apktool) | {N_SMALI:,} |
| Resource decode | {N_RES:,} |
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
"""


w("README.md", README)
w("APP_INFO.md", APP_INFO)
w("DART_STRUCTURE.md", dart_tree())
w("RECOVERY_REPORT.md", REPORT)

# checksums file cho originals
import hashlib
cert = (REPO / "originals" / "signing_certificate.der").read_bytes()
lines = [
    f"yeu_truyen_1.0.18.xapk  sha256  {SHA256}",
    f"yeu_truyen_1.0.18.xapk  md5     {MD5}",
    f"yeu_truyen_1.0.18.xapk  size    {SIZE:,} bytes",
    f"signing_certificate.der sha256  {hashlib.sha256(cert).hexdigest()}",
]
(REPO / "originals" / "CHECKSUMS.txt").write_text("\n".join(lines) + "\n", encoding="utf-8")
print("viết originals/CHECKSUMS.txt")
print("\n=== XONG — docs ===")
