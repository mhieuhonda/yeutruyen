package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcm extends zzbdm {
    private static final zzbdn zzh = new zzbdn();
    private final Context zzi;

    public zzbcm(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2, Context context) {
        super(zzbbzVar, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", zzaxtVar, i, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzp(ExifInterface.LONGITUDE_EAST);
        Context context = this.zzi;
        AtomicReference atomicReferenceZza = zzh.zza(context.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                if (atomicReferenceZza.get() == null) {
                    atomicReferenceZza.set((String) this.zze.invoke(null, context));
                }
            }
        }
        String str = (String) atomicReferenceZza.get();
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzp(zzazp.zza(str.getBytes(), true));
        }
    }
}
