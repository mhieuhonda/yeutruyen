package com.google.android.gms.internal.ads;

import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzftu {
    private final String zza;
    private final AdFormat zzb;
    private final String zzc;

    /* synthetic */ zzftu(zzftt zzfttVar, byte[] bArr) {
        this.zza = zzfttVar.zzb();
        this.zzb = zzfttVar.zzc();
        this.zzc = zzfttVar.zzd();
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzftu) {
            zzftu zzftuVar = (zzftu) obj;
            if (this.zza.equals(zzftuVar.zza) && (adFormat = this.zzb) != null && (adFormat2 = zzftuVar.zzb) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? EnvironmentCompat.MEDIA_UNKNOWN : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final String zzc() {
        return this.zzc;
    }
}
