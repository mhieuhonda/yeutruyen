package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfsi {
    private final zzepl zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfkz zzf;
    private final zzfla zzg;
    private final Clock zzh;
    private final zzbaw zzi;

    public zzfsi(zzepl zzeplVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfkz zzfkzVar, zzfla zzflaVar, Clock clock, zzbaw zzbawVar) {
        this.zza = zzeplVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfkzVar;
        this.zzg = zzflaVar;
        this.zzh = clock;
        this.zzi = zzbawVar;
    }

    public static String zzd(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzg(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return com.google.android.gms.ads.internal.util.client.zzl.zzj() ? "fakeForAdDebugLog" : str;
    }

    public final List zza(zzfky zzfkyVar, zzfkn zzfknVar, List list) {
        return zzb(zzfkyVar, zzfknVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0190  */
    public final List zzb(zzfky zzfkyVar, zzfkn zzfknVar, boolean z, String str, String str2, List list, zzdbv zzdbvVar, zzcfl zzcflVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String strZzd = zzd(zzd(zzd((String) it.next(), "@gw_adlocid@", zzfkyVar.zza.zza.zzg), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfknVar != null) {
                String strZzd2 = zzd(zzd(zzd(strZzd, "@gw_qdata@", zzfknVar.zzy), "@gw_adnetid@", zzfknVar.zzx), "@gw_allocid@", zzfknVar.zzw);
                Context context = this.zze;
                strZzd = zzcei.zza(strZzd2, context, zzfknVar.zzW, zzfknVar.zzaw);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpk)).booleanValue() && zzfknVar.zze == 4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    strZzd = zzd(strZzd, "@gw_aps@", true == com.google.android.gms.ads.internal.util.zzs.zzJ(context) ? "1" : "0");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpv)).booleanValue() && zzcflVar != null) {
                    int i = zzcflVar.zza;
                    String strZzd3 = zzd(strZzd, "@gw_is@", i >= 0 ? Integer.toString(i) : "");
                    int i2 = zzcflVar.zzb;
                    String strZzd4 = zzd(strZzd3, "@gw_fis@", i2 >= 0 ? Integer.toString(i2) : "");
                    int i3 = zzcflVar.zzc;
                    strZzd = zzd(strZzd4, "@gw_sfis@", i3 >= 0 ? Integer.toString(i3) : "");
                }
            }
            zzepl zzeplVar = this.zza;
            String strZzd5 = zzd(zzd(zzd(zzd(strZzd, "@gw_adnetstatus@", zzeplVar.zzg()), "@gw_ttr@", Long.toString(zzeplVar.zzh(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpt)).booleanValue()) {
                strZzd5 = (zzdbvVar == null || zzdbvVar.zza() <= 0) ? zzd(strZzd5, "@gw_placement_id@", "") : zzd(strZzd5, "@gw_placement_id@", Long.toString(zzdbvVar.zza(), 10));
            }
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeB)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !zIsEmpty;
            if (z3) {
                z2 = z4;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strZzd5);
            }
            if (this.zzi.zza(Uri.parse(strZzd5))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzd5).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzd5 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzd5);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    public final List zzc(zzfkn zzfknVar, List list, zzcbw zzcbwVar) {
        zzfkz zzfkzVar;
        zzgtp zzgtpVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String strZzb = zzcbwVar.zzb();
            String string = Integer.toString(zzcbwVar.zzc());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeC)).booleanValue()) {
                zzfla zzflaVar = this.zzg;
                if (zzflaVar == null) {
                    zzgtpVarZzd = zzgtp.zzc();
                } else {
                    zzfkzVar = zzflaVar.zza;
                }
                str = (String) zzgtpVarZzd.zzb(zzfsh.zza).zza("");
                str2 = (String) zzgtpVarZzd.zzb(zzfsg.zza).zza("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzcei.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfknVar.zzW, zzfknVar.zzaw));
                }
                return arrayList;
            }
            zzfkzVar = this.zzf;
            zzgtpVarZzd = zzgtp.zzd(zzfkzVar);
            str = (String) zzgtpVarZzd.zzb(zzfsh.zza).zza("");
            str2 = (String) zzgtpVarZzd.zzb(zzfsg.zza).zza("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzcei.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfknVar.zzW, zzfknVar.zzaw));
            }
            return arrayList;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
