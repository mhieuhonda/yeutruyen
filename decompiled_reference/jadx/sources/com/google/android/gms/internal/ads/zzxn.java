package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzxn {
    default void zzB(zzak zzakVar) {
    }

    void zzE(zzxj zzxjVar);

    zzxj zzH(zzxl zzxlVar, zzabm zzabmVar, long j);

    default zzbf zzI() {
        return null;
    }

    default boolean zzJ() {
        return true;
    }

    zzak zzK();

    void zzm(Handler handler, zzxw zzxwVar);

    void zzn(zzxw zzxwVar);

    void zzo(Handler handler, zzum zzumVar);

    void zzp(zzum zzumVar);

    default void zzq(zzxm zzxmVar, zzqh zzqhVar, zzabr zzabrVar) {
        zzabrVar.zze();
        throw new IllegalStateException("prepareSource(MediaSourceCaller, TransferListener, PlayerId) not implemented");
    }

    void zzr(zzxm zzxmVar);

    void zzs(zzxm zzxmVar);

    void zzt(zzxm zzxmVar);

    void zzu() throws IOException;
}
