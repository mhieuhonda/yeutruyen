package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpw implements zzqf {
    public static final zzguj zza = zzpu.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzqe zzf;
    private zzbf zzg;
    private String zzh;
    private long zzi;

    public zzpw() {
        throw null;
    }

    public zzpw(zzguj zzgujVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzl(zznp zznpVar) {
        if (zznpVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpv zzpvVar = (zzpv) this.zze.get(str);
                zzpvVar.getClass();
                zzm(zzpvVar);
                return;
            }
            return;
        }
        zzpv zzpvVar2 = (zzpv) this.zze.get(this.zzh);
        int i = zznpVar.zzc;
        zzxl zzxlVar = zznpVar.zzd;
        this.zzh = zzo(i, zzxlVar).zze();
        zzc(zznpVar);
        if (zzxlVar == null || !zzxlVar.zzb()) {
            return;
        }
        if (zzpvVar2 != null) {
            if (zzpvVar2.zzg() == zzxlVar.zzd && zzpvVar2.zzh() != null) {
                zzxl zzxlVarZzh = zzpvVar2.zzh();
                if (zzxlVarZzh.zzb == zzxlVar.zzb) {
                    zzxl zzxlVarZzh2 = zzpvVar2.zzh();
                    if (zzxlVarZzh2.zzc == zzxlVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i, new zzxl(zzxlVar.zza, zzxlVar.zzd));
    }

    private final void zzm(zzpv zzpvVar) {
        if (zzpvVar.zzg() != -1 && zzpvVar.zzi()) {
            this.zzi = zzpvVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpv zzpvVar = (zzpv) this.zze.get(this.zzh);
        return (zzpvVar == null || zzpvVar.zzg() == -1) ? this.zzi + 1 : zzpvVar.zzg();
    }

    private final zzpv zzo(int i, zzxl zzxlVar) {
        HashMap map = this.zze;
        long j = Long.MAX_VALUE;
        zzpv zzpvVar = null;
        for (zzpv zzpvVar2 : map.values()) {
            zzpvVar2.zzc(i, zzxlVar);
            if (zzpvVar2.zzb(i, zzxlVar)) {
                long jZzg = zzpvVar2.zzg();
                if (jZzg == -1 || jZzg < j) {
                    zzpvVar = zzpvVar2;
                    j = jZzg;
                } else if (jZzg == j) {
                    String str = zzfm.zza;
                    if (zzpvVar.zzh() != null && zzpvVar2.zzh() != null) {
                        zzpvVar = zzpvVar2;
                    }
                }
            }
        }
        if (zzpvVar != null) {
            return zzpvVar;
        }
        String strZzp = zzp();
        zzpv zzpvVar3 = new zzpv(this, strZzp, i, zzxlVar);
        map.put(strZzp, zzpvVar3);
        return zzpvVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zza(zzqe zzqeVar) {
        this.zzf = zzqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized String zzb(zzbf zzbfVar, zzxl zzxlVar) {
        return zzo(zzbfVar.zzo(zzxlVar.zza, this.zzd).zzc, zzxlVar).zze();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:14:0x0023, B:16:0x002f, B:18:0x0037, B:20:0x003f, B:22:0x0049, B:25:0x0052, B:27:0x0058, B:29:0x006d, B:30:0x0086, B:32:0x008c, B:33:0x008f, B:35:0x009b, B:37:0x00a1, B:43:0x00b2), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:14:0x0023, B:16:0x002f, B:18:0x0037, B:20:0x003f, B:22:0x0049, B:25:0x0052, B:27:0x0058, B:29:0x006d, B:30:0x0086, B:32:0x008c, B:33:0x008f, B:35:0x009b, B:37:0x00a1, B:43:0x00b2), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:14:0x0023, B:16:0x002f, B:18:0x0037, B:20:0x003f, B:22:0x0049, B:25:0x0052, B:27:0x0058, B:29:0x006d, B:30:0x0086, B:32:0x008c, B:33:0x008f, B:35:0x009b, B:37:0x00a1, B:43:0x00b2), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:14:0x0023, B:16:0x002f, B:18:0x0037, B:20:0x003f, B:22:0x0049, B:25:0x0052, B:27:0x0058, B:29:0x006d, B:30:0x0086, B:32:0x008c, B:33:0x008f, B:35:0x009b, B:37:0x00a1, B:43:0x00b2), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized void zzc(zznp zznpVar) {
        int i;
        zzpv zzpvVarZzo;
        Object obj;
        int i2;
        zzpv zzpvVarZzo2;
        zzpv zzpvVar;
        if (this.zzf == null) {
            throw null;
        }
        zzbf zzbfVar = zznpVar.zzb;
        if (!zzbfVar.zzg()) {
            zzxl zzxlVar = zznpVar.zzd;
            if (zzxlVar != null) {
                long j = zzxlVar.zzd;
                if ((j == -1 || j >= zzi()) && ((zzpvVar = (zzpv) this.zze.get(this.zzh)) == null || zzpvVar.zzg() != -1 || zzpvVar.zzf() == zznpVar.zzc)) {
                    i = zznpVar.zzc;
                    zzpvVarZzo = zzo(i, zzxlVar);
                    if (this.zzh == null) {
                        this.zzh = zzpvVarZzo.zze();
                    }
                    if (zzxlVar != null && zzxlVar.zzb()) {
                        obj = zzxlVar.zza;
                        long j2 = zzxlVar.zzd;
                        i2 = zzxlVar.zzb;
                        zzpvVarZzo2 = zzo(i, new zzxl(obj, j2, i2));
                        if (!zzpvVarZzo2.zzi()) {
                            zzpvVarZzo2.zzj(true);
                            zzbd zzbdVar = this.zzd;
                            zzbfVar.zzo(obj, zzbdVar);
                            zzbdVar.zzc(i2);
                            Math.max(0L, zzfm.zzs(0L) + zzfm.zzs(0L));
                        }
                    }
                    if (!zzpvVarZzo.zzi()) {
                        zzpvVarZzo.zzj(true);
                    }
                    if (zzpvVarZzo.zze().equals(this.zzh) && !zzpvVarZzo.zzk()) {
                        zzpvVarZzo.zzl(true);
                        this.zzf.zzc(zznpVar, zzpvVarZzo.zze());
                    }
                }
            } else {
                i = zznpVar.zzc;
                zzpvVarZzo = zzo(i, zzxlVar);
                if (this.zzh == null) {
                    this.zzh = zzpvVarZzo.zze();
                }
                if (zzxlVar != null) {
                    obj = zzxlVar.zza;
                    long j3 = zzxlVar.zzd;
                    i2 = zzxlVar.zzb;
                    zzpvVarZzo2 = zzo(i, new zzxl(obj, j3, i2));
                    if (!zzpvVarZzo2.zzi()) {
                        zzpvVarZzo2.zzj(true);
                        zzbd zzbdVar2 = this.zzd;
                        zzbfVar.zzo(obj, zzbdVar2);
                        zzbdVar2.zzc(i2);
                        Math.max(0L, zzfm.zzs(0L) + zzfm.zzs(0L));
                    }
                }
                if (!zzpvVarZzo.zzi()) {
                    zzpvVarZzo.zzj(true);
                }
                if (zzpvVarZzo.zze().equals(this.zzh)) {
                    zzpvVarZzo.zzl(true);
                    this.zzf.zzc(zznpVar, zzpvVarZzo.zze());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized void zzd(zznp zznpVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzbf zzbfVar = this.zzg;
        this.zzg = zznpVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpv zzpvVar = (zzpv) it.next();
            if (!zzpvVar.zza(zzbfVar, this.zzg) || zzpvVar.zzd(zznpVar)) {
                it.remove();
                if (zzpvVar.zze().equals(this.zzh)) {
                    zzm(zzpvVar);
                }
                if (zzpvVar.zzi()) {
                    this.zzf.zzd(zznpVar, zzpvVar.zze(), false);
                }
            }
        }
        zzl(zznpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized void zze(zznp zznpVar, int i) {
        if (this.zzf == null) {
            throw null;
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpv zzpvVar = (zzpv) it.next();
            if (zzpvVar.zzd(zznpVar)) {
                it.remove();
                boolean zEquals = zzpvVar.zze().equals(this.zzh);
                if (zEquals) {
                    zzm(zzpvVar);
                }
                if (zzpvVar.zzi()) {
                    boolean z = false;
                    if (i == 0 && zEquals && zzpvVar.zzk()) {
                        z = true;
                    }
                    this.zzf.zzd(zznpVar, zzpvVar.zze(), z);
                }
            }
        }
        zzl(zznpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized void zzg(zznp zznpVar) {
        zzqe zzqeVar;
        String str = this.zzh;
        if (str != null) {
            zzpv zzpvVar = (zzpv) this.zze.get(str);
            if (zzpvVar == null) {
                throw null;
            }
            zzm(zzpvVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpv zzpvVar2 = (zzpv) it.next();
            it.remove();
            if (zzpvVar2.zzi() && (zzqeVar = this.zzf) != null) {
                zzqeVar.zzd(zznpVar, zzpvVar2.zze(), false);
            }
        }
    }

    final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }
}
