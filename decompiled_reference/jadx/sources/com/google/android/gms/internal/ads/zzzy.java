package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzzy extends zzaar implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzaan zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    public zzzy(int i, zzbg zzbgVar, int i2, zzaan zzaanVar, int i3, boolean z, zzgts zzgtsVar, int i4) {
        int i5;
        int iZzj;
        int iHashCode;
        int i6;
        int iZzj2;
        boolean z2;
        super(i, zzbgVar, i2);
        this.zzh = zzaanVar;
        int i7 = 1;
        int i8 = true != zzaanVar.zzT ? 16 : 24;
        boolean z3 = zzaanVar.zzP;
        this.zzg = zzaaz.zzi(this.zzd.zzd);
        this.zzi = zzne.zzad(i3, false);
        int i9 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i9 >= zzaanVar.zzq.size()) {
                iZzj = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaz.zzj(this.zzd, (String) zzaanVar.zzq.get(i9), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.zzk = i9;
        this.zzj = iZzj;
        int i10 = this.zzd.zzf;
        int i11 = zzaanVar.zzs;
        this.zzl = zzaaz.zzm(i10, 0);
        this.zzm = zzaaz.zzn(this.zzd, zzaanVar.zzr);
        zzv zzvVar = this.zzd;
        int i12 = zzvVar.zzf;
        this.zzn = i12 == 0 || (i12 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzp;
        this.zzx = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        this.zzr = zzvVar.zzH;
        this.zzs = zzvVar.zzJ;
        this.zzt = zzvVar.zzj;
        int i13 = zzvVar.zzj;
        this.zzf = (i13 == -1 || i13 <= zzaanVar.zzu) && ((i6 = zzvVar.zzH) == -1 || i6 <= zzaanVar.zzt) && zzgtsVar.zza(zzvVar);
        String str2 = zzfm.zza;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            strArrSplit[i14] = zzfm.zzi(strArrSplit[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= strArrSplit.length) {
                iZzj2 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj2 = zzaaz.zzj(this.zzd, strArrSplit[i15], false);
                if (iZzj2 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.zzo = i15;
        this.zzp = iZzj2;
        for (int i16 = 0; i16 < zzaanVar.zzv.size(); i16++) {
            String str3 = this.zzd.zzp;
            if (str3 != null && str3.equals(zzaanVar.zzv.get(i16))) {
                i5 = i16;
                break;
            }
        }
        this.zzu = i5;
        this.zzv = (i3 & 384) == 128;
        this.zzw = (i3 & 64) == 64;
        zzaan zzaanVar2 = this.zzh;
        if (zzne.zzad(i3, zzaanVar2.zzV) && ((z2 = this.zzf) || zzaanVar2.zzO)) {
            int i17 = zzaanVar2.zzw.zzb;
            if (zzne.zzad(i3, false) && z2 && this.zzd.zzj != -1) {
                boolean z4 = zzaanVar2.zzG;
                boolean z5 = zzaanVar2.zzF;
                if ((zzaanVar2.zzX || !z) && (i8 & i3) != 0) {
                    i7 = 2;
                }
            }
        } else {
            i7 = 0;
        }
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzy zzzyVar) {
        boolean z = this.zzf;
        zzgyn zzgynVarZza = (z && this.zzi) ? zzaaz.zzc : zzaaz.zzc.zza();
        zzgwg zzgwgVarZza = zzgwg.zzg().zzd(this.zzi, zzzyVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzzyVar.zzk), zzgyn.zzb().zza()).zzb(this.zzj, zzzyVar.zzj).zzb(this.zzl, zzzyVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzzyVar.zzm), zzgyn.zzb().zza()).zzd(this.zzq, zzzyVar.zzq).zzd(this.zzn, zzzyVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzzyVar.zzo), zzgyn.zzb().zza()).zzb(this.zzp, zzzyVar.zzp).zzd(z, zzzyVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzzyVar.zzu), zzgyn.zzb().zza());
        boolean z2 = this.zzh.zzF;
        zzgwg zzgwgVarZza2 = zzgwgVarZza.zzd(this.zzv, zzzyVar.zzv).zzd(this.zzw, zzzyVar.zzw).zzd(this.zzx, zzzyVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzzyVar.zzr), zzgynVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzzyVar.zzs), zzgynVarZza);
        if (Objects.equals(this.zzg, zzzyVar.zzg)) {
            zzgwgVarZza2 = zzgwgVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzzyVar.zzt), zzgynVarZza);
        }
        return zzgwgVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ boolean zzc(zzaar zzaarVar) {
        String str;
        zzaan zzaanVar = this.zzh;
        zzzy zzzyVar = (zzzy) zzaarVar;
        boolean z = zzaanVar.zzR;
        zzv zzvVar = this.zzd;
        int i = zzvVar.zzH;
        if (i == -1) {
            return false;
        }
        zzv zzvVar2 = zzzyVar.zzd;
        if (i != zzvVar2.zzH || (str = zzvVar.zzp) == null || !TextUtils.equals(str, zzvVar2.zzp)) {
            return false;
        }
        boolean z2 = zzaanVar.zzQ;
        int i2 = zzvVar.zzJ;
        if (i2 == -1 || i2 != zzvVar2.zzJ) {
            return false;
        }
        boolean z3 = zzaanVar.zzS;
        return this.zzv == zzzyVar.zzv && this.zzw == zzzyVar.zzw;
    }
}
