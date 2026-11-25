package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzadi extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzadh zzd;
    private boolean zze;

    /* synthetic */ zzadi(zzadh zzadhVar, SurfaceTexture surfaceTexture, boolean z, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzadhVar;
        this.zza = z;
    }

    public static synchronized boolean zza(Context context) {
        int i;
        if (!zzc) {
            try {
                if (zzdy.zza(context)) {
                    i = zzdy.zzb() ? 1 : 2;
                } else {
                    i = 0;
                }
            } catch (zzdx e) {
                String message = e.getMessage();
                String.valueOf(message);
                zzeh.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(message)));
            }
            zzb = i;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzadi zzb(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        zzgtr.zzi(z2);
        return new zzadh().zza(z ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzadh zzadhVar = this.zzd;
        synchronized (zzadhVar) {
            if (!this.zze) {
                zzadhVar.zzb();
                this.zze = true;
            }
        }
    }
}
