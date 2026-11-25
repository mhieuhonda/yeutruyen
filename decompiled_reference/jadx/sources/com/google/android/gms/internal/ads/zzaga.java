package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzaga {
    boolean zza(zzagb zzagbVar) throws IOException;

    default List zzb() {
        return zzgwt.zzi();
    }

    void zzc(zzagd zzagdVar);

    int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException;

    void zze(long j, long j2);

    void zzf();

    @SideEffectFree
    default zzaga zzg() {
        return this;
    }
}
