package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqj {
    public static final Intent zza(Uri uri, Context context, zzbaw zzbawVar, View view, zzflk zzflkVar) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final ResolveInfo zzb(Intent intent, Context context, zzbaw zzbawVar, View view, zzflk zzflkVar) {
        return zzc(intent, new ArrayList(), context, zzbawVar, view, zzflkVar);
    }

    public static final ResolveInfo zzc(Intent intent, ArrayList arrayList, Context context, zzbaw zzbawVar, View view, zzflk zzflkVar) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
            return resolveInfo;
        }
    }

    public static final Intent zzd(Intent intent, ResolveInfo resolveInfo, Context context, zzbaw zzbawVar, View view, zzflk zzflkVar) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }
}
