package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbip {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final void zza(zzbio zzbioVar) {
        this.zza.add(zzbioVar);
    }

    public final void zzb(zzbio zzbioVar) {
        this.zzb.add(zzbioVar);
    }

    public final void zzc(zzbio zzbioVar) {
        this.zzc.add(zzbioVar);
    }

    public final void zzd(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbio zzbioVar : this.zza) {
            if (zzbioVar.zzm() == 1) {
                zzbioVar.zzb(editor, zzbioVar.zzc(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Flag Json is null.");
        }
    }

    public final List zze() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd((zzbio) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbiy.zza());
        return arrayList;
    }

    public final List zzf() {
        List listZze = zze();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd((zzbio) it.next());
            if (!TextUtils.isEmpty(str)) {
                listZze.add(str);
            }
        }
        listZze.addAll(zzbiy.zzb());
        return listZze;
    }
}
