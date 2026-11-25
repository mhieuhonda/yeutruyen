package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevd implements zzfcs {
    private final zzfcs zza;
    private final zzflg zzb;
    private final Context zzc;
    private final zzcfk zzd;

    zzevd(zzexg zzexgVar, zzflg zzflgVar, Context context, zzcfk zzcfkVar) {
        this.zza = zzexgVar;
        this.zzb = zzflgVar;
        this.zzc = context;
        this.zzd = zzcfkVar;
    }

    private static final int zzd(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static final int zze(int i, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f);
    }

    private static final Insets zzf(Insets insets, float f) {
        return f == 0.0f ? Insets.NONE : Insets.of((int) Math.ceil(insets.left / f), (int) Math.ceil(insets.top / f), (int) Math.ceil(insets.right / f), (int) Math.ceil(insets.bottom / f));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.zzk(this.zza.zza(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzevc
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzfdb) obj);
            }
        }, zzcfy.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 com.google.android.gms.internal.ads.zzeve, still in use, count: 4, list:
          (r4v1 com.google.android.gms.internal.ads.zzeve) from 0x02d3: MOVE (r20v0 com.google.android.gms.internal.ads.zzeve) = (r4v1 com.google.android.gms.internal.ads.zzeve)
          (r4v1 com.google.android.gms.internal.ads.zzeve) from 0x0212: MOVE (r20v3 com.google.android.gms.internal.ads.zzeve) = (r4v1 com.google.android.gms.internal.ads.zzeve)
          (r4v1 com.google.android.gms.internal.ads.zzeve) from 0x0260: MOVE (r20v5 com.google.android.gms.internal.ads.zzeve) = (r4v1 com.google.android.gms.internal.ads.zzeve)
          (r4v1 com.google.android.gms.internal.ads.zzeve) from 0x017f: MOVE (r20v6 com.google.android.gms.internal.ads.zzeve) = (r4v1 com.google.android.gms.internal.ads.zzeve)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    final /* synthetic */ com.google.android.gms.internal.ads.zzeve zzc(com.google.android.gms.internal.ads.zzfdb r22) {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevd.zzc(com.google.android.gms.internal.ads.zzfdb):com.google.android.gms.internal.ads.zzeve");
    }
}
