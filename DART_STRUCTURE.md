# Cấu trúc mã Dart khôi phục — `package:yeutruyen_app`

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
| `lib/main.dart` | — | Điểm vào ứng dụng: runApp, khởi tạo ApiService/AuthService/AdService, gate đăng nhập (splash -> login/main). |
| `lib/utils/api_text.dart` | ApiText | Tiện ích xử lý văn bản API (chuẩn hoá nội dung truyện/chapter trả về từ REST). |
| `lib/models/blocked_user.dart` | BlockedUser | Model user bị chặn. |
| `lib/models/chapter.dart` | Chapter, ChapterDraft, ChapterLink | Model chapter truyện, bản nháp, liên kết chapter (đầu/sau), trạng thái khóa (unlock). |
| `lib/models/comment.dart` | CommentModel | Model bình luận truyện/chapter. |
| `lib/models/history.dart` | History | Model lịch sử đọc (user/history). |
| `lib/models/home_model.dart` | HomeModel, HomeModelStoryDetail | Model dữ liệu màn home (các section truyện đề xuất). |
| `lib/models/story.dart` | Story, StoryCover, StoryStats, StoryListTile | Model truyện: bìa, thống kê, item danh sách. |
| `lib/models/story_detail.dart` | StoryDetail | Model chi tiết truyện. |
| `lib/models/user.dart` | User, UserRank | Model người dùng, xếp hạng, số dư/vip. |
| `lib/screens/account_detail_screen.dart` | AccountDetailScreen | Màn chi tiết tài khoản. |
| `lib/screens/blocked_users_screen.dart` | BlockedUsersScreen | Màn danh sách user đã chặn. |
| `lib/screens/category_screen.dart` | CategoryScreen | Màn danh mục truyện (category). |
| `lib/screens/chapter_screen.dart` | ChapterScreen | Màn đọc chapter + phát audio (audioplayers). |
| `lib/screens/creator_revenue_screen.dart` | CreatorRevenueScreen | Màn doanh thu tác giả (creator). |
| `lib/screens/creator_screens.dart` | CreatorScreens | Gộp các màn dành cho tác giả (dashboard creator). |
| `lib/screens/edit_profile_screen.dart` | EditProfileScreen | Màn sửa hồ sơ (image_picker cho avatar). |
| `lib/screens/home_screen.dart` | HomeScreen | Màn home: các HomeSection, banner, truyện mới/cập nhật. |
| `lib/screens/library_screen.dart` | LibraryScreen | Màn tủ truyện (/bookshelf). |
| `lib/screens/login_screen.dart` | LoginScreen | Màn đăng nhập Google/Apple (app_links deep link vn.yeutruyen.app://auth/google). |
| `lib/screens/main_screen.dart` | MainScreen | Khung shell điều hướng dưới (home/ranking/library/search/profile). |
| `lib/screens/missions_screen.dart` | MissionsScreen | Màn nhiệm vụ hàng ngày (MissionTask). |
| `lib/screens/notifications_screen.dart` | NotificationsScreen | Màn thông báo. |
| `lib/screens/profile_screen.dart` | ProfileScreen | Màn hồ sơ cá nhân. |
| `lib/screens/ranking_screen.dart` | RankingScreen | Màn bảng xếp hạng (UserRank, StoryStats). |
| `lib/screens/register_screen.dart` | RegisterScreen | Màn đăng ký tài khoản. |
| `lib/screens/search_screen.dart` | SearchScreen | Màn tìm kiếm truyện. |
| `lib/screens/splash_screen.dart` | SplashScreen | Màn splash khi khởi động. |
| `lib/screens/story_detail_screen.dart` | StoryDetailScreen | Màn chi tiết truyện + danh sách chapter + unlock. |
| `lib/screens/story_list_screen.dart` | StoryListScreen | Màn danh sách truyện theo category/tìm kiếm. |
| `lib/screens/subscription_screen.dart` | SubscriptionScreen, SubscriptionPlan | Mân gói VIP/thành viên (in_app_purchase). |
| `lib/screens/vip_decoration_screen.dart` | VipDecorationScreen | Màn khung/hiệu ứng VIP (avatar-frame, crown, border-frame). |
| `lib/screens/wallet_screen.dart` | WalletScreen | Màn ví xu + nạp tiền (VietQR VCB). |
| `lib/widgets/ad_banner.dart` | AdBanner | Widget banner AdMob (2 ad unit đã trích). |
| `lib/widgets/home_section.dart` | HomeSection | Widget section trang chủ (list ngang truyện). |
| `lib/widgets/story_card.dart` | StoryCard | Widget card truyện dùng cached_network_image. |
| `lib/services/account_service.dart` | AccountService | Tài khoản: xem/sửa hồ sơ, xoá tài khoản (yeutruyen.vn/user/notifications/xoa-tai-khoan). |
| `lib/services/ad_service.dart` | AdService | Google Mobile Ads: init, banner/interstitial, ad unit 3464822039 & 7755420838. |
| `lib/services/api_service.dart` | ApiService | REST client: base https://yeutruyen.vn/api/v1; http + token (flutter_secure_storage); lỗi/mã hoá api_text. |
| `lib/services/app_banner_service.dart` | AppBannerService | Banner nội dung riêng app (khuyến mãi, sự kiện). |
| `lib/services/auth_service.dart` | AuthService | Đăng nhập Google/Apple (OAuth /google, /apple), lưu token bảo mật. |
| `lib/services/blocked_user_service.dart` | BlockedUserService | Chặn/bo chặn người dùng. |
| `lib/services/chapter_service.dart` | ChapterService | Lấy chapter (/chapters, /chapters/{id}), đánh dấu đã đọc (/read). |
| `lib/services/comment_service.dart` | CommentService | Bình luận (/comments), like (/like). |
| `lib/services/creator_service.dart` | CreatorService | API cho tác giả truyện (creator). |
| `lib/services/home_service.dart` | HomeService | Dữ liệu trang chủ (HomeModel). |
| `lib/services/library_service.dart` | LibraryService | Tủ truyện (/bookshelf). |
| `lib/services/local_store.dart` | — | Lưu cục bộ: sqflite (lịch sử/cache) + shared_preferences + flutter_secure_storage. |
| `lib/services/mission_service.dart` | MissionService | Nhiệm vụ + phần thưởng (MissionTask). |
| `lib/services/play_billing_service.dart` | PlayBillingService, SubscriptionPlan | Google Play Billing 8.0.0: gói VIP, mua nội dung (in_app_purchase). |
| `lib/services/revenue_service.dart` | RevenueService | Doanh thu creator (CreatorRevenue). |
| `lib/services/search_service.dart` | SearchService | Tìm kiếm truyện. |
| `lib/services/story_service.dart` | StoryService | Danh sách chi tiết truyện (/stories). |
| `lib/services/unlock_service.dart` | UnlockService | Mở khóa chương trả phí bằng xu/VIP (/unlock). |
| `lib/services/user_service.dart` | UserService | Thông tin user (User, UserRank). |

## Endpoints theo service

| Service | Endpoint / cấu hình |
|---|---|
| ApiService | base `https://yeutruyen.vn/api/v1`, token từ flutter_secure_storage |
| StoryService / HomeService | `/stories` (home feed, category, ranking, search) |
| ChapterService | `/chapters`, `/chapters/{id}`, `/read` (đánh dấu đã đọc) |
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
