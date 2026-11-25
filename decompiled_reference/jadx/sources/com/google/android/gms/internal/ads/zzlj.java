package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlj extends zzf implements zzjx {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdn zzB;
    private final zzfd zzC;
    private final zzli zzD;
    private final zzjz zzE;
    private final zzjz zzF;
    private int zzG;
    private int zzH;
    private boolean zzI;
    private zznj zzJ;
    private zznk zzK;
    private zzjw zzL;
    private zzax zzM;
    private zzan zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private zzev zzR;
    private zzd zzS;
    private float zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private boolean zzY;
    private zzan zzZ;
    private zzmu zzaa;
    private int zzab;
    private long zzac;
    private zzzg zzad;
    final zzabj zzb;
    final zzax zzc;
    private final zzdt zze = new zzdt(zzdp.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zznc[] zzh;
    private final zznc[] zzi;
    private final zzabi zzj;
    private final zzea zzk;
    private final zzlu zzl;
    private final zzlw zzm;
    private final zzeg zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzno zzs;
    private final Looper zzt;
    private final zzabr zzu;
    private final zzdp zzv;
    private final zzkf zzw;
    private final zzle zzx;
    private final zzfs zzy;
    private final zzfu zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzlj(zzjv zzjvVar, zzbb zzbbVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfm.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 31 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.10.0] [");
            sb.append(str);
            sb.append("]");
            zzeh.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zzjvVar.zza.getApplicationContext();
            this.zzs = (zzno) zzjvVar.zzh.apply(zzjvVar.zzb);
            this.zzX = zzjvVar.zzj;
            this.zzS = zzjvVar.zzk;
            this.zzQ = zzjvVar.zzl;
            this.zzU = false;
            this.zzA = zzjvVar.zzq;
            zzkf zzkfVar = new zzkf(this, null);
            this.zzw = zzkfVar;
            this.zzx = new zzle(null);
            zznc[] zzncVarArrZza = ((zznh) zzjvVar.zzc.zza()).zza(new Handler(zzjvVar.zzi), zzkfVar, zzkfVar, zzkfVar, zzkfVar);
            this.zzh = zzncVarArrZza;
            int length = zzncVarArrZza.length;
            this.zzi = new zznc[2];
            int i = 0;
            while (true) {
                zznc[] zzncVarArr = this.zzi;
                int length2 = zzncVarArr.length;
                if (i >= 2) {
                    break;
                }
                zznc zzncVar = this.zzh[i];
                zzncVarArr[i] = null;
                i++;
            }
            zzabi zzabiVar = (zzabi) zzjvVar.zze.zza();
            this.zzj = zzabiVar;
            zzabr zzabrVar = (zzabr) zzjvVar.zzg.zza();
            this.zzu = zzabrVar;
            this.zzr = zzjvVar.zzm;
            this.zzK = zzjvVar.zzn;
            this.zzJ = zzjvVar.zzo;
            Looper looper = zzjvVar.zzi;
            this.zzt = looper;
            zzdp zzdpVar = zzjvVar.zzb;
            this.zzv = zzdpVar;
            this.zzg = zzbbVar;
            this.zzn = new zzeg(looper, zzdpVar, new zzec() { // from class: com.google.android.gms.internal.ads.zzld
                @Override // com.google.android.gms.internal.ads.zzec
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    this.zza.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzzg(0);
            this.zzL = zzjw.zza;
            int length3 = this.zzh.length;
            zzabj zzabjVar = new zzabj(new zznf[2], new zzabb[2], zzbn.zza, null);
            this.zzb = zzabjVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzabiVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zzaxVarZze = zzawVar.zze();
            this.zzc = zzaxVarZze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVarZze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzM = zzawVar2.zze();
            this.zzk = zzdpVar.zzd(looper, null);
            zzlu zzluVar = new zzlu() { // from class: com.google.android.gms.internal.ads.zzkg
                @Override // com.google.android.gms.internal.ads.zzlu
                public final /* synthetic */ void zza(zzlt zzltVar) {
                    this.zza.zzK(zzltVar);
                }
            };
            this.zzl = zzluVar;
            this.zzaa = zzmu.zza(zzabjVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzqh zzqhVar = new zzqh(zzjvVar.zzx);
            zzlw zzlwVar = new zzlw(this.zzf, this.zzh, this.zzi, zzabiVar, zzabjVar, (zzma) zzjvVar.zzf.zza(), zzabrVar, 0, false, this.zzs, this.zzK, zzjvVar.zzz, zzjvVar.zzp, false, zzjvVar.zzy, looper, zzdpVar, zzluVar, zzqhVar, null, this.zzL, this.zzx);
            this.zzm = zzlwVar;
            Looper looperZzn = zzlwVar.zzn();
            this.zzT = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzN = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i2 = zzda.zza;
            this.zzV = true;
            zze(this.zzs);
            zzabrVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.zzf;
                final boolean z = zzjvVar.zzv;
                zzdpVar.zzd(zzlwVar.zzn(), null).zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzqd zzqdVarZza = zzqd.zza(context);
                        if (zzqdVarZza == null) {
                            zzeh.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.zzD(zzqdVarZza);
                        }
                        zzqhVar.zzb(zzqdVarZza.zzb());
                    }
                });
            }
            zzdn zzdnVar = new zzdn(0, looperZzn, looper, zzdpVar, new zzdm() { // from class: com.google.android.gms.internal.ads.zzkr
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzL(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdnVar;
            zzdnVar.zzd(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzM();
                }
            });
            new zzbz(zzjvVar.zza, looperZzn, zzjvVar.zzi, this.zzw, zzdpVar);
            boolean z2 = (zzjvVar.zzs == Integer.MAX_VALUE || zzjvVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfs zzfsVar = new zzfs(zzjvVar.zza, looperZzn, zzdpVar);
            this.zzy = zzfsVar;
            zzfsVar.zza(z2);
            this.zzz = new zzfu(zzjvVar.zza, looperZzn, zzdpVar);
            int i3 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzR = zzev.zza;
            this.zzD = Build.VERSION.SDK_INT >= 34 ? new zzli(this, zzjvVar.zza, null) : null;
            this.zzE = new zzjz(this, 1, null);
            this.zzF = new zzjz(this, 2, null);
            this.zzC = new zzfd(this, this.zzw, zzdpVar, zzjvVar.zzr, zzjvVar.zzs, zzjvVar.zzt, zzjvVar.zzu);
            zzlwVar.zzg(this.zzJ);
            zzlwVar.zzi(this.zzS, false);
            zzau(1, 3, this.zzS);
            zzau(2, 4, Integer.valueOf(this.zzQ));
            zzau(2, 5, 0);
            zzau(1, 9, Boolean.valueOf(this.zzU));
            zzau(6, 8, this.zzx);
            zzau(-1, 16, Integer.valueOf(this.zzX));
        } finally {
            this.zze.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzP(zzjm zzjmVar) {
        zzmu zzmuVar = this.zzaa;
        zzmu zzmuVarZzh = zzmuVar.zzh(zzmuVar.zzb);
        zzmuVarZzh.zzq = zzmuVarZzh.zzs;
        zzmuVarZzh.zzr = 0L;
        zzmu zzmuVarZzam = zzam(zzmuVarZzh, 1);
        if (zzjmVar != null) {
            zzmuVarZzam = zzmuVarZzam.zzf(zzjmVar);
        }
        this.zzG++;
        this.zzm.zzh();
        zzaj(zzmuVarZzam, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzag(zzmu zzmuVar) {
        zzbf zzbfVar = zzmuVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmuVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzah(zzmu zzmuVar) {
        zzxl zzxlVar = zzmuVar.zzb;
        if (!zzxlVar.zzb()) {
            return zzfm.zzs(zzai(zzmuVar));
        }
        zzbf zzbfVar = zzmuVar.zza;
        zzbfVar.zzo(zzxlVar.zza, this.zzp);
        long j = zzmuVar.zzc;
        if (j != -9223372036854775807L) {
            return zzfm.zzs(0L) + zzfm.zzs(j);
        }
        long j2 = zzbfVar.zzb(zzag(zzmuVar), this.zza, 0L).zzl;
        return zzfm.zzs(0L);
    }

    private final long zzai(zzmu zzmuVar) {
        zzbf zzbfVar = zzmuVar.zza;
        if (zzbfVar.zzg()) {
            return zzfm.zzt(this.zzac);
        }
        boolean z = zzmuVar.zzp;
        long j = zzmuVar.zzs;
        zzxl zzxlVar = zzmuVar.zzb;
        if (zzxlVar.zzb()) {
            return j;
        }
        zzao(zzbfVar, zzxlVar, j);
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:104:0x0290  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:108:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:111:0x030b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0311  */
    /* JADX WARN: Code duplicated, block: B:114:0x031d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0326  */
    /* JADX WARN: Code duplicated, block: B:119:0x0332  */
    /* JADX WARN: Code duplicated, block: B:122:0x0340  */
    /* JADX WARN: Code duplicated, block: B:124:0x0354  */
    /* JADX WARN: Code duplicated, block: B:126:0x0364  */
    /* JADX WARN: Code duplicated, block: B:129:0x0374  */
    /* JADX WARN: Code duplicated, block: B:132:0x0382  */
    /* JADX WARN: Code duplicated, block: B:137:0x0395  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:151:0x0406  */
    /* JADX WARN: Code duplicated, block: B:152:0x0408  */
    /* JADX WARN: Code duplicated, block: B:156:0x0415  */
    /* JADX WARN: Code duplicated, block: B:157:0x041a  */
    /* JADX WARN: Code duplicated, block: B:159:0x042c  */
    /* JADX WARN: Code duplicated, block: B:160:0x042f  */
    /* JADX WARN: Code duplicated, block: B:163:0x043b  */
    /* JADX WARN: Code duplicated, block: B:164:0x043d  */
    /* JADX WARN: Code duplicated, block: B:166:0x044d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0458  */
    /* JADX WARN: Code duplicated, block: B:171:0x046a  */
    /* JADX WARN: Code duplicated, block: B:172:0x046c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0479  */
    /* JADX WARN: Code duplicated, block: B:179:0x0489  */
    /* JADX WARN: Code duplicated, block: B:182:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:187:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x04af  */
    /* JADX WARN: Code duplicated, block: B:192:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:200:0x04c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:205:0x04d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:213:0x04e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:215:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:218:0x04f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:223:0x050f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0116  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x0170 A[LOOP:1: B:58:0x016a->B:60:0x0170, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x018d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0190  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x021f  */
    /* JADX WARN: Code duplicated, block: B:90:0x022d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0235  */
    /* JADX WARN: Code duplicated, block: B:93:0x0242  */
    /* JADX WARN: Code duplicated, block: B:95:0x0247  */
    /* JADX WARN: Code duplicated, block: B:96:0x024e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0251  */
    /* JADX WARN: Code duplicated, block: B:99:0x0259  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private final void zzaj(zzmu zzmuVar, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        Pair pair;
        boolean z3;
        boolean z4;
        int i5;
        boolean zBooleanValue;
        final int iIntValue;
        zzlj zzljVar;
        final zzmu zzmuVar2;
        final zzak zzakVar;
        zzam zzamVarZza;
        List list;
        int i6;
        zzap zzapVar;
        int i7;
        zzbf zzbfVarZzq;
        zzan zzanVarZzw;
        boolean zEquals;
        int i8;
        int i9;
        int i10;
        zzjm zzjmVar;
        zzjm zzjmVar2;
        zzabj zzabjVar;
        zzabj zzabjVar2;
        zzax zzaxVar;
        zzf zzfVar;
        zzbf zzbfVarZzq2;
        zzax zzaxVar2;
        boolean z5;
        zzbf zzbfVarZzq3;
        ?? r15;
        int iZzi;
        int i11;
        boolean z6;
        ?? Zzq;
        int iZzs;
        ?? r4;
        zzbf zzbfVarZzq4;
        long j2;
        zzbf zzbfVarZzq5;
        boolean z7;
        boolean zZzg;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        zzax zzaxVarZze;
        zzeg zzegVar;
        zzbd zzbdVar;
        int i12;
        int i13;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        long jZzak;
        long jZzak2;
        int iZzs2;
        int iZzr;
        int i14;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        long jZzs;
        long jZzs2;
        zzxl zzxlVar;
        final int i15 = i2;
        zzmu zzmuVar3 = this.zzaa;
        this.zzaa = zzmuVar;
        zzbf zzbfVar = zzmuVar.zza;
        if (!zzbfVar.zzg()) {
            Object obj5 = zzmuVar.zzb.zza;
            zzgtr.zzj(zzbfVar.zze(obj5) != -1, String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", obj5, zzbfVar.getClass().getName(), Integer.valueOf(zzbfVar.zza())));
        }
        zzbf zzbfVar2 = zzmuVar3.zza;
        boolean zEquals2 = zzbfVar2.equals(zzbfVar);
        if (!zzbfVar.zzg() || !zzbfVar2.zzg()) {
            if (zzbfVar.zzg() != zzbfVar2.zzg()) {
                pair = new Pair(true, 3);
            } else {
                zzxl zzxlVar2 = zzmuVar3.zzb;
                Object obj6 = zzxlVar2.zza;
                i4 = 0;
                zzbd zzbdVar2 = this.zzp;
                int i16 = zzbfVar2.zzo(obj6, zzbdVar2).zzc;
                zzbe zzbeVar = this.zza;
                Object obj7 = zzbfVar2.zzb(i16, zzbeVar, 0L).zzb;
                zzxl zzxlVar3 = zzmuVar.zzb;
                if (obj7.equals(zzbfVar.zzb(zzbfVar.zzo(zzxlVar3.zza, zzbdVar2).zzc, zzbeVar, 0L).zzb)) {
                    if (z) {
                        if (i15 == 0) {
                            if (zzxlVar2.zzd < zzxlVar3.zzd) {
                                pair = new Pair(true, 0);
                                i15 = 0;
                                z = true;
                            } else {
                                i15 = 0;
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    pair = new Pair(false, -1);
                } else {
                    if (z) {
                        if (i15 == 0) {
                            i15 = 0;
                            i5 = 1;
                            z4 = true;
                        } else {
                            z3 = true;
                            z4 = true;
                        }
                        Pair pair2 = new Pair(true, Integer.valueOf(i5));
                        z = z4;
                        pair = pair2;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    if (z3 && i15 == 1) {
                        i5 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i5 = 3;
                    }
                    Pair pair3 = new Pair(true, Integer.valueOf(i5));
                    z = z4;
                    pair = pair3;
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (zzbfVar.zzg()) {
                    zzljVar = this;
                    zzmuVar2 = zzmuVar;
                    zzakVar = null;
                } else {
                    zzmuVar2 = zzmuVar;
                    zzljVar = this;
                    zzakVar = zzbfVar.zzb(zzbfVar.zzo(zzmuVar2.zzb.zza, zzljVar.zzp).zzc, zzljVar.zza, 0L).zzd;
                }
                zzljVar.zzZ = zzan.zza;
            } else {
                zzljVar = this;
                zzmuVar2 = zzmuVar;
                zzakVar = null;
            }
            if (zBooleanValue || !zzmuVar3.zzj.equals(zzmuVar2.zzj)) {
                zzamVarZza = zzljVar.zzZ.zza();
                list = zzmuVar2.zzj;
                for (i6 = i4; i6 < list.size(); i6++) {
                    zzapVar = (zzap) list.get(i6);
                    for (i7 = i4; i7 < zzapVar.zza(); i7++) {
                        zzapVar.zzb(i7).zza(zzamVarZza);
                    }
                }
                zzljVar.zzZ = zzamVarZza.zzw();
            }
            zzbfVarZzq = zzljVar.zzq();
            if (zzbfVarZzq.zzg()) {
                zzanVarZzw = zzljVar.zzZ;
            } else {
                zzak zzakVar4 = zzbfVarZzq.zzb(zzljVar.zzs(), zzljVar.zza, 0L).zzd;
                zzam zzamVarZza2 = zzljVar.zzZ.zza();
                zzamVarZza2.zzv(zzakVar4.zzd);
                zzanVarZzw = zzamVarZza2.zzw();
            }
            zEquals = zzanVarZzw.equals(zzljVar.zzN);
            zzljVar.zzN = zzanVarZzw;
            if (zzmuVar3.zzl != zzmuVar2.zzl) {
                i8 = 1;
            } else {
                i8 = i4;
            }
            if (zzmuVar3.zze != zzmuVar2.zze) {
                i9 = 1;
            } else {
                i9 = i4;
            }
            if (i9 == 0 || i8 != 0) {
                zzljVar.zzas();
            }
            if (zzmuVar3.zzg != zzmuVar2.zzg) {
                i10 = 1;
            } else {
                i10 = i4;
            }
            if (!zEquals2) {
                zzljVar.zzn.zze(i4, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkz
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj8) {
                        int i17 = zzlj.zzd;
                        ((zzaz) obj8).zzb(zzmuVar2.zza, i);
                    }
                });
            }
            if (z) {
                zzbdVar = new zzbd();
                if (zzbfVar2.zzg()) {
                    i12 = i3;
                    i13 = i12;
                    obj = null;
                    zzakVar2 = null;
                    obj2 = null;
                } else {
                    Object obj8 = zzmuVar3.zzb.zza;
                    zzbfVar2.zzo(obj8, zzbdVar);
                    int i17 = zzbdVar.zzc;
                    int iZze = zzbfVar2.zze(obj8);
                    zzbe zzbeVar2 = zzljVar.zza;
                    obj2 = obj8;
                    obj = zzbfVar2.zzb(i17, zzbeVar2, 0L).zzb;
                    zzakVar2 = zzbeVar2.zzd;
                    i12 = i17;
                    i13 = iZze;
                }
                if (i15 == 0) {
                    zzxlVar = zzmuVar3.zzb;
                    if (zzxlVar.zzb()) {
                        jZzak = zzbdVar.zzh(zzxlVar.zzb, zzxlVar.zzc);
                        jZzak2 = zzak(zzmuVar3);
                    } else {
                        if (zzxlVar.zze != -1) {
                            jZzak = zzak(zzljVar.zzaa);
                        } else {
                            jZzak = zzbdVar.zzd;
                        }
                        jZzak2 = jZzak;
                    }
                } else if (zzmuVar3.zzb.zzb()) {
                    jZzak = zzmuVar3.zzs;
                    jZzak2 = zzak(zzmuVar3);
                } else {
                    jZzak = zzmuVar3.zzs;
                    jZzak2 = jZzak;
                }
                String str = zzfm.zza;
                zzxl zzxlVar4 = zzmuVar3.zzb;
                final zzba zzbaVar = new zzba(obj, i12, zzakVar2, obj2, i13, zzfm.zzs(jZzak), zzfm.zzs(jZzak2), zzxlVar4.zzb, zzxlVar4.zzc);
                iZzs2 = zzljVar.zzs();
                iZzr = zzljVar.zzr();
                if (zzljVar.zzaa.zza.zzg()) {
                    i14 = iZzr;
                    obj3 = null;
                    zzakVar3 = null;
                    obj4 = null;
                } else {
                    zzmu zzmuVar4 = zzljVar.zzaa;
                    Object obj9 = zzmuVar4.zzb.zza;
                    zzmuVar4.zza.zzo(obj9, zzljVar.zzp);
                    int iZze2 = zzljVar.zzaa.zza.zze(obj9);
                    zzbf zzbfVar3 = zzljVar.zzaa.zza;
                    zzbe zzbeVar3 = zzljVar.zza;
                    i14 = iZze2;
                    obj3 = zzbfVar3.zzb(iZzs2, zzbeVar3, 0L).zzb;
                    zzakVar3 = zzbeVar3.zzd;
                    obj4 = obj9;
                }
                jZzs = zzfm.zzs(j);
                if (zzljVar.zzaa.zzb.zzb()) {
                    jZzs2 = zzfm.zzs(zzak(zzljVar.zzaa));
                } else {
                    jZzs2 = jZzs;
                }
                zzxl zzxlVar5 = zzljVar.zzaa.zzb;
                final zzba zzbaVar2 = new zzba(obj3, iZzs2, zzakVar3, obj4, i14, jZzs, jZzs2, zzxlVar5.zzb, zzxlVar5.zzc);
                zzljVar.zzn.zze(11, new zzeb() { // from class: com.google.android.gms.internal.ads.zzla
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        ((zzaz) obj10).zzo(zzbaVar, zzbaVar2, i15);
                    }
                });
            } else {
                i9 = i9;
                i10 = i10;
            }
            if (zBooleanValue) {
                zzljVar.zzn.zze(1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlb
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        ((zzaz) obj10).zzc(zzakVar, iIntValue);
                    }
                });
            }
            zzjmVar = zzmuVar3.zzf;
            zzjmVar2 = zzmuVar2.zzf;
            if (zzjmVar != zzjmVar2) {
                zzegVar = zzljVar.zzn;
                zzegVar.zze(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlc
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        ((zzaz) obj10).zzn(zzmuVar2.zzf);
                    }
                });
                if (zzjmVar2 != null) {
                    zzegVar.zze(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkh
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i18 = zzlj.zzd;
                            ((zzaz) obj10).zzm(zzmuVar2.zzf);
                        }
                    });
                }
            }
            zzabjVar = zzmuVar3.zzi;
            zzabjVar2 = zzmuVar2.zzi;
            if (zzabjVar != zzabjVar2) {
                zzljVar.zzj.zzq(zzabjVar2.zze);
                zzljVar.zzn.zze(2, new zzeb() { // from class: com.google.android.gms.internal.ads.zzki
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        ((zzaz) obj10).zzd(zzmuVar2.zzi.zzd);
                    }
                });
            }
            if (!zEquals) {
                final zzan zzanVar = zzljVar.zzN;
                zzljVar.zzn.zze(14, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkj
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        ((zzaz) obj10).zze(zzanVar);
                    }
                });
            }
            if (i10 != 0) {
                zzljVar.zzn.zze(3, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkk
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        ((zzaz) obj10).zzf(zzmuVar2.zzg);
                    }
                });
            }
            if (i9 == 0 || i8 != 0) {
                zzljVar.zzn.zze(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkl
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        zzmu zzmuVar5 = zzmuVar2;
                        ((zzaz) obj10).zzh(zzmuVar5.zzl, zzmuVar5.zze);
                    }
                });
            }
            if (i9 != 0) {
                zzljVar.zzn.zze(4, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkm
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        ((zzaz) obj10).zzi(zzmuVar2.zze);
                    }
                });
            }
            if (i8 == 0 || zzmuVar3.zzm != zzmuVar2.zzm) {
                zzljVar.zzn.zze(5, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkn
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        zzmu zzmuVar5 = zzmuVar2;
                        ((zzaz) obj10).zzj(zzmuVar5.zzl, zzmuVar5.zzm);
                    }
                });
            }
            if (zzmuVar3.zzn != zzmuVar2.zzn) {
                zzljVar.zzn.zze(6, new zzeb() { // from class: com.google.android.gms.internal.ads.zzko
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        ((zzaz) obj10).zzk(zzmuVar2.zzn);
                    }
                });
            }
            if (zzmuVar3.zzj() != zzmuVar2.zzj()) {
                zzljVar.zzn.zze(7, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkp
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        ((zzaz) obj10).zzl(zzmuVar2.zzj());
                    }
                });
            }
            if (!zzmuVar3.zzo.equals(zzmuVar2.zzo)) {
                zzljVar.zzn.zze(12, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkq
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        int i18 = zzlj.zzd;
                        ((zzaz) obj10).zzp(zzmuVar2.zzo);
                    }
                });
            }
            zzaxVar = zzljVar.zzM;
            zzbb zzbbVar = zzljVar.zzg;
            zzax zzaxVar3 = zzljVar.zzc;
            String str2 = zzfm.zza;
            boolean zZzx = zzbbVar.zzx();
            zzfVar = (zzf) zzbbVar;
            zzbfVarZzq2 = zzfVar.zzq();
            if (!zzbfVarZzq2.zzg()) {
                zzaxVar2 = zzaxVar;
                z5 = zzbfVarZzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh;
                zzbfVarZzq3 = zzfVar.zzq();
                if (zzbfVarZzq3.zzg()) {
                    i11 = -1;
                    r15 = 0;
                    z6 = false;
                } else {
                    int iZzs3 = zzfVar.zzs();
                    zzfVar.zzl();
                    zzfVar.zzm();
                    r15 = 0;
                    r15 = 0;
                    iZzi = zzbfVarZzq3.zzi(iZzs3, 0, false);
                    i11 = -1;
                    if (iZzi != -1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                Zzq = zzfVar.zzq();
                if (Zzq.zzg()) {
                    r4 = r15;
                } else {
                    iZzs = zzfVar.zzs();
                    zzfVar.zzl();
                    zzfVar.zzm();
                    if (Zzq.zzh(iZzs, r15, r15) != i11) {
                        r4 = 1;
                    } else {
                        r4 = r15;
                    }
                }
                zzbfVarZzq4 = zzfVar.zzq();
                if (!zzbfVarZzq4.zzg()) {
                    j2 = 0;
                    boolean z15 = zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb();
                    zzbfVarZzq5 = zzfVar.zzq();
                    if (zzbfVarZzq5.zzg() && zzbfVarZzq5.zzb(zzfVar.zzs(), zzfVar.zza, j2).zzi) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zZzg = zzbbVar.zzq().zzg();
                    zzaw zzawVar = new zzaw();
                    zzawVar.zzd(zzaxVar3);
                    boolean z16 = !zZzx;
                    zzawVar.zzb(4, z16);
                    if (z5 || zZzx) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    zzawVar.zzb(5, z8);
                    if (z6 || zZzx) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    zzawVar.zzb(6, z9);
                    if (!zZzg || (!(z6 || !z15 || z5) || zZzx)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zzawVar.zzb(7, z10);
                    if (r4 != 0 || zZzx) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    zzawVar.zzb(8, z11);
                    if (!zZzg || ((r4 == 0 && !(z15 && z7)) || zZzx)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    zzawVar.zzb(9, z12);
                    zzawVar.zzb(10, z16);
                    if (z5 || zZzx) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    zzawVar.zzb(11, z13);
                    if (z5 || zZzx) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    zzawVar.zzb(12, z14);
                    zzaxVarZze = zzawVar.zze();
                    this.zzM = zzaxVarZze;
                    if (!zzaxVarZze.equals(zzaxVar2)) {
                        this.zzn.zze(13, new zzeb() { // from class: com.google.android.gms.internal.ads.zzks
                            @Override // com.google.android.gms.internal.ads.zzeb
                            public final /* synthetic */ void zza(Object obj10) {
                                this.zza.zzN((zzaz) obj10);
                            }
                        });
                    }
                    this.zzn.zzf();
                    boolean z17 = zzmuVar3.zzp;
                    boolean z18 = zzmuVar2.zzp;
                }
                j2 = 0;
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg()) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                zZzg = zzbbVar.zzq().zzg();
                zzaw zzawVar2 = new zzaw();
                zzawVar2.zzd(zzaxVar3);
                boolean z19 = !zZzx;
                zzawVar2.zzb(4, z19);
                if (z5) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                zzawVar2.zzb(5, z8);
                if (z6) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                zzawVar2.zzb(6, z9);
                if (zZzg) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                zzawVar2.zzb(7, z10);
                if (r4 != 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                zzawVar2.zzb(8, z11);
                if (zZzg) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                zzawVar2.zzb(9, z12);
                zzawVar2.zzb(10, z19);
                if (z5) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zzawVar2.zzb(11, z13);
                if (z5) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                zzawVar2.zzb(12, z14);
                zzaxVarZze = zzawVar2.zze();
                this.zzM = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar2)) {
                    this.zzn.zze(13, new zzeb() { // from class: com.google.android.gms.internal.ads.zzks
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            this.zza.zzN((zzaz) obj10);
                        }
                    });
                }
                this.zzn.zzf();
                boolean z110 = zzmuVar3.zzp;
                boolean z111 = zzmuVar2.zzp;
            }
            zzaxVar2 = zzaxVar;
            zzbfVarZzq3 = zzfVar.zzq();
            if (zzbfVarZzq3.zzg()) {
                i11 = -1;
                r15 = 0;
                z6 = false;
            } else {
                int iZzs4 = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                r15 = 0;
                r15 = 0;
                iZzi = zzbfVarZzq3.zzi(iZzs4, 0, false);
                i11 = -1;
                if (iZzi != -1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            Zzq = zzfVar.zzq();
            if (Zzq.zzg()) {
                r4 = r15;
            } else {
                iZzs = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                if (Zzq.zzh(iZzs, r15, r15) != i11) {
                    r4 = 1;
                } else {
                    r4 = r15;
                }
            }
            zzbfVarZzq4 = zzfVar.zzq();
            if (!zzbfVarZzq4.zzg()) {
                j2 = 0;
                if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                }
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg()) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                zZzg = zzbbVar.zzq().zzg();
                zzaw zzawVar3 = new zzaw();
                zzawVar3.zzd(zzaxVar3);
                boolean z112 = !zZzx;
                zzawVar3.zzb(4, z112);
                if (z5) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                zzawVar3.zzb(5, z8);
                if (z6) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                zzawVar3.zzb(6, z9);
                if (zZzg) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                zzawVar3.zzb(7, z10);
                if (r4 != 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                zzawVar3.zzb(8, z11);
                if (zZzg) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                zzawVar3.zzb(9, z12);
                zzawVar3.zzb(10, z112);
                if (z5) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zzawVar3.zzb(11, z13);
                if (z5) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                zzawVar3.zzb(12, z14);
                zzaxVarZze = zzawVar3.zze();
                this.zzM = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar2)) {
                    this.zzn.zze(13, new zzeb() { // from class: com.google.android.gms.internal.ads.zzks
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            this.zza.zzN((zzaz) obj10);
                        }
                    });
                }
                this.zzn.zzf();
                boolean z113 = zzmuVar3.zzp;
                boolean z114 = zzmuVar2.zzp;
            }
            j2 = 0;
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z7 = false;
            } else {
                z7 = false;
            }
            zZzg = zzbbVar.zzq().zzg();
            zzaw zzawVar4 = new zzaw();
            zzawVar4.zzd(zzaxVar3);
            boolean z115 = !zZzx;
            zzawVar4.zzb(4, z115);
            if (z5) {
                z8 = false;
            } else {
                z8 = false;
            }
            zzawVar4.zzb(5, z8);
            if (z6) {
                z9 = false;
            } else {
                z9 = false;
            }
            zzawVar4.zzb(6, z9);
            if (zZzg) {
                z10 = false;
            } else {
                z10 = false;
            }
            zzawVar4.zzb(7, z10);
            if (r4 != 0) {
                z11 = false;
            } else {
                z11 = false;
            }
            zzawVar4.zzb(8, z11);
            if (zZzg) {
                z12 = false;
            } else {
                z12 = false;
            }
            zzawVar4.zzb(9, z12);
            zzawVar4.zzb(10, z115);
            if (z5) {
                z13 = false;
            } else {
                z13 = false;
            }
            zzawVar4.zzb(11, z13);
            if (z5) {
                z14 = false;
            } else {
                z14 = false;
            }
            zzawVar4.zzb(12, z14);
            zzaxVarZze = zzawVar4.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar2)) {
                this.zzn.zze(13, new zzeb() { // from class: com.google.android.gms.internal.ads.zzks
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj10) {
                        this.zza.zzN((zzaz) obj10);
                    }
                });
            }
            this.zzn.zzf();
            boolean z116 = zzmuVar3.zzp;
            boolean z117 = zzmuVar2.zzp;
        }
        pair = new Pair(false, -1);
        i4 = 0;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (zzbfVar.zzg()) {
                zzmuVar2 = zzmuVar;
                zzljVar = this;
                zzakVar = zzbfVar.zzb(zzbfVar.zzo(zzmuVar2.zzb.zza, zzljVar.zzp).zzc, zzljVar.zza, 0L).zzd;
            } else {
                zzljVar = this;
                zzmuVar2 = zzmuVar;
                zzakVar = null;
            }
            zzljVar.zzZ = zzan.zza;
        } else {
            zzljVar = this;
            zzmuVar2 = zzmuVar;
            zzakVar = null;
        }
        if (zBooleanValue) {
            zzamVarZza = zzljVar.zzZ.zza();
            list = zzmuVar2.zzj;
            while (i6 < list.size()) {
                zzapVar = (zzap) list.get(i6);
                while (i7 < zzapVar.zza()) {
                    zzapVar.zzb(i7).zza(zzamVarZza);
                }
            }
            zzljVar.zzZ = zzamVarZza.zzw();
        } else {
            zzamVarZza = zzljVar.zzZ.zza();
            list = zzmuVar2.zzj;
            while (i6 < list.size()) {
                zzapVar = (zzap) list.get(i6);
                while (i7 < zzapVar.zza()) {
                    zzapVar.zzb(i7).zza(zzamVarZza);
                }
            }
            zzljVar.zzZ = zzamVarZza.zzw();
        }
        zzbfVarZzq = zzljVar.zzq();
        if (zzbfVarZzq.zzg()) {
            zzanVarZzw = zzljVar.zzZ;
        } else {
            zzak zzakVar5 = zzbfVarZzq.zzb(zzljVar.zzs(), zzljVar.zza, 0L).zzd;
            zzam zzamVarZza3 = zzljVar.zzZ.zza();
            zzamVarZza3.zzv(zzakVar5.zzd);
            zzanVarZzw = zzamVarZza3.zzw();
        }
        zEquals = zzanVarZzw.equals(zzljVar.zzN);
        zzljVar.zzN = zzanVarZzw;
        if (zzmuVar3.zzl != zzmuVar2.zzl) {
            i8 = 1;
        } else {
            i8 = i4;
        }
        if (zzmuVar3.zze != zzmuVar2.zze) {
            i9 = 1;
        } else {
            i9 = i4;
        }
        if (i9 == 0) {
            zzljVar.zzas();
        } else {
            zzljVar.zzas();
        }
        if (zzmuVar3.zzg != zzmuVar2.zzg) {
            i10 = 1;
        } else {
            i10 = i4;
        }
        if (!zEquals2) {
            zzljVar.zzn.zze(i4, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkz
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj10) {
                    int i18 = zzlj.zzd;
                    ((zzaz) obj10).zzb(zzmuVar2.zza, i);
                }
            });
        }
        if (z) {
            zzbdVar = new zzbd();
            if (zzbfVar2.zzg()) {
                Object obj10 = zzmuVar3.zzb.zza;
                zzbfVar2.zzo(obj10, zzbdVar);
                int i18 = zzbdVar.zzc;
                int iZze3 = zzbfVar2.zze(obj10);
                zzbe zzbeVar4 = zzljVar.zza;
                obj2 = obj10;
                obj = zzbfVar2.zzb(i18, zzbeVar4, 0L).zzb;
                zzakVar2 = zzbeVar4.zzd;
                i12 = i18;
                i13 = iZze3;
            } else {
                i12 = i3;
                i13 = i12;
                obj = null;
                zzakVar2 = null;
                obj2 = null;
            }
            if (i15 == 0) {
                zzxlVar = zzmuVar3.zzb;
                if (zzxlVar.zzb()) {
                    jZzak = zzbdVar.zzh(zzxlVar.zzb, zzxlVar.zzc);
                    jZzak2 = zzak(zzmuVar3);
                } else {
                    if (zzxlVar.zze != -1) {
                        jZzak = zzak(zzljVar.zzaa);
                    } else {
                        jZzak = zzbdVar.zzd;
                    }
                    jZzak2 = jZzak;
                }
            } else if (zzmuVar3.zzb.zzb()) {
                jZzak = zzmuVar3.zzs;
                jZzak2 = zzak(zzmuVar3);
            } else {
                jZzak = zzmuVar3.zzs;
                jZzak2 = jZzak;
            }
            String str3 = zzfm.zza;
            zzxl zzxlVar6 = zzmuVar3.zzb;
            final zzba zzbaVar3 = new zzba(obj, i12, zzakVar2, obj2, i13, zzfm.zzs(jZzak), zzfm.zzs(jZzak2), zzxlVar6.zzb, zzxlVar6.zzc);
            iZzs2 = zzljVar.zzs();
            iZzr = zzljVar.zzr();
            if (zzljVar.zzaa.zza.zzg()) {
                zzmu zzmuVar5 = zzljVar.zzaa;
                Object obj11 = zzmuVar5.zzb.zza;
                zzmuVar5.zza.zzo(obj11, zzljVar.zzp);
                int iZze4 = zzljVar.zzaa.zza.zze(obj11);
                zzbf zzbfVar4 = zzljVar.zzaa.zza;
                zzbe zzbeVar5 = zzljVar.zza;
                i14 = iZze4;
                obj3 = zzbfVar4.zzb(iZzs2, zzbeVar5, 0L).zzb;
                zzakVar3 = zzbeVar5.zzd;
                obj4 = obj11;
            } else {
                i14 = iZzr;
                obj3 = null;
                zzakVar3 = null;
                obj4 = null;
            }
            jZzs = zzfm.zzs(j);
            if (zzljVar.zzaa.zzb.zzb()) {
                jZzs2 = zzfm.zzs(zzak(zzljVar.zzaa));
            } else {
                jZzs2 = jZzs;
            }
            zzxl zzxlVar7 = zzljVar.zzaa.zzb;
            final zzba zzbaVar4 = new zzba(obj3, iZzs2, zzakVar3, obj4, i14, jZzs, jZzs2, zzxlVar7.zzb, zzxlVar7.zzc);
            zzljVar.zzn.zze(11, new zzeb() { // from class: com.google.android.gms.internal.ads.zzla
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    ((zzaz) obj12).zzo(zzbaVar3, zzbaVar4, i15);
                }
            });
        } else {
            i9 = i9;
            i10 = i10;
        }
        if (zBooleanValue) {
            zzljVar.zzn.zze(1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlb
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    ((zzaz) obj12).zzc(zzakVar, iIntValue);
                }
            });
        }
        zzjmVar = zzmuVar3.zzf;
        zzjmVar2 = zzmuVar2.zzf;
        if (zzjmVar != zzjmVar2) {
            zzegVar = zzljVar.zzn;
            zzegVar.zze(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlc
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    ((zzaz) obj12).zzn(zzmuVar2.zzf);
                }
            });
            if (zzjmVar2 != null) {
                zzegVar.zze(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkh
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj12) {
                        int i19 = zzlj.zzd;
                        ((zzaz) obj12).zzm(zzmuVar2.zzf);
                    }
                });
            }
        }
        zzabjVar = zzmuVar3.zzi;
        zzabjVar2 = zzmuVar2.zzi;
        if (zzabjVar != zzabjVar2) {
            zzljVar.zzj.zzq(zzabjVar2.zze);
            zzljVar.zzn.zze(2, new zzeb() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    ((zzaz) obj12).zzd(zzmuVar2.zzi.zzd);
                }
            });
        }
        if (!zEquals) {
            final zzan zzanVar2 = zzljVar.zzN;
            zzljVar.zzn.zze(14, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkj
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    ((zzaz) obj12).zze(zzanVar2);
                }
            });
        }
        if (i10 != 0) {
            zzljVar.zzn.zze(3, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkk
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    ((zzaz) obj12).zzf(zzmuVar2.zzg);
                }
            });
        }
        if (i9 == 0) {
            zzljVar.zzn.zze(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkl
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    zzmu zzmuVar6 = zzmuVar2;
                    ((zzaz) obj12).zzh(zzmuVar6.zzl, zzmuVar6.zze);
                }
            });
        } else {
            zzljVar.zzn.zze(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkl
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    zzmu zzmuVar6 = zzmuVar2;
                    ((zzaz) obj12).zzh(zzmuVar6.zzl, zzmuVar6.zze);
                }
            });
        }
        if (i9 != 0) {
            zzljVar.zzn.zze(4, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    ((zzaz) obj12).zzi(zzmuVar2.zze);
                }
            });
        }
        if (i8 == 0) {
            zzljVar.zzn.zze(5, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkn
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    zzmu zzmuVar6 = zzmuVar2;
                    ((zzaz) obj12).zzj(zzmuVar6.zzl, zzmuVar6.zzm);
                }
            });
        } else {
            zzljVar.zzn.zze(5, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkn
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    zzmu zzmuVar6 = zzmuVar2;
                    ((zzaz) obj12).zzj(zzmuVar6.zzl, zzmuVar6.zzm);
                }
            });
        }
        if (zzmuVar3.zzn != zzmuVar2.zzn) {
            zzljVar.zzn.zze(6, new zzeb() { // from class: com.google.android.gms.internal.ads.zzko
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    ((zzaz) obj12).zzk(zzmuVar2.zzn);
                }
            });
        }
        if (zzmuVar3.zzj() != zzmuVar2.zzj()) {
            zzljVar.zzn.zze(7, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkp
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    ((zzaz) obj12).zzl(zzmuVar2.zzj());
                }
            });
        }
        if (!zzmuVar3.zzo.equals(zzmuVar2.zzo)) {
            zzljVar.zzn.zze(12, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkq
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    int i19 = zzlj.zzd;
                    ((zzaz) obj12).zzp(zzmuVar2.zzo);
                }
            });
        }
        zzaxVar = zzljVar.zzM;
        zzbb zzbbVar2 = zzljVar.zzg;
        zzax zzaxVar4 = zzljVar.zzc;
        String str4 = zzfm.zza;
        boolean zZzx2 = zzbbVar2.zzx();
        zzfVar = (zzf) zzbbVar2;
        zzbfVarZzq2 = zzfVar.zzq();
        if (!zzbfVarZzq2.zzg()) {
            zzaxVar2 = zzaxVar;
            if (zzbfVarZzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh) {
            }
            zzbfVarZzq3 = zzfVar.zzq();
            if (zzbfVarZzq3.zzg()) {
                i11 = -1;
                r15 = 0;
                z6 = false;
            } else {
                int iZzs5 = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                r15 = 0;
                r15 = 0;
                iZzi = zzbfVarZzq3.zzi(iZzs5, 0, false);
                i11 = -1;
                if (iZzi != -1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            Zzq = zzfVar.zzq();
            if (Zzq.zzg()) {
                r4 = r15;
            } else {
                iZzs = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                if (Zzq.zzh(iZzs, r15, r15) != i11) {
                    r4 = 1;
                } else {
                    r4 = r15;
                }
            }
            zzbfVarZzq4 = zzfVar.zzq();
            if (!zzbfVarZzq4.zzg()) {
                j2 = 0;
                if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                }
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg()) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                zZzg = zzbbVar2.zzq().zzg();
                zzaw zzawVar5 = new zzaw();
                zzawVar5.zzd(zzaxVar4);
                boolean z118 = !zZzx2;
                zzawVar5.zzb(4, z118);
                if (z5) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                zzawVar5.zzb(5, z8);
                if (z6) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                zzawVar5.zzb(6, z9);
                if (zZzg) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                zzawVar5.zzb(7, z10);
                if (r4 != 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                zzawVar5.zzb(8, z11);
                if (zZzg) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                zzawVar5.zzb(9, z12);
                zzawVar5.zzb(10, z118);
                if (z5) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zzawVar5.zzb(11, z13);
                if (z5) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                zzawVar5.zzb(12, z14);
                zzaxVarZze = zzawVar5.zze();
                this.zzM = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar2)) {
                    this.zzn.zze(13, new zzeb() { // from class: com.google.android.gms.internal.ads.zzks
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj12) {
                            this.zza.zzN((zzaz) obj12);
                        }
                    });
                }
                this.zzn.zzf();
                boolean z119 = zzmuVar3.zzp;
                boolean z1110 = zzmuVar2.zzp;
            }
            j2 = 0;
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z7 = false;
            } else {
                z7 = false;
            }
            zZzg = zzbbVar2.zzq().zzg();
            zzaw zzawVar6 = new zzaw();
            zzawVar6.zzd(zzaxVar4);
            boolean z1111 = !zZzx2;
            zzawVar6.zzb(4, z1111);
            if (z5) {
                z8 = false;
            } else {
                z8 = false;
            }
            zzawVar6.zzb(5, z8);
            if (z6) {
                z9 = false;
            } else {
                z9 = false;
            }
            zzawVar6.zzb(6, z9);
            if (zZzg) {
                z10 = false;
            } else {
                z10 = false;
            }
            zzawVar6.zzb(7, z10);
            if (r4 != 0) {
                z11 = false;
            } else {
                z11 = false;
            }
            zzawVar6.zzb(8, z11);
            if (zZzg) {
                z12 = false;
            } else {
                z12 = false;
            }
            zzawVar6.zzb(9, z12);
            zzawVar6.zzb(10, z1111);
            if (z5) {
                z13 = false;
            } else {
                z13 = false;
            }
            zzawVar6.zzb(11, z13);
            if (z5) {
                z14 = false;
            } else {
                z14 = false;
            }
            zzawVar6.zzb(12, z14);
            zzaxVarZze = zzawVar6.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar2)) {
                this.zzn.zze(13, new zzeb() { // from class: com.google.android.gms.internal.ads.zzks
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj12) {
                        this.zza.zzN((zzaz) obj12);
                    }
                });
            }
            this.zzn.zzf();
            boolean z1112 = zzmuVar3.zzp;
            boolean z1113 = zzmuVar2.zzp;
        }
        zzaxVar2 = zzaxVar;
        zzbfVarZzq3 = zzfVar.zzq();
        if (zzbfVarZzq3.zzg()) {
            i11 = -1;
            r15 = 0;
            z6 = false;
        } else {
            int iZzs6 = zzfVar.zzs();
            zzfVar.zzl();
            zzfVar.zzm();
            r15 = 0;
            r15 = 0;
            iZzi = zzbfVarZzq3.zzi(iZzs6, 0, false);
            i11 = -1;
            if (iZzi != -1) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        Zzq = zzfVar.zzq();
        if (Zzq.zzg()) {
            r4 = r15;
        } else {
            iZzs = zzfVar.zzs();
            zzfVar.zzl();
            zzfVar.zzm();
            if (Zzq.zzh(iZzs, r15, r15) != i11) {
                r4 = 1;
            } else {
                r4 = r15;
            }
        }
        zzbfVarZzq4 = zzfVar.zzq();
        if (!zzbfVarZzq4.zzg()) {
            j2 = 0;
            if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
            }
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z7 = false;
            } else {
                z7 = false;
            }
            zZzg = zzbbVar2.zzq().zzg();
            zzaw zzawVar7 = new zzaw();
            zzawVar7.zzd(zzaxVar4);
            boolean z1114 = !zZzx2;
            zzawVar7.zzb(4, z1114);
            if (z5) {
                z8 = false;
            } else {
                z8 = false;
            }
            zzawVar7.zzb(5, z8);
            if (z6) {
                z9 = false;
            } else {
                z9 = false;
            }
            zzawVar7.zzb(6, z9);
            if (zZzg) {
                z10 = false;
            } else {
                z10 = false;
            }
            zzawVar7.zzb(7, z10);
            if (r4 != 0) {
                z11 = false;
            } else {
                z11 = false;
            }
            zzawVar7.zzb(8, z11);
            if (zZzg) {
                z12 = false;
            } else {
                z12 = false;
            }
            zzawVar7.zzb(9, z12);
            zzawVar7.zzb(10, z1114);
            if (z5) {
                z13 = false;
            } else {
                z13 = false;
            }
            zzawVar7.zzb(11, z13);
            if (z5) {
                z14 = false;
            } else {
                z14 = false;
            }
            zzawVar7.zzb(12, z14);
            zzaxVarZze = zzawVar7.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar2)) {
                this.zzn.zze(13, new zzeb() { // from class: com.google.android.gms.internal.ads.zzks
                    @Override // com.google.android.gms.internal.ads.zzeb
                    public final /* synthetic */ void zza(Object obj12) {
                        this.zza.zzN((zzaz) obj12);
                    }
                });
            }
            this.zzn.zzf();
            boolean z1115 = zzmuVar3.zzp;
            boolean z1116 = zzmuVar2.zzp;
        }
        j2 = 0;
        zzbfVarZzq5 = zzfVar.zzq();
        if (zzbfVarZzq5.zzg()) {
            z7 = false;
        } else {
            z7 = false;
        }
        zZzg = zzbbVar2.zzq().zzg();
        zzaw zzawVar8 = new zzaw();
        zzawVar8.zzd(zzaxVar4);
        boolean z1117 = !zZzx2;
        zzawVar8.zzb(4, z1117);
        if (z5) {
            z8 = false;
        } else {
            z8 = false;
        }
        zzawVar8.zzb(5, z8);
        if (z6) {
            z9 = false;
        } else {
            z9 = false;
        }
        zzawVar8.zzb(6, z9);
        if (zZzg) {
            z10 = false;
        } else {
            z10 = false;
        }
        zzawVar8.zzb(7, z10);
        if (r4 != 0) {
            z11 = false;
        } else {
            z11 = false;
        }
        zzawVar8.zzb(8, z11);
        if (zZzg) {
            z12 = false;
        } else {
            z12 = false;
        }
        zzawVar8.zzb(9, z12);
        zzawVar8.zzb(10, z1117);
        if (z5) {
            z13 = false;
        } else {
            z13 = false;
        }
        zzawVar8.zzb(11, z13);
        if (z5) {
            z14 = false;
        } else {
            z14 = false;
        }
        zzawVar8.zzb(12, z14);
        zzaxVarZze = zzawVar8.zze();
        this.zzM = zzaxVarZze;
        if (!zzaxVarZze.equals(zzaxVar2)) {
            this.zzn.zze(13, new zzeb() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj12) {
                    this.zza.zzN((zzaz) obj12);
                }
            });
        }
        this.zzn.zzf();
        boolean z1118 = zzmuVar3.zzp;
        boolean z1119 = zzmuVar2.zzp;
    }

    private static long zzak(zzmu zzmuVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmuVar.zza;
        zzbfVar.zzo(zzmuVar.zzb.zza, zzbdVar);
        long j = zzmuVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    private final zzmu zzal(zzmu zzmuVar, zzbf zzbfVar, Pair pair) {
        boolean z;
        zzgtr.zza(zzbfVar.zzg() || pair != null);
        zzbf zzbfVar2 = zzmuVar.zza;
        long jZzah = zzah(zzmuVar);
        zzmu zzmuVarZzd = zzmuVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            zzxl zzxlVarZzb = zzmu.zzb();
            long jZzt = zzfm.zzt(this.zzac);
            zzmu zzmuVarZzh = zzmuVarZzd.zzc(zzxlVarZzb, jZzt, jZzt, jZzt, 0L, zzzo.zza, this.zzb, zzgwt.zzi()).zzh(zzxlVarZzb);
            zzmuVarZzh.zzq = zzmuVarZzh.zzs;
            return zzmuVarZzh;
        }
        zzxl zzxlVar = zzmuVarZzd.zzb;
        Object obj = zzxlVar.zza;
        String str = zzfm.zza;
        boolean zEquals = obj.equals(pair.first);
        zzxl zzxlVar2 = !zEquals ? new zzxl(pair.first, -1L) : zzxlVar;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzt2 = zzfm.zzt(jZzah);
        if (zzbfVar2.zzg()) {
            z = true;
        } else {
            zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (zEquals && jZzt2 - jLongValue == 1) {
                zzbd zzbdVarZzo = zzbfVar2.zzo(obj, zzbdVar);
                z = true;
                if (jZzt2 == zzbdVarZzo.zzd) {
                    jZzt2--;
                }
            } else {
                z = true;
            }
        }
        if (!zEquals || jLongValue < jZzt2) {
            zzgtr.zzi(zzxlVar2.zzb() ^ z);
            zzxl zzxlVar3 = zzxlVar2;
            zzmu zzmuVarZzh2 = zzmuVarZzd.zzc(zzxlVar3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzzo.zza : zzmuVarZzd.zzh, !zEquals ? this.zzb : zzmuVarZzd.zzi, !zEquals ? zzgwt.zzi() : zzmuVarZzd.zzj).zzh(zzxlVar3);
            zzmuVarZzh2.zzq = jLongValue;
            return zzmuVarZzh2;
        }
        if (jLongValue != jZzt2) {
            zzgtr.zzi(zzxlVar2.zzb() ^ z);
            long jMax = Math.max(0L, zzmuVarZzd.zzr - (jLongValue - jZzt2));
            long j = zzmuVarZzd.zzq;
            if (zzmuVarZzd.zzk.equals(zzxlVar)) {
                j = jLongValue + jMax;
            }
            zzmu zzmuVarZzc = zzmuVarZzd.zzc(zzxlVar2, jLongValue, jLongValue, jLongValue, jMax, zzmuVarZzd.zzh, zzmuVarZzd.zzi, zzmuVarZzd.zzj);
            zzmuVarZzc.zzq = j;
            return zzmuVarZzc;
        }
        int iZze = zzbfVar.zze(zzmuVarZzd.zzk.zza);
        if (iZze != -1) {
            zzbd zzbdVar2 = this.zzp;
            if (zzbfVar.zzd(iZze, zzbdVar2, false).zzc == zzbfVar.zzo(zzxlVar2.zza, zzbdVar2).zzc) {
                return zzmuVarZzd;
            }
        }
        Object obj2 = zzxlVar2.zza;
        zzbd zzbdVar3 = this.zzp;
        zzbfVar.zzo(obj2, zzbdVar3);
        long jZzh = zzxlVar2.zzb() ? zzbdVar3.zzh(zzxlVar2.zzb, zzxlVar2.zzc) : zzbdVar3.zzd;
        zzxl zzxlVar4 = zzxlVar2;
        zzmu zzmuVarZzh3 = zzmuVarZzd.zzc(zzxlVar4, zzmuVarZzd.zzs, zzmuVarZzd.zzs, zzmuVarZzd.zzd, jZzh - zzmuVarZzd.zzs, zzmuVarZzd.zzh, zzmuVarZzd.zzi, zzmuVarZzd.zzj).zzh(zzxlVar4);
        zzmuVarZzh3.zzq = jZzh;
        return zzmuVarZzh3;
    }

    private static zzmu zzam(zzmu zzmuVar, int i) {
        zzmu zzmuVarZze = zzmuVar.zze(i);
        return (i == 1 || i == 4) ? zzmuVarZze.zzg(false) : zzmuVarZze;
    }

    private final Pair zzan(zzbf zzbfVar, int i, long j) {
        if (zzbfVar.zzg()) {
            this.zzab = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzac = j;
            return null;
        }
        if (i == -1 || i >= zzbfVar.zza()) {
            i = zzbfVar.zzk(false);
            long j2 = zzbfVar.zzb(i, this.zza, 0L).zzl;
            j = zzfm.zzs(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i, zzfm.zzt(j));
    }

    private final long zzao(zzbf zzbfVar, zzxl zzxlVar, long j) {
        zzbfVar.zzo(zzxlVar.zza, this.zzp);
        return j;
    }

    private final zzmy zzap(zzmx zzmxVar) {
        int iZzag = zzag(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (iZzag == -1) {
            iZzag = 0;
        }
        zzdp zzdpVar = this.zzv;
        zzlw zzlwVar = this.zzm;
        return new zzmy(zzlwVar, zzmxVar, zzbfVar, iZzag, zzdpVar, zzlwVar.zzn());
    }

    private final void zzaq(Object obj) {
        Object obj2 = this.zzO;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z ? this.zzA : -9223372036854775807L);
        if (z) {
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (zZzl) {
            return;
        }
        zzP(zzjm.zzc(new zzlx(3), PointerIconCompat.TYPE_HELP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i, final int i2) {
        if (i == this.zzR.zza() && i2 == this.zzR.zzb()) {
            return;
        }
        this.zzR = new zzev(i, i2);
        zzeg zzegVar = this.zzn;
        zzegVar.zze(24, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkt
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzlj.zzd;
                ((zzaz) obj).zzu(i, i2);
            }
        });
        zzegVar.zzf();
        zzau(2, 14, new zzev(i, i2));
    }

    private final void zzas() {
        int iZzh = zzh();
        if (iZzh != 2 && iZzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzat();
            boolean z = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzat() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzfm.zza;
            String str2 = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzV) {
                throw new IllegalStateException(str2);
            }
            zzeh.zzd("ExoPlayerImpl", str2, this.zzW ? null : new IllegalStateException());
            this.zzW = true;
        }
    }

    private final void zzau(int i, int i2, Object obj) {
        zznc[] zzncVarArr = this.zzh;
        int length = zzncVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zznc zzncVar = zzncVarArr[i3];
            if (i == -1 || zzncVar.zza() == i) {
                zzmy zzmyVarZzap = zzap(zzncVar);
                zzmyVarZzap.zzb(i2);
                zzmyVarZzap.zzd(obj);
                zzmyVarZzap.zzg();
            }
        }
        zznc[] zzncVarArr2 = this.zzi;
        int length2 = zzncVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zznc zzncVar2 = zzncVarArr2[i4];
            if (zzncVar2 != null && (i == -1 || zzncVar2.zza() == i)) {
                zzmy zzmyVarZzap2 = zzap(zzncVar2);
                zzmyVarZzap2.zzb(i2);
                zzmyVarZzap2.zzd(obj);
                zzmyVarZzap2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzat();
        return zzah(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f) {
        zzat();
        String str = zzfm.zza;
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzT == fMax) {
            return;
        }
        this.zzT = fMax;
        this.zzm.zzj(fMax);
        zzeg zzegVar = this.zzn;
        zzegVar.zze(22, new zzeb() { // from class: com.google.android.gms.internal.ads.zzky
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i = zzlj.zzd;
                ((zzaz) obj).zzr(fMax);
            }
        });
        zzegVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        zzat();
        zzaq(surface);
        int i = surface == null ? 0 : -1;
        zzS(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzD(zznr zznrVar) {
        this.zzs.zzv(zznrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzE(zznr zznrVar) {
        zzat();
        this.zzs.zzw(zznrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final int zzF() {
        zzat();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzG(zzxn zzxnVar) {
        zzat();
        List listSingletonList = Collections.singletonList(zzxnVar);
        zzat();
        zzat();
        zzag(this.zzaa);
        zzu();
        this.zzG++;
        List list = this.zzq;
        list.clear();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listSingletonList.size(); i++) {
            zzmq zzmqVar = new zzmq((zzxn) listSingletonList.get(i), this.zzr);
            arrayList.add(zzmqVar);
            list.add(i, new zzlf(zzmqVar.zzb, zzmqVar.zza));
        }
        this.zzad = this.zzad.zzg().zzf(0, arrayList.size());
        zzna zznaVar = new zzna(list, this.zzad);
        if (!zznaVar.zzg() && zznaVar.zza() < 0) {
            throw new zzw(zznaVar, -1, -9223372036854775807L);
        }
        int iZzk = zznaVar.zzk(false);
        zzmu zzmuVarZzal = zzal(this.zzaa, zznaVar, zzan(zznaVar, iZzk, -9223372036854775807L));
        int i2 = zzmuVarZzal.zze;
        if (i2 == 1) {
            i2 = 1;
        } else if (zznaVar.zzg()) {
            i2 = 4;
        } else if (iZzk != -1) {
            if (iZzk >= zznaVar.zza()) {
                i2 = 4;
            } else {
                i2 = 2;
            }
        }
        zzmu zzmuVarZzam = zzam(zzmuVarZzal, i2);
        this.zzm.zzy(arrayList, iZzk, zzfm.zzt(-9223372036854775807L), this.zzad);
        zzaj(zzmuVarZzam, 0, (this.zzaa.zzb.zza.equals(zzmuVarZzam.zzb.zza) || this.zzaa.zza.zzg()) ? false : true, 4, zzai(zzmuVarZzam), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfm.zza;
        String strZza = zzal.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 34 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.10.0] [");
        sb.append(str);
        sb.append("] [");
        sb.append(strZza);
        sb.append("]");
        zzeh.zzb("ExoPlayerImpl", sb.toString());
        zzat();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzli zzliVar = this.zzD;
        if (zzliVar != null && Build.VERSION.SDK_INT >= 34) {
            zzliVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzeg zzegVar = this.zzn;
            zzegVar.zze(10, zzkx.zza);
            zzegVar.zzf();
        }
        this.zzn.zzg();
        this.zzk.zzl(null);
        zzabr zzabrVar = this.zzu;
        zzno zznoVar = this.zzs;
        zzabrVar.zzg(zznoVar);
        boolean z = this.zzaa.zzp;
        zzmu zzmuVarZzam = zzam(this.zzaa, 1);
        this.zzaa = zzmuVarZzam;
        zzmu zzmuVarZzh = zzmuVarZzam.zzh(zzmuVarZzam.zzb);
        this.zzaa = zzmuVarZzh;
        zzmuVarZzh.zzq = zzmuVarZzh.zzs;
        this.zzaa.zzr = 0L;
        zznoVar.zzy();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        int i = zzda.zza;
        this.zzY = true;
        if (this.zzaa.zza.zzg()) {
            return;
        }
        zzmu zzmuVar = this.zzaa;
        boolean z2 = zzmuVar.zza.zze(zzmuVar.zzb.zza) != -1;
        Locale locale = Locale.US;
        zzmu zzmuVar2 = this.zzaa;
        zzgtr.zzj(z2, String.format(locale, "periodUid %s not found in timeline %s with size %d", zzmuVar2.zzb.zza, zzmuVar2.zza.getClass().getName(), Integer.valueOf(this.zzaa.zza.zza())));
    }

    public final zzjm zzI() {
        zzat();
        return this.zzaa.zzf;
    }

    final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    final /* synthetic */ void zzK(final zzlt zzltVar) {
        this.zzk.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO(zzltVar);
            }
        });
    }

    final /* synthetic */ void zzL(int i, final int i2) {
        zzat();
        Integer numValueOf = Integer.valueOf(i2);
        zzau(1, 10, numValueOf);
        zzau(2, 10, numValueOf);
        zzeb zzebVar = new zzeb() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzlj.zzd;
                ((zzaz) obj).zzq(i2);
            }
        };
        zzeg zzegVar = this.zzn;
        zzegVar.zze(21, zzebVar);
        zzegVar.zzf();
    }

    final /* synthetic */ void zzM() {
        String str = zzfm.zza;
        int iGenerateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (iGenerateAudioSessionId == -1) {
            iGenerateAudioSessionId = 0;
        }
        zzdn zzdnVar = this.zzB;
        if (((Integer) zzdnVar.zza()).intValue() != iGenerateAudioSessionId) {
            Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
            zzdnVar.zzc(numValueOf);
            zzau(1, 10, numValueOf);
            zzau(2, 10, numValueOf);
        }
    }

    final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzM);
    }

    final /* synthetic */ void zzO(zzlt zzltVar) {
        int i;
        long j;
        boolean z;
        int i2 = this.zzG - zzltVar.zzb;
        this.zzG = i2;
        boolean z2 = true;
        if (zzltVar.zzc) {
            this.zzH = zzltVar.zzd;
            this.zzI = true;
        }
        if (i2 == 0) {
            zzbf zzbfVar = zzltVar.zza.zza;
            int iZzs = -1;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List listZzw = ((zzna) zzbfVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzgtr.zzi(size == list.size());
                for (int i3 = 0; i3 < listZzw.size(); i3++) {
                    ((zzlf) list.get(i3)).zzc((zzbf) listZzw.get(i3));
                }
            }
            long j2 = -9223372036854775807L;
            if (this.zzI) {
                boolean z3 = zzltVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean zEquals = zzltVar.zza.zzb.equals(this.zzaa.zzb);
                long j3 = zzltVar.zza.zzd;
                long j4 = this.zzaa.zzs;
                if (z3 || (zEquals && j3 == j4)) {
                    z2 = false;
                }
                if (z2) {
                    iZzs = zzs();
                    if (zzbfVar.zzg() || zzltVar.zza.zzb.zzb()) {
                        j2 = zzltVar.zza.zzd;
                    } else {
                        zzmu zzmuVar = zzltVar.zza;
                        zzxl zzxlVar = zzmuVar.zzb;
                        long j5 = zzmuVar.zzd;
                        zzao(zzbfVar, zzxlVar, j5);
                        j2 = j5;
                    }
                }
                z = z2;
                long j6 = j2;
                i = iZzs;
                j = j6;
            } else {
                i = -1;
                j = -9223372036854775807L;
                z = false;
            }
            this.zzI = false;
            zzaj(zzltVar.zza, 1, z, this.zzH, j, i, false);
        }
    }

    final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzaq(surface);
        this.zzP = surface;
    }

    final /* synthetic */ void zzR(Object obj) {
        zzaq(null);
    }

    final /* synthetic */ void zzT(int i, int i2, Object obj) {
        zzau(1, 19, obj);
    }

    final /* synthetic */ zzeg zzU() {
        return this.zzn;
    }

    final /* synthetic */ zzno zzV() {
        return this.zzs;
    }

    final /* synthetic */ Looper zzW() {
        return this.zzt;
    }

    final /* synthetic */ zzdp zzX() {
        return this.zzv;
    }

    final /* synthetic */ zzdn zzY() {
        return this.zzB;
    }

    final /* synthetic */ zzjz zzZ() {
        return this.zzE;
    }

    final /* synthetic */ zzjz zzaa() {
        return this.zzF;
    }

    final /* synthetic */ Object zzab() {
        return this.zzO;
    }

    final /* synthetic */ boolean zzac() {
        return this.zzU;
    }

    final /* synthetic */ void zzad(boolean z) {
        this.zzU = z;
    }

    final /* synthetic */ boolean zzae() {
        return this.zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    protected final void zzc(int i, long j, int i2, boolean z) {
        zzat();
        if (i == -1) {
            return;
        }
        zzgtr.zza(i >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzG++;
            if (zzx()) {
                zzeh.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlt zzltVar = new zzlt(this.zzaa);
                zzltVar.zza(1);
                this.zzl.zza(zzltVar);
                return;
            }
            zzmu zzmuVarZzam = this.zzaa;
            int i3 = zzmuVarZzam.zze;
            if (i3 == 3 || (i3 == 4 && !zzbfVar.zzg())) {
                zzmuVarZzam = zzam(this.zzaa, 2);
            }
            int iZzs = zzs();
            zzmu zzmuVarZzal = zzal(zzmuVarZzam, zzbfVar, zzan(zzbfVar, i, j));
            this.zzm.zzf(zzbfVar, i, zzfm.zzt(j));
            zzaj(zzmuVarZzal, 0, true, 1, zzai(zzmuVarZzal), iZzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzat();
        zzazVar.getClass();
        this.zzn.zzd(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzat();
        zzmu zzmuVar = this.zzaa;
        if (zzmuVar.zze != 1) {
            return;
        }
        zzmu zzmuVarZzf = zzmuVar.zzf(null);
        zzmu zzmuVarZzam = zzam(zzmuVarZzf, true != zzmuVarZzf.zza.zzg() ? 2 : 4);
        this.zzG++;
        this.zzm.zzd();
        zzaj(zzmuVarZzam, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzat();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzat();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z) {
        zzat();
        zzmu zzmuVar = this.zzaa;
        int i = zzmuVar.zzn;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (zzmuVar.zzl == z && i == i2 && zzmuVar.zzm == 1) {
            return;
        }
        this.zzG++;
        boolean z2 = zzmuVar.zzp;
        zzmu zzmuVarZzi = zzmuVar.zzi(z, 1, i2);
        this.zzm.zze(z, 1, i2);
        zzaj(zzmuVarZzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzat();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzat();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzat();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzat();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzat();
        zzP(null);
        new zzda(zzgwt.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzat();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzat();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzat();
        if (!this.zzaa.zza.zzg()) {
            zzmu zzmuVar = this.zzaa;
            return zzmuVar.zza.zze(zzmuVar.zzb.zza);
        }
        int i = this.zzab;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzat();
        int iZzag = zzag(this.zzaa);
        if (iZzag == -1) {
            return 0;
        }
        return iZzag;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzat();
        if (!zzx()) {
            zzbf zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                return -9223372036854775807L;
            }
            return zzfm.zzs(zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzmu zzmuVar = this.zzaa;
        zzxl zzxlVar = zzmuVar.zzb;
        zzbf zzbfVar = zzmuVar.zza;
        Object obj = zzxlVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfm.zzs(zzbdVar.zzh(zzxlVar.zzb, zzxlVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzat();
        return zzfm.zzs(zzai(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzat();
        if (zzx()) {
            zzmu zzmuVar = this.zzaa;
            return zzmuVar.zzk.equals(zzmuVar.zzb) ? zzfm.zzs(this.zzaa.zzq) : zzt();
        }
        zzat();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzmu zzmuVar2 = this.zzaa;
        long j = 0;
        if (zzmuVar2.zzk.zzd != zzmuVar2.zzb.zzd) {
            return zzfm.zzs(zzmuVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j2 = zzmuVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzmu zzmuVar3 = this.zzaa;
            zzmuVar3.zza.zzo(zzmuVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j = j2;
        }
        zzmu zzmuVar4 = this.zzaa;
        zzao(zzmuVar4.zza, zzmuVar4.zzk, j);
        return zzfm.zzs(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzat();
        return zzfm.zzs(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzat();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }
}
