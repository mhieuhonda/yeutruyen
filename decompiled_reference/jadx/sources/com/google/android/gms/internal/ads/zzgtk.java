package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtk extends zzgth implements Serializable {
    private final Pattern zza;

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final zzgtg zza(CharSequence charSequence) {
        return new zzgtj(this.zza.matcher(charSequence));
    }

    zzgtk(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
