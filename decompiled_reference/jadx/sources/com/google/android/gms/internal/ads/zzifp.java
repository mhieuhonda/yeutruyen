package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzifp implements zzifx {
    private final zzifx[] zza;

    zzifp(zzifx... zzifxVarArr) {
        this.zza = zzifxVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final zzifw zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzifx zzifxVar = this.zza[i];
            if (zzifxVar.zzb(cls)) {
                return zzifxVar.zzc(cls);
            }
        }
        String name = cls.getName();
        String.valueOf(name);
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(name)));
    }
}
