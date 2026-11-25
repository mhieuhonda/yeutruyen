package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzli {
    final /* synthetic */ zzlj zza;
    private final WeakReference zzb;
    private final IntConsumer zzc;

    /* synthetic */ zzli(zzlj zzljVar, Context context, byte[] bArr) {
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
        this.zzb = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.zzlg
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                zzlj zzljVar2 = this.zza.zza;
                if (zzljVar2.zzae()) {
                    return;
                }
                zzljVar2.zzT(1, 19, Integer.valueOf(i));
            }
        };
        this.zzc = intConsumer;
        final zzea zzeaVarZzd = zzljVar.zzX().zzd(zzljVar.zzW(), null);
        Objects.requireNonNull(zzeaVarZzd);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzeaVarZzd.zzm(runnable);
            }
        }, intConsumer);
    }

    final /* synthetic */ void zza() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.zzc);
    }
}
