package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxh extends zzfxd {
    public zzfxh(zzfww zzfwwVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfwwVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfvs zzfvsVarZza = zzfvs.zza();
        if (zzfvsVarZza != null) {
            for (zzfuy zzfuyVar : zzfvsVarZza.zze()) {
                if (this.zza.contains(zzfuyVar.zzh())) {
                    zzfuyVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxe, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxe
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
