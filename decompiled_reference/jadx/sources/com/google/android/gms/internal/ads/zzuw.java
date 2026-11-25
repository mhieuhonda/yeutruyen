package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzuw implements zzvk {
    private final zzguj zza;
    private final zzguj zzb;
    private boolean zzc;

    public zzuw(final int i) {
        zzguj zzgujVar = new zzguj() { // from class: com.google.android.gms.internal.ads.zzuv
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzux.zzw(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzguj zzgujVar2 = new zzguj() { // from class: com.google.android.gms.internal.ads.zzuu
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzux.zzw(i, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzgujVar;
        this.zzb = zzgujVar2;
        this.zzc = true;
    }

    public final void zza(boolean z) {
        this.zzc = true;
    }

    public final zzux zzb(zzvj zzvjVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzvn zzwkVar;
        int i;
        zzvp zzvpVar = zzvjVar.zza;
        String str = zzvpVar.zza;
        zzux zzuxVar = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (this.zzc && Build.VERSION.SDK_INT >= 36) {
                    zzwkVar = new zzwk(mediaCodecCreateByCodecName);
                    i = 4;
                } else {
                    zzwkVar = new zzva(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza());
                    i = 0;
                }
                zzux zzuxVar2 = new zzux(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), zzwkVar, zzvjVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzvjVar.zzd;
                    if (surface == null && zzvpVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    zzuxVar2.zzt(zzvjVar.zzb, surface, null, i);
                    return zzuxVar2;
                } catch (Exception e) {
                    exc = e;
                    zzuxVar = zzuxVar2;
                    if (zzuxVar != null) {
                        zzuxVar.zzl();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Exception e3) {
            exc = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ zzvm zzc(zzvj zzvjVar) throws IOException {
        throw null;
    }
}
