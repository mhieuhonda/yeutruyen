package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzelp implements zzelq {
    static /* synthetic */ zzelv zzl(String str, String str2, String str3, zzelr zzelrVar, String str4, WebView webView, String str5, String str6, zzels zzelsVar) {
        zzfvi zzfviVarZza = zzfvi.zza("Google", str2);
        zzfvh zzfvhVarZzn = zzn("javascript");
        zzfuz zzfuzVarZzp = zzp(zzelrVar.toString());
        zzfvh zzfvhVar = zzfvh.NONE;
        if (zzfvhVarZzn == zzfvhVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfuzVarZzp == null) {
            String strValueOf = String.valueOf(zzelrVar);
            String.valueOf(strValueOf);
            String strValueOf2 = String.valueOf(strValueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(strValueOf2));
            return null;
        }
        zzfvh zzfvhVarZzn2 = zzn(str4);
        if (zzfuzVarZzp != zzfuz.VIDEO || zzfvhVarZzn2 != zzfvhVar) {
            zzfuw zzfuwVarZza = zzfuw.zza(zzfviVarZza, webView, str5, "");
            return new zzelv(zzfuu.zze(zzfuv.zza(zzfuzVarZzp, zzo(zzelsVar.toString()), zzfvhVarZzn, zzfvhVarZzn2, true), zzfuwVarZza), zzfuwVarZza);
        }
        String.valueOf(str4);
        String strValueOf3 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf3));
        return null;
    }

    static /* synthetic */ zzelv zzm(String str, String str2, String str3, String str4, zzelr zzelrVar, WebView webView, String str5, String str6, zzels zzelsVar) {
        zzfvi zzfviVarZza = zzfvi.zza(str, str2);
        zzfvh zzfvhVarZzn = zzn("javascript");
        zzfvh zzfvhVarZzn2 = zzn(str4);
        zzfuz zzfuzVarZzp = zzp(zzelrVar.toString());
        zzfvh zzfvhVar = zzfvh.NONE;
        if (zzfvhVarZzn == zzfvhVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfuzVarZzp == null) {
            String strValueOf = String.valueOf(zzelrVar);
            String.valueOf(strValueOf);
            String strValueOf2 = String.valueOf(strValueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(strValueOf2));
            return null;
        }
        if (zzfuzVarZzp != zzfuz.VIDEO || zzfvhVarZzn2 != zzfvhVar) {
            zzfuw zzfuwVarZzb = zzfuw.zzb(zzfviVarZza, webView, str5, "");
            return new zzelv(zzfuu.zze(zzfuv.zza(zzfuzVarZzp, zzo(zzelsVar.toString()), zzfvhVarZzn, zzfvhVarZzn2, true), zzfuwVarZzb), zzfuwVarZzb);
        }
        String.valueOf(str4);
        String strValueOf3 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf3));
        return null;
    }

    private static zzfvh zzn(String str) {
        if ("native".equals(str)) {
            return zzfvh.NATIVE;
        }
        return "javascript".equals(str) ? zzfvh.JAVASCRIPT : zzfvh.NONE;
    }

    private static zzfvc zzo(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return zzfvc.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return zzfvc.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return zzfvc.BEGIN_TO_RENDER;
        }
        return zzfvc.UNSPECIFIED;
    }

    private static zzfuz zzp(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return zzfuz.HTML_DISPLAY;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return zzfuz.VIDEO;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return zzfuz.NATIVE_DISPLAY;
        }
        return null;
    }

    private static final Object zzq(zzelo zzeloVar) {
        try {
            return zzeloVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgq)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzelo() { // from class: com.google.android.gms.internal.ads.zzeln
                @Override // com.google.android.gms.internal.ads.zzelo
                public final /* synthetic */ Object zza() {
                    if (zzfus.zzb()) {
                        return true;
                    }
                    zzfus.zza(context);
                    return Boolean.valueOf(zzfus.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgq)).booleanValue()) {
            return (String) zzq(zzele.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzelv zzc(final String str, final WebView webView, String str2, String str3, final String str4, final zzels zzelsVar, final zzelr zzelrVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgq)).booleanValue() || !zzfus.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzelv) zzq(new zzelo(str7, str, str6, zzelrVar, str4, webView, str5, str8, zzelsVar) { // from class: com.google.android.gms.internal.ads.zzelf
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzelr zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzels zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzelrVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzelsVar;
            }

            @Override // com.google.android.gms.internal.ads.zzelo
            public final /* synthetic */ Object zza() {
                return zzelp.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzelv zzd(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzels zzelsVar, final zzelr zzelrVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgq)).booleanValue() || !zzfus.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzelv) zzq(new zzelo(str5, str, str8, str4, zzelrVar, webView, str6, str7, zzelsVar) { // from class: com.google.android.gms.internal.ads.zzelg
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzelr zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzels zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzelrVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzelsVar;
            }

            @Override // com.google.android.gms.internal.ads.zzelo
            public final /* synthetic */ Object zza() {
                return zzelp.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zze(final zzfuu zzfuuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgq)).booleanValue() && zzfus.zzb()) {
            Objects.requireNonNull(zzfuuVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeld
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfuuVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zzf(final zzfuu zzfuuVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgq)).booleanValue() && zzfus.zzb()) {
                    zzfuuVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zzg(final zzfuu zzfuuVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeli
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgq)).booleanValue() && zzfus.zzb()) {
                    zzfuuVar.zzd(view, zzfvb.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zzh(final zzfuu zzfuuVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgq)).booleanValue() && zzfus.zzb()) {
                    zzfuuVar.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzfvg zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        final boolean z2 = true;
        return (zzfvg) zzq(new zzelo(webView, z2) { // from class: com.google.android.gms.internal.ads.zzelk
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzelo
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                int i = versionInfoParcel2.buddyApkVersion;
                int i2 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                return zzfvg.zza(zzfvi.zza("Google", sb.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zzj(final zzfvg zzfvgVar, final zzfvf zzfvfVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzell
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfvgVar.zzb(zzfvfVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zzk(final zzfvg zzfvgVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfvgVar.zzd(view, zzfvb.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
