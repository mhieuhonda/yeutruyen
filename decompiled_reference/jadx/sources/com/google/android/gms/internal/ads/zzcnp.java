package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnp implements zzbar {
    private final Context zza;
    private final zzgdl zzb;

    zzcnp(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdI)).intValue();
        int i = 2;
        if (iIntValue != 1) {
            i = (iIntValue == 2 || iIntValue != 3) ? 3 : 4;
        }
        zzgeh zzgehVarZze = zzgei.zze();
        zzgehVarZze.zza(((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdO)).floatValue());
        zzgei zzgeiVar = (zzgei) zzgehVarZze.zzbu();
        zzgej zzgejVarZzi = zzgek.zzi();
        zzgejVarZzi.zza(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdP)).booleanValue());
        zzgejVarZzi.zzb(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdR)).longValue());
        zzgek zzgekVar = (zzgek) zzgejVarZzi.zzbu();
        zzgdo zzgdoVarZzx = zzgdq.zzx();
        zzgdoVarZzx.zzl(i);
        zzgdoVarZzx.zzd(versionInfoParcel.afmaVersion);
        zzgdoVarZzx.zzm(3);
        zzgdoVarZzx.zza(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdp)).booleanValue());
        zzgdoVarZzx.zzb(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdS)).booleanValue());
        zzgdoVarZzx.zzc(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdT)).booleanValue());
        zzgdoVarZzx.zzj(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdF)).intValue() == -1);
        zzgdoVarZzx.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdH)).intValue());
        zzgdoVarZzx.zzg(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdQ)).longValue());
        zzgdoVarZzx.zzf(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdG)).intValue());
        zzgdoVarZzx.zze(zzgeiVar);
        zzgdoVarZzx.zzh(zzgekVar);
        zzgdoVarZzx.zzk(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzew)).booleanValue());
        zzgdl zzgdlVarZza = zzgdl.zza(context, zzcfy.zza, (zzgdq) zzgdoVarZzx.zzbu());
        this.zzb = zzgdlVarZza;
        zzgdlVarZza.zzb();
    }

    public final String zza() {
        int iZzh = this.zzb.zzh() - 1;
        if (iZzh == 1) {
            return "1.0";
        }
        if (iZzh != 2) {
            return iZzh != 3 ? "uns" : "3.0";
        }
        return "2.0";
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    @Deprecated
    public final void zze(int i, int i2, int i3) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        Context context = this.zza;
        float fZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        float fZzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2);
        zzgdl zzgdlVar = this.zzb;
        long j = i3;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j, 0, fZzE, fZzE2, 0);
        zzgdlVar.zzg(motionEventObtain);
        motionEventObtain.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float fZzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j, 2, fZzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgdlVar.zzg(motionEventObtain2);
        motionEventObtain2.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float fZzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j, 1, fZzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgdlVar.zzg(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzg(Context context, String str, View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzj(Context context, View view, Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}
