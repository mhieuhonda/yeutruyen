package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzve implements zzvk {
    private final Context zza;

    @Deprecated
    public zzve() {
        this.zza = null;
    }

    public zzve(Context context, zzguj zzgujVar, zzguj zzgujVar2) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final zzvm zzc(zzvj zzvjVar) throws Throwable {
        Context context;
        if (Build.VERSION.SDK_INT >= 31 || ((context = this.zza) != null && Build.VERSION.SDK_INT >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int iZzf = zzas.zzf(zzvjVar.zzc.zzp);
            zzeh.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfm.zzU(iZzf)));
            zzuw zzuwVar = new zzuw(iZzf);
            zzuwVar.zza(true);
            return zzuwVar.zzb(zzvjVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzvp zzvpVar = zzvjVar.zza;
            String str = zzvpVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzvjVar.zzd;
                int i = 0;
                if (surface == null && zzvpVar.zzh && Build.VERSION.SDK_INT >= 35) {
                    i = 8;
                }
                mediaCodecCreateByCodecName.configure(zzvjVar.zzb, surface, (MediaCrypto) null, i);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new zzwj(mediaCodecCreateByCodecName, zzvjVar.zzf, null);
            } catch (IOException | RuntimeException e) {
                e = e;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        }
    }
}
