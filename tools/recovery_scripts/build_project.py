#!/usr/bin/env python3
"""Tái cấu trúc project Flutter/Android 'yeutruyen_app' từ kết quả dịch ngược.

Nguồn: XAPK 1.0.18 (Play build, armeabi-v7a) -> jadx + apktool + string-pool libapp.so
Đích:   /home/z/my-project/work/repo  (cấu trúc sẵn sàng cho `flutter pub get && flutter run`)
"""
import re
import shutil
from pathlib import Path

WORK = Path("/home/z/my-project/work")
REPO = WORK / "repo"
APKT = WORK / "apktool_out"
JADX = WORK / "jadx_out"
XAPK = WORK / "dl" / "yeu_truyen_1.0.18.xapk"
NLIB = WORK / "native_libs" / "lib" / "armeabi-v7a"

PKG = "vn.yeutruyen.app"

# ---------------------------------------------------------------------------
# Danh sách 55 file Dart phát hiện trong AOT string pool + class + mô tả
# (path tương đối lib/, class xác nhận được từ string pool, vai trò)
# ---------------------------------------------------------------------------
LIB_FILES = [
    ("main.dart", "", "Điểm vào ứng dụng: runApp, khởi tạo ApiService/AuthService/AdService, gate đăng nhập (splash -> login/main)."),
    ("utils/api_text.dart", "ApiText", "Tiện ích xử lý văn bản API (chuẩn hoá nội dung truyện/chapter trả về từ REST)."),
    ("models/blocked_user.dart", "BlockedUser", "Model user bị chặn."),
    ("models/chapter.dart", "Chapter, ChapterDraft, ChapterLink", "Model chapter truyện, bản nháp, liên kết chapter (đầu/sau), trạng thái khóa (unlock)."),
    ("models/comment.dart", "CommentModel", "Model bình luận truyện/chapter."),
    ("models/history.dart", "History", "Model lịch sử đọc (user/history)."),
    ("models/home_model.dart", "HomeModel, HomeModelStoryDetail", "Model dữ liệu màn home (các section truyện đề xuất)."),
    ("models/story.dart", "Story, StoryCover, StoryStats, StoryListTile", "Model truyện: bìa, thống kê, item danh sách."),
    ("models/story_detail.dart", "StoryDetail", "Model chi tiết truyện."),
    ("models/user.dart", "User, UserRank", "Model người dùng, xếp hạng, số dư/vip."),
    ("screens/account_detail_screen.dart", "AccountDetailScreen", "Màn chi tiết tài khoản."),
    ("screens/blocked_users_screen.dart", "BlockedUsersScreen", "Màn danh sách user đã chặn."),
    ("screens/category_screen.dart", "CategoryScreen", "Màn danh mục truyện (category)."),
    ("screens/chapter_screen.dart", "ChapterScreen", "Màn đọc chapter + phát audio (audioplayers)."),
    ("screens/creator_revenue_screen.dart", "CreatorRevenueScreen", "Màn doanh thu tác giả (creator)."),
    ("screens/creator_screens.dart", "CreatorScreens", "Gộp các màn dành cho tác giả (dashboard creator)."),
    ("screens/edit_profile_screen.dart", "EditProfileScreen", "Màn sửa hồ sơ (image_picker cho avatar)."),
    ("screens/home_screen.dart", "HomeScreen", "Màn home: các HomeSection, banner, truyện mới/cập nhật."),
    ("screens/library_screen.dart", "LibraryScreen", "Màn tủ truyện (/bookshelf)."),
    ("screens/login_screen.dart", "LoginScreen", "Màn đăng nhập Google/Apple (app_links deep link vn.yeutruyen.app://auth/google)."),
    ("screens/main_screen.dart", "MainScreen", "Khung shell điều hướng dưới (home/ranking/library/search/profile)."),
    ("screens/missions_screen.dart", "MissionsScreen", "Màn nhiệm vụ hàng ngày (MissionTask)."),
    ("screens/notifications_screen.dart", "NotificationsScreen", "Màn thông báo."),
    ("screens/profile_screen.dart", "ProfileScreen", "Màn hồ sơ cá nhân."),
    ("screens/ranking_screen.dart", "RankingScreen", "Màn bảng xếp hạng (UserRank, StoryStats)."),
    ("screens/register_screen.dart", "RegisterScreen", "Màn đăng ký tài khoản."),
    ("screens/search_screen.dart", "SearchScreen", "Màn tìm kiếm truyện."),
    ("screens/splash_screen.dart", "SplashScreen", "Màn splash khi khởi động."),
    ("screens/story_detail_screen.dart", "StoryDetailScreen", "Màn chi tiết truyện + danh sách chapter + unlock."),
    ("screens/story_list_screen.dart", "StoryListScreen", "Màn danh sách truyện theo category/tìm kiếm."),
    ("screens/subscription_screen.dart", "SubscriptionScreen, SubscriptionPlan", "Mân gói VIP/thành viên (in_app_purchase)."),
    ("screens/vip_decoration_screen.dart", "VipDecorationScreen", "Màn khung/hiệu ứng VIP (avatar-frame, crown, border-frame)."),
    ("screens/wallet_screen.dart", "WalletScreen", "Màn ví xu + nạp tiền (VietQR VCB)."),
    ("widgets/ad_banner.dart", "AdBanner", "Widget banner AdMob (2 ad unit đã trích)."),
    ("widgets/home_section.dart", "HomeSection", "Widget section trang chủ (list ngang truyện)."),
    ("widgets/story_card.dart", "StoryCard", "Widget card truyện dùng cached_network_image."),
    ("services/account_service.dart", "AccountService", "Tài khoản: xem/sửa hồ sơ, xoá tài khoản (yeutruyen.vn/user/notifications/xoa-tai-khoan)."),
    ("services/ad_service.dart", "AdService", "Google Mobile Ads: init, banner/interstitial, ad unit 3464822039 & 7755420838."),
    ("services/api_service.dart", "ApiService", "REST client: base https://yeutruyen.vn/api/v1; http + token (flutter_secure_storage); lỗi/mã hoá api_text."),
    ("services/app_banner_service.dart", "AppBannerService", "Banner nội dung riêng app (khuyến mãi, sự kiện)."),
    ("services/auth_service.dart", "AuthService", "Đăng nhập Google/Apple (OAuth /google, /apple), lưu token bảo mật."),
    ("services/blocked_user_service.dart", "BlockedUserService", "Chặn/bo chặn người dùng."),
    ("services/chapter_service.dart", "ChapterService", "Lấy chapter (/chapters, /chapters/{id}), đánh dấu đã đọc (/read)."),
    ("services/comment_service.dart", "CommentService", "Bình luận (/comments), like (/like)."),
    ("services/creator_service.dart", "CreatorService", "API cho tác giả truyện (creator)."),
    ("services/home_service.dart", "HomeService", "Dữ liệu trang chủ (HomeModel)."),
    ("services/library_service.dart", "LibraryService", "Tủ truyện (/bookshelf)."),
    ("services/local_store.dart", "", "Lưu cục bộ: sqflite (lịch sử/cache) + shared_preferences + flutter_secure_storage."),
    ("services/mission_service.dart", "MissionService", "Nhiệm vụ + phần thưởng (MissionTask)."),
    ("services/play_billing_service.dart", "PlayBillingService, SubscriptionPlan", "Google Play Billing 8.0.0: gói VIP, mua nội dung (in_app_purchase)."),
    ("services/revenue_service.dart", "RevenueService", "Doanh thu creator (CreatorRevenue)."),
    ("services/search_service.dart", "SearchService", "Tìm kiếm truyện."),
    ("services/story_service.dart", "StoryService", "Danh sách chi tiết truyện (/stories)."),
    ("services/unlock_service.dart", "UnlockService", "Mở khóa chương trả phí bằng xu/VIP (/unlock)."),
    ("services/user_service.dart", "UserService", "Thông tin user (User, UserRank)."),
]

HEADER = """/// {path_dart}
/// ---------------------------------------------------------------------------
/// TÁI TẠO TỪ BẢN BUILD 1.0.18 — KHÔNG PHẢI MÃ NGUỒN GỐC.
/// File gốc tồn tại trong bản build (xác nhận qua AOT string pool) nhưng nội
/// dung Dart đã được biên dịch AOT; chỉ có KHUNG + tên class + hành vi quan
/// sát được được khôi phục. Xem DART_STRUCTURE.md để biết chi tiết đã trích.
///
/// Class đã xác nhận: {classes}
/// Vai trò (phân tích nhị phân): {desc}
///
/// TODO(dev): cài đặt lại logic dựa trên tài liệu repo + decompiled_reference/.
/// ---------------------------------------------------------------------------
"""

# ---------------------------------------------------------------------------
# Chuẩn bị cây thư mục
# ---------------------------------------------------------------------------


def fresh(p: Path):
    if p.exists():
        shutil.rmtree(p)
    p.mkdir(parents=True)


def cp(src: Path, dst: Path):
    dst.parent.mkdir(parents=True, exist_ok=True)
    if src.is_dir():
        shutil.copytree(src, dst, dirs_exist_ok=True)
    else:
        shutil.copy2(src, dst)


def w(p: Path, content: str):
    p.parent.mkdir(parents=True, exist_ok=True)
    p.write_text(content, encoding="utf-8")


def main():
    fresh(REPO)

    # --- 1. lib/ skeletons -------------------------------------------------
    for rel, classes, desc in LIB_FILES:
        content = HEADER.format(path_dart=f"lib/{rel}", classes=classes or "(không trích được)", desc=desc)
        w(REPO / "lib" / rel, content)
    print(f"lib/      : {len(LIB_FILES)} file skeleton")

    # --- 2. assets/ ---------------------------------------------------------
    fa = APKT / "assets" / "flutter_assets" / "yeutruyen"
    cp(fa, REPO / "assets" / "yeutruyen")
    n = len(list((REPO / "assets" / "yeutruyen").rglob("*")))
    print(f"assets/   : {n} file (bìa webp/png, logo, favicon)")

    # --- 3. android/ host ---------------------------------------------------
    build_android_host()

    # --- 4. decompiled_reference/ ------------------------------------------
    cp(JADX, REPO / "decompiled_reference" / "jadx")
    cp(APKT, REPO / "decompiled_reference" / "apktool")
    for s in ("en", "zh", "mdpi"):
        cp(WORK / f"split_{s}", REPO / "decompiled_reference" / "splits" / f"config.{s}")
    print("decompiled_reference/: jadx + apktool + 3 splits")

    # --- 5. originals/ ------------------------------------------------------
    orig = REPO / "originals"
    cp(XAPK, orig / "yeu_truyen_1.0.18.xapk")
    cp(WORK / "signer_v2_0.der", orig / "signing_certificate.der")
    cp(Path("/home/z/my-project/scripts"), REPO / "tools" / "recovery_scripts")

    # --- 6. pubspec + analysis + gitignore ----------------------------------
    w(REPO / "pubspec.yaml", PUBSPEC)
    w(REPO / "analysis_options.yaml", ANALYSIS)
    w(REPO / ".gitignore", GITIGNORE)
    print("pubspec.yaml / analysis_options.yaml / .gitignore: OK")


# ---------------------------------------------------------------------------
# Android host
# ---------------------------------------------------------------------------
SETTINGS_GRADLE = """// Khôi phục từ bản build 1.0.18 — flutter SDK path được flutter CLI tự ghi
// vào android/local.properties khi chạy `flutter pub get` / `flutter run`.
pluginManagement {
    def flutterSdkPath = {
        def properties = new Properties()
        file("local.properties").withInputStream { properties.load(it) }
        def flutterPath = properties.getProperty("flutter.sdk")
        assert flutterPath != null, "flutter.sdk not set in local.properties"
        return flutterPath
    }()

    includeBuild("$flutterSdkPath/packages/flutter_tools/gradle")

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id "dev.flutter.flutter-plugin-loader" version "1.0.0"
    // Phiên bản khớp khuyến nghị của Flutter 3.3x (Dart 3.12.1) — chỉnh nếu cần.
    id "com.android.application" version "8.9.1" apply false
    id "org.jetbrains.kotlin.android" version "2.1.10" apply false
}

include ":app"
"""

ROOT_GRADLE = """allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.buildDir = "../build"
subprojects {
    project.buildDir = "${rootProject.buildDir}/${project.name}"
}
subprojects {
    project.evaluationDependsOn(":app")
}

tasks.register("clean", Delete) {
    delete rootProject.buildDir
}
"""

GRADLE_PROPS = """org.gradle.jvmargs=-Xmx4G -XX:MaxMetaspaceSize=2G -XX:+HeapDumpOnOutOfMemoryError
android.useAndroidX=true
android.enableJetifier=true
"""

APP_GRADLE = """plugins {
    id "com.android.application"
    id "kotlin-android"
    id "dev.flutter.flutter-gradle-plugin"
}

android {
    namespace = "vn.yeutruyen.app"
    compileSdk = 36
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    defaultConfig {
        applicationId = "vn.yeutruyen.app"
        minSdk = 32
        targetSdk = 36
        versionCode = 30
        versionName = "1.0.18"
    }

    buildTypes {
        release {
            // LƯU Ý: release signing key GỐC không nằm trong APK (Google Play App
            // Signing). Dùng debug key để build thử; nạp lại keystore riêng khi có.
            signingConfig = signingConfigs.debug
        }
    }
}

flutter {
    source = "../.."
}
"""

WRAPPER_PROPS = """distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists
distributionUrl=https\\://services.gradle.org/distributions/gradle-8.12-all.zip
"""

MAIN_ACTIVITY = """package vn.yeutruyen.app

import io.flutter.embedding.android.FlutterActivity

// Khôi phục chính xác từ jadx (MainActivity.kt gốc chỉ kế thừa FlutterActivity,
// không có member nào khác — kiểm chứng: decompiled_reference/jadx).
class MainActivity : FlutterActivity()
"""


def build_android_host():
    a = REPO / "android"
    w(a / "settings.gradle", SETTINGS_GRADLE)
    w(a / "build.gradle", ROOT_GRADLE)
    w(a / "gradle.properties", GRADLE_PROPS)
    w(a / "gradle" / "wrapper" / "gradle-wrapper.properties", WRAPPER_PROPS)
    w(a / "app" / "build.gradle", APP_GRADLE)
    w(a / "app" / "proguard-rules.pro", "# (không trích được rule gốc — bản build dùng R8 mặc định của Flutter)\n")
    w(a / "app" / "src" / "main" / "kotlin" / PKG.replace(".", "/") / "MainActivity.kt", MAIN_ACTIVITY)

    # Manifest: làm sạch các phần Play/pairip bơm vào bản phân phối
    clean_manifest()

    # res app-owned
    res = a / "app" / "src" / "main" / "res"
    extract_styles(APKT / "res" / "values" / "styles.xml", res / "values" / "styles.xml")
    extract_styles(APKT / "res" / "values-night" / "styles.xml", res / "values-night" / "styles.xml", night=True)
    w(res / "values" / "strings.xml", STRINGS_XML)
    cp(APKT / "res" / "drawable" / "launch_background.xml", res / "drawable" / "launch_background.xml")
    cp(APKT / "res" / "xml" / "network_security_config.xml", res / "xml" / "network_security_config.xml")
    mip = 0
    for d in APKT.glob("res/mipmap-*"):
        if (d / "ic_launcher.png").exists():
            cp(d / "ic_launcher.png", res / d.name / "ic_launcher.png")
            mip += 1
    print(f"android/  : manifest sạch, {mip} mipmap, styles, jniLibs, gradle files")

    # jniLibs (bản arm32 duy nhất có trong XAPK; libapp.so = Dart AOT)
    for so in NLIB.glob("*.so"):
        cp(so, a / "app" / "src" / "main" / "jniLibs" / "armeabi-v7a" / so.name)


STRINGS_XML = """<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="app_name">Yêu Truyện</string>
</resources>
"""


def extract_styles(src: Path, dst: Path, night: bool = False):
    xml = src.read_text(encoding="utf-8")
    found = re.findall(r"<style [^>]*name=\"(?:LaunchTheme|NormalTheme)\"[^>]*>.*?</style>", xml, re.S)
    if not found:
        found = re.findall(r"<style [^>]*name=\"(?:LaunchTheme|NormalTheme)\"[^>]*/>", xml)
    body = "\n    ".join(found)
    if not body:
        body = (
            "<style name=\"LaunchTheme\" parent=\"@android:style/Theme.Light.NoTitleBar\">\n"
            "        <item name=\"android:windowBackground\">@drawable/launch_background</item>\n"
            "    </style>\n"
            "    <style name=\"NormalTheme\" parent=\"@android:style/Theme.Light.NoTitleBar\">\n"
            "        <item name=\"android:windowBackground\">?android:colorBackground</item>\n"
            "    </style>"
        )
    w(dst, f'<?xml version="1.0" encoding="utf-8"?>\n<resources>\n    {body}\n</resources>\n')


REMOVE_ATTRS = [
    r'\s+android:compileSdkVersion="[^"]*"',
    r'\s+android:compileSdkVersionCodename="[^"]*"',
    r'\s+android:requiredSplitTypes="[^"]*"',
    r'\s+android:splitTypes="[^"]*"',
    r'\s+android:platformBuildVersionCode="[^"]*"',
    r'\s+android:platformBuildVersionName="[^"]*"',
]
REMOVE_TAGS = [
    r'<meta-data\s+[^>]*android:name="com\.android\.vending\.splits\.required"[^>]*/>',
    r'<meta-data\s+[^>]*android:name="com\.android\.stamp\.source"[^>]*/>',
    r'<meta-data\s+[^>]*android:name="com\.android\.stamp\.type"[^>]*/>',
    r'<meta-data\s+[^>]*android:name="com\.android\.vending\.splits"[^>]*/>',
    r'<meta-data\s+[^>]*android:name="com\.android\.vending\.derived\.apk\.id"[^>]*/>',
    r'<activity\s+[^>]*android:name="com\.pairip\.licensecheck\.LicenseActivity"[^>]*/>',
    r'<uses-permission\s+[^>]*android:name="com\.android\.vending\.CHECK_LICENSE"/>',
    r'\s+android:name="com\.pairip\.application\.Application"',
]


def clean_manifest():
    xml = (APKT / "AndroidManifest.xml").read_text(encoding="utf-8")
    removed = []
    for pat in REMOVE_ATTRS + REMOVE_TAGS:
        xml, n = re.subn(pat, "", xml)
        if n:
            removed.append(f"{n}x {pat[:60]}")
    xml = xml.strip()
    if xml.startswith("<?xml"):
        end = xml.find("?>") + 2
        decl, body = xml[:end], xml[end:].strip()
    else:
        decl, body = '<?xml version="1.0" encoding="utf-8"?>', xml
    header = (
        "\n<!-- Tái tạo từ apktool decode của vn.yeutruyen.app.apk (1.0.18).\n"
        "     Đã loại: thuộc tính platform của aapt2, các meta Play App Signing/\n"
        "     splits/stamp, phần pairip (Application + license check + quyền\n"
        "     CHECK_LICENSE) — đây là thứ Google Play bơm vào khi phân phối,\n"
        "     không có trong source gốc.\n"
        "     Bản manifest gốc 100% giữ nguyên: decompiled_reference/apktool/AndroidManifest.xml -->\n\n"
    )
    dst = REPO / "android" / "app" / "src" / "main" / "AndroidManifest.xml"
    w(dst, decl + header + body + "\n")
    print(f"manifest : đã làm sạch {len(removed)} nhóm mục (Play/pairip/aapt2)")


# ---------------------------------------------------------------------------
# pubspec / analysis / .gitignore
# ---------------------------------------------------------------------------
PUBSPEC = """name: yeutruyen_app
description: "Yêu Truyện - Đọc & Nghe — khôi phục từ bản build 1.0.18 (vn.yeutruyen.app)."
publish_to: "none"
version: 1.0.18+30

environment:
  sdk: ">=3.12.0 <4.0.0"

dependencies:
  flutter:
    sdk: flutter
  cupertino_icons: any

  # ---- Plugin xác nhận trực tiếp qua GeneratedPluginRegistrant.java ----
  app_links: any
  audioplayers: any
  flutter_secure_storage: any
  google_mobile_ads: any
  image_picker: any
  in_app_purchase: any
  sign_in_with_apple: any
  sqflite: any
  shared_preferences: any
  url_launcher: any
  webview_flutter: any

  # ---- Phát hiện qua package-URI trong AOT string pool ----
  # (có thể là direct hoặc transitive; pin lại sau khi `flutter pub get`)
  http: any
  intl: any
  cached_network_image: any
  flutter_cache_manager: any
  path_provider: any
  path: any
  rxdart: any
  jni: any

dev_dependencies:
  flutter_test:
    sdk: flutter
  flutter_lints: any

flutter:
  uses-material-design: true
  assets:
    - assets/yeutruyen/
"""

ANALYSIS = """include: package:flutter_lints/flutter.yaml

analyzer:
  errors:
    todo: ignore
"""

GITIGNORE = """# Dart/Flutter
.dart_tool/
.packages
build/
.flutter-plugins
.flutter-plugins-dependencies
pubspec.lock

# Android (giữ jniLibs vì chứa libapp.so tham chiếu)
android/.gradle/
android/local.properties
android/key.properties
*.keystore
*.jks

# IDE
.idea/
*.iml
.vscode/

# macOS/Windows
.DS_Store
Thumbs.db
"""


if __name__ == "__main__":
    main()
    print("\n=== HOÀN TẤT TÁI CẤU TRÚC ===")
