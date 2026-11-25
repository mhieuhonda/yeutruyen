package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzakc implements zzao {
    public final String zza;
    public final String zzb;

    public zzakc(String str, String str2) {
        this.zza = zzgsz.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzakc zzakcVar = (zzakc) obj;
            if (this.zza.equals(zzakcVar.zza) && this.zzb.equals(zzakcVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        Integer numZzh;
        Integer numZzh2;
        Integer numZzh3;
        Integer numZzh4;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numZzh = zzhaq.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzh(numZzh);
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numZzh2 = zzhaq.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzs(numZzh2);
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numZzh3 = zzhaq.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzg(numZzh3);
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    zzamVar.zzc(this.zzb);
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    zzamVar.zzt(this.zzb);
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    zzamVar.zza(this.zzb);
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    zzamVar.zze(this.zzb);
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numZzh4 = zzhaq.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzr(numZzh4);
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    zzamVar.zzd(this.zzb);
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    zzamVar.zzb(this.zzb);
                }
                break;
        }
    }
}
