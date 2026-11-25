package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzarv implements zzaru {
    private final zzagd zza;
    private final zzahm zzb;
    private final zzary zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzarv(zzagd zzagdVar, zzahm zzahmVar, zzary zzaryVar, String str, int i) throws zzat {
        this.zza = zzagdVar;
        this.zzb = zzahmVar;
        this.zzc = zzaryVar;
        int i2 = zzaryVar.zzb * zzaryVar.zze;
        int i3 = zzaryVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 28 + String.valueOf(i3).length());
            sb.append("Expected block size: ");
            sb.append(i4);
            sb.append("; got: ");
            sb.append(i3);
            throw zzat.zzb(sb.toString(), null);
        }
        int i5 = zzaryVar.zzc * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.zze = iMax;
        zzt zztVar = new zzt();
        zztVar.zzn("audio/wav");
        zztVar.zzo(str);
        zztVar.zzi(i6);
        zztVar.zzj(i6);
        zztVar.zzp(iMax);
        zztVar.zzG(zzaryVar.zzb);
        zztVar.zzH(zzft.zzb(zzaryVar.zzg));
        zztVar.zzI(zzaryVar.zzc);
        zztVar.zzJ(i);
        this.zzd = zztVar.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final void zzb(int i, long j) {
        zzasb zzasbVar = new zzasb(this.zzc, 1, i, j);
        this.zza.zzw(zzasbVar);
        zzahm zzahmVar = this.zzb;
        zzahmVar.zzA(this.zzd);
        zzahmVar.zzP(zzasbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final boolean zzc(zzagb zzagbVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int iZza = this.zzb.zza(zzagbVar, (int) Math.min(i2 - i, j2), true);
            if (iZza == -1) {
                j2 = 0;
            } else {
                this.zzg += iZza;
                j2 -= (long) iZza;
            }
        }
        zzary zzaryVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzaryVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jZzw = this.zzf + zzfm.zzw(this.zzh, 1000000L, zzaryVar.zzc, RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zze(jZzw, 1, i6, i7, null);
            this.zzh += (long) i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}
