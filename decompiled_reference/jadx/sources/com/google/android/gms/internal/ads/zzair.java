package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzair implements zzaga {
    private final zzaga zza;
    private final zzaga zzb;
    private zzagd zzc;
    private zzaga zzd;
    private Pair zze;

    public zzair() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        if (zzais.zza(zzagbVar, true)) {
            return true;
        }
        zzagbVar.zzl();
        return zzais.zza(zzagbVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzc = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        if (this.zzd == null) {
            zzaga zzagaVar = this.zzb;
            if (!zzagaVar.zza(zzagbVar)) {
                zzagaVar = this.zza;
            }
            this.zzd = zzagaVar;
            zzagbVar.zzl();
            Pair pair = this.zze;
            if (pair != null) {
                this.zzd.zze(((Long) pair.first).longValue(), ((Long) this.zze.second).longValue());
                this.zze = null;
            }
            zzaga zzagaVar2 = this.zzd;
            zzagd zzagdVar = this.zzc;
            zzagdVar.getClass();
            zzagaVar2.zzc(zzagdVar);
        }
        return this.zzd.zzd(zzagbVar, zzahaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        zzaga zzagaVar = this.zzd;
        if (zzagaVar != null) {
            zzagaVar.zze(j, j2);
        } else {
            this.zze = Pair.create(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
        this.zzb.zzf();
    }

    public zzair(int i) {
        this.zza = new zzahf(-1, -1, "image/heif");
        this.zzb = new zzaiq();
    }
}
