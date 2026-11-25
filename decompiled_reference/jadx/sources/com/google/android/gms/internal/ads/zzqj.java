package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqj {
    public static final zzqj zza;
    static final zzgww zzb;
    private static final zzgwt zzc;
    private static final zzgwt zzd;
    private static final zzgwt zze;
    private final SparseArray zzf = new SparseArray();
    private final int zzg;
    private final zzgwt zzh;
    private final zzgwt zzi;

    static {
        zzgwt zzgwtVarZzj = zzgwt.zzj(12);
        zzc = zzgwtVarZzj;
        zzgwt zzgwtVarZzi = zzgwt.zzi();
        zzd = zzgwtVarZzi;
        zza = new zzqj(zzgwt.zzj(zzqi.zza), zzgwtVarZzj, zzgwtVarZzi);
        zze = zzgwt.zzl(2, 5, 6);
        zzgwv zzgwvVar = new zzgwv();
        zzgwvVar.zza(5, 6);
        zzgwvVar.zza(17, 6);
        zzgwvVar.zza(7, 6);
        zzgwvVar.zza(30, 10);
        zzgwvVar.zza(18, 6);
        zzgwvVar.zza(6, 8);
        zzgwvVar.zza(8, 8);
        zzgwvVar.zza(14, 8);
        zzb = zzgwvVar.zzc();
    }

    private zzqj(List list, List list2, List list3) {
        for (int i = 0; i < list.size(); i++) {
            zzqi zzqiVar = (zzqi) list.get(i);
            this.zzf.put(zzqiVar.zzb, zzqiVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            iMax = Math.max(iMax, ((zzqi) this.zzf.valueAt(i2)).zzc);
        }
        this.zzg = iMax;
        this.zzh = zzgwt.zzq(list2);
        this.zzi = zzgwt.zzq(list3);
    }

    static zzqj zza(Context context, zzd zzdVar, AudioDeviceInfo audioDeviceInfo, List list) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo, list);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    static zzqj zzb(Context context, Intent intent, zzd zzdVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager audioManagerZza = zzcj.zza(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List<AudioDeviceInfo> audioDevicesForAttributes = audioManagerZza.getAudioDevicesForAttributes(zzdVar.zza());
                if (audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = null;
                } else {
                    audioDeviceInfo = audioDevicesForAttributes.get(0);
                }
            } else {
                audioDeviceInfo = null;
            }
        }
        zzgwt zzgwtVarZza = audioDeviceInfo != null ? zzue.zza(audioDeviceInfo) : zzc;
        if (Build.VERSION.SDK_INT >= 33 && (zzfm.zzR(context) || zzfm.zzS(context))) {
            List<AudioProfile> directProfilesForAttributes = audioManagerZza.getDirectProfilesForAttributes(zzdVar.zza());
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzhaq.zzg(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile audioProfile = directProfilesForAttributes.get(i);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (zzfm.zzE(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzhaq.zzg(audioProfile.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzhaq.zzg(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            int i2 = zzgwt.zzd;
            zzgwq zzgwqVar = new zzgwq();
            for (Map.Entry entry : map.entrySet()) {
                zzgwqVar.zzf(new zzqi(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzqj(zzgwqVar.zzi(), zzgwtVarZza, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? audioManagerZza.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (zztx.zza(audioDeviceInfo2.getType())) {
                return new zzqj(zzgwt.zzj(zzqi.zza), zzgwtVarZza, list);
            }
        }
        zzgxc zzgxcVar = new zzgxc();
        zzgxcVar.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzfm.zzR(context) || zzfm.zzS(context))) {
            int i3 = zzgwt.zzd;
            zzgwq zzgwqVar2 = new zzgwq();
            zzgzh it = zzb.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (Build.VERSION.SDK_INT >= zzfm.zzH(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzdVar.zza())) {
                    zzgwqVar2.zzf(Integer.valueOf(iIntValue));
                }
            }
            zzgwqVar2.zzf((Object) 2);
            zzgxcVar.zzg(zzgwqVar2.zzi());
            return new zzqj(zzh(zzhaq.zzf(zzgxcVar.zzh()), 10), zzgwtVarZza, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zzg()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzgxcVar.zzg(zze);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzqj(zzh(zzhaq.zzf(zzgxcVar.zzh()), 10), zzgwtVarZza, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzgxcVar.zzg(zzhaq.zzg(intArrayExtra));
        }
        return new zzqj(zzh(zzhaq.zzf(zzgxcVar.zzh()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), zzgwtVarZza, list);
    }

    static Uri zzc() {
        if (zzg()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zzg() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    private static zzgwt zzh(int[] iArr, int i) {
        int i2 = zzgwt.zzd;
        zzgwq zzgwqVar = new zzgwq();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            zzgwqVar.zzf(new zzqi(i3, i));
        }
        return zzgwqVar.zzi();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqj)) {
            return false;
        }
        zzqj zzqjVar = (zzqj) obj;
        SparseArray sparseArray = this.zzf;
        SparseArray<?> sparseArray2 = zzqjVar.zzf;
        String str = zzfm.zza;
        if (Build.VERSION.SDK_INT < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                    }
                }
                if (this.zzg != zzqjVar.zzg) {
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.zzg != zzqjVar.zzg && Objects.equals(this.zzh, zzqjVar.zzh) && Objects.equals(this.zzi, zzqjVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzfm.zza;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzf;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i2)) * 31) + Objects.hashCode(sparseArray.valueAt(i2));
            }
            iContentHashCode = iKeyAt;
        }
        return (((((this.zzg * 31) + iContentHashCode) * 31) + Objects.hashCode(this.zzh)) * 31) + Objects.hashCode(this.zzi);
    }

    public final String toString() {
        zzgwt zzgwtVar = this.zzi;
        zzgwt zzgwtVar2 = this.zzh;
        String string = this.zzf.toString();
        String strValueOf = String.valueOf(zzgwtVar2);
        String strValueOf2 = String.valueOf(zzgwtVar);
        int i = this.zzg;
        int length = String.valueOf(i).length();
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 28 + String.valueOf(strValueOf).length() + 26 + String.valueOf(strValueOf2).length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(string);
        sb.append(", speakerLayoutChannelMasks=");
        sb.append(strValueOf);
        sb.append(", spatializerChannelMasks=");
        sb.append(strValueOf2);
        sb.append("]");
        return sb.toString();
    }

    public final zzgwt zzd() {
        return this.zzh;
    }

    public final zzgwt zze() {
        return this.zzi;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d A[PHI: r1
      0x003d: PHI (r1v5 int) = (r1v4 int), (r1v9 int) binds: [B:11:0x002f, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    public final Pair zzf(zzv zzvVar, zzd zzdVar) {
        int iZza;
        String str = zzvVar.zzp;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(iZzg))) {
            return null;
        }
        int i = 6;
        if (iZzg != 18) {
            if (iZzg != 8) {
                if (iZzg == 30 && !zzfm.zza(this.zzf, 30)) {
                    iZzg = 7;
                }
            } else if (zzfm.zza(this.zzf, 8)) {
                iZzg = 8;
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else {
                iZzg = 7;
            }
        } else if (zzfm.zza(this.zzf, 18)) {
            iZzg = 18;
            if (iZzg != 8) {
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else if (zzfm.zza(this.zzf, 8)) {
                iZzg = 8;
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else {
                iZzg = 7;
            }
        } else {
            iZzg = 6;
        }
        SparseArray sparseArray = this.zzf;
        if (!zzfm.zza(sparseArray, iZzg)) {
            return null;
        }
        zzqi zzqiVar = (zzqi) sparseArray.get(iZzg);
        zzqiVar.getClass();
        int i2 = zzvVar.zzH;
        if (i2 == -1 || iZzg == 18) {
            int i3 = zzvVar.zzJ;
            if (i3 == -1) {
                i3 = 48000;
            }
            iZza = zzqiVar.zza(i3, zzdVar);
        } else {
            if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                if (!zzqiVar.zzb(i2, zzvVar)) {
                    return null;
                }
            } else if (i2 > 10) {
                return null;
            }
            iZza = i2;
        }
        if (Build.VERSION.SDK_INT > 28) {
            i = iZza;
        } else if (iZza == 7) {
            i = 8;
        } else if (iZza != 3 && iZza != 4 && iZza != 5) {
            i = iZza;
        }
        if (Build.VERSION.SDK_INT <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iZzG = zzvVar.zzI;
        if (iZzG == -1 || i2 != i) {
            iZzG = zzfm.zzG(i);
        }
        if (iZzG != 0) {
            return Pair.create(Integer.valueOf(iZzg), Integer.valueOf(iZzG));
        }
        return null;
    }
}
