package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzauo extends zzatl {
    private final Object zza;
    private final zzatq zzb;

    public zzauo(int i, String str, zzatq zzatqVar, zzatp zzatpVar) {
        super(i, str, zzatpVar);
        this.zza = new Object();
        this.zzb = zzatqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    protected final zzatr zzr(zzath zzathVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzathVar.zzb;
            Map map = zzathVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get(HttpHeaders.CONTENT_TYPE)) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzathVar.zzb);
        }
        return zzatr.zza(str, zzaui.zza(zzathVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzatl
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzatq zzatqVar;
        synchronized (this.zza) {
            zzatqVar = this.zzb;
        }
        zzatqVar.zza(str);
    }
}
