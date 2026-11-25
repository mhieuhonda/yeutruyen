package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzp extends zzat {
    public final zzgwt zzc;

    public zzzp(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzgwt.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        zzgwt zzgwtVar = this.zzc;
        String message = super.getMessage();
        if (zzgwtVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(zzgwtVar);
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(strValueOf).length());
        sb.append(message);
        sb.append("\nsniff failures: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
