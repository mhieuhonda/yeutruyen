package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzwt extends zzwm {
    private final HashMap zza = new HashMap();
    private Handler zzb;

    protected zzwt() {
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    protected final void zzN() {
        for (zzws zzwsVar : this.zza.values()) {
            zzwsVar.zza.zzr(zzwsVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    protected void zza(zzip zzipVar) {
        this.zzb = zzfm.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    protected final void zzc() {
        for (zzws zzwsVar : this.zza.values()) {
            zzwsVar.zza.zzs(zzwsVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    protected void zzd() {
        HashMap map = this.zza;
        for (zzws zzwsVar : map.values()) {
            zzxn zzxnVar = zzwsVar.zza;
            zzxnVar.zzt(zzwsVar.zzb);
            zzwr zzwrVar = zzwsVar.zzc;
            zzxnVar.zzn(zzwrVar);
            zzxnVar.zzp(zzwrVar);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public void zzu() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzws) it.next()).zza.zzu();
        }
    }

    protected abstract void zzv(Object obj, zzxn zzxnVar, zzbf zzbfVar);

    protected final void zzw(final Object obj, zzxn zzxnVar) {
        HashMap map = this.zza;
        zzgtr.zza(!map.containsKey(obj));
        zzxm zzxmVar = new zzxm() { // from class: com.google.android.gms.internal.ads.zzwq
            @Override // com.google.android.gms.internal.ads.zzxm
            public final /* synthetic */ void zza(zzxn zzxnVar2, zzbf zzbfVar) {
                this.zza.zzv(obj, zzxnVar2, zzbfVar);
            }
        };
        zzwr zzwrVar = new zzwr(this, obj);
        map.put(obj, new zzws(zzxnVar, zzxmVar, zzwrVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzxnVar.zzm(handler, zzwrVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzxnVar.zzo(handler2, zzwrVar);
        zzxnVar.zzq(zzxmVar, zzk(), zzl());
        if (zzj()) {
            return;
        }
        zzxnVar.zzs(zzxmVar);
    }

    protected int zzx(Object obj, int i) {
        return 0;
    }

    protected zzxl zzy(Object obj, zzxl zzxlVar) {
        throw null;
    }

    protected long zzz(Object obj, long j, zzxl zzxlVar) {
        return j;
    }
}
