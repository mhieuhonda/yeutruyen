package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpv {
    final /* synthetic */ zzpw zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzxl zze;
    private boolean zzf;
    private boolean zzg;

    public zzpv(zzpw zzpwVar, String str, int i, zzxl zzxlVar) {
        Objects.requireNonNull(zzpwVar);
        this.zza = zzpwVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzxlVar == null ? -1L : zzxlVar.zzd;
        if (zzxlVar == null || !zzxlVar.zzb()) {
            return;
        }
        this.zze = zzxlVar;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i = this.zzc;
        if (i < zzbfVar.zza()) {
            zzpw zzpwVar = this.zza;
            zzbfVar.zzb(i, zzpwVar.zzj(), 0L);
            int i2 = zzpwVar.zzj().zzn;
            while (true) {
                if (i2 > zzpwVar.zzj().zzo) {
                    i = -1;
                    break;
                }
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i2));
                if (iZze != -1) {
                    i = zzbfVar2.zzd(iZze, zzpwVar.zzk(), false).zzc;
                    break;
                }
                i2++;
            }
        } else if (i >= zzbfVar2.zza()) {
            i = -1;
            break;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzxl zzxlVar = this.zze;
        return zzxlVar == null || zzbfVar2.zze(zzxlVar.zza) != -1;
    }

    public final boolean zzb(int i, zzxl zzxlVar) {
        if (zzxlVar != null) {
            long j = zzxlVar.zzd;
            if (j != -1) {
                zzxl zzxlVar2 = this.zze;
                if (zzxlVar2 == null) {
                    return !zzxlVar.zzb() && j == this.zzd;
                }
                return j == zzxlVar2.zzd && zzxlVar.zzb == zzxlVar2.zzb && zzxlVar.zzc == zzxlVar2.zzc;
            }
        }
        return i == this.zzc;
    }

    public final void zzc(int i, zzxl zzxlVar) {
        if (this.zzd == -1 && i == this.zzc && zzxlVar != null) {
            zzpw zzpwVar = this.zza;
            long j = zzxlVar.zzd;
            if (j >= zzpwVar.zzi()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzd(zznp zznpVar) {
        zzxl zzxlVar = zznpVar.zzd;
        if (zzxlVar == null) {
            return this.zzc != zznpVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j2 = zzxlVar.zzd;
        if (j2 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zznpVar.zzb;
        int iZze = zzbfVar.zze(zzxlVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzxl zzxlVar2 = this.zze;
        if (j2 < zzxlVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzxlVar.zzb()) {
            int i = zzxlVar.zze;
            return i == -1 || i > zzxlVar2.zzb;
        }
        int i2 = zzxlVar.zzb;
        int i3 = zzxlVar.zzc;
        int i4 = zzxlVar2.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzxlVar2.zzc;
        }
        return true;
    }

    final /* synthetic */ String zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzxl zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(boolean z) {
        this.zzf = true;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzg = true;
    }
}
