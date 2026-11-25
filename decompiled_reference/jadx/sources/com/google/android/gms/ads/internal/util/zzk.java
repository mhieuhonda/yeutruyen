package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbjy;
import com.google.android.gms.internal.ads.zzinp;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzk implements zzbjx {
    final /* synthetic */ zzbjy zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Uri zzd;

    zzk(zzs zzsVar, zzbjy zzbjyVar, Bundle bundle, Context context, Uri uri) {
        this.zza = zzbjyVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        Objects.requireNonNull(zzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjx
    public final void zza() {
        zzbjy zzbjyVar = this.zza;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(zzbjyVar.zzc());
        zzs.zzai(builder, this.zzb);
        CustomTabsIntent customTabsIntentBuild = builder.build();
        Intent intent = customTabsIntentBuild.intent;
        Context context = this.zzc;
        intent.setPackage(zzinp.zza(context));
        customTabsIntentBuild.launchUrl(context, this.zzd);
        zzbjyVar.zzb((Activity) context);
    }
}
