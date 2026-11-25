package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbpo implements zzgti {
    static final /* synthetic */ zzbpo zza = new zzbpo();

    private /* synthetic */ zzbpo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbpx zzbpxVar = zzbpw.zza;
        if (!((Boolean) zzbkw.zzi.zze()).booleanValue()) {
            return "failure_click_attok";
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
