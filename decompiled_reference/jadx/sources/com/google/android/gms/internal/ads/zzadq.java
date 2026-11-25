package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzadq implements zzbs {
    private final zzbq zza = new zzadp(false);

    public zzadq(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbs
    public final zzbu zza(Context context, zzi zziVar, zzl zzlVar, zzbt zzbtVar, Executor executor, long j, boolean z) {
        try {
            return ((zzbs) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzbq.class).newInstance(this.zza)).zza(context, zziVar, zzlVar, zzbtVar, executor, 0L, false);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
