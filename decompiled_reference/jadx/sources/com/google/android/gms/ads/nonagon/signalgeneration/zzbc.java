package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzdzc;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbc {
    public final String zza;
    public String zzb;
    public zzcbk zzc;
    public Bundle zzd = new Bundle();
    private long zze;
    private long zzf;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzbc(JsonReader jsonReader, zzcbk zzcbkVar) throws IOException {
        Bundle bundle;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzc = zzcbkVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.zze = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -995427962:
                    if (strNextName.equals("params")) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.zzf = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzd.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue() || zzcbkVar == null || (bundle = zzcbkVar.zzm) == null) {
            return;
        }
        bundle.putLong(zzdzc.GET_SIGNALS_SDKCORE_START.zza(), this.zze);
        zzcbkVar.zzm.putLong(zzdzc.GET_SIGNALS_SDKCORE_END.zza(), this.zzf);
    }
}
