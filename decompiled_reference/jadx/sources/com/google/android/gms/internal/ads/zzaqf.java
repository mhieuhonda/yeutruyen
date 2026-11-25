package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaqf implements zzaqa {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzars zzb;
    private zzaqe zzg;
    private long zzh;
    private String zzi;
    private zzahm zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzaqd zze = new zzaqd(128);
    private long zzl = -9223372036854775807L;
    private final zzaqr zzf = new zzaqr(178, 128);
    private final zzeu zzc = new zzeu();

    zzaqf(zzars zzarsVar, String str) {
        this.zzb = zzarsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        zzgr.zzj(this.zzd);
        this.zze.zza();
        zzaqe zzaqeVar = this.zzg;
        if (zzaqeVar != null) {
            zzaqeVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzi = zzaroVar.zzc();
        this.zzj = zzagdVar.zzs(zzaroVar.zzb(), 2);
        this.zzg = new zzaqe(this.zzj);
        this.zzb.zza(zzagdVar, zzaroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0111  */
    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) {
        int i;
        int i2;
        this.zzg.getClass();
        this.zzj.getClass();
        int iZzg = zzeuVar.zzg();
        int iZze = zzeuVar.zze();
        byte[] bArrZzi = zzeuVar.zzi();
        this.zzh += (long) zzeuVar.zzd();
        this.zzj.zzc(zzeuVar, zzeuVar.zzd());
        while (true) {
            int iZzi = zzgr.zzi(bArrZzi, iZzg, iZze, this.zzd);
            if (iZzi == iZze) {
                break;
            }
            int i3 = iZzi + 3;
            int i4 = zzeuVar.zzi()[i3] & 255;
            int i5 = iZzi - iZzg;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zzc(bArrZzi, iZzg, iZzi);
                }
                int i6 = i5 < 0 ? -i5 : 0;
                zzaqd zzaqdVar = this.zze;
                if (zzaqdVar.zzb(i4, i6)) {
                    zzahm zzahmVar = this.zzj;
                    int i7 = zzaqdVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzaqdVar.zzc, zzaqdVar.zza);
                    zzet zzetVar = new zzet(bArrCopyOf, bArrCopyOf.length);
                    zzetVar.zzo(i7);
                    zzetVar.zzo(4);
                    zzetVar.zzg();
                    zzetVar.zzh(8);
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(4);
                        zzetVar.zzh(3);
                    }
                    int iZzj = zzetVar.zzj(4);
                    float f = 1.0f;
                    if (iZzj == 15) {
                        int iZzj2 = zzetVar.zzj(8);
                        int iZzj3 = zzetVar.zzj(8);
                        if (iZzj3 == 0) {
                            zzeh.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = iZzj2 / iZzj3;
                        }
                    } else if (iZzj < 7) {
                        f = zza[iZzj];
                    } else {
                        zzeh.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(2);
                        zzetVar.zzh(1);
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            zzetVar.zzh(3);
                            zzetVar.zzh(11);
                            zzetVar.zzg();
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            i2 = 2;
                        } else {
                            i2 = 2;
                        }
                    } else {
                        i2 = 2;
                    }
                    if (zzetVar.zzj(i2) != 0) {
                        zzeh.zzc("H263Reader", "Unhandled video object layer shape");
                    }
                    zzetVar.zzg();
                    int iZzj4 = zzetVar.zzj(16);
                    zzetVar.zzg();
                    if (zzetVar.zzi()) {
                        if (iZzj4 == 0) {
                            zzeh.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i8 = iZzj4 - 1;
                            int i9 = 0;
                            while (i8 > 0) {
                                i8 >>= 1;
                                i9++;
                            }
                            zzetVar.zzh(i9);
                        }
                    }
                    zzetVar.zzg();
                    int iZzj5 = zzetVar.zzj(13);
                    zzetVar.zzg();
                    int iZzj6 = zzetVar.zzj(13);
                    zzetVar.zzg();
                    zzetVar.zzg();
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzn("video/mp2t");
                    zztVar.zzo("video/mp4v-es");
                    zztVar.zzv(iZzj5);
                    zztVar.zzw(iZzj6);
                    zztVar.zzB(f2);
                    zztVar.zzr(Collections.singletonList(bArrCopyOf));
                    zzahmVar.zzA(zztVar.zzP());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(bArrZzi, iZzg, iZzi);
            zzaqr zzaqrVar = this.zzf;
            if (i5 > 0) {
                zzaqrVar.zzd(bArrZzi, iZzg, iZzi);
                i = 0;
            } else {
                i = -i5;
            }
            if (zzaqrVar.zze(i)) {
                int iZza = zzgr.zza(zzaqrVar.zza, zzaqrVar.zzb);
                zzeu zzeuVar2 = this.zzc;
                String str2 = zzfm.zza;
                zzeuVar2.zzb(zzaqrVar.zza, iZza);
                this.zzb.zzb(this.zzl, zzeuVar2);
            }
            if (i4 == 178) {
                if (zzeuVar.zzi()[iZzi + 2] == 1) {
                    zzaqrVar.zzc(178);
                }
                i4 = 178;
            }
            int i10 = iZze - iZzi;
            this.zzg.zzd(this.zzh - ((long) i10), i10, this.zzk);
            this.zzg.zzb(i4, this.zzl);
            iZzg = i3;
            iZze = iZze;
        }
        if (!this.zzk) {
            this.zze.zzc(bArrZzi, iZzg, iZze);
        }
        this.zzg.zzc(bArrZzi, iZzg, iZze);
        this.zzf.zzd(bArrZzi, iZzg, iZze);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z) {
        zzaqe zzaqeVar = this.zzg;
        zzaqeVar.getClass();
        if (z) {
            zzaqeVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
