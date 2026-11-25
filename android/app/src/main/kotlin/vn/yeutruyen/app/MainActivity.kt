package vn.yeutruyen.app

import io.flutter.embedding.android.FlutterActivity

// Khôi phục chính xác từ jadx (MainActivity.kt gốc chỉ kế thừa FlutterActivity,
// không có member nào khác — kiểm chứng: decompiled_reference/jadx).
class MainActivity : FlutterActivity()
