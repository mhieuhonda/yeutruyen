package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenn implements zzema {
    private final Context zza;
    private final zzdno zzb;
    private final Executor zzc;
    private final zzfkm zzd;
    private final zzdzt zze;

    public zzenn(Context context, Executor executor, zzdno zzdnoVar, zzfkm zzfkmVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = zzdnoVar;
        this.zzc = executor;
        this.zzd = zzfkmVar;
        this.zze = zzdztVar;
    }

    private static String zze(zzfkn zzfknVar) {
        try {
            return zzfknVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbjy.zza(context) && !TextUtils.isEmpty(zze(zzfknVar));
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final ListenableFuture zzb(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoN)).booleanValue()) {
            zzdzs zzdzsVarZza = this.zze.zza();
            zzdzsVarZza.zzc("action", "cstm_tbs_rndr");
            zzdzsVarZza.zzd();
        }
        String strZze = zze(zzfknVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
        return zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(uri, zzfkyVar, zzfknVar, zzfkqVar, obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ ListenableFuture zzc(Uri uri, zzfky zzfkyVar, zzfkn zzfknVar, zzfkq zzfkqVar, Object obj) {
        try {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            customTabsIntentBuild.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null);
            zzcgd zzcgdVar = new zzcgd();
            zzdmi zzdmiVarZzd = this.zzb.zzd(new zzcyq(zzfkyVar, zzfknVar, null), new zzdml(new zzenl(this, zzcgdVar, zzfknVar), null));
            zzcgdVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzdmiVarZzd.zzi(), null, new VersionInfoParcel(0, 0, false), null, null, zzfkqVar.zzb));
            this.zzd.zzd();
            return zzhcf.zza(zzdmiVarZzd.zzh());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    final /* synthetic */ zzdzt zzd() {
        return this.zze;
    }
}
