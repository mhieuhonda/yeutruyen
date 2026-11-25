package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzalx implements zzahh {
    public static final zzalx zza = new zzalx(true);
    public static final zzalx zzb = new zzalx(false);
    public final boolean zzc;

    private zzalx(boolean z) {
        this.zzc = z;
    }

    public final String toString() {
        boolean z = !this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
