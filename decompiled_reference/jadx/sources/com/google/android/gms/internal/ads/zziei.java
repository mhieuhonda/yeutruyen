package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zziei implements zzifx {
    private static final zziei zza = new zziei();

    private zziei() {
    }

    public static zziei zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final boolean zzb(Class cls) {
        return zziep.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final zzifw zzc(Class cls) {
        if (!zziep.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            String.valueOf(name);
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(name)));
        }
        try {
            return (zzifw) zziep.zzbt(cls.asSubclass(zziep.class)).zzbs();
        } catch (Exception e) {
            String name2 = cls.getName();
            String.valueOf(name2);
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(name2)), e);
        }
    }
}
