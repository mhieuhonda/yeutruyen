# Hồ sơ ứng dụng — Yêu Truyện (vn.yeutruyen.app)

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
- Endpoint đã xác nhận: `/stories`, `/chapters`, `/chapters/{id}`, `/comments`,
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
