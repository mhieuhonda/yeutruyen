package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzax;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzu;
import com.google.android.gms.ads.internal.util.zzv;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.ads.internal.util.zzz;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzceg;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcft;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzcgl;
import com.google.android.gms.internal.ads.zzcja;
import com.google.android.gms.internal.ads.zzclr;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzelq;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbht zzA;
    private final zzceg zzB;
    private final zzcg zzC;
    private final zzcja zzD;
    private final zzcgl zzE;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzclr zze;
    private final zzcft zzf;
    private final zzz zzg;
    private final zzbfs zzh;
    private final zzcfk zzi;
    private final zzaa zzj;
    private final zzbhe zzk;
    private final Clock zzl;
    private final zzf zzm;
    private final zzbjd zzn;
    private final zzbjw zzo;
    private final zzax zzp;
    private final zzcbr zzq;
    private final zzcge zzr;
    private final zzbug zzs;
    private final com.google.android.gms.ads.internal.overlay.zzz zzt;
    private final zzbq zzu;
    private final zzae zzv;
    private final zzaf zzw;
    private final zzbve zzx;
    private final zzbr zzy;
    private final zzelq zzz;

    protected zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzclr zzclrVar = new zzclr();
        zzcft zzcftVar = new zzcft();
        int i = Build.VERSION.SDK_INT;
        zzz zzyVar = i >= 30 ? new zzy() : i >= 28 ? new zzx() : i >= 26 ? new zzv() : new zzu();
        zzbfs zzbfsVar = new zzbfs();
        zzcfk zzcfkVar = new zzcfk();
        zzaa zzaaVar = new zzaa();
        zzbhe zzbheVar = new zzbhe();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbjd zzbjdVar = new zzbjd();
        zzbjw zzbjwVar = new zzbjw();
        zzax zzaxVar = new zzax();
        zzcbr zzcbrVar = new zzcbr();
        zzcge zzcgeVar = new zzcge();
        zzbug zzbugVar = new zzbug();
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = new com.google.android.gms.ads.internal.overlay.zzz();
        zzbq zzbqVar = new zzbq();
        zzae zzaeVar = new zzae();
        zzaf zzafVar = new zzaf();
        zzbve zzbveVar = new zzbve();
        zzbr zzbrVar = new zzbr();
        zzelp zzelpVar = new zzelp();
        zzbht zzbhtVar = new zzbht();
        zzceg zzcegVar = new zzceg();
        zzcg zzcgVar = new zzcg();
        zzcja zzcjaVar = new zzcja();
        zzcgl zzcglVar = new zzcgl();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zzsVar;
        this.zze = zzclrVar;
        this.zzf = zzcftVar;
        this.zzg = zzyVar;
        this.zzh = zzbfsVar;
        this.zzi = zzcfkVar;
        this.zzj = zzaaVar;
        this.zzk = zzbheVar;
        this.zzl = defaultClock;
        this.zzm = zzfVar;
        this.zzn = zzbjdVar;
        this.zzo = zzbjwVar;
        this.zzp = zzaxVar;
        this.zzq = zzcbrVar;
        this.zzr = zzcgeVar;
        this.zzs = zzbugVar;
        this.zzu = zzbqVar;
        this.zzt = zzzVar;
        this.zzv = zzaeVar;
        this.zzw = zzafVar;
        this.zzx = zzbveVar;
        this.zzy = zzbrVar;
        this.zzz = zzelpVar;
        this.zzA = zzbhtVar;
        this.zzB = zzcegVar;
        this.zzC = zzcgVar;
        this.zzD = zzcjaVar;
        this.zzE = zzcglVar;
    }

    public static zzcg zzA() {
        return zza.zzC;
    }

    public static zzcja zzB() {
        return zza.zzD;
    }

    public static zzcgl zzC() {
        return zza.zzE;
    }

    public static zzceg zzD() {
        return zza.zzB;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zza() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzb() {
        return zza.zzc;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzc() {
        return zza.zzd;
    }

    public static zzclr zzd() {
        return zza.zze;
    }

    public static zzcft zze() {
        return zza.zzf;
    }

    public static zzz zzf() {
        return zza.zzg;
    }

    public static zzbfs zzg() {
        return zza.zzh;
    }

    public static zzcfk zzh() {
        return zza.zzi;
    }

    public static zzaa zzi() {
        return zza.zzj;
    }

    public static zzbhe zzj() {
        return zza.zzk;
    }

    public static Clock zzk() {
        return zza.zzl;
    }

    public static zzf zzl() {
        return zza.zzm;
    }

    public static zzbjd zzm() {
        return zza.zzn;
    }

    public static zzbjw zzn() {
        return zza.zzo;
    }

    public static zzax zzo() {
        return zza.zzp;
    }

    public static zzcbr zzp() {
        return zza.zzq;
    }

    public static zzcge zzq() {
        return zza.zzr;
    }

    public static zzbug zzr() {
        return zza.zzs;
    }

    public static zzbq zzs() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzz zzt() {
        return zza.zzt;
    }

    public static zzelq zzu() {
        return zza.zzz;
    }

    public static zzae zzv() {
        return zza.zzv;
    }

    public static zzaf zzw() {
        return zza.zzw;
    }

    public static zzbve zzx() {
        return zza.zzx;
    }

    public static zzbr zzy() {
        return zza.zzy;
    }

    public static zzbht zzz() {
        return zza.zzA;
    }
}
