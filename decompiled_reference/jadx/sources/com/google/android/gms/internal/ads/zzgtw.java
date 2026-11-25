package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtw extends zzgtp {
    private final Object zza;

    zzgtw(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgtw) {
            return this.zza.equals(((zzgtw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 13);
        sb.append("Optional.of(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgtp
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgtp
    public final zzgtp zzb(zzgti zzgtiVar) {
        Object objApply = zzgtiVar.apply(this.zza);
        zzgtr.zzk(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzgtw(objApply);
    }
}
