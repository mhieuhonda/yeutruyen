package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzall implements zzali {
    private final int zza;
    private final int zzb;
    private final zzeu zzc;

    public zzall(zzga zzgaVar, zzv zzvVar) {
        zzeu zzeuVar = zzgaVar.zza;
        this.zzc = zzeuVar;
        zzeuVar.zzh(12);
        int iZzH = zzeuVar.zzH();
        if ("audio/raw".equals(zzvVar.zzp)) {
            int iZzI = zzfm.zzI(zzvVar.zzK) * zzvVar.zzH;
            if (iZzH % iZzI != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzI).length() + 66 + String.valueOf(iZzH).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(iZzI);
                sb.append(", stsz sample size: ");
                sb.append(iZzH);
                zzeh.zzc("BoxParsers", sb.toString());
                iZzH = iZzI;
            }
        }
        this.zza = iZzH == 0 ? -1 : iZzH;
        this.zzb = zzeuVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzH() : i;
    }
}
