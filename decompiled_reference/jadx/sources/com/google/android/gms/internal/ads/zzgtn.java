package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgtn {
    private final String zza;
    private final zzgtm zzb;
    private zzgtm zzc;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzgtm zzgtmVar = this.zzb.zzb;
        String str = "";
        while (zzgtmVar != null) {
            Object obj = zzgtmVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzgtmVar = zzgtmVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzgtn zza(Object obj) {
        zzgtm zzgtmVar = new zzgtm();
        this.zzc.zzb = zzgtmVar;
        this.zzc = zzgtmVar;
        zzgtmVar.zza = obj;
        return this;
    }

    /* synthetic */ zzgtn(String str, byte[] bArr) {
        zzgtm zzgtmVar = new zzgtm();
        this.zzb = zzgtmVar;
        this.zzc = zzgtmVar;
        str.getClass();
        this.zza = str;
    }
}
