package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxi extends zzfxd {
    public zzfxi(zzfww zzfwwVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfwwVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfww zzfwwVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfwo.zzg(jSONObject, zzfwwVar.zzd())) {
            return null;
        }
        zzfwwVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxe, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxe
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfvs zzfvsVarZza;
        if (!TextUtils.isEmpty(str) && (zzfvsVarZza = zzfvs.zza()) != null) {
            for (zzfuy zzfuyVar : zzfvsVarZza.zze()) {
                if (this.zza.contains(zzfuyVar.zzh())) {
                    zzfuyVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
