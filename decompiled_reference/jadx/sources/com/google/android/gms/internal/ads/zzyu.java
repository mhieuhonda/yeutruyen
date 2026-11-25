package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyu implements zzxk {
    private final zzhq zza;
    private final zzyd zzb;
    private int zzc;
    private final zzabw zzd;

    public zzyu(zzhq zzhqVar, final zzagg zzaggVar) {
        zzyd zzydVar = new zzyd() { // from class: com.google.android.gms.internal.ads.zzyt
            @Override // com.google.android.gms.internal.ads.zzyd
            public final /* synthetic */ zzye zza(zzqh zzqhVar) {
                return new zzwp(zzaggVar);
            }
        };
        zzabw zzabwVar = new zzabw(-1);
        this.zza = zzhqVar;
        this.zzb = zzydVar;
        this.zzd = zzabwVar;
        this.zzc = 1048576;
    }

    public final zzyu zza(int i) {
        this.zzc = i;
        return this;
    }

    public final zzyv zzb(zzak zzakVar) {
        zzag zzagVar = zzakVar.zzb;
        zzagVar.getClass();
        zzhq zzhqVar = this.zza;
        zzyd zzydVar = this.zzb;
        zzagVar.getClass();
        return new zzyv(zzakVar, zzhqVar, zzydVar, zzuq.zza, this.zzd, this.zzc, false, 0, null, null, null);
    }
}
