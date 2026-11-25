package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwi {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzvp zza() throws zzwa {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzvp) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z, boolean z2) throws zzwa {
        zzvz zzvzVar = new zzvz(str, z, z2);
        HashMap map = zzb;
        List list = (List) map.get(zzvzVar);
        if (list != null) {
            return list;
        }
        ArrayList arrayListZzh = zzh(zzvzVar, new zzwd(z, z2, str.equals("video/mv-hevc")));
        if (z) {
            arrayListZzh.isEmpty();
        }
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzvp) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzh.add(zzvp.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzj(arrayListZzh, zzwe.zza);
        }
        if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzvp) arrayListZzh.get(0)).zza)) {
            arrayListZzh.add((zzvp) arrayListZzh.remove(0));
        }
        zzgwt zzgwtVarZzq = zzgwt.zzq(arrayListZzh);
        map.put(zzvzVar, zzgwtVarZzq);
        return zzgwtVarZzq;
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzc(zzvy zzvyVar, zzv zzvVar, boolean z, boolean z2) throws zzwa {
        List listZza = zzvyVar.zza(zzvVar.zzp, z, z2);
        List listZzd = zzd(zzvyVar, zzvVar, z, z2);
        int i = zzgwt.zzd;
        zzgwq zzgwqVar = new zzgwq();
        zzgwqVar.zzh(listZza);
        zzgwqVar.zzh(listZzd);
        return zzgwqVar.zzi();
    }

    public static List zzd(zzvy zzvyVar, zzv zzvVar, boolean z, boolean z2) throws zzwa {
        String strZzg = zzg(zzvVar);
        return strZzg == null ? zzgwt.zzi() : zzvyVar.zza(strZzg, z, z2);
    }

    public static List zze(final Context context, List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzwh() { // from class: com.google.android.gms.internal.ads.zzwg
            @Override // com.google.android.gms.internal.ads.zzwh
            public final /* synthetic */ int zza(Object obj) {
                int i = zzwi.zza;
                return ((zzvp) obj).zzd(context, zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        zzdq zzdqVarZzf;
        String str = zzvVar.zzp;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (zzdqVarZzf = zzdr.zzf(zzvVar)) != null && zzdqVarZzf.zzc()) {
            int iZza = zzdqVarZzf.zza();
            if (iZza == 16 || iZza == 256) {
                return "video/hevc";
            }
            if (iZza == 512) {
                return "video/avc";
            }
            if (iZza == 1024) {
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zziVar.zzd == 6 && zziVar.zzc == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa A[EDGE_INSN: B:39:0x00aa->B:56:0x00e7 BREAK  A[LOOP:1: B:17:0x0059->B:21:0x0067]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0115  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x0123 A[Catch: Exception -> 0x01c2, TryCatch #3 {Exception -> 0x01c2, blocks: (B:58:0x00eb, B:65:0x0107, B:71:0x011b, B:73:0x0123, B:78:0x0135, B:80:0x0143, B:81:0x0148, B:83:0x0158, B:85:0x0160, B:74:0x0129), top: B:124:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0129 A[Catch: Exception -> 0x01c2, TryCatch #3 {Exception -> 0x01c2, blocks: (B:58:0x00eb, B:65:0x0107, B:71:0x011b, B:73:0x0123, B:78:0x0135, B:80:0x0143, B:81:0x0148, B:83:0x0158, B:85:0x0160, B:74:0x0129), top: B:124:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0133  */
    /* JADX WARN: Code duplicated, block: B:80:0x0143 A[Catch: Exception -> 0x01c2, TryCatch #3 {Exception -> 0x01c2, blocks: (B:58:0x00eb, B:65:0x0107, B:71:0x011b, B:73:0x0123, B:78:0x0135, B:80:0x0143, B:81:0x0148, B:83:0x0158, B:85:0x0160, B:74:0x0129), top: B:124:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0148 A[Catch: Exception -> 0x01c2, TryCatch #3 {Exception -> 0x01c2, blocks: (B:58:0x00eb, B:65:0x0107, B:71:0x011b, B:73:0x0123, B:78:0x0135, B:80:0x0143, B:81:0x0148, B:83:0x0158, B:85:0x0160, B:74:0x0129), top: B:124:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0158 A[Catch: Exception -> 0x01c2, TryCatch #3 {Exception -> 0x01c2, blocks: (B:58:0x00eb, B:65:0x0107, B:71:0x011b, B:73:0x0123, B:78:0x0135, B:80:0x0143, B:81:0x0148, B:83:0x0158, B:85:0x0160, B:74:0x0129), top: B:124:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0171 A[ADDED_TO_REGION] */
    private static ArrayList zzh(zzvz zzvzVar, zzwb zzwbVar) throws zzwa {
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        String str4;
        boolean zZzd;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean zIsHardwareAccelerated;
        String strZza;
        boolean zIsVendor;
        zzvz zzvzVar2 = zzvzVar;
        zzwb zzwbVar2 = zzwbVar;
        String str5 = "secure-playback";
        String str6 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str7 = zzvzVar2.zza;
            int iZza = zzwbVar2.zza();
            boolean zZzc = zzwbVar2.zzc();
            int i3 = 0;
            while (i3 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzwbVar2.zzb(i3);
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfoZzb.isAlias()) {
                    int i4 = iZza;
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZzc && name.endsWith(".secure"))) {
                        str = str6;
                        i = i3;
                        i2 = i4;
                    } else {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                if (!str7.equals("video/dolby-vision")) {
                                    if (!str7.equals("video/mv-hevc")) {
                                        if (!str7.equals("audio/alac") || !"OMX.lge.alac.decoder".equals(name)) {
                                            if (!str7.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(name)) {
                                                if (!str7.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                                    str2 = null;
                                                    break;
                                                }
                                                str2 = "audio/lg-ac3";
                                                break;
                                            }
                                            str2 = "audio/x-lg-flac";
                                            break;
                                        }
                                        str2 = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str2 = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str2 = "video/dv_hevc";
                                    break;
                                }
                                str2 = "video/hevcdv";
                                break;
                            }
                            int i6 = i5;
                            str2 = supportedTypes[i6];
                            if (str2.equalsIgnoreCase(str7)) {
                                break;
                            }
                            i5 = i6 + 1;
                        }
                        if (str2 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str2);
                                boolean zZzd2 = zzwbVar2.zzd(str6, str2, capabilitiesForType);
                                boolean zZze = zzwbVar2.zze(str6, str2, capabilitiesForType);
                                str = str6;
                                if (zzvzVar2.zzc) {
                                    if (zZzd2) {
                                        zZzd = zzwbVar2.zzd(str5, str2, capabilitiesForType);
                                        boolean zZze2 = zzwbVar2.zze(str5, str2, capabilitiesForType);
                                        z = zzvzVar2.zzb;
                                        if (z) {
                                            if (z) {
                                                if (zZzd) {
                                                    zZzd = true;
                                                }
                                            }
                                            str5 = str5;
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                codecCapabilities = capabilitiesForType;
                                            } else {
                                                codecCapabilities = capabilitiesForType;
                                                if (zzi(mediaCodecInfoZzb, str7)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                            }
                                            boolean zZzi = zzi(mediaCodecInfoZzb, str7);
                                            boolean z2 = zIsHardwareAccelerated;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities2 = codecCapabilities;
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzgsz.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZzc) {
                                                boolean z3 = zIsVendor;
                                                i = i3;
                                                i2 = i4;
                                                str3 = str2;
                                                str4 = name;
                                                if (zZzc) {
                                                    continue;
                                                }
                                            } else {
                                                boolean z4 = zIsVendor;
                                                i = i3;
                                                i2 = i4;
                                                str3 = str2;
                                                str4 = name;
                                                if (zZzc) {
                                                    continue;
                                                }
                                            }
                                            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                            sb.append("Failed to query codec ");
                                            sb.append(str4);
                                            sb.append(" (");
                                            sb.append(str3);
                                            sb.append(")");
                                            zzeh.zze("MediaCodecUtil", sb.toString());
                                            throw e;
                                        }
                                        if (z) {
                                            if (zZzd) {
                                                zZzd = true;
                                            }
                                        }
                                        str5 = str5;
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            if (zzi(mediaCodecInfoZzb, str7)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        boolean zZzi2 = zzi(mediaCodecInfoZzb, str7);
                                        boolean z5 = zIsHardwareAccelerated;
                                        MediaCodecInfo.CodecCapabilities codecCapabilities3 = codecCapabilities;
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzgsz.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZzc) {
                                            boolean z6 = zIsVendor;
                                            i = i3;
                                            i2 = i4;
                                            str3 = str2;
                                            str4 = name;
                                            if (zZzc) {
                                                continue;
                                            }
                                        } else {
                                            boolean z7 = zIsVendor;
                                            i = i3;
                                            i2 = i4;
                                            str3 = str2;
                                            str4 = name;
                                            if (zZzc) {
                                                continue;
                                            }
                                        }
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                        sb2.append("Failed to query codec ");
                                        sb2.append(str4);
                                        sb2.append(" (");
                                        sb2.append(str3);
                                        sb2.append(")");
                                        zzeh.zze("MediaCodecUtil", sb2.toString());
                                        throw e;
                                    }
                                } else if (!zZze) {
                                    zZzd = zzwbVar2.zzd(str5, str2, capabilitiesForType);
                                    boolean zZze3 = zzwbVar2.zze(str5, str2, capabilitiesForType);
                                    z = zzvzVar2.zzb;
                                    if (z || !zZze3) {
                                        if (z) {
                                            if (zZzd) {
                                                zZzd = true;
                                            }
                                        }
                                        str5 = str5;
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            if (zzi(mediaCodecInfoZzb, str7)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        boolean zZzi3 = zzi(mediaCodecInfoZzb, str7);
                                        boolean z8 = zIsHardwareAccelerated;
                                        MediaCodecInfo.CodecCapabilities codecCapabilities4 = codecCapabilities;
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzgsz.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = true;
                                            }
                                        }
                                        if ((zZzc || z != zZzd) && (zZzc || z)) {
                                            boolean z9 = zIsVendor;
                                            i = i3;
                                            i2 = i4;
                                            str3 = str2;
                                            str4 = name;
                                            if (zZzc && zZzd) {
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 7);
                                                sb3.append(str4);
                                                sb3.append(".secure");
                                                arrayList.add(zzvp.zza(sb3.toString(), str7, str3, codecCapabilities4, z8, zZzi3, z9, false, true));
                                                return arrayList;
                                            }
                                        } else {
                                            i2 = i4;
                                            boolean z10 = zIsVendor;
                                            i = i3;
                                            str3 = str2;
                                            try {
                                                str4 = name;
                                                try {
                                                    arrayList.add(zzvp.zza(name, str7, str3, codecCapabilities4, z8, zZzi3, z10, false, false));
                                                } catch (Exception e) {
                                                    e = e;
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                str4 = name;
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                                sb4.append("Failed to query codec ");
                                                sb4.append(str4);
                                                sb4.append(" (");
                                                sb4.append(str3);
                                                sb4.append(")");
                                                zzeh.zze("MediaCodecUtil", sb4.toString());
                                                throw e;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str3 = str2;
                            }
                        } else {
                            str = str6;
                        }
                        i = i3;
                        i2 = i4;
                    }
                } else {
                    str5 = str5;
                    str = str6;
                    i2 = iZza;
                    i = i3;
                }
                i3 = i + 1;
                zzvzVar2 = zzvzVar;
                iZza = i2;
                str5 = str5;
                str6 = str;
                zzwbVar2 = zzwbVar;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new zzwa(e4, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgsz.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.") || ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google."))) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzwh zzwhVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwf
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i = zzwi.zza;
                zzwh zzwhVar2 = zzwhVar;
                return zzwhVar2.zza(obj2) - zzwhVar2.zza(obj);
            }
        });
    }
}
