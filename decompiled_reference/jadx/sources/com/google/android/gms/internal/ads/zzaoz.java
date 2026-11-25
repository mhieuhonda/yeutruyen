package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaoz implements zzans {
    public static final zzank zza = new zzank(zzgwt.zzi(), -9223372036854775807L, -9223372036854775807L);
    private final zzeu zzb = new zzeu();
    private final zzeu zzc = new zzeu();
    private final zzaoy zzd;
    private Inflater zze;

    public zzaoz(List list) {
        zzaoy zzaoyVar = new zzaoy();
        this.zzd = zzaoyVar;
        zzaoyVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(byte[] bArr, int i, int i2, zzanr zzanrVar, zzdu zzduVar) {
        zzank zzankVar;
        zzeu zzeuVar = this.zzb;
        zzeuVar.zzb(bArr, i2 + i);
        zzeuVar.zzh(i);
        if (this.zze == null) {
            this.zze = new Inflater();
        }
        zzeu zzeuVar2 = this.zzc;
        if (zzfm.zzQ(zzeuVar, zzeuVar2, this.zze)) {
            zzeuVar.zzb(zzeuVar2.zzi(), zzeuVar2.zze());
        }
        zzaoy zzaoyVar = this.zzd;
        zzaoyVar.zzc();
        int iZzd = zzeuVar.zzd();
        if (iZzd < 2 || zzeuVar.zzt() != iZzd) {
            zzankVar = zza;
        } else {
            zzaoyVar.zzd(zzeuVar);
            long jZzf = zzaoyVar.zzf();
            zzcy zzcyVarZzb = zzaoyVar.zzb(zzeuVar);
            long jZzf2 = -9223372036854775807L;
            if (jZzf != -9223372036854775807L) {
                if (zzaoyVar.zze() != -9223372036854775807L) {
                    if (zzaoyVar.zzf() > zzaoyVar.zze()) {
                        jZzf2 = zzaoyVar.zzf() - zzaoyVar.zze();
                    } else {
                        jZzf2 = zzaoyVar.zzf();
                    }
                } else {
                    jZzf2 = zzaoyVar.zzf();
                }
            }
            zzankVar = new zzank(zzcyVarZzb != null ? zzgwt.zzj(zzcyVarZzb) : zzgwt.zzi(), zzaoyVar.zze(), jZzf2);
        }
        zzduVar.zza(zzankVar);
    }
}
