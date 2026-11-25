package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzawd implements Supplier {
    private final /* synthetic */ int zzc;
    public static final /* synthetic */ zzawd zzb = new zzawd(1);
    static final /* synthetic */ zzawd zza = new zzawd(0);

    private /* synthetic */ zzawd(int i) {
        this.zzc = i;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.zzc != 0 ? zzawt.zza(null) : new zzawg();
    }
}
