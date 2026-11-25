package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfxe extends AsyncTask {
    private zzfxf zza;
    protected final zzfww zzd;

    public zzfxe(zzfww zzfwwVar) {
        this.zzd = zzfwwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfxf zzfxfVar = this.zza;
        if (zzfxfVar != null) {
            zzfxfVar.zzb(this);
        }
    }

    public final void zzb(zzfxf zzfxfVar) {
        this.zza = zzfxfVar;
    }
}
