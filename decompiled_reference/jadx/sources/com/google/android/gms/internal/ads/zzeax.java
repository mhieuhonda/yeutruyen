package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeax {
    public final long zza;
    public final int[] zzb;

    private zzeax(long j, int[] iArr) {
        this.zza = j;
        this.zzb = iArr;
    }

    public static zzgwt zza(JsonReader jsonReader) throws IOException {
        int[] iArr;
        int i = zzgwt.zzd;
        zzgwq zzgwqVar = new zzgwq();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgwt zzgwtVarZzi = zzgwt.zzi();
            jsonReader.beginObject();
            zzeax zzeaxVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzgwq zzgwqVar2 = new zzgwq();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgwqVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgwtVarZzi = zzgwqVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgwtVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                if (zzgwtVarZzi == null) {
                    iArr = new int[0];
                } else {
                    int[] iArr2 = new int[zzgwtVarZzi.size()];
                    for (int i2 = 0; i2 < zzgwtVarZzi.size(); i2++) {
                        iArr2[i2] = ((Integer) zzgwtVarZzi.get(i2)).intValue();
                    }
                    iArr = iArr2;
                }
                zzeaxVar = new zzeax(jLongValue, iArr);
            }
            if (zzeaxVar != null) {
                zzgwqVar.zzf(zzeaxVar);
            }
        }
        jsonReader.endArray();
        return zzgwqVar.zzi();
    }
}
