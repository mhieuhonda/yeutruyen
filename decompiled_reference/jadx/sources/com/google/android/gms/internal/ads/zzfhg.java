package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhg implements zzfie {
    private zzdch zza;
    private final Executor zzb = zzhcw.zza();

    public final zzdch zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzfif zzfifVar, zzfid zzfidVar, zzdch zzdchVar) {
        zzdcg zzdcgVarZza = zzfidVar.zza(zzfifVar.zzb);
        zzdcgVarZza.zzj(new zzfii(true));
        zzdch zzdchVar2 = (zzdch) zzdcgVarZza.zzh();
        this.zza = zzdchVar2;
        final zzcze zzczeVarZza = zzdchVar2.zza();
        final zzfne zzfneVar = new zzfne();
        zzhbx zzhbxVarZzw = zzhbx.zzw(zzczeVarZza.zzb());
        zzhbn zzhbnVar = new zzhbn(this) { // from class: com.google.android.gms.internal.ads.zzfhf
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzfky zzfkyVar = (zzfky) obj;
                zzfneVar.zzb = zzfkyVar;
                Iterator it = zzfkyVar.zzb.zza.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfkn) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzhcf.zza(null);
                        }
                        z = true;
                    }
                }
                if (z) {
                    return zzczeVarZza.zzc(zzhcf.zza(zzfkyVar));
                }
                return zzhcf.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzj(zzhbxVarZzw, zzhbnVar, executor), new zzgti() { // from class: com.google.android.gms.internal.ads.zzfhe
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzfne zzfneVar2 = zzfneVar;
                zzfneVar2.zzc = (zzcya) obj;
                return zzfneVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfif zzfifVar, zzfid zzfidVar, Object obj) {
        return zzb(zzfifVar, zzfidVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
