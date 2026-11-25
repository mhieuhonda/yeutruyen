package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaap extends zzaar implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzaap(int i, zzbg zzbgVar, int i2, zzaan zzaanVar, int i3, String str, String str2) {
        int iZzj;
        int i4;
        boolean z;
        super(i, zzbgVar, i2);
        int i5 = 0;
        this.zzf = zzne.zzad(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzaanVar.zzC;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzgwt zzgwtVarZzj = str2 != null ? zzgwt.zzj(str2) : zzaanVar.zzy.isEmpty() ? zzgwt.zzj("") : zzaanVar.zzy;
        int i8 = 0;
        while (true) {
            if (i8 >= zzgwtVarZzj.size()) {
                iZzj = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            zzv zzvVar = this.zzd;
            String str3 = (String) zzgwtVarZzj.get(i8);
            boolean z2 = zzaanVar.zzD;
            iZzj = zzaaz.zzj(zzvVar, str3, false);
            if (iZzj > 0) {
                break;
            } else {
                i8++;
            }
        }
        this.zzi = i8;
        this.zzj = iZzj;
        if (str2 != null) {
            i4 = 1088;
        } else {
            int i9 = zzaanVar.zzA;
            i4 = 0;
        }
        int iZzm = zzaaz.zzm(this.zzd.zzf, i4);
        this.zzk = iZzm;
        zzv zzvVar2 = this.zzd;
        this.zzn = (1088 & zzvVar2.zzf) != 0;
        int iZzn = zzaaz.zzn(zzvVar2, zzaanVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzaaz.zzj(this.zzd, str, zzaaz.zzi(str) == null);
        this.zzm = iZzj2;
        if (iZzj > 0 || ((zzaanVar.zzy.isEmpty() && iZzm > 0) || ((zzaanVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0)))) {
            z = true;
        } else {
            boolean z3 = zzaanVar.zzx;
            z = false;
        }
        if (zzne.zzad(i3, zzaanVar.zzV) && z) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaap zzaapVar) {
        zzgwg zzgwgVarZza = zzgwg.zzg().zzd(this.zzf, zzaapVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzaapVar.zzi), zzgyn.zzb().zza());
        int i = this.zzj;
        zzgwg zzgwgVarZzb = zzgwgVarZza.zzb(i, zzaapVar.zzj);
        int i2 = this.zzk;
        zzgwg zzgwgVarZzb2 = zzgwgVarZzb.zzb(i2, zzaapVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzaapVar.zzl), zzgyn.zzb().zza()).zzd(this.zzg, zzaapVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzaapVar.zzh), i == 0 ? zzgyn.zzb() : zzgyn.zzb().zza()).zzb(this.zzm, zzaapVar.zzm);
        if (i2 == 0) {
            zzgwgVarZzb2 = zzgwgVarZzb2.zzc(this.zzn, zzaapVar.zzn);
        }
        return zzgwgVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ boolean zzc(zzaar zzaarVar) {
        return false;
    }
}
