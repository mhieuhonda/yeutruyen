package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcpb implements zzdoj {
    private final zzcpe zza;
    private zzfii zzb;
    private zzfhm zzc;
    private zzdiz zzd;
    private zzdcj zze;
    private zzdof zzf;
    private zzcvp zzg;

    /* synthetic */ zzcpb(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj, com.google.android.gms.internal.ads.zzdcg
    /* JADX INFO: renamed from: zza */
    public final zzdok zzh() {
        zzinh.zzc(this.zzd, zzdiz.class);
        zzinh.zzc(this.zze, zzdcj.class);
        zzinh.zzc(this.zzf, zzdof.class);
        zzinh.zzc(this.zzg, zzcvp.class);
        return new zzcpc(this.zza, this.zzg, this.zzf, new zzczg(), new zzfmm(), new zzdbi(), new zzeai(), this.zzd, this.zze, zzepw.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* synthetic */ zzdoj zzb(zzfhm zzfhmVar) {
        this.zzc = zzfhmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* synthetic */ zzdoj zzc(zzfii zzfiiVar) {
        this.zzb = zzfiiVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* bridge */ /* synthetic */ zzdoj zzd(zzcvp zzcvpVar) {
        this.zzg = zzcvpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* bridge */ /* synthetic */ zzdoj zze(zzdof zzdofVar) {
        this.zzf = zzdofVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* bridge */ /* synthetic */ zzdoj zzf(zzdcj zzdcjVar) {
        this.zze = zzdcjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* bridge */ /* synthetic */ zzdoj zzg(zzdiz zzdizVar) {
        this.zzd = zzdizVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj, com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zzi(zzfhm zzfhmVar) {
        this.zzc = zzfhmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj, com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zzj(zzfii zzfiiVar) {
        this.zzb = zzfiiVar;
        return this;
    }
}
