package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzart implements zzaru {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzagd zzc;
    private final zzahm zzd;
    private final zzary zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzeu zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzart(zzagd zzagdVar, zzahm zzahmVar, zzary zzaryVar) throws zzat {
        this.zzc = zzagdVar;
        this.zzd = zzahmVar;
        this.zze = zzaryVar;
        int iMax = Math.max(1, zzaryVar.zzc / 10);
        this.zzi = iMax;
        zzeu zzeuVar = new zzeu(zzaryVar.zzf);
        zzeuVar.zzu();
        int iZzu = zzeuVar.zzu();
        this.zzf = iZzu;
        int i = zzaryVar.zzb;
        int i2 = (((zzaryVar.zzd - (i * 4)) * 8) / (zzaryVar.zze * i)) + 1;
        if (iZzu != i2) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 34 + String.valueOf(iZzu).length());
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(iZzu);
            throw zzat.zzb(sb.toString(), null);
        }
        String str = zzfm.zza;
        int i3 = ((iMax + iZzu) - 1) / iZzu;
        this.zzg = new byte[zzaryVar.zzd * i3];
        this.zzh = new zzeu(i3 * (iZzu + iZzu) * i);
        int i4 = ((zzaryVar.zzc * zzaryVar.zzd) * 8) / iZzu;
        zzt zztVar = new zzt();
        zztVar.zzo("audio/raw");
        zztVar.zzi(i4);
        zztVar.zzj(i4);
        zztVar.zzp((iMax + iMax) * i);
        zztVar.zzG(zzaryVar.zzb);
        zztVar.zzH(zzft.zzb(zzaryVar.zzg));
        zztVar.zzI(zzaryVar.zzc);
        zztVar.zzJ(2);
        this.zzj = zztVar.zzP();
    }

    private final void zzd(int i) {
        long jZzw = this.zzl + zzfm.zzw(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int iZzf = zzf(i);
        this.zzd.zze(jZzw, 1, iZzf, this.zzm - iZzf, null);
        this.zzn += (long) i;
        this.zzm -= iZzf;
    }

    private final int zze(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zzf(int i) {
        return (i + i) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final void zza(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final void zzb(int i, long j) {
        zzasb zzasbVar = new zzasb(this.zze, this.zzf, i, j);
        this.zzc.zzw(zzasbVar);
        zzahm zzahmVar = this.zzd;
        zzahmVar.zzA(this.zzj);
        zzahmVar.zzP(zzasbVar.zza());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f A[LOOP:0: B:6:0x0024->B:12:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.zzaru
    public final boolean zzc(com.google.android.gms.internal.ads.zzagb r26, long r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzart.zzc(com.google.android.gms.internal.ads.zzagb, long):boolean");
    }
}
