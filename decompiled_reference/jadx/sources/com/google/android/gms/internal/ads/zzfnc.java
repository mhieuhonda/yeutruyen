package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfnc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnc> CREATOR = new zzfnd();

    @Nullable
    public final Context zza;
    public final zzfmz zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfmz[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfnc(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfmz[] zzfmzVarArrValues = zzfmz.values();
        this.zzh = zzfmzVarArrValues;
        int[] iArrZza = zzfna.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfnb.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfmzVarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = iArrZza[i5];
        this.zzk = i6;
        int i7 = iArrZza2[i6];
    }

    @Nullable
    public static zzfnc zza(zzfmz zzfmzVar, Context context) {
        if (zzfmzVar == zzfmz.Rewarded) {
            return new zzfnc(context, zzfmzVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhu)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhA)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhC)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhE), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhw), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhy));
        }
        if (zzfmzVar == zzfmz.Interstitial) {
            return new zzfnc(context, zzfmzVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhv)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhB)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhD)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhF), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhx), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhz));
        }
        if (zzfmzVar != zzfmz.AppOpen) {
            return null;
        }
        return new zzfnc(context, zzfmzVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhI)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhK)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhL)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhG), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhH), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhJ));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfnc(@Nullable Context context, zzfmz zzfmzVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfmz.values();
        this.zzl = zzfna.zza();
        this.zzm = zzfnb.zza();
        this.zza = context;
        this.zzi = zzfmzVar.ordinal();
        this.zzb = zzfmzVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i4;
        this.zzj = i4 - 1;
        this.zzk = 0;
    }
}
