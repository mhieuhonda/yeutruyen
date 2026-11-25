package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahi extends zzago {
    private final long zza;

    public zzahi(zzagb zzagbVar, long j) {
        super(zzagbVar);
        zzgtr.zza(zzagbVar.zzn() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzagb
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzagb
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzagb
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
