package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahr implements zzaga {
    private static final int[] zza;
    private static final int[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzahm zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzagd zzn;
    private zzahm zzo;
    private zzahm zzp;
    private zzahd zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i = zzahq.zza;
        zza = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        zzb = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        String str = zzfm.zza;
        zzc = "#!AMR\n".getBytes(StandardCharsets.UTF_8);
        zzd = "#!AMR-WB\n".getBytes(StandardCharsets.UTF_8);
    }

    public zzahr() {
        throw null;
    }

    public zzahr(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzafx zzafxVar = new zzafx();
        this.zzf = zzafxVar;
        this.zzp = zzafxVar;
    }

    private final boolean zzh(zzagb zzagbVar) throws IOException {
        byte[] bArr = zzc;
        if (zzi(zzagbVar, bArr)) {
            this.zzg = false;
            zzagbVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzi(zzagbVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzagbVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzi(zzagb zzagbVar, byte[] bArr) throws IOException {
        zzagbVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzagbVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    @RequiresNonNull({"realTrackOutput"})
    private final int zzj(zzagb zzagbVar) throws IOException {
        int i = this.zzj;
        if (i == 0) {
            try {
                zzagbVar.zzl();
                byte[] bArr = this.zze;
                zzagbVar.zzi(bArr, 0, 1);
                byte b = bArr[0];
                if ((b & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b);
                    throw zzat.zzb(sb.toString(), null);
                }
                boolean z = this.zzg;
                int i2 = (b >> 3) & 15;
                if (!z) {
                    if (!z) {
                        if (i2 >= 12 && i2 <= 14) {
                        }
                    }
                    String str = true != z ? "NB" : "WB";
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 26);
                    sb2.append("Illegal AMR ");
                    sb2.append(str);
                    sb2.append(" frame type ");
                    sb2.append(i2);
                    throw zzat.zzb(sb2.toString(), null);
                }
                if (i2 >= 10 && i2 <= 13) {
                    if (!z) {
                        if (i2 >= 12) {
                        }
                    }
                    if (true != z) {
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 26);
                    sb3.append("Illegal AMR ");
                    sb3.append(str);
                    sb3.append(" frame type ");
                    sb3.append(i2);
                    throw zzat.zzb(sb3.toString(), null);
                }
                i = z ? zzb[i2] : zza[i2];
                this.zzi = i;
                this.zzj = i;
                int i3 = this.zzk;
                if (i3 == -1) {
                    this.zzk = i;
                    i3 = i;
                }
                if (i3 == i) {
                    this.zzl++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZza = this.zzp.zza(zzagbVar, i, true);
        if (iZza == -1) {
            return -1;
        }
        int i4 = this.zzj - iZza;
        this.zzj = i4;
        if (i4 > 0) {
            return 0;
        }
        this.zzp.zze(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        return zzh(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzn = zzagdVar;
        zzahm zzahmVarZzs = zzagdVar.zzs(0, 1);
        this.zzo = zzahmVarZzs;
        this.zzp = zzahmVarZzs;
        zzagdVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        this.zzo.getClass();
        String str = zzfm.zza;
        if (zzagbVar.zzn() == 0 && !zzh(zzagbVar)) {
            throw zzat.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzg;
            String str2 = true != z ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i = true != z ? 8000 : 16000;
            int i2 = z ? zzb[8] : zza[7];
            zzahm zzahmVar = this.zzo;
            zzt zztVar = new zzt();
            zztVar.zzn(str2);
            zztVar.zzo(str3);
            zztVar.zzp(i2);
            zztVar.zzG(1);
            zztVar.zzI(i);
            zzahmVar.zzA(zztVar.zzP());
        }
        int iZzj = zzj(zzagbVar);
        if (this.zzq == null) {
            zzahc zzahcVar = new zzahc(-9223372036854775807L, 0L);
            this.zzq = zzahcVar;
            this.zzn.zzw(zzahcVar);
        }
        return iZzj == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j2;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }
}
