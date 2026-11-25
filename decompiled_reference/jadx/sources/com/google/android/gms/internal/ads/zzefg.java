package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefg implements zzimz {
    private final zzini zza;

    private zzefg(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzefg zzc(zzini zziniVar) {
        return new zzefg(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcnz) this.zza).zza().getPackageName();
        zzinh.zzb(packageName);
        return packageName;
    }
}
