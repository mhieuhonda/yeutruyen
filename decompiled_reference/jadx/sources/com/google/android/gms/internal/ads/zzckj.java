package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzckj extends zzchl implements zzip, zznr {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcjt zzc;
    private final zzaaz zzd;
    private final zzcht zze;
    private final WeakReference zzf;
    private final zzyu zzg;
    private zzjx zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzchk zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcjw zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code duplicated, block: B:21:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e9  */
    public zzckj(Context context, zzcht zzchtVar, zzchu zzchuVar, Integer num) {
        final boolean z;
        final zzhq zzhqVar;
        this.zzb = context;
        this.zze = zzchtVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzchuVar);
        zzcjt zzcjtVar = new zzcjt();
        this.zzc = zzcjtVar;
        zzaaz zzaazVar = new zzaaz(context);
        this.zzd = zzaazVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzf().incrementAndGet();
        zznl zznlVar = new zznl(context, new zznh() { // from class: com.google.android.gms.internal.ads.zzcke
            @Override // com.google.android.gms.internal.ads.zznh
            public final /* synthetic */ zznc[] zza(Handler handler, zzaer zzaerVar, zzrx zzrxVar, zzzr zzzrVar, zzwl zzwlVar) {
                return this.zza.zzW(handler, zzaerVar, zzrxVar, zzzrVar, zzwlVar);
            }
        });
        zznlVar.zza(zzaazVar);
        zznlVar.zzb(zzcjtVar);
        zznm zznmVarZzc = zznlVar.zzc();
        this.zzh = zznmVarZzc;
        zznmVarZzc.zzD(this);
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzgtp.zzd(zzchuVar != null ? zzchuVar.zzn() : null).zza("");
        this.zzp = zzchuVar != null ? zzchuVar.zzp() : 0;
        final String strZze = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzchuVar.zzs().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcO)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcG)).booleanValue()) {
                    z = zzchtVar.zzi ? false : true;
                }
            } else if (zzchtVar.zzi) {
            }
            final zzhq zzhqVar2 = zzchtVar.zzl ? new zzhq() { // from class: com.google.android.gms.internal.ads.zzcjz
                @Override // com.google.android.gms.internal.ads.zzhq
                public final /* synthetic */ zzhr zza() {
                    return this.zza.zzS(strZze, z);
                }
            } : zzchtVar.zzh > 0 ? new zzhq() { // from class: com.google.android.gms.internal.ads.zzckb
                @Override // com.google.android.gms.internal.ads.zzhq
                public final /* synthetic */ zzhr zza() {
                    return this.zza.zzU(strZze, z);
                }
            } : new zzhq() { // from class: com.google.android.gms.internal.ads.zzcka
                @Override // com.google.android.gms.internal.ads.zzhq
                public final /* synthetic */ zzhr zza() {
                    return this.zza.zzT(strZze, z);
                }
            };
            zzhqVar = zzchtVar.zzi ? new zzhq() { // from class: com.google.android.gms.internal.ads.zzckc
                @Override // com.google.android.gms.internal.ads.zzhq
                public final /* synthetic */ zzhr zza() {
                    return this.zza.zzV(zzhqVar2);
                }
            } : zzhqVar2;
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzi.limit()];
                this.zzi.get(bArr);
                zzhqVar = new zzhq() { // from class: com.google.android.gms.internal.ads.zzckd
                    @Override // com.google.android.gms.internal.ads.zzhq
                    public final /* synthetic */ zzhr zza() {
                        int i = zzckj.zza;
                        zzhr zzhrVarZza = zzhqVar.zza();
                        byte[] bArr2 = bArr;
                        return new zzcjx(new zzhm(bArr2), bArr2.length, zzhrVarZza);
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.zzi.limit()];
            this.zzi.get(bArr2);
            zzhqVar = new zzhq() { // from class: com.google.android.gms.internal.ads.zzcjy
                @Override // com.google.android.gms.internal.ads.zzhq
                public final /* synthetic */ zzhr zza() {
                    int i = zzckj.zza;
                    return new zzhm(bArr2);
                }
            };
        }
        this.zzg = new zzyu(zzhqVar, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzq)).booleanValue() ? zzckg.zza : zzckf.zza);
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzA(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcjs zzcjsVar = (zzcjs) ((WeakReference) it.next()).get();
            if (zzcjsVar != null) {
                zzcjsVar.zzk(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzC() {
        return this.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzD() {
        return this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzE(boolean z) {
        this.zzh.zzj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzF(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzG(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzH() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j = this.zzn;
                    Map mapZzj = ((zzik) arrayList.remove(0)).zzj();
                    long j2 = 0;
                    if (mapZzj != null) {
                        for (Map.Entry entry : mapZzj.entrySet()) {
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzgsz.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzM(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzF();
            if (i >= 2) {
                return;
            }
            zzaaz zzaazVar = this.zzd;
            zzaam zzaamVarZzd = zzaazVar.zzc().zzd();
            zzaamVarZzd.zzy(i, !z);
            zzaazVar.zzf(zzaamVarZzd);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzN() {
        return this.zzh.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzO() {
        return this.zzl;
    }

    final zzxn zzR(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.zzb(uri);
        zzak zzakVarZzc = zzzVar.zzc();
        zzyu zzyuVar = this.zzg;
        zzyuVar.zza(this.zze.zzf);
        return zzyuVar.zzb(zzakVarZzc);
    }

    final /* synthetic */ zzhr zzS(String str, boolean z) {
        zzckj zzckjVar = true != z ? null : this;
        zzcht zzchtVar = this.zze;
        return new zzckm(str, zzckjVar, zzchtVar.zzd, zzchtVar.zze, zzchtVar.zzm, zzchtVar.zzn);
    }

    final /* synthetic */ zzhr zzT(String str, boolean z) {
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(str);
        zzhyVar.zzf(true != z ? null : this);
        zzcht zzchtVar = this.zze;
        zzhyVar.zzc(zzchtVar.zzd);
        zzhyVar.zzd(zzchtVar.zze);
        zzhyVar.zze(true);
        return zzhyVar.zza();
    }

    final /* synthetic */ zzhr zzU(String str, boolean z) {
        zzckj zzckjVar = true != z ? null : this;
        zzcht zzchtVar = this.zze;
        zzcjs zzcjsVar = new zzcjs(str, zzckjVar, zzchtVar.zzd, zzchtVar.zze, zzchtVar.zzh);
        this.zzu.add(new WeakReference(zzcjsVar));
        return zzcjsVar;
    }

    final /* synthetic */ zzhr zzV(zzhq zzhqVar) {
        zzhr zzhrVarZza = zzhqVar.zza();
        zzcju zzcjuVar = new zzcju() { // from class: com.google.android.gms.internal.ads.zzckh
            @Override // com.google.android.gms.internal.ads.zzcju
            public final /* synthetic */ void zza(boolean z, long j) {
                this.zza.zzX(z, j);
            }
        };
        return new zzcjw(this.zzb, zzhrVarZza, this.zzo, this.zzp, this, zzcjuVar);
    }

    final /* synthetic */ zznc[] zzW(Handler handler, zzaer zzaerVar, zzrx zzrxVar, zzzr zzzrVar, zzwl zzwlVar) {
        zzvy zzvyVar = zzvy.zzb;
        Context context = this.zzb;
        zzua zzuaVar = new zzua(context, new zzve(context, null, null), zzvyVar, false, handler, zzrxVar, new zztn(context).zza());
        zzade zzadeVar = new zzade(context);
        zzadeVar.zza(zzvyVar);
        zzadeVar.zzb(handler);
        zzadeVar.zzc(zzaerVar);
        return new zznc[]{zzuaVar, zzadeVar.zzd()};
    }

    final /* synthetic */ void zzX(boolean z, long j) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            zzchkVar.zzr(z, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zza(zzhr zzhrVar, zzhv zzhvVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zzb(zzhr zzhrVar, zzhv zzhvVar, boolean z) {
        if (zzhrVar instanceof zzik) {
            synchronized (this.zzq) {
                this.zzs.add((zzik) zzhrVar);
            }
        } else if (zzhrVar instanceof zzcjw) {
            this.zzt = (zzcjw) zzhrVar;
            final zzchu zzchuVar = (zzchu) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcG)).booleanValue() && zzchuVar != null && this.zzt.zzk()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcki
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i = zzckj.zza;
                        zzchuVar.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zzc(zzhr zzhrVar, zzhv zzhvVar, boolean z, int i) {
        this.zzl += i;
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zzd(zzhr zzhrVar, zzhv zzhvVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zze(zznp zznpVar, int i) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            zzchkVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzg(zznp zznpVar, zzau zzauVar) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            zzchkVar.zzu("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzh(zznp zznpVar, zzxc zzxcVar, zzxh zzxhVar, IOException iOException, boolean z) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            if (this.zze.zzj) {
                zzchkVar.zzv("onLoadException", iOException);
            } else {
                zzchkVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzk(zznp zznpVar, zzv zzvVar, zzje zzjeVar) {
        zzchu zzchuVar = (zzchu) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcG)).booleanValue() || zzchuVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzvVar.zzo;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzvVar.zzp;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzchuVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzl(zznp zznpVar, zzv zzvVar, zzje zzjeVar) {
        zzchu zzchuVar = (zzchu) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcG)).booleanValue() || zzchuVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzvVar.zzA));
        map.put("bitRate", String.valueOf(zzvVar.zzj));
        int i = zzvVar.zzw;
        int i2 = zzvVar.zzx;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        map.put("resolution", sb.toString());
        String str = zzvVar.zzo;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzvVar.zzp;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzchuVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzm(zznp zznpVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzn(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzo(zznp zznpVar, Object obj, long j) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            zzchkVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzp(zznp zznpVar, zzbv zzbvVar) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            zzchkVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzs(zzchk zzchkVar) {
        this.zzk = zzchkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzt() {
        zzjx zzjxVar = this.zzh;
        if (zzjxVar != null) {
            zzjxVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzu(Surface surface, boolean z) {
        zzjx zzjxVar = this.zzh;
        if (zzjxVar != null) {
            zzjxVar.zzC(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzv(float f, boolean z) {
        zzjx zzjxVar = this.zzh;
        if (zzjxVar != null) {
            zzjxVar.zzB(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzw() {
        this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzx(long j) {
        this.zzh.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzy(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzz(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzxn zzycVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzycVar = zzR(uriArr[0]);
            } else {
                zzxn[] zzxnVarArr = new zzxn[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzxnVarArr[i] = zzR(uriArr[i]);
                }
                zzycVar = new zzyc(false, false, new zzww(), zzxnVarArr);
            }
            this.zzh.zzG(zzycVar);
            this.zzh.zzg();
            zzi().incrementAndGet();
        }
    }
}
