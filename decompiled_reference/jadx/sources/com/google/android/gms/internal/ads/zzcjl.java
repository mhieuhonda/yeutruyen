package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcjl extends zzcjh {
    public zzcjl(zzchu zzchuVar) {
        super(zzchuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final boolean zze(String str) {
        String strZzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        zzchu zzchuVar = (zzchu) this.zzc.get();
        if (zzchuVar != null && strZzg != null) {
            zzchuVar.zzt(strZzg, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, strZzg, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzl() {
    }
}
