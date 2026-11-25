package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsu implements zzth {
    final /* synthetic */ zztb zza;

    /* synthetic */ zzsu(zztb zztbVar, byte[] bArr) {
        Objects.requireNonNull(zztbVar);
        this.zza = zztbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zza(long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        zzeh.zzc("AudioTrackAudioOutput", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zzb(final long j) {
        zztb zztbVar = this.zza;
        if (zztbVar.zzu().zzb()) {
            zzeg zzegVarZzu = zztbVar.zzu();
            zzegVarZzu.zze(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzst
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj) {
                    ((zzqv) obj).zza(j);
                }
            });
            zzegVarZzu.zzf();
        }
    }
}
