package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzahx implements zzahs {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzahx(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
    }

    public static zzahx zzb(zzeu zzeuVar) {
        int iZzC = zzeuVar.zzC();
        zzeuVar.zzk(12);
        int iZzC2 = zzeuVar.zzC();
        int iZzC3 = zzeuVar.zzC();
        int iZzC4 = zzeuVar.zzC();
        zzeuVar.zzk(4);
        int iZzC5 = zzeuVar.zzC();
        int iZzC6 = zzeuVar.zzC();
        zzeuVar.zzk(4);
        return new zzahx(iZzC, iZzC2, iZzC3, iZzC4, iZzC5, iZzC6, zzeuVar.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return 1752331379;
    }

    public final int zzc() {
        int i = this.zza;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        String hexString = Integer.toHexString(i);
        String.valueOf(hexString);
        zzeh.zzc("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(hexString)));
        return -1;
    }

    public final long zzd() {
        return zzfm.zzw(this.zzd, ((long) this.zzb) * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
