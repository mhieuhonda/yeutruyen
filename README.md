# Yêu Truyện — Đọc & Nghe (`vn.yeutruyen.app`)

> **Bộ mã nguồn khôi phục từ bản cài đặt đã biên dịch 1.0.18** (versionCode 30).
> Khôi phục trong đêm 25/11/2026 từ file XAPK duy nhất còn sót lại sau sự cố
> mã hoá máy chủ. Tài sản trí tuệ của cùng chủ sở hữu ứng dụng trên Google Play.

## 1. Nguồn khôi phục

| Mục | Giá trị |
|---|---|
| File gốc | `originals/yeu_truyen_1.0.18.xapk` (39.56 MB) |
| SHA-256 | `6a3214ca8fd04ddd51aaf93649d14fe3a9c898bf5977c1c4b2998bb59baf3794` |
| MD5 | `c7a4d9e9955bed25d85f2c59ff42ffa0` |
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
│   ├── jadx/                 # 14,516 file .java dịch ngược từ 3 file dex
│   ├── apktool/              # 23,762 smali + 254 resource đã decode + manifest + assets
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
