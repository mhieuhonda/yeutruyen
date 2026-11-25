package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzciu extends zzaus {
    static final zzciu zzb = new zzciu();

    zzciu() {
    }

    @Override // com.google.android.gms.internal.ads.zzaus
    public final zzauw zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzauy();
        }
        return "mvhd".equals(str) ? new zzauz() : new zzava(str);
    }
}
