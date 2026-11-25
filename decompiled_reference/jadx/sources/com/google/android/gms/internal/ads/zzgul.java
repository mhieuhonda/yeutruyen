package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgul implements zzguj {
    private final zzgup zza = new zzgup();
    private volatile zzguj zzb;
    private Object zzc;

    zzgul(zzguj zzgujVar) {
        this.zzb = zzgujVar;
    }

    public final String toString() {
        Object string = this.zzb;
        if (string == null) {
            String strValueOf = String.valueOf(this.zzc);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String string2 = string.toString();
        StringBuilder sb2 = new StringBuilder(string2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(string2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzguj
    public final Object zza() {
        if (this.zzb != null) {
            synchronized (this.zza) {
                if (this.zzb != null) {
                    Object objZza = this.zzb.zza();
                    this.zzc = objZza;
                    this.zzb = null;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }
}
