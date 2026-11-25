package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzvw extends zziz {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private boolean zzA;
    private float zzB;
    private ArrayDeque zzC;
    private zzvs zzD;
    private zzvp zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private ByteBuffer zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    protected zzjd zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private long zzad;
    private boolean zzae;
    private boolean zzaf;
    private boolean zzag;
    private zzvv zzah;
    private long zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private long zzam;
    private zzjb zzan;
    private zzjb zzao;
    private zzgxd zzap;
    private final Context zzc;
    private final zzvk zzd;
    private final zzvy zze;
    private final float zzf;
    private final zzix zzg;
    private final zzix zzh;
    private final zzix zzi;
    private final zzvd zzj;
    private final MediaCodec.BufferInfo zzk;
    private final ArrayDeque zzl;
    private final zzub zzm;
    private final AtomicInteger zzn;
    private zzv zzo;
    private zzv zzp;
    private zzuj zzq;
    private zzuj zzr;
    private zznb zzs;
    private MediaCrypto zzt;
    private long zzu;
    private float zzv;
    private float zzw;
    private zzvm zzx;
    private zzv zzy;
    private MediaFormat zzz;

    public zzvw(Context context, int i, zzvk zzvkVar, zzvy zzvyVar, boolean z, float f) {
        super(i);
        this.zzc = context.getApplicationContext();
        this.zzd = zzvkVar;
        zzvyVar.getClass();
        this.zze = zzvyVar;
        this.zzf = f;
        this.zzn = new AtomicInteger();
        this.zzg = new zzix(0, 0);
        this.zzh = new zzix(0, 0);
        this.zzi = new zzix(2, 0);
        zzvd zzvdVar = new zzvd();
        this.zzj = zzvdVar;
        this.zzk = new MediaCodec.BufferInfo();
        this.zzv = 1.0f;
        this.zzw = 1.0f;
        this.zzu = -9223372036854775807L;
        this.zzl = new ArrayDeque();
        this.zzah = zzvv.zza;
        zzvdVar.zzj(0);
        zzvdVar.zzc.order(ByteOrder.nativeOrder());
        this.zzm = new zzub();
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzW = 0;
        this.zzO = -1;
        this.zzP = -1;
        this.zzN = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzai = -9223372036854775807L;
        this.zzL = -9223372036854775807L;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzjd();
        this.zzal = false;
        this.zzam = 0L;
        this.zzap = zzgxd.zzh();
        zzjb zzjbVar = zzjb.zza;
        this.zzan = zzjbVar;
        this.zzao = zzjbVar;
    }

    private final void zzaA() {
        try {
            zzvm zzvmVar = this.zzx;
            if (zzvmVar == null) {
                throw null;
            }
            zzvmVar.zzk();
            zzaT();
        } catch (Throwable th) {
            zzaT();
            throw th;
        }
    }

    private final void zzaB() {
        this.zzac = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        zzbv().zzi(-9223372036854775807L);
        this.zzai = -9223372036854775807L;
    }

    private final boolean zzaC(int i) throws zzjm {
        zzly zzlyVarZzI = zzI();
        zzix zzixVar = this.zzg;
        zzixVar.zza();
        int iZzR = zzR(zzlyVarZzI, zzixVar, i | 4);
        if (iZzR == -5) {
            zzap(zzlyVarZzI);
            return true;
        }
        if (iZzR != -4 || !zzixVar.zzb()) {
            return false;
        }
        this.zzae = true;
        zzbt();
        return false;
    }

    private final boolean zzaD(long j) {
        return this.zzu == -9223372036854775807L || zzM().zzb() - j < this.zzu;
    }

    private final boolean zzaE() {
        return this.zzP >= 0;
    }

    private final void zzar() {
        this.zzS = false;
        zzay();
    }

    private final void zzay() {
        zzaB();
        this.zzU = false;
        this.zzj.zza();
        this.zzi.zza();
        this.zzT = false;
        this.zzm.zzb();
    }

    private final boolean zzaz() {
        if (this.zzx == null) {
            return false;
        }
        if (zzaQ()) {
            zzaO();
            return true;
        }
        if (zzaR()) {
            zzaA();
            return false;
        }
        this.zzal = true;
        return false;
    }

    protected static boolean zzbl(zzv zzvVar) {
        return zzvVar.zzP == 0;
    }

    private final void zzbo() {
        this.zzO = -1;
        this.zzh.zzc = null;
    }

    private final void zzbp() {
        this.zzP = -1;
        this.zzQ = null;
    }

    private final boolean zzbq(zzv zzvVar) throws zzjm {
        if (this.zzx != null && this.zzY != 3 && zze() != 0) {
            float f = this.zzw;
            zzvVar.getClass();
            float fZzal = zzal(f, zzvVar, zzJ());
            float f2 = this.zzB;
            if (f2 != fZzal) {
                if (fZzal == -1.0f) {
                    zzbs();
                    return false;
                }
                if (f2 != -1.0f || fZzal > this.zzf) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzal);
                    zzvm zzvmVar = this.zzx;
                    zzvmVar.getClass();
                    zzvmVar.zzp(bundle);
                    this.zzB = fZzal;
                }
            }
        }
        return true;
    }

    private final boolean zzbr() throws zzjm {
        if (this.zzZ) {
            this.zzX = 1;
            if (zzaQ()) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbw();
        }
        return true;
    }

    private final void zzbs() throws zzjm {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaO();
            zzaG();
        }
    }

    private final void zzbu(zzvv zzvvVar) {
        this.zzah = zzvvVar;
        if (zzvvVar.zzd() != -9223372036854775807L) {
            this.zzaj = true;
            zzaw(zzvvVar.zzd());
        }
    }

    private final zzvv zzbv() {
        ArrayDeque arrayDeque = this.zzl;
        return !arrayDeque.isEmpty() ? (zzvv) arrayDeque.getLast() : this.zzah;
    }

    private final boolean zzbx(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzv zzvVar = this.zzp;
        return (zzvVar != null && Objects.equals(zzvVar.zzp, "audio/opus") && zzgx.zzf(j, j2)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected void zzA(long j, boolean z, boolean z2) throws zzjm {
        ArrayDeque arrayDeque = this.zzl;
        if (!arrayDeque.isEmpty()) {
            this.zzah = (zzvv) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.zzae = false;
            this.zzaf = false;
            if (this.zzS) {
                zzay();
            } else {
                zzaP();
            }
            if (this.zzah.zze().zzc() > 0) {
                this.zzag = true;
            }
            this.zzah.zze().zzb();
            this.zzah.zzg(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected void zzD() {
        this.zzo = null;
        zzbu(zzvv.zza);
        this.zzl.clear();
        if (this.zzS) {
            zzar();
        } else {
            zzaz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected void zzE() {
        try {
            zzar();
            zzaO();
        } finally {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected final void zzG(zzbf zzbfVar) {
        zzbv();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final long zzW(long j, long j2) {
        return zzak(j, j2, this.zzM);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public void zzY(float f, float f2) throws zzjm {
        this.zzv = f;
        this.zzw = f2;
        zzbq(this.zzy);
    }

    public final void zzaF() {
        this.zzak = true;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02a6 A[Catch: zzvs -> 0x02d4, TryCatch #5 {zzvs -> 0x02d4, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0063, B:31:0x0079, B:32:0x0084, B:37:0x0091, B:39:0x0099, B:41:0x009d, B:42:0x00a0, B:44:0x00a4, B:46:0x00ad, B:151:0x028d, B:153:0x02a6, B:155:0x02af, B:158:0x02bb, B:159:0x02bd, B:154:0x02a9, B:161:0x02bf, B:162:0x02c0, B:164:0x02c5, B:165:0x02c6, B:166:0x02d0, B:35:0x0088, B:36:0x0090, B:168:0x02d3), top: B:182:0x0055, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x02a9 A[Catch: zzvs -> 0x02d4, TryCatch #5 {zzvs -> 0x02d4, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0063, B:31:0x0079, B:32:0x0084, B:37:0x0091, B:39:0x0099, B:41:0x009d, B:42:0x00a0, B:44:0x00a4, B:46:0x00ad, B:151:0x028d, B:153:0x02a6, B:155:0x02af, B:158:0x02bb, B:159:0x02bd, B:154:0x02a9, B:161:0x02bf, B:162:0x02c0, B:164:0x02c5, B:165:0x02c6, B:166:0x02d0, B:35:0x0088, B:36:0x0090, B:168:0x02d3), top: B:182:0x0055, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.google.android.gms.internal.ads.zzvk] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.google.android.gms.internal.ads.zzvp] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzvj] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzvw] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected final void zzaG() throws zzjm {
        zzv zzvVar;
        boolean z;
        ?? Zzai;
        zzvs zzvsVar;
        zzvs zzvsVar2;
        boolean z2;
        zzvp zzvpVar;
        if (this.zzx != null || this.zzS || (zzvVar = this.zzo) == null) {
            return;
        }
        boolean z3 = true;
        if (zzaH(zzvVar)) {
            zzar();
            String str = zzvVar.zzp;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzj.zzm(32);
            } else {
                this.zzj.zzm(1);
            }
            this.zzS = true;
            return;
        }
        zzuj zzujVar = this.zzr;
        this.zzq = zzujVar;
        if (zzujVar != null) {
            zzgtr.zzi(true);
            this.zzq.zza();
        }
        try {
            zzv zzvVar2 = this.zzo;
            MediaCrypto mediaCrypto = null;
            if (zzvVar2 == null) {
                throw null;
            }
            if (this.zzC == null) {
                try {
                    List listZzag = zzag(this.zze, zzvVar2, false);
                    listZzag.isEmpty();
                    this.zzC = new ArrayDeque();
                    if (!listZzag.isEmpty()) {
                        this.zzC.add((zzvp) listZzag.get(0));
                    }
                    this.zzD = null;
                } catch (zzwa e) {
                    throw new zzvs(zzvVar2, (Throwable) e, false, -49998);
                }
            }
            if (this.zzC.isEmpty()) {
                throw new zzvs(zzvVar2, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzC;
            if (arrayDeque == null) {
                throw null;
            }
            while (this.zzx == null) {
                zzvp zzvpVar2 = (zzvp) arrayDeque.peekFirst();
                if (zzvpVar2 == null) {
                    throw mediaCrypto;
                }
                zzaW(zzvVar2);
                if (!zzaI(zzvpVar2)) {
                    return;
                }
                try {
                    this.zzE = zzvpVar2;
                    zzv zzvVar3 = this.zzo;
                    if (zzvVar3 == null) {
                        throw mediaCrypto;
                    }
                    String str2 = zzvpVar2.zza;
                    float fZzal = zzal(this.zzw, zzvVar3, zzJ());
                    if (fZzal <= this.zzf) {
                        fZzal = -1.0f;
                    }
                    long jZzb = zzM().zzb();
                    z = z3;
                    try {
                        Zzai = zzai(zzvpVar2, zzvVar3, mediaCrypto, fZzal);
                        if (Build.VERSION.SDK_INT >= 31) {
                            LogSessionId logSessionIdZza = zzL().zza();
                            if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                Zzai.zzb.setString("log-session-id", logSessionIdZza.getStringId());
                            }
                        }
                        try {
                            StringBuilder sb = new StringBuilder(str2.length() + 12);
                            sb.append("createCodec:");
                            sb.append(str2);
                            Trace.beginSection(sb.toString());
                            zzvm zzvmVarZzc = this.zzd.zzc(Zzai);
                            this.zzx = zzvmVarZzc;
                            this.zzM = zzvmVarZzc.zzm(new zzvu(this, null));
                            Trace.endSection();
                            long jZzb2 = zzM().zzb();
                            if (!zzvpVar2.zzc(this.zzc, zzvVar3)) {
                                Object[] objArr = {zzv.zze(zzvVar3), str2};
                                String str3 = zzfm.zza;
                                zzeh.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                            }
                            this.zzB = fZzal;
                            this.zzy = zzvVar3;
                            this.zzF = (Build.VERSION.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2) && (Build.MODEL.startsWith("SM-T585") || Build.MODEL.startsWith("SM-A510") || Build.MODEL.startsWith("SM-A520") || Build.MODEL.startsWith("SM-J700"))) ? 2 : 0;
                            this.zzG = (Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str2)) ? z : false;
                            this.zzH = false;
                            String str4 = zzvpVar2.zza;
                            if (Build.VERSION.SDK_INT <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) {
                                z2 = z;
                            } else if ((Build.VERSION.SDK_INT > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) && !("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && zzvpVar2.zzf)) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            this.zzK = z2;
                            zzvm zzvmVar = this.zzx;
                            if (zzvmVar == null) {
                                throw null;
                            }
                            if (zze() == 2) {
                                try {
                                    zzvpVar = zzvpVar2;
                                    try {
                                        this.zzN = zzM().zzb() + 1000;
                                    } catch (Exception e2) {
                                        e = e2;
                                        Zzai = zzvpVar;
                                        zzeh.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(Zzai.zza), e);
                                        arrayDeque.removeFirst();
                                        zzvsVar = new zzvs(zzvVar2, (Throwable) e, false, (zzvp) Zzai);
                                        zzao(zzvsVar);
                                        zzvsVar2 = this.zzD;
                                        if (zzvsVar2 == null) {
                                            this.zzD = zzvsVar;
                                        } else {
                                            this.zzD = zzvsVar2.zza(zzvsVar);
                                        }
                                        if (!arrayDeque.isEmpty()) {
                                            throw this.zzD;
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    zzvpVar = zzvpVar2;
                                    Zzai = zzvpVar;
                                    zzeh.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(Zzai.zza), e);
                                    arrayDeque.removeFirst();
                                    zzvsVar = new zzvs(zzvVar2, (Throwable) e, false, (zzvp) Zzai);
                                    zzao(zzvsVar);
                                    zzvsVar2 = this.zzD;
                                    if (zzvsVar2 == null) {
                                        this.zzD = zzvsVar;
                                    } else {
                                        this.zzD = zzvsVar2.zza(zzvsVar);
                                    }
                                    if (!arrayDeque.isEmpty()) {
                                        throw this.zzD;
                                    }
                                }
                            } else {
                                zzvpVar = zzvpVar2;
                            }
                            this.zza.zza++;
                            long j = jZzb2 - jZzb;
                            if (Build.VERSION.SDK_INT >= 31 && !this.zzap.isEmpty()) {
                                zzvm zzvmVar2 = this.zzx;
                                if (zzvmVar2 == null) {
                                    throw null;
                                }
                                zzvmVar2.zzr(new ArrayList(this.zzap));
                            }
                            Zzai = zzvpVar;
                            try {
                                zzam(str2, Zzai, jZzb2, j);
                            } catch (Exception e4) {
                                e = e4;
                                zzeh.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(Zzai.zza), e);
                                arrayDeque.removeFirst();
                                zzvsVar = new zzvs(zzvVar2, (Throwable) e, false, (zzvp) Zzai);
                                zzao(zzvsVar);
                                zzvsVar2 = this.zzD;
                                if (zzvsVar2 == null) {
                                    this.zzD = zzvsVar;
                                } else {
                                    this.zzD = zzvsVar2.zza(zzvsVar);
                                }
                                if (!arrayDeque.isEmpty()) {
                                    throw this.zzD;
                                }
                            }
                            z3 = z;
                            mediaCrypto = null;
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        Zzai = zzvpVar2;
                    }
                } catch (Exception e6) {
                    e = e6;
                    z = z3;
                }
                Zzai = zzvpVar2;
                zzeh.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(Zzai.zza), e);
                arrayDeque.removeFirst();
                zzvsVar = new zzvs(zzvVar2, (Throwable) e, false, (zzvp) Zzai);
                zzao(zzvsVar);
                zzvsVar2 = this.zzD;
                if (zzvsVar2 == null) {
                    this.zzD = zzvsVar;
                } else {
                    this.zzD = zzvsVar2.zza(zzvsVar);
                }
                if (!arrayDeque.isEmpty()) {
                    throw this.zzD;
                }
                z3 = z;
                mediaCrypto = null;
            }
            this.zzC = mediaCrypto;
        } catch (zzvs e7) {
            throw zzQ(e7, zzvVar, false, 4001);
        }
    }

    protected final boolean zzaH(zzv zzvVar) {
        return this.zzr == null && zzah(zzvVar);
    }

    protected boolean zzaI(zzvp zzvpVar) {
        return true;
    }

    protected final boolean zzaJ() {
        return this.zzS;
    }

    protected final zzvm zzaK() {
        return this.zzx;
    }

    protected final zzv zzaL() {
        return this.zzy;
    }

    protected final MediaFormat zzaM() {
        return this.zzz;
    }

    protected final zzvp zzaN() {
        return this.zzE;
    }

    protected final void zzaO() {
        try {
            zzvm zzvmVar = this.zzx;
            if (zzvmVar != null) {
                zzvmVar.zzl();
                this.zza.zzb++;
                zzvp zzvpVar = this.zzE;
                if (zzvpVar == null) {
                    throw null;
                }
                zzan(zzvpVar.zza);
            }
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaU();
        } catch (Throwable th) {
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaU();
            throw th;
        }
    }

    protected final boolean zzaP() throws zzjm {
        boolean zZzaz = zzaz();
        if (zZzaz) {
            zzaG();
        }
        return zZzaz;
    }

    protected boolean zzaQ() {
        int i = this.zzY;
        if (i == 3 || ((this.zzG && !this.zzab) || (this.zzH && (this.zzaa || this.zzX == 1)))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbw();
            return false;
        } catch (zzjm e) {
            zzeh.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    protected boolean zzaR() {
        return true;
    }

    protected final long zzaS() {
        return this.zzam;
    }

    protected void zzaT() {
        zzbo();
        zzbp();
        zzaB();
        this.zzN = -9223372036854775807L;
        this.zzaa = false;
        this.zzL = -9223372036854775807L;
        this.zzZ = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzal = false;
        this.zzam = 0L;
    }

    protected final void zzaU() {
        zzaT();
        this.zzC = null;
        this.zzE = null;
        this.zzy = null;
        this.zzz = null;
        this.zzA = false;
        this.zzab = false;
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzM = false;
        this.zzV = false;
        this.zzW = 0;
    }

    protected zzvo zzaV(Throwable th, zzvp zzvpVar) {
        return new zzvo(th, zzvpVar);
    }

    protected boolean zzaW(zzv zzvVar) throws zzjm {
        return true;
    }

    protected void zzaX(zzix zzixVar) throws zzjm {
    }

    protected int zzaY(zzix zzixVar) {
        return 0;
    }

    protected boolean zzaZ(zzix zzixVar) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:207:0x0365 A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0373  */
    /* JADX WARN: Code duplicated, block: B:213:0x0380 A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0390  */
    /* JADX WARN: Code duplicated, block: B:219:0x03aa A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TRY_LEAVE, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:223:0x03c3 A[Catch: IllegalStateException -> 0x0074, CryptoException -> 0x069c, TryCatch #2 {IllegalStateException -> 0x0074, blocks: (B:18:0x0034, B:20:0x0053, B:22:0x0064, B:25:0x0073, B:236:0x03ee, B:241:0x03ff, B:243:0x0403, B:245:0x0408, B:248:0x040e, B:250:0x0415, B:252:0x041d, B:253:0x0428, B:221:0x03bd, B:223:0x03c3, B:228:0x03d3, B:231:0x03d9, B:232:0x03e3, B:234:0x03e8), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:225:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:228:0x03d3 A[Catch: IllegalStateException -> 0x0074, CryptoException -> 0x069c, TryCatch #2 {IllegalStateException -> 0x0074, blocks: (B:18:0x0034, B:20:0x0053, B:22:0x0064, B:25:0x0073, B:236:0x03ee, B:241:0x03ff, B:243:0x0403, B:245:0x0408, B:248:0x040e, B:250:0x0415, B:252:0x041d, B:253:0x0428, B:221:0x03bd, B:223:0x03c3, B:228:0x03d3, B:231:0x03d9, B:232:0x03e3, B:234:0x03e8), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:235:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:239:0x03f5 A[LOOP:0: B:117:0x01f5->B:239:0x03f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:382:0x0658  */
    /* JADX WARN: Code duplicated, block: B:384:0x065f  */
    /* JADX WARN: Code duplicated, block: B:388:0x0672  */
    /* JADX WARN: Code duplicated, block: B:391:0x067d  */
    /* JADX WARN: Code duplicated, block: B:393:0x0680  */
    /* JADX WARN: Code duplicated, block: B:396:0x068f  */
    /* JADX WARN: Code duplicated, block: B:397:0x0692  */
    /* JADX WARN: Code duplicated, block: B:420:0x0625 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x03e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:? A[LOOP:5: B:50:0x00c1->B:475:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2 A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4 A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, EDGE_INSN: B:56:0x00d4->B:96:0x01b2 BREAK  A[LOOP:5: B:50:0x00c1->B:475:?], TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00df A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2 A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:64:0x010a A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0119 A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TRY_ENTER, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x011d A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:83:0x016f A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0182 A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0191  */
    /* JADX WARN: Code duplicated, block: B:90:0x0192 A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01b8 A[Catch: IllegalStateException -> 0x0649, CryptoException -> 0x064d, TryCatch #12 {CryptoException -> 0x064d, IllegalStateException -> 0x0649, blocks: (B:106:0x01ca, B:39:0x0093, B:41:0x0097, B:43:0x009b, B:46:0x00a4, B:49:0x00b2, B:50:0x00c1, B:54:0x00ce, B:56:0x00d4, B:96:0x01b2, B:98:0x01b8, B:99:0x01bb, B:101:0x01c1, B:103:0x01c5, B:57:0x00df, B:59:0x00e5, B:60:0x00f2, B:62:0x0102, B:65:0x0113, B:68:0x0119, B:70:0x011d, B:72:0x012a, B:74:0x0134, B:75:0x0151, B:76:0x0159, B:77:0x015a, B:79:0x0161, B:81:0x0169, B:83:0x016f, B:84:0x0176, B:86:0x0182, B:87:0x018b, B:92:0x01a6, B:94:0x01ac, B:90:0x0192, B:64:0x010a, B:95:0x01af, B:114:0x01e0, B:116:0x01e7, B:117:0x01f5, B:119:0x01f9, B:121:0x0208, B:125:0x0213, B:127:0x0219, B:129:0x0224, B:131:0x022e, B:133:0x0236, B:134:0x023a, B:136:0x0240, B:139:0x024a, B:140:0x0257, B:142:0x025d, B:144:0x0269, B:153:0x027a, B:154:0x0282, B:155:0x028a, B:156:0x0292, B:157:0x029a, B:158:0x02a2, B:160:0x02ae, B:161:0x02b3, B:162:0x02b8, B:163:0x02b9, B:165:0x02bd, B:167:0x02c1, B:169:0x02c5, B:170:0x02c8, B:172:0x02ce, B:174:0x02dd, B:176:0x02e4, B:178:0x02ef, B:180:0x02f8, B:182:0x02fc, B:184:0x0301, B:185:0x0305, B:187:0x030f, B:188:0x031e, B:190:0x032e, B:192:0x0332, B:194:0x0336, B:196:0x0344, B:201:0x034f, B:203:0x0353, B:204:0x0360, B:197:0x0347, B:199:0x034b, B:205:0x0361, B:207:0x0365, B:211:0x0374, B:213:0x0380, B:217:0x0391, B:219:0x03aa), top: B:406:0x001f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzvw] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // com.google.android.gms.internal.ads.zznc
    public void zzaa(long j, long j2) throws Throwable {
        ?? r12;
        boolean z;
        byte b;
        boolean z2;
        ?? r2;
        zzvo zzvoVarZzaV;
        int i;
        StackTraceElement[] stackTrace;
        ?? r3;
        boolean z3;
        zzly zzlyVarZzI;
        zzix zzixVar;
        int iZzR;
        byte b2;
        zzv zzvVar;
        long jZzH;
        zzv zzvVar2;
        boolean z4;
        boolean z5;
        ByteBuffer byteBuffer;
        int i2;
        MediaCodec.BufferInfo bufferInfo;
        long j3;
        int i3;
        long j4;
        boolean z6;
        zzv zzvVar3;
        Throwable th;
        boolean z7;
        boolean z8 = true;
        try {
            try {
                if (this.zzaf) {
                    zzav();
                    return;
                }
                int i4 = 2;
                if (this.zzo == null && !zzaC(2)) {
                    return;
                }
                zzaG();
                byte b3 = -5;
                ?? r6 = 0;
                try {
                    try {
                        try {
                            if (this.zzS) {
                                try {
                                    try {
                                        Trace.beginSection("bypassRender");
                                        while (true) {
                                            zzgtr.zzi(this.zzaf ^ z8);
                                            zzvd zzvdVar = this.zzj;
                                            try {
                                                if (zzvdVar.zzp()) {
                                                    ByteBuffer byteBuffer2 = zzvdVar.zzc;
                                                    int i5 = this.zzP;
                                                    int iZzo = zzvdVar.zzo();
                                                    long j5 = zzvdVar.zzd;
                                                    boolean zZzbx = zzbx(zzH(), zzvdVar.zzn());
                                                    boolean zZzb = zzvdVar.zzb();
                                                    zzv zzvVar4 = this.zzp;
                                                    if (zzvVar4 == null) {
                                                        throw r6;
                                                    }
                                                    if (zzat(j, j2, null, byteBuffer2, i5, 0, iZzo, j5, zZzbx, zZzb, zzvVar4)) {
                                                        zzbb(zzvdVar.zzn());
                                                        zzvdVar.zza();
                                                        r3 = 0;
                                                    } else {
                                                        z8 = true;
                                                    }
                                                    z3 = false;
                                                    break;
                                                }
                                                r3 = r6;
                                                if (this.zzae) {
                                                    z8 = true;
                                                    this.zzaf = true;
                                                    z3 = false;
                                                    break;
                                                }
                                                z8 = true;
                                                if (this.zzT) {
                                                    zzgtr.zzi(zzvdVar.zzq(this.zzi));
                                                    z3 = false;
                                                    this.zzT = false;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (this.zzU) {
                                                    if (!zzvdVar.zzp()) {
                                                        zzar();
                                                        this.zzU = z3;
                                                        zzaG();
                                                        if (!this.zzS) {
                                                            break;
                                                        }
                                                        zzgtr.zzi(!this.zzae);
                                                        zzlyVarZzI = zzI();
                                                        zzixVar = this.zzi;
                                                        zzixVar.zza();
                                                        while (true) {
                                                            zzixVar.zza();
                                                            iZzR = zzR(zzlyVarZzI, zzixVar, z3 ? 1 : 0);
                                                            b2 = -5;
                                                            if (iZzR != -5) {
                                                                zzap(zzlyVarZzI);
                                                                break;
                                                            }
                                                            if (iZzR != -4) {
                                                                if (zzcW()) {
                                                                    break;
                                                                }
                                                                zzbv().zzi(this.zzac);
                                                                break;
                                                            }
                                                            if (zzixVar.zzb()) {
                                                                this.zzae = true;
                                                                zzbv().zzi(this.zzac);
                                                                break;
                                                            }
                                                            this.zzac = Math.max(this.zzac, zzixVar.zzd);
                                                            if (zzcW()) {
                                                                zzbv().zzi(this.zzac);
                                                            } else {
                                                                zzbv().zzi(this.zzac);
                                                            }
                                                            if (this.zzag) {
                                                                zzvVar2 = this.zzo;
                                                                if (zzvVar2 != null) {
                                                                    throw r3;
                                                                }
                                                                this.zzp = zzvVar2;
                                                                if (Objects.equals(zzvVar2.zzp, "audio/opus")) {
                                                                    int iZze = zzgx.zze((byte[]) this.zzp.zzs.get(z3 ? 1 : 0));
                                                                    zzt zztVarZza = this.zzp.zza();
                                                                    zztVarZza.zzK(iZze);
                                                                    this.zzp = zztVarZza.zzP();
                                                                }
                                                                zzaq(this.zzp, r3);
                                                                this.zzag = z3;
                                                            }
                                                            zzixVar.zzl();
                                                            zzvVar = this.zzp;
                                                            if (zzvVar != null) {
                                                                if (zzixVar.zze()) {
                                                                    zzixVar.zza = this.zzp;
                                                                    zzax(zzixVar);
                                                                }
                                                                if (zzgx.zzf(zzH(), zzixVar.zzd)) {
                                                                    this.zzm.zza(zzixVar, this.zzp.zzs);
                                                                }
                                                            }
                                                            if (!zzvdVar.zzp()) {
                                                                jZzH = zzH();
                                                                if (zzbx(jZzH, zzvdVar.zzn()) == zzbx(jZzH, zzixVar.zzd)) {
                                                                }
                                                                this.zzT = true;
                                                                break;
                                                            }
                                                            if (!zzvdVar.zzq(zzixVar)) {
                                                                this.zzT = true;
                                                                break;
                                                            }
                                                        }
                                                        if (zzvdVar.zzp()) {
                                                            zzvdVar.zzl();
                                                        }
                                                        if (!zzvdVar.zzp()) {
                                                            break;
                                                            break;
                                                        }
                                                        continue;
                                                    } else {
                                                        b2 = -5;
                                                    }
                                                    r6 = r3;
                                                } else {
                                                    zzgtr.zzi(!this.zzae);
                                                    zzlyVarZzI = zzI();
                                                    zzixVar = this.zzi;
                                                    zzixVar.zza();
                                                    while (true) {
                                                        zzixVar.zza();
                                                        iZzR = zzR(zzlyVarZzI, zzixVar, z3 ? 1 : 0);
                                                        b2 = -5;
                                                        if (iZzR != -5) {
                                                            zzap(zzlyVarZzI);
                                                            break;
                                                        }
                                                        if (iZzR != -4) {
                                                            if (zzcW()) {
                                                                break;
                                                            }
                                                            zzbv().zzi(this.zzac);
                                                            break;
                                                        }
                                                        if (zzixVar.zzb()) {
                                                            this.zzae = true;
                                                            zzbv().zzi(this.zzac);
                                                            break;
                                                        }
                                                        this.zzac = Math.max(this.zzac, zzixVar.zzd);
                                                        if (zzcW() || this.zzh.zzd()) {
                                                            zzbv().zzi(this.zzac);
                                                        }
                                                        if (this.zzag) {
                                                            zzvVar2 = this.zzo;
                                                            if (zzvVar2 != null) {
                                                                throw r3;
                                                            }
                                                            this.zzp = zzvVar2;
                                                            if (Objects.equals(zzvVar2.zzp, "audio/opus") && !this.zzp.zzs.isEmpty()) {
                                                                int iZze2 = zzgx.zze((byte[]) this.zzp.zzs.get(z3 ? 1 : 0));
                                                                zzt zztVarZza2 = this.zzp.zza();
                                                                zztVarZza2.zzK(iZze2);
                                                                this.zzp = zztVarZza2.zzP();
                                                            }
                                                            zzaq(this.zzp, r3);
                                                            this.zzag = z3;
                                                        }
                                                        zzixVar.zzl();
                                                        zzvVar = this.zzp;
                                                        if (zzvVar != null && Objects.equals(zzvVar.zzp, "audio/opus")) {
                                                            if (zzixVar.zze()) {
                                                                zzixVar.zza = this.zzp;
                                                                zzax(zzixVar);
                                                            }
                                                            if (zzgx.zzf(zzH(), zzixVar.zzd)) {
                                                                this.zzm.zza(zzixVar, this.zzp.zzs);
                                                            }
                                                        }
                                                        if (!zzvdVar.zzp()) {
                                                            jZzH = zzH();
                                                            if (zzbx(jZzH, zzvdVar.zzn()) == zzbx(jZzH, zzixVar.zzd)) {
                                                            }
                                                            this.zzT = true;
                                                            break;
                                                        }
                                                        if (!zzvdVar.zzq(zzixVar)) {
                                                            this.zzT = true;
                                                            break;
                                                        }
                                                    }
                                                    if (zzvdVar.zzp()) {
                                                        zzvdVar.zzl();
                                                    }
                                                    if (!zzvdVar.zzp() && !this.zzae && !this.zzU) {
                                                        break;
                                                    }
                                                    r6 = r3;
                                                }
                                            } catch (IllegalStateException e) {
                                                e = e;
                                                z8 = true;
                                                b3 = 0;
                                                z = z8;
                                                b = b3;
                                                z2 = e instanceof MediaCodec.CodecException;
                                                if (!z2) {
                                                    stackTrace = e.getStackTrace();
                                                    if (stackTrace.length > 0) {
                                                    }
                                                    throw e;
                                                }
                                                zzao(e);
                                                if (z2) {
                                                    r2 = b;
                                                } else {
                                                    r2 = b;
                                                }
                                                if (r2 != 0) {
                                                    zzaO();
                                                }
                                                zzvoVarZzaV = zzaV(e, this.zzE);
                                                if (zzvoVarZzaV.zza == 1101) {
                                                    i = 4006;
                                                } else {
                                                    i = 4003;
                                                }
                                                throw zzQ(zzvoVarZzaV, this.zzo, r2, i);
                                            }
                                        }
                                        Trace.endSection();
                                    } catch (MediaCodec.CryptoException e2) {
                                        e = e2;
                                        b3 = 0;
                                        r12 = b3;
                                        throw zzQ(e, this.zzo, r12, zzfm.zzJ(e.getErrorCode()));
                                    }
                                } catch (IllegalStateException e3) {
                                    e = e3;
                                }
                            } else {
                                byte b4 = -5;
                                Throwable th2 = null;
                                boolean z9 = false;
                                if (this.zzx != null) {
                                    long jZzb = zzM().zzb();
                                    Trace.beginSection("drainAndFeed");
                                    long j6 = jZzb;
                                    while (true) {
                                        zzvm zzvmVar = this.zzx;
                                        if (zzvmVar == null) {
                                            throw th2;
                                        }
                                        if (zzaE()) {
                                            if (!this.zzal || this.zzk.presentationTimeUs < zzH()) {
                                                z4 = z8;
                                            } else {
                                                z4 = z9;
                                            }
                                            this.zzR = z4;
                                            if (this.zzah.zzh() != -9223372036854775807L || this.zzah.zzh() > this.zzk.presentationTimeUs) {
                                                z5 = z9;
                                            } else {
                                                z5 = z8;
                                            }
                                            byteBuffer = this.zzQ;
                                            i2 = this.zzP;
                                            bufferInfo = this.zzk;
                                            j3 = j6;
                                            i3 = bufferInfo.flags;
                                            j4 = bufferInfo.presentationTimeUs;
                                            z6 = this.zzR;
                                            zzvVar3 = this.zzp;
                                            if (zzvVar3 == null) {
                                                throw th2;
                                            }
                                            th = th2;
                                            if (zzat(j, j2, zzvmVar, byteBuffer, i2, i3, 1, j4, z6, z5, zzvVar3)) {
                                                zzbb(bufferInfo.presentationTimeUs);
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (!z7 && this.zzaa && z5) {
                                                    this.zzL = zzM().zza();
                                                }
                                                zzbp();
                                                if (z7) {
                                                    zzbt();
                                                } else {
                                                    j6 = j3;
                                                    if (!zzaD(j6)) {
                                                        break;
                                                    }
                                                    th2 = th;
                                                    z8 = true;
                                                    i4 = 2;
                                                    z9 = false;
                                                    b4 = -5;
                                                }
                                            }
                                            j6 = j3;
                                            break;
                                        }
                                        MediaCodec.BufferInfo bufferInfo2 = this.zzk;
                                        int iZzf = zzvmVar.zzf(bufferInfo2);
                                        if (iZzf >= 0) {
                                            bufferInfo2.presentationTimeUs -= this.zzam;
                                            if (!this.zzJ) {
                                                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                                                    zzbt();
                                                    th = th2;
                                                    break;
                                                }
                                                this.zzP = iZzf;
                                                ByteBuffer byteBufferZzj = zzvmVar.zzj(iZzf);
                                                this.zzQ = byteBufferZzj;
                                                if (byteBufferZzj != null) {
                                                    byteBufferZzj.position(bufferInfo2.offset);
                                                    this.zzQ.limit(bufferInfo2.offset + bufferInfo2.size);
                                                }
                                                zzv zzvVar5 = (zzv) this.zzah.zze().zze(bufferInfo2.presentationTimeUs);
                                                if (zzvVar5 == null && this.zzaj && this.zzz != null) {
                                                    zzvVar5 = (zzv) this.zzah.zze().zzd();
                                                }
                                                if (zzvVar5 == null) {
                                                    if (this.zzA && this.zzp != null) {
                                                    }
                                                    if (this.zzal) {
                                                        z4 = z8;
                                                    } else {
                                                        z4 = z8;
                                                    }
                                                    this.zzR = z4;
                                                    if (this.zzah.zzh() != -9223372036854775807L) {
                                                        z5 = z9;
                                                    } else {
                                                        z5 = z9;
                                                    }
                                                    byteBuffer = this.zzQ;
                                                    i2 = this.zzP;
                                                    bufferInfo = this.zzk;
                                                    j3 = j6;
                                                    i3 = bufferInfo.flags;
                                                    j4 = bufferInfo.presentationTimeUs;
                                                    z6 = this.zzR;
                                                    zzvVar3 = this.zzp;
                                                    if (zzvVar3 == null) {
                                                        throw th2;
                                                    }
                                                    th = th2;
                                                    if (zzat(j, j2, zzvmVar, byteBuffer, i2, i3, 1, j4, z6, z5, zzvVar3)) {
                                                        zzbb(bufferInfo.presentationTimeUs);
                                                        if ((bufferInfo.flags & 4) != 0) {
                                                            z7 = true;
                                                        } else {
                                                            z7 = false;
                                                        }
                                                        if (!z7) {
                                                            this.zzL = zzM().zza();
                                                        }
                                                        zzbp();
                                                        if (z7) {
                                                            zzbt();
                                                        } else {
                                                            j6 = j3;
                                                            if (!zzaD(j6)) {
                                                                break;
                                                                break;
                                                            }
                                                            th2 = th;
                                                            z8 = true;
                                                            i4 = 2;
                                                            z9 = false;
                                                            b4 = -5;
                                                        }
                                                    }
                                                    j6 = j3;
                                                    break;
                                                }
                                                this.zzp = zzvVar5;
                                                zzv zzvVar6 = this.zzp;
                                                if (zzvVar6 == null) {
                                                    throw th2;
                                                }
                                                zzaq(zzvVar6, this.zzz);
                                                this.zzA = z9;
                                                this.zzaj = z9;
                                                if (this.zzal) {
                                                    z4 = z8;
                                                } else {
                                                    z4 = z8;
                                                }
                                                this.zzR = z4;
                                                if (this.zzah.zzh() != -9223372036854775807L) {
                                                    z5 = z9;
                                                } else {
                                                    z5 = z9;
                                                }
                                                byteBuffer = this.zzQ;
                                                i2 = this.zzP;
                                                bufferInfo = this.zzk;
                                                j3 = j6;
                                                i3 = bufferInfo.flags;
                                                j4 = bufferInfo.presentationTimeUs;
                                                z6 = this.zzR;
                                                zzvVar3 = this.zzp;
                                                if (zzvVar3 == null) {
                                                    throw th2;
                                                }
                                                th = th2;
                                                if (zzat(j, j2, zzvmVar, byteBuffer, i2, i3, 1, j4, z6, z5, zzvVar3)) {
                                                    zzbb(bufferInfo.presentationTimeUs);
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (!z7) {
                                                        this.zzL = zzM().zza();
                                                    }
                                                    zzbp();
                                                    if (z7) {
                                                        zzbt();
                                                    } else {
                                                        j6 = j3;
                                                        if (!zzaD(j6)) {
                                                            break;
                                                            break;
                                                        }
                                                        th2 = th;
                                                        z8 = true;
                                                        i4 = 2;
                                                        z9 = false;
                                                        b4 = -5;
                                                    }
                                                }
                                                j6 = j3;
                                                break;
                                            }
                                            this.zzJ = z9;
                                            zzvmVar.zzc(iZzf, z9);
                                            th = th2;
                                            if (!zzaD(j6)) {
                                                break;
                                                break;
                                            }
                                            th2 = th;
                                            z8 = true;
                                            i4 = 2;
                                            z9 = false;
                                            b4 = -5;
                                        } else {
                                            if (iZzf != -2) {
                                                if (this.zzK && (this.zzae || this.zzX == i4)) {
                                                    zzbt();
                                                }
                                                long j7 = this.zzL;
                                                if (j7 != -9223372036854775807L && j7 + 100 < zzM().zza()) {
                                                    zzbt();
                                                }
                                                th = th2;
                                                break;
                                            }
                                            this.zzab = z8;
                                            zzvm zzvmVar2 = this.zzx;
                                            if (zzvmVar2 == null) {
                                                throw th2;
                                            }
                                            MediaFormat mediaFormatZzg = zzvmVar2.zzg();
                                            if (this.zzF != 0 && mediaFormatZzg.getInteger("width") == 32 && mediaFormatZzg.getInteger("height") == 32) {
                                                this.zzJ = z8;
                                            } else {
                                                if (Build.VERSION.SDK_INT >= 29 && !this.zzap.isEmpty()) {
                                                    zzgxd<String> zzgxdVar = this.zzap;
                                                    zzjb zzjbVar = zzjb.zza;
                                                    zzja zzjaVar = new zzja();
                                                    for (String str : zzgxdVar) {
                                                        if (mediaFormatZzg.containsKey(str)) {
                                                            int valueTypeForKey = mediaFormatZzg.getValueTypeForKey(str);
                                                            if (valueTypeForKey == z8) {
                                                                zzjaVar.zza(str, mediaFormatZzg.getInteger(str));
                                                            } else if (valueTypeForKey == i4) {
                                                                zzjaVar.zzb(str, mediaFormatZzg.getLong(str));
                                                            } else if (valueTypeForKey == 3) {
                                                                zzjaVar.zzc(str, mediaFormatZzg.getFloat(str));
                                                            } else if (valueTypeForKey == 4) {
                                                                zzjaVar.zzd(str, mediaFormatZzg.getString(str));
                                                            } else if (valueTypeForKey == 5) {
                                                                zzjaVar.zze(str, mediaFormatZzg.getByteBuffer(str));
                                                            }
                                                        }
                                                    }
                                                    zzjb zzjbVarZzg = zzjaVar.zzg();
                                                    if (!zzjbVarZzg.equals(this.zzao)) {
                                                        this.zzao = zzjbVarZzg;
                                                        zzau(zzjbVarZzg);
                                                    }
                                                }
                                                this.zzz = mediaFormatZzg;
                                                this.zzA = z8;
                                            }
                                            th = th2;
                                            if (!zzaD(j6)) {
                                                break;
                                                break;
                                            }
                                            th2 = th;
                                            z8 = true;
                                            i4 = 2;
                                            z9 = false;
                                            b4 = -5;
                                        }
                                        z2 = e instanceof MediaCodec.CodecException;
                                        if (!z2) {
                                            stackTrace = e.getStackTrace();
                                            if (stackTrace.length > 0 || !stackTrace[b].getClassName().equals("android.media.MediaCodec")) {
                                                throw e;
                                            }
                                        }
                                        zzao(e);
                                        if (z2 || !((MediaCodec.CodecException) e).isRecoverable()) {
                                            r2 = b;
                                        } else {
                                            r2 = z;
                                        }
                                        if (r2 != 0) {
                                            zzaO();
                                        }
                                        zzvoVarZzaV = zzaV(e, this.zzE);
                                        if (zzvoVarZzaV.zza == 1101) {
                                            i = 4006;
                                        } else {
                                            i = 4003;
                                        }
                                        throw zzQ(zzvoVarZzaV, this.zzo, r2, i);
                                    }
                                    do {
                                        zzvm zzvmVar3 = this.zzx;
                                        if (zzvmVar3 == null || this.zzX == 2 || this.zzae) {
                                            break;
                                        }
                                        if (this.zzO < 0) {
                                            int iZze3 = zzvmVar3.zze();
                                            this.zzO = iZze3;
                                            if (iZze3 < 0) {
                                                break;
                                                break;
                                            } else {
                                                zzix zzixVar2 = this.zzh;
                                                zzixVar2.zzc = zzvmVar3.zzh(iZze3);
                                                zzixVar2.zza();
                                            }
                                        }
                                        z = true;
                                        if (this.zzX == 1) {
                                            if (!this.zzK) {
                                                this.zzaa = true;
                                                zzvmVar3.zza(this.zzO, 0, 0, 0L, 4);
                                                zzbo();
                                            }
                                            this.zzX = 2;
                                            break;
                                        }
                                        try {
                                            if (this.zzI) {
                                                this.zzI = false;
                                                ByteBuffer byteBuffer3 = this.zzh.zzc;
                                                if (byteBuffer3 == null) {
                                                    throw th;
                                                }
                                                byteBuffer3.put(zzb);
                                                zzvmVar3.zza(this.zzO, 0, 38, 0L, 0);
                                                zzbo();
                                                this.zzZ = true;
                                            } else {
                                                r12 = 0;
                                                b = 0;
                                                if (this.zzW == 1) {
                                                    int i6 = 0;
                                                    while (true) {
                                                        zzv zzvVar7 = this.zzy;
                                                        if (zzvVar7 == null) {
                                                            throw th;
                                                        }
                                                        if (i6 >= zzvVar7.zzs.size()) {
                                                            this.zzW = 2;
                                                            break;
                                                        }
                                                        byte[] bArr = (byte[]) this.zzy.zzs.get(i6);
                                                        ByteBuffer byteBuffer4 = this.zzh.zzc;
                                                        if (byteBuffer4 == null) {
                                                            throw th;
                                                        }
                                                        byteBuffer4.put(bArr);
                                                        i6++;
                                                    }
                                                }
                                                ByteBuffer byteBuffer5 = this.zzh.zzc;
                                                if (byteBuffer5 == null) {
                                                    throw th;
                                                }
                                                int iPosition = byteBuffer5.position();
                                                final zzly zzlyVarZzI2 = zzI();
                                                try {
                                                    zzvmVar3.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvt
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            this.zza.zzbm(zzlyVarZzI2);
                                                        }
                                                    });
                                                    int i7 = this.zzn.get();
                                                    if (i7 == -3) {
                                                        if (!zzcW()) {
                                                            break;
                                                        }
                                                        zzbv().zzi(this.zzac);
                                                        break;
                                                    }
                                                    if (i7 == -5) {
                                                        if (this.zzW == 2) {
                                                            this.zzh.zza();
                                                            this.zzW = 1;
                                                        }
                                                        zzap(zzlyVarZzI2);
                                                    } else {
                                                        zzix zzixVar3 = this.zzh;
                                                        if (zzixVar3.zzb()) {
                                                            zzbv().zzi(this.zzac);
                                                            if (this.zzW == 2) {
                                                                zzixVar3.zza();
                                                                this.zzW = 1;
                                                            }
                                                            this.zzae = true;
                                                            if (this.zzZ) {
                                                                if (!this.zzK) {
                                                                    this.zzaa = true;
                                                                    zzvmVar3.zza(this.zzO, 0, 0, 0L, 4);
                                                                    zzbo();
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            zzbt();
                                                            break;
                                                        }
                                                        if (this.zzZ || zzixVar3.zzc()) {
                                                            long j8 = zzixVar3.zzd;
                                                            if (!zzaZ(zzixVar3)) {
                                                                boolean zZzk = zzixVar3.zzk();
                                                                if (zZzk) {
                                                                    zzixVar3.zzb.zzc(iPosition);
                                                                }
                                                                if (this.zzag) {
                                                                    zzvv zzvvVarZzbv = zzbv();
                                                                    zzfi zzfiVarZze = zzvvVarZzbv.zze();
                                                                    zzv zzvVar8 = this.zzo;
                                                                    if (zzvVar8 == null) {
                                                                        throw th;
                                                                    }
                                                                    zzfiVarZze.zza(j8, zzvVar8);
                                                                    zzvvVarZzbv.zzg(true);
                                                                    this.zzag = false;
                                                                }
                                                                this.zzac = Math.max(this.zzac, j8);
                                                                if (zzP() == -9223372036854775807L || j8 - zzbv().zzd() < zzP()) {
                                                                    this.zzad = Math.max(this.zzad, j8);
                                                                }
                                                                if (zzcW() || zzixVar3.zzd()) {
                                                                    zzbv().zzi(this.zzac);
                                                                }
                                                                zzixVar3.zzl();
                                                                if (zzixVar3.zze()) {
                                                                    zzax(zzixVar3);
                                                                }
                                                                if (this.zzal) {
                                                                    long j9 = this.zzac;
                                                                    if (j8 <= j9) {
                                                                        this.zzam += (j9 - j8) + 1;
                                                                    }
                                                                    this.zzac = j8;
                                                                    this.zzad = j8;
                                                                    this.zzal = false;
                                                                }
                                                                zzaX(zzixVar3);
                                                                int iZzaY = zzaY(zzixVar3);
                                                                long j10 = j8 + this.zzam;
                                                                if (zZzk) {
                                                                    zzvmVar3.zzb(this.zzO, 0, zzixVar3.zzb, j10, iZzaY);
                                                                } else {
                                                                    int i8 = this.zzO;
                                                                    ByteBuffer byteBuffer6 = zzixVar3.zzc;
                                                                    if (byteBuffer6 == null) {
                                                                        throw th;
                                                                    }
                                                                    zzvmVar3.zza(i8, 0, byteBuffer6.limit(), j10, iZzaY);
                                                                }
                                                                zzbo();
                                                                this.zzZ = true;
                                                                this.zzW = 0;
                                                                this.zza.zzc++;
                                                            }
                                                        } else {
                                                            zzixVar3.zza();
                                                            if (this.zzW == 2) {
                                                                this.zzW = 1;
                                                            }
                                                        }
                                                    }
                                                } catch (zziw e4) {
                                                    zzao(e4);
                                                    zzaC(0);
                                                    zzaA();
                                                }
                                            }
                                        } catch (IllegalStateException e5) {
                                            e = e5;
                                            b = 0;
                                            z2 = e instanceof MediaCodec.CodecException;
                                            if (!z2) {
                                                stackTrace = e.getStackTrace();
                                                if (stackTrace.length > 0) {
                                                }
                                                throw e;
                                            }
                                            zzao(e);
                                            if (z2) {
                                                r2 = b;
                                            } else {
                                                r2 = b;
                                            }
                                            if (r2 != 0) {
                                                zzaO();
                                            }
                                            zzvoVarZzaV = zzaV(e, this.zzE);
                                            if (zzvoVarZzaV.zza == 1101) {
                                                i = 4006;
                                            } else {
                                                i = 4003;
                                            }
                                            throw zzQ(zzvoVarZzaV, this.zzo, r2, i);
                                        }
                                    } while (zzaD(j6));
                                    Trace.endSection();
                                } else {
                                    this.zza.zzd += zzS(j);
                                    zzaC(1);
                                }
                            }
                            this.zza.zza();
                        } catch (IllegalStateException e6) {
                            e = e6;
                            b = 0;
                            z = true;
                        }
                    } catch (MediaCodec.CryptoException e7) {
                        e = e7;
                    } catch (IllegalStateException e8) {
                        e = e8;
                    }
                } catch (MediaCodec.CryptoException e9) {
                    e = e9;
                    throw zzQ(e, this.zzo, r12, zzfm.zzJ(e.getErrorCode()));
                } catch (IllegalStateException e10) {
                    e = e10;
                }
            } catch (IllegalStateException e11) {
                e = e11;
                z = true;
            }
        } catch (MediaCodec.CryptoException e12) {
            e = e12;
            r12 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public boolean zzab() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public boolean zzac() {
        return this.zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final int zzae(zzv zzvVar) throws zzjm {
        try {
            return zzaf(this.zze, zzvVar);
        } catch (zzwa e) {
            throw zzQ(e, zzvVar, false, 4002);
        }
    }

    protected abstract int zzaf(zzvy zzvyVar, zzv zzvVar) throws zzwa;

    protected abstract List zzag(zzvy zzvyVar, zzv zzvVar, boolean z) throws zzwa;

    protected boolean zzah(zzv zzvVar) {
        return false;
    }

    protected abstract zzvj zzai(zzvp zzvpVar, zzv zzvVar, MediaCrypto mediaCrypto, float f);

    protected zzje zzaj(zzvp zzvpVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        throw null;
    }

    protected long zzak(long j, long j2, boolean z) {
        return super.zzW(j, j2);
    }

    protected float zzal(float f, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    protected void zzam(String str, zzvj zzvjVar, long j, long j2) {
        throw null;
    }

    protected void zzan(String str) {
        throw null;
    }

    protected void zzao(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    protected zzje zzap(zzly zzlyVar) throws zzjm {
        int i;
        Pair pairZze;
        String str;
        boolean z = true;
        this.zzag = true;
        zzv zzvVarZzP = zzlyVar.zzb;
        zzvVarZzP.getClass();
        String str2 = zzvVarZzP.zzp;
        if (str2 == null) {
            throw zzQ(new IllegalArgumentException("Sample MIME type is null."), zzvVarZzP, false, 4005);
        }
        if (Objects.equals(str2, "video/av01") || Objects.equals(str2, "video/x-vnd.on2.vp9")) {
            if (!zzvVarZzP.zzs.isEmpty()) {
                zzt zztVarZza = zzvVarZzP.zza();
                zztVarZza.zzr(null);
                zzvVarZzP = zztVarZza.zzP();
            }
        } else if (Objects.equals(str2, "video/dolby-vision")) {
            int i2 = zzdr.zza;
            if (Objects.equals(str2, "video/dolby-vision") && (pairZze = zzdr.zze(zzvVarZzP)) != null) {
                int iIntValue = ((Integer) pairZze.first).intValue();
                if (iIntValue == 16 || iIntValue == 32 || iIntValue == 256) {
                    str = "video/hevc";
                } else if (iIntValue == 512) {
                    str = "video/avc";
                } else if (iIntValue != 1024) {
                    str = null;
                } else {
                    str = "video/av01";
                }
            } else {
                str = null;
            }
            if (Objects.equals(str, "video/av01")) {
                if (!zzvVarZzP.zzs.isEmpty()) {
                    zzt zztVarZza2 = zzvVarZzP.zza();
                    zztVarZza2.zzr(null);
                    zzvVarZzP = zztVarZza2.zzP();
                }
            }
        }
        zzv zzvVar = zzvVarZzP;
        this.zzr = zzlyVar.zza;
        this.zzo = zzvVar;
        if (this.zzS) {
            this.zzU = true;
            return null;
        }
        zzvm zzvmVar = this.zzx;
        if (zzvmVar == null) {
            this.zzC = null;
            zzaG();
            return null;
        }
        zzvp zzvpVar = this.zzE;
        zzvpVar.getClass();
        zzv zzvVar2 = this.zzy;
        zzvVar2.getClass();
        zzuj zzujVar = this.zzq;
        zzuj zzujVar2 = this.zzr;
        if (zzujVar != zzujVar2) {
            zzbs();
            return new zzje(zzvpVar.zza, zzvVar2, zzvVar, 0, 128);
        }
        zzje zzjeVarZzaj = zzaj(zzvpVar, zzvVar2, zzvVar, zzbv().zzf());
        int i3 = zzjeVarZzaj.zzd;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (zzbq(zzvVar)) {
                        this.zzy = zzvVar;
                        if (zzujVar2 != zzujVar && !zzbr()) {
                            i = 2;
                        }
                    } else {
                        i = 16;
                    }
                } else if (zzbq(zzvVar)) {
                    this.zzV = true;
                    this.zzW = 1;
                    int i4 = this.zzF;
                    if (i4 != 2 && (i4 != 1 || zzvVar.zzw != zzvVar2.zzw || zzvVar.zzx != zzvVar2.zzx)) {
                        z = false;
                    }
                    this.zzI = z;
                    this.zzy = zzvVar;
                    if (zzujVar2 != zzujVar && !zzbr()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (zzbq(zzvVar)) {
                this.zzy = zzvVar;
                if (zzujVar2 != zzujVar) {
                    if (!zzbr()) {
                        i = 2;
                    }
                } else if (this.zzZ) {
                    this.zzX = 1;
                    if (zzaQ()) {
                        this.zzY = 3;
                        i = 2;
                    } else {
                        this.zzY = 1;
                    }
                }
            } else {
                i = 16;
            }
            return (i3 != 0 || (this.zzx == zzvmVar && this.zzY != 3)) ? zzjeVarZzaj : new zzje(zzvpVar.zza, zzvVar2, zzvVar, 0, i);
        }
        zzbs();
        i = 0;
        if (i3 != 0) {
        }
    }

    protected void zzaq(zzv zzvVar, MediaFormat mediaFormat) throws zzjm {
        throw null;
    }

    protected void zzas() {
    }

    protected abstract boolean zzat(long j, long j2, zzvm zzvmVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzjm;

    protected abstract void zzau(zzjb zzjbVar);

    protected void zzav() throws zzjm {
        throw null;
    }

    protected void zzaw(long j) {
    }

    protected void zzax(zzix zzixVar) throws zzjm {
        throw null;
    }

    protected final long zzba() {
        return this.zzai;
    }

    protected void zzbb(long j) {
        this.zzai = Math.max(j, this.zzai);
        while (true) {
            ArrayDeque arrayDeque = this.zzl;
            if (arrayDeque.isEmpty() || j < ((zzvv) arrayDeque.peek()).zzb()) {
                return;
            }
            zzvv zzvvVar = (zzvv) arrayDeque.poll();
            zzvvVar.getClass();
            zzbu(zzvvVar);
            zzas();
        }
    }

    protected final boolean zzbc() {
        if (this.zzo == null) {
            return false;
        }
        if (zzT() || zzaE()) {
            return true;
        }
        return this.zzN != -9223372036854775807L && zzM().zzb() < this.zzN;
    }

    protected final float zzbd() {
        return this.zzv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zznb zzbe() {
        return this.zzs;
    }

    protected final boolean zzbf() throws zzjm {
        return zzbq(this.zzy);
    }

    protected final long zzbg() {
        return this.zzah.zzh();
    }

    protected final long zzbh() {
        return this.zzac;
    }

    protected final long zzbi() {
        return this.zzah.zzd();
    }

    protected final long zzbj() {
        return this.zzah.zzc();
    }

    protected final void zzbk(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.zzan.zzb(mediaFormat);
        }
    }

    final /* synthetic */ void zzbm(zzly zzlyVar) {
        this.zzn.set(zzR(zzlyVar, this.zzh, 0));
    }

    final /* synthetic */ zznb zzbn() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzne
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzmx
    public void zzx(int i, Object obj) throws zzjm {
        if (i != 11) {
            return;
        }
        zznb zznbVar = (zznb) obj;
        zznbVar.getClass();
        this.zzs = zznbVar;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected void zzy(boolean z, boolean z2) throws zzjm {
        this.zza = new zzjd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r2 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zziz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void zzz(com.google.android.gms.internal.ads.zzv[] r14, long r15, long r17, com.google.android.gms.internal.ads.zzxl r19) throws com.google.android.gms.internal.ads.zzjm {
        /*
            r13 = this;
            long r7 = r13.zzP()
            com.google.android.gms.internal.ads.zzvv r14 = r13.zzah
            long r0 = r14.zzd()
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 != 0) goto L2d
            com.google.android.gms.internal.ads.zzvv r0 = new com.google.android.gms.internal.ads.zzvv
            r9 = 0
            r10 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9, r10)
            r13.zzbu(r0)
            boolean r14 = r13.zzak
            if (r14 == 0) goto L64
            r13.zzas()
            return
        L2d:
            java.util.ArrayDeque r14 = r13.zzl
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L65
            long r0 = r13.zzac
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L45
            long r2 = r13.zzai
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L65
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L65
        L45:
            com.google.android.gms.internal.ads.zzvv r0 = new com.google.android.gms.internal.ads.zzvv
            r9 = 0
            r10 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9, r10)
            r13.zzbu(r0)
            com.google.android.gms.internal.ads.zzvv r14 = r13.zzah
            long r0 = r14.zzd()
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 == 0) goto L64
            r13.zzas()
        L64:
            return
        L65:
            com.google.android.gms.internal.ads.zzvv r0 = new com.google.android.gms.internal.ads.zzvv
            long r1 = r13.zzac
            r9 = 0
            r10 = 0
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9, r10)
            r14.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvw.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzxl):void");
    }

    private final void zzbw() throws zzjm {
        zzuj zzujVar = this.zzr;
        zzujVar.getClass();
        this.zzq = zzujVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final void zzbt() throws zzjm {
        int i = this.zzY;
        if (i == 1) {
            zzaA();
            return;
        }
        if (i == 2) {
            zzaA();
            zzbw();
        } else if (i != 3) {
            this.zzaf = true;
            zzav();
        } else {
            zzaO();
            zzaG();
        }
    }
}
