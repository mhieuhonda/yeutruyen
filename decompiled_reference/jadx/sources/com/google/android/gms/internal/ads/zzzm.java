package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzm extends zzwz {
    private final zzak zzc;

    private zzzm(zzbf zzbfVar, zzak zzakVar) {
        super(zzbfVar);
        this.zzc = zzakVar;
    }

    public static zzzm zzp(zzbf zzbfVar, zzak zzakVar) {
        return zzbfVar instanceof zzzm ? new zzzm(((zzzm) zzbfVar).zzb, zzakVar) : new zzzm(zzbfVar, zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i, zzbe zzbeVar, long j) {
        this.zzb.zzb(i, zzbeVar, j);
        zzak zzakVar = this.zzc;
        zzbeVar.zzd = zzakVar;
        zzag zzagVar = zzakVar.zzb;
        zzbeVar.zzc = null;
        return zzbeVar;
    }
}
