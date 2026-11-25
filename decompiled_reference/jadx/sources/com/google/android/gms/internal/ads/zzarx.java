package com.google.android.gms.internal.ads;

import android.util.Pair;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarx implements zzaga {
    private zzagd zza;
    private zzahm zzb;
    private zzaru zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i = zzarw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        return zzasa.zza(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zza = zzagdVar;
        this.zzb = zzagdVar.zzs(0, 1);
        zzagdVar.zzv();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x010c  */
    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        int iZzC;
        int i;
        this.zzb.getClass();
        String str = zzfm.zza;
        int i2 = this.zzc;
        if (i2 == 0) {
            zzgtr.zzi(zzagbVar.zzn() == 0);
            int i3 = this.zzf;
            if (i3 != -1) {
                zzagbVar.zzf(i3);
                this.zzc = 4;
            } else {
                if (!zzasa.zza(zzagbVar)) {
                    throw zzat.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzagbVar.zzf((int) (zzagbVar.zzm() - zzagbVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long jZzE = -1;
        if (i2 == 1) {
            int i4 = zzasa.zza;
            zzeu zzeuVar = new zzeu(8);
            zzarz zzarzVarZza = zzarz.zza(zzagbVar, zzeuVar);
            if (zzarzVarZza.zza != 1685272116) {
                zzagbVar.zzl();
            } else {
                zzagbVar.zzk(8);
                zzeuVar.zzh(0);
                zzagbVar.zzi(zzeuVar.zzi(), 0, 8);
                jZzE = zzeuVar.zzE();
                zzagbVar.zzf(((int) zzarzVarZza.zzb) + 8);
            }
            this.zzd = jZzE;
            this.zzc = 2;
            return 0;
        }
        if (i2 == 2) {
            zzary zzaryVarZzb = zzasa.zzb(zzagbVar);
            int i5 = zzaryVarZzb.zza;
            if (i5 == 17) {
                this.zze = new zzart(this.zza, this.zzb, zzaryVarZzb);
            } else if (i5 == 6) {
                this.zze = new zzarv(this.zza, this.zzb, zzaryVarZzb, "audio/g711-alaw", -1);
            } else if (i5 == 7) {
                this.zze = new zzarv(this.zza, this.zzb, zzaryVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i6 = zzaryVarZzb.zze;
                if (i5 == 1) {
                    iZzC = zzfm.zzC(i6, ByteOrder.LITTLE_ENDIAN);
                    i = iZzC;
                } else if (i5 == 3) {
                    iZzC = zzfm.zzD(i6, ByteOrder.LITTLE_ENDIAN);
                    i = iZzC;
                } else if (i5 != 65534) {
                    i = 0;
                } else {
                    iZzC = zzfm.zzC(i6, ByteOrder.LITTLE_ENDIAN);
                    i = iZzC;
                }
                if (i == 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 29);
                    sb.append("Unsupported WAV format type: ");
                    sb.append(i5);
                    throw zzat.zzc(sb.toString());
                }
                this.zze = new zzarv(this.zza, this.zzb, zzaryVarZzb, "audio/raw", i);
            }
            this.zzc = 3;
            return 0;
        }
        if (i2 != 3) {
            zzgtr.zzi(this.zzg != -1);
            long jZzn = this.zzg - zzagbVar.zzn();
            zzaru zzaruVar = this.zze;
            zzaruVar.getClass();
            return zzaruVar.zzc(zzagbVar, jZzn) ? -1 : 0;
        }
        Pair pairZzc = zzasa.zzc(zzagbVar);
        this.zzf = ((Long) pairZzc.first).intValue();
        long jLongValue = ((Long) pairZzc.second).longValue();
        long j = this.zzd;
        if (j != -1 && jLongValue == KeyboardMap.kValueMask) {
            jLongValue = j;
        }
        long j2 = ((long) this.zzf) + jLongValue;
        this.zzg = j2;
        long jZzo = zzagbVar.zzo();
        if (jZzo != -1 && j2 > jZzo) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 29 + String.valueOf(jZzo).length());
            sb2.append("Data exceeds input length: ");
            sb2.append(j2);
            sb2.append(", ");
            sb2.append(jZzo);
            zzeh.zzc("WavExtractor", sb2.toString());
            this.zzg = jZzo;
            j2 = jZzo;
        }
        zzaru zzaruVar2 = this.zze;
        zzaruVar2.getClass();
        zzaruVar2.zzb(this.zzf, j2);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzaru zzaruVar = this.zze;
        if (zzaruVar != null) {
            zzaruVar.zza(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }
}
