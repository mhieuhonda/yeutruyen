package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zznl {
    private final zzjv zza;

    @Deprecated
    public zznl(Context context, zznh zznhVar) {
        this.zza = new zzjv(context, zznhVar);
    }

    @Deprecated
    public final zznl zza(final zzabi zzabiVar) {
        zzjv zzjvVar = this.zza;
        zzgtr.zzi(!zzjvVar.zzw);
        zzabiVar.getClass();
        zzjvVar.zze = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjs
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i = zzjv.zzA;
                return zzabiVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zznl zzb(final zzma zzmaVar) {
        zzjv zzjvVar = this.zza;
        zzgtr.zzi(!zzjvVar.zzw);
        zzmaVar.getClass();
        zzjvVar.zzf = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjt
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i = zzjv.zzA;
                return zzmaVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zznm zzc() {
        zzjv zzjvVar = this.zza;
        zzgtr.zzi(!zzjvVar.zzw);
        zzjvVar.zzw = true;
        return new zznm(zzjvVar);
    }
}
