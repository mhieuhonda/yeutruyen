package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.internal.ads.zzcdb;
import java.util.Random;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzay {
    public static final /* synthetic */ int zza = 0;
    private static final zzay zzb = new zzay();
    private final com.google.android.gms.ads.internal.util.client.zzf zzc;
    private final zzaw zzd;
    private boolean zze;
    private final VersionInfoParcel zzf;
    private final Random zzg;
    private final String zzh;

    protected zzay() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzfc(), new zzboe(), new zzcdb(), new zzbzf(), new zzbof(), new zzl());
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 261710000, true);
        Random random = new Random();
        String strZzj = com.google.android.gms.ads.internal.util.client.zzf.zzj();
        this.zzc = zzfVar;
        this.zzd = zzawVar;
        this.zze = false;
        this.zzf = versionInfoParcel;
        this.zzg = random;
        this.zzh = strZzj;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zza() {
        return zzb.zzc;
    }

    public static zzaw zzb() {
        return zzb.zzd;
    }

    public static void zzc() {
        zzb.zze = false;
    }

    public static void zzd() {
        zzb.zze = true;
    }

    public static boolean zze() {
        return zzb.zze;
    }

    public static String zzf() {
        return zzb.zzh;
    }

    public static VersionInfoParcel zzg() {
        return zzb.zzf;
    }

    public static Random zzh() {
        return zzb.zzg;
    }
}
