package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfkx {
    public final List zza;
    public final zzfkq zzb;
    public final List zzc;
    public final Bundle zzd;

    zzfkx(JsonReader jsonReader, Bundle bundle) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        this.zzd = bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue() && bundle != null) {
            bundle.putLong(zzdzc.SERVER_RESPONSE_PARSE_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfkq zzfkqVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        listEmptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            listEmptyList.add(new zzfkn(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzfkqVar = new zzfkq(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcT)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdzc.NORMALIZATION_AD_RESPONSE_START.zza(), zzfkqVar.zzs);
                            bundle.putLong(zzdzc.NORMALIZATION_AD_RESPONSE_END.zza(), zzfkqVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzd = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (AppMeasurementSdk.ConditionalUserProperty.NAME.equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new zzfkw(strNextString, jSONObjectZzd));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = listEmptyList;
        this.zzb = zzfkqVar == null ? new zzfkq(new JsonReader(new StringReader("{}"))) : zzfkqVar;
    }

    public static zzfkx zza(Reader reader, Bundle bundle) throws zzfkr {
        try {
            try {
                zzfkx zzfkxVar = new zzfkx(new JsonReader(reader), bundle);
                IOUtils.closeQuietly(reader);
                return zzfkxVar;
            } catch (Throwable th) {
                IOUtils.closeQuietly(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfkr("unable to parse ServerResponse", e);
        }
    }
}
