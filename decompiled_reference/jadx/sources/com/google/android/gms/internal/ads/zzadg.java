package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.common.Scopes;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzadg extends zzvw implements zzadv {
    private static final int[] zzb = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private long zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private zznj zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private int zzJ;
    private long zzK;
    private zzbv zzL;
    private zzbv zzM;
    private int zzN;
    private int zzO;
    private zzadt zzP;
    private long zzQ;
    private boolean zzR;
    private int zzS;
    private final Context zze;
    private final boolean zzf;
    private final zzaeq zzg;
    private final boolean zzh;
    private final zzadw zzi;
    private final zzadu zzj;
    private final zzacp zzk;
    private final long zzl;
    private final zzadx zzm;
    private final PriorityQueue zzn;
    private zzadf zzo;
    private boolean zzp;
    private boolean zzq;
    private zzaew zzr;
    private boolean zzs;
    private int zzt;
    private List zzu;
    private Surface zzv;
    private zzadi zzw;
    private zzev zzx;
    private boolean zzy;
    private int zzz;

    protected zzadg(zzade zzadeVar) {
        super(zzadeVar.zze().getApplicationContext(), 2, zzadeVar.zzg(), zzadeVar.zzf(), false, 30.0f);
        Context applicationContext = zzadeVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzr = null;
        this.zzg = new zzaeq(zzadeVar.zzh(), zzadeVar.zzi());
        this.zzf = this.zzr == null;
        this.zzi = new zzadw(applicationContext, this, 0L);
        this.zzj = new zzadu();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzx = zzev.zza;
        this.zzz = 1;
        this.zzA = 0;
        this.zzL = zzbv.zza;
        this.zzO = 0;
        this.zzM = null;
        this.zzN = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.zzQ = -9223372036854775807L;
        this.zzk = new zzacp();
        this.zzn = new PriorityQueue();
        this.zzl = -15000L;
        this.zzm = new zzadx(1.0f);
        this.zzF = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c1, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzay(com.google.android.gms.internal.ads.zzvp r8, com.google.android.gms.internal.ads.zzv r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zzay(com.google.android.gms.internal.ads.zzvp, com.google.android.gms.internal.ads.zzv):int");
    }

    private final Surface zzbA(zzvp zzvpVar) {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            return zzaewVar.zzk();
        }
        Surface surface = this.zzv;
        if (surface != null) {
            return surface;
        }
        if (zzbt(zzvpVar)) {
            return null;
        }
        zzgtr.zzi(zzaE(zzvpVar));
        zzadi zzadiVar = this.zzw;
        if (zzadiVar != null) {
            if (zzadiVar.zza != zzvpVar.zzf) {
                zzbB();
            }
        }
        if (this.zzw == null) {
            this.zzw = zzadi.zzb(this.zze, zzvpVar.zzf);
        }
        return this.zzw;
    }

    private final void zzbB() {
        zzadi zzadiVar = this.zzw;
        if (zzadiVar != null) {
            zzadiVar.release();
            this.zzw = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    /* JADX INFO: renamed from: zzbC, reason: merged with bridge method [inline-methods] */
    public final void zzbq() {
        this.zzg.zzg(this.zzv);
        this.zzy = true;
    }

    private final void zzbD() {
        zzbv zzbvVar = this.zzM;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    protected static int zzbo(zzvp zzvpVar, zzv zzvVar) {
        int i = zzvVar.zzq;
        if (i == -1) {
            return zzay(zzvpVar, zzvVar);
        }
        List list = zzvVar.zzs;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return i + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:103:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:109:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x016d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0177  */
    /* JADX WARN: Code duplicated, block: B:124:0x0181  */
    /* JADX WARN: Code duplicated, block: B:127:0x018b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0195  */
    /* JADX WARN: Code duplicated, block: B:133:0x019f  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01db  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:163:0x0203  */
    /* JADX WARN: Code duplicated, block: B:166:0x020d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0217  */
    /* JADX WARN: Code duplicated, block: B:172:0x0221  */
    /* JADX WARN: Code duplicated, block: B:175:0x022b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0235  */
    /* JADX WARN: Code duplicated, block: B:181:0x023f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0249  */
    /* JADX WARN: Code duplicated, block: B:187:0x0253  */
    /* JADX WARN: Code duplicated, block: B:190:0x025d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0267  */
    /* JADX WARN: Code duplicated, block: B:196:0x0271  */
    /* JADX WARN: Code duplicated, block: B:199:0x027b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0285  */
    /* JADX WARN: Code duplicated, block: B:205:0x028f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0299  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:223:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:229:0x02df  */
    /* JADX WARN: Code duplicated, block: B:232:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:235:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:241:0x0307  */
    /* JADX WARN: Code duplicated, block: B:244:0x0311  */
    /* JADX WARN: Code duplicated, block: B:247:0x031b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0325  */
    /* JADX WARN: Code duplicated, block: B:253:0x032f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0339  */
    /* JADX WARN: Code duplicated, block: B:259:0x0343  */
    /* JADX WARN: Code duplicated, block: B:262:0x034d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0357  */
    /* JADX WARN: Code duplicated, block: B:268:0x0361  */
    /* JADX WARN: Code duplicated, block: B:271:0x036b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0375  */
    /* JADX WARN: Code duplicated, block: B:277:0x037f  */
    /* JADX WARN: Code duplicated, block: B:280:0x0389  */
    /* JADX WARN: Code duplicated, block: B:283:0x0393  */
    /* JADX WARN: Code duplicated, block: B:286:0x039d  */
    /* JADX WARN: Code duplicated, block: B:289:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:295:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:298:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:301:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:304:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:307:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:310:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:313:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:316:0x0401  */
    /* JADX WARN: Code duplicated, block: B:319:0x040b  */
    /* JADX WARN: Code duplicated, block: B:322:0x0415  */
    /* JADX WARN: Code duplicated, block: B:325:0x041f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0429  */
    /* JADX WARN: Code duplicated, block: B:331:0x0433  */
    /* JADX WARN: Code duplicated, block: B:334:0x043d  */
    /* JADX WARN: Code duplicated, block: B:337:0x0447  */
    /* JADX WARN: Code duplicated, block: B:340:0x0451  */
    /* JADX WARN: Code duplicated, block: B:343:0x045b  */
    /* JADX WARN: Code duplicated, block: B:346:0x0465  */
    /* JADX WARN: Code duplicated, block: B:349:0x046f  */
    /* JADX WARN: Code duplicated, block: B:352:0x0479  */
    /* JADX WARN: Code duplicated, block: B:355:0x0483  */
    /* JADX WARN: Code duplicated, block: B:358:0x048d  */
    /* JADX WARN: Code duplicated, block: B:361:0x0497  */
    /* JADX WARN: Code duplicated, block: B:364:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:367:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:370:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:373:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:376:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:379:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:382:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:385:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:388:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:391:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:394:0x0505  */
    /* JADX WARN: Code duplicated, block: B:397:0x050f  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[Catch: all -> 0x0677, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:507:0x0673, B:10:0x0013, B:12:0x001a, B:506:0x066f, B:39:0x006e, B:41:0x0074, B:44:0x007f, B:74:0x00da, B:76:0x00e0, B:499:0x0659), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:400:0x0519  */
    /* JADX WARN: Code duplicated, block: B:403:0x0523  */
    /* JADX WARN: Code duplicated, block: B:406:0x052d  */
    /* JADX WARN: Code duplicated, block: B:409:0x0537  */
    /* JADX WARN: Code duplicated, block: B:412:0x0541  */
    /* JADX WARN: Code duplicated, block: B:415:0x054b  */
    /* JADX WARN: Code duplicated, block: B:418:0x0555  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[Catch: all -> 0x0677, TryCatch #0 {, blocks: (B:7:0x000d, B:507:0x0673, B:10:0x0013, B:12:0x001a, B:506:0x066f, B:39:0x006e, B:41:0x0074, B:44:0x007f, B:74:0x00da, B:76:0x00e0, B:499:0x0659), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:421:0x055f  */
    /* JADX WARN: Code duplicated, block: B:424:0x0569  */
    /* JADX WARN: Code duplicated, block: B:427:0x0573  */
    /* JADX WARN: Code duplicated, block: B:430:0x057d  */
    /* JADX WARN: Code duplicated, block: B:433:0x0587  */
    /* JADX WARN: Code duplicated, block: B:436:0x0591  */
    /* JADX WARN: Code duplicated, block: B:439:0x059b  */
    /* JADX WARN: Code duplicated, block: B:442:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:445:0x05af  */
    /* JADX WARN: Code duplicated, block: B:448:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[Catch: all -> 0x0677, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:507:0x0673, B:10:0x0013, B:12:0x001a, B:506:0x066f, B:39:0x006e, B:41:0x0074, B:44:0x007f, B:74:0x00da, B:76:0x00e0, B:499:0x0659), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:451:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:454:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:457:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:460:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:463:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:466:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:469:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:472:0x0607  */
    /* JADX WARN: Code duplicated, block: B:475:0x0610  */
    /* JADX WARN: Code duplicated, block: B:478:0x0619  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:481:0x0622  */
    /* JADX WARN: Code duplicated, block: B:484:0x062b  */
    /* JADX WARN: Code duplicated, block: B:487:0x0634  */
    /* JADX WARN: Code duplicated, block: B:490:0x063d  */
    /* JADX WARN: Code duplicated, block: B:493:0x0646  */
    /* JADX WARN: Code duplicated, block: B:496:0x064f  */
    /* JADX WARN: Code duplicated, block: B:499:0x0659 A[Catch: all -> 0x0677, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:507:0x0673, B:10:0x0013, B:12:0x001a, B:506:0x066f, B:39:0x006e, B:41:0x0074, B:44:0x007f, B:74:0x00da, B:76:0x00e0, B:499:0x0659), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:503:0x0665  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da A[Catch: all -> 0x0677, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:507:0x0673, B:10:0x0013, B:12:0x001a, B:506:0x066f, B:39:0x006e, B:41:0x0074, B:44:0x007f, B:74:0x00da, B:76:0x00e0, B:499:0x0659), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0 A[Catch: all -> 0x0677, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:507:0x0673, B:10:0x0013, B:12:0x001a, B:506:0x066f, B:39:0x006e, B:41:0x0074, B:44:0x007f, B:74:0x00da, B:76:0x00e0, B:499:0x0659), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0127  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:322:0x0415
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    protected static final boolean zzbs(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 2292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zzbs(java.lang.String):boolean");
    }

    protected static final boolean zzbt(zzvp zzvpVar) {
        return Build.VERSION.SDK_INT >= 35 && zzvpVar.zzh;
    }

    private static List zzbu(Context context, zzvy zzvyVar, zzv zzvVar, boolean z, boolean z2) throws zzwa {
        String str = zzvVar.zzp;
        if (str == null) {
            return zzgwt.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadd.zza(context)) {
            List listZzd = zzwi.zzd(zzvyVar, zzvVar, z, z2);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzwi.zzc(zzvyVar, zzvVar, z, z2);
    }

    private final void zzbv(Object obj) throws zzjm {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzv == surface) {
            if (surface != null) {
                zzbD();
                Surface surface2 = this.zzv;
                if (surface2 == null || !this.zzy) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzv = surface;
        if (this.zzr == null) {
            this.zzi.zzd(surface);
        }
        this.zzy = false;
        int iZze = zze();
        zzvm zzvmVarZzaK = zzaK();
        if (zzvmVarZzaK != null && this.zzr == null) {
            zzvp zzvpVarZzaN = zzaN();
            zzvpVarZzaN.getClass();
            if (!zzbz(zzvpVarZzaN) || this.zzp) {
                zzaO();
                zzaG();
            } else {
                Surface surfaceZzbA = zzbA(zzvpVarZzaN);
                if (surfaceZzbA != null) {
                    zzvmVarZzaK.zzn(surfaceZzbA);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzvmVarZzaK.zzo();
                }
            }
        }
        if (surface != null) {
            zzbD();
        } else {
            this.zzM = null;
            zzaew zzaewVar = this.zzr;
            if (zzaewVar != null) {
                zzaewVar.zzq();
            }
        }
        if (iZze == 2) {
            zzaew zzaewVar2 = this.zzr;
            if (zzaewVar2 != null) {
                zzaewVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbw(zzix zzixVar) {
        if (zzcW() || zzixVar.zzd() || zzP() == -9223372036854775807L) {
            return true;
        }
        return zzP() - (zzixVar.zzd - zzbi()) <= 100000;
    }

    private final boolean zzbx(zzix zzixVar) {
        return zzixVar.zzd < zzH();
    }

    private final void zzby(long j, long j2, zzv zzvVar) {
        zzadt zzadtVar = this.zzP;
        if (zzadtVar != null) {
            zzadtVar.zzcS(j, j2, zzvVar, zzaM());
        }
    }

    private final boolean zzbz(zzvp zzvpVar) {
        if (this.zzr != null) {
            return true;
        }
        Surface surface = this.zzv;
        return (surface != null && surface.isValid()) || zzbt(zzvpVar) || zzaE(zzvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    protected final void zzA(long j, boolean z, boolean z2) throws zzjm {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null && !z) {
            zzaewVar.zzg(true);
        }
        if (z2) {
            this.zzG = j;
        }
        super.zzA(j, z, z2);
        if (this.zzr == null) {
            this.zzi.zzl();
        }
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            zzadxVar.zzd();
        }
        if (z) {
            zzaew zzaewVar2 = this.zzr;
            if (zzaewVar2 != null) {
                zzaewVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzD = 0;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected final void zzB() {
        this.zzC = 0;
        this.zzB = zzM().zzb();
        this.zzI = 0L;
        this.zzJ = 0;
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected final void zzC() {
        if (this.zzC > 0) {
            long jZzb = zzM().zzb();
            this.zzg.zzd(this.zzC, jZzb - this.zzB);
            this.zzC = 0;
            this.zzB = jZzb;
        }
        int i = this.zzJ;
        if (i != 0) {
            this.zzg.zze(this.zzI, i);
            this.zzI = 0L;
            this.zzJ = 0;
        }
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zzb();
        } else {
            this.zzi.zzc();
        }
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            zzadxVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    protected final void zzD() {
        this.zzM = null;
        this.zzy = false;
        this.zzH = true;
        try {
            super.zzD();
        } finally {
            zzaeq zzaeqVar = this.zzg;
            zzaeqVar.zzi(this.zza);
            zzaeqVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzs = false;
            this.zzQ = -9223372036854775807L;
            zzbB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected final void zzF() {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar == null || !this.zzf) {
            return;
        }
        zzaewVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zznc, com.google.android.gms.internal.ads.zzne
    public final String zzV() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final boolean zzX(long j) {
        if (zzbh() == -9223372036854775807L || j < this.zzG) {
            return false;
        }
        long jZzba = zzba();
        return jZzba == -9223372036854775807L || j > jZzba;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final void zzY(float f, float f2) throws zzjm {
        super.zzY(f, f2);
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            zzadxVar.zzc(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzZ() {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar == null) {
            this.zzi.zzh();
            return;
        }
        int i = this.zzt;
        if (i == 0 || i == 1) {
            this.zzt = 0;
        } else {
            zzaewVar.zzt();
        }
    }

    protected final void zzaA(zzvm zzvmVar, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzvmVar.zzc(i, false);
        Trace.endSection();
        zzaB(0, 1);
    }

    protected final void zzaB(int i, int i2) {
        zzjd zzjdVar = this.zza;
        zzjdVar.zzh += i;
        int i3 = i + i2;
        zzjdVar.zzg += i3;
        this.zzC += i3;
        int i4 = this.zzD + i3;
        this.zzD = i4;
        zzjdVar.zzi = Math.max(i4, zzjdVar.zzi);
    }

    protected final void zzaC(long j) {
        zzjd zzjdVar = this.zza;
        zzjdVar.zzk += j;
        zzjdVar.zzl++;
        this.zzI += j;
        this.zzJ++;
    }

    protected final void zzaD(zzvm zzvmVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzvmVar.zzd(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzD = 0;
        if (this.zzr == null) {
            zzbv zzbvVar = this.zzL;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzM)) {
                this.zzM = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzv == null) {
                return;
            }
            zzbq();
        }
    }

    protected final boolean zzaE(zzvp zzvpVar) {
        if (zzbs(zzvpVar.zza)) {
            return false;
        }
        return !zzvpVar.zzf || zzadi.zza(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final boolean zzaI(zzvp zzvpVar) {
        return zzbz(zzvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final boolean zzaQ() {
        zzvp zzvpVarZzaN = zzaN();
        if (this.zzr != null && zzvpVarZzaN != null) {
            String str = zzvpVarZzaN.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaQ();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    @Override // com.google.android.gms.internal.ads.zzvw
    protected final boolean zzaR() {
        boolean z;
        zzv zzvVarZzaL = zzaL();
        long jZzP = zzP();
        if (jZzP != -9223372036854775807L) {
            if (zzaS() + 1 + jZzP > Long.MAX_VALUE - (zzbi() + jZzP)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return this.zzF == null || this.zzH || (zzvVarZzaL != null && zzvVarZzaL.zzr > 0) || z || zzbg() != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzaT() {
        super.zzaT();
        this.zzn.clear();
        this.zzE = 0;
        this.zzS = 0;
        this.zzH = false;
        zzacp zzacpVar = this.zzk;
        if (zzacpVar != null) {
            zzacpVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final zzvo zzaV(Throwable th, zzvp zzvpVar) {
        return new zzada(th, zzvpVar, this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final boolean zzaW(zzv zzvVar) throws zzjm {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar == null || zzaewVar.zze()) {
            return true;
        }
        try {
            zzaewVar.zzd(zzvVar);
            return true;
        } catch (zzaev e) {
            throw zzQ(e, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzaX(zzix zzixVar) throws zzjm {
        ByteBuffer byteBuffer;
        zzacp zzacpVar = this.zzk;
        if (zzacpVar != null) {
            zzvp zzvpVarZzaN = zzaN();
            zzvpVarZzaN.getClass();
            if (zzvpVarZzaN.zzb.equals("video/av01") && zzixVar.zzc() && (byteBuffer = zzixVar.zzc) != null) {
                zzacpVar.zzb(byteBuffer);
            }
        }
        this.zzS = 0;
        int iZzaY = zzaY(zzixVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaY & 32) == 0) {
            this.zzE++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final int zzaY(zzix zzixVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzF == null || !zzbx(zzixVar) || zzbw(zzixVar)) ? 0 : 32;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    @Override // com.google.android.gms.internal.ads.zzvw
    protected final boolean zzaZ(zzix zzixVar) {
        boolean z;
        ByteBuffer byteBuffer;
        boolean z2 = false;
        if (zzbw(zzixVar)) {
            return false;
        }
        boolean zZzbx = zzbx(zzixVar);
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            long jZzb = zzadxVar.zzb(zzixVar.zzd);
            if (jZzb == -9223372036854775807L || jZzb >= this.zzl) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if ((!zZzbx && !z) || zzixVar.zze()) {
            return false;
        }
        if (!zzixVar.zzf()) {
            zzacp zzacpVar = this.zzk;
            if (zzacpVar != null) {
                zzvp zzvpVarZzaN = zzaN();
                zzvpVarZzaN.getClass();
                if (zzvpVarZzaN.zzb.equals("video/av01") && (byteBuffer = zzixVar.zzc) != null) {
                    boolean z3 = zZzbx || this.zzS <= 0;
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    byteBufferAsReadOnlyBuffer.flip();
                    int iZza = zzacpVar.zza(byteBufferAsReadOnlyBuffer, z3);
                    if (iZza == 0) {
                        zzixVar.zza();
                    } else if (iZza != byteBufferAsReadOnlyBuffer.limit()) {
                        zzadf zzadfVar = this.zzo;
                        zzadfVar.getClass();
                        if (zzadfVar.zzc + iZza < byteBufferAsReadOnlyBuffer.capacity() && !zzixVar.zzk()) {
                            ByteBuffer byteBuffer2 = zzixVar.zzc;
                            byteBuffer2.getClass();
                            byteBuffer2.position(iZza);
                        }
                    }
                }
            }
            if (z2) {
                if (zZzbx) {
                    this.zza.zzd++;
                    return z2;
                }
                this.zzn.add(Long.valueOf(zzixVar.zzd));
                this.zzS++;
            }
            return z2;
        }
        zzixVar.zza();
        z2 = true;
        if (z2) {
            if (zZzbx) {
                this.zza.zzd++;
                return z2;
            }
            this.zzn.add(Long.valueOf(zzixVar.zzd));
            this.zzS++;
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final void zzaa(long j, long j2) throws Throwable {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            try {
                zzaewVar.zzv(j, j2);
            } catch (zzaev e) {
                throw zzQ(e, e.zza, false, 7001);
            }
        }
        super.zzaa(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final boolean zzab() {
        boolean zZzbc = zzbc();
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            return zzaewVar.zzh(zZzbc);
        }
        if (zZzbc && zzaK() == null) {
            return true;
        }
        return this.zzi.zzi(zZzbc);
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final boolean zzac() {
        if (!super.zzac()) {
            return false;
        }
        zzaew zzaewVar = this.zzr;
        return zzaewVar == null || zzaewVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final int zzaf(zzvy zzvyVar, zzv zzvVar) throws zzwa {
        boolean z;
        String str = zzvVar.zzp;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzvVar.zzt != null;
        List listZzbu = zzbu(context, zzvyVar, zzvVar, z2, false);
        if (z2 && listZzbu.isEmpty()) {
            listZzbu = zzbu(context, zzvyVar, zzvVar, false, false);
        }
        if (listZzbu.isEmpty()) {
            return 129;
        }
        if (!zzbl(zzvVar)) {
            return 130;
        }
        zzvp zzvpVar = (zzvp) listZzbu.get(0);
        boolean zZzc = zzvpVar.zzc(context, zzvVar);
        if (!zZzc) {
            int i2 = 1;
            while (true) {
                if (i2 >= listZzbu.size()) {
                    z = true;
                    break;
                }
                zzvp zzvpVar2 = (zzvp) listZzbu.get(i2);
                if (zzvpVar2.zzc(context, zzvVar)) {
                    zZzc = true;
                    z = false;
                    zzvpVar = zzvpVar2;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = true != zZzc ? 3 : 4;
        int i4 = true != zzvpVar.zze(zzvVar) ? 8 : 16;
        int i5 = true != zzvpVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadd.zza(context)) {
            i6 = 256;
        }
        if (zZzc) {
            List listZzbu2 = zzbu(context, zzvyVar, zzvVar, z2, true);
            if (!listZzbu2.isEmpty()) {
                zzvp zzvpVar3 = (zzvp) zzwi.zze(context, listZzbu2, zzvVar).get(0);
                if (zzvpVar3.zzc(context, zzvVar) && zzvpVar3.zze(zzvVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final List zzag(zzvy zzvyVar, zzv zzvVar, boolean z) throws zzwa {
        Context context = this.zze;
        return zzwi.zze(context, zzbu(context, zzvyVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final zzvj zzai(zzvp zzvpVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        int i;
        zzadf zzadfVar;
        Point pointZzi;
        int i2;
        zzv[] zzvVarArr;
        byte b;
        boolean z;
        Pair pairZze;
        int iZzay;
        zzv[] zzvVarArrZzJ = zzJ();
        int length = zzvVarArrZzJ.length;
        int iZzbo = zzbo(zzvpVar, zzvVar);
        int i3 = zzvVar.zzx;
        int i4 = zzvVar.zzw;
        if (length == 1) {
            if (iZzbo != -1 && (iZzay = zzay(zzvpVar, zzvVar)) != -1) {
                iZzbo = Math.min((int) (iZzbo * 1.5f), iZzay);
            }
            zzadfVar = new zzadf(i4, i3, iZzbo);
            i = 35;
        } else {
            int iMax = i3;
            int iMax2 = i4;
            int i5 = 0;
            boolean z2 = false;
            i = 35;
            while (i5 < length) {
                zzv zzvVarZzP = zzvVarArrZzJ[i5];
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zzvVarZzP.zzF == null) {
                    zzt zztVarZza = zzvVarZzP.zza();
                    zztVarZza.zzE(zziVar);
                    zzvVarZzP = zztVarZza.zzP();
                }
                if (zzvpVar.zzf(zzvVar, zzvVarZzP).zzd != 0) {
                    int i6 = zzvVarZzP.zzw;
                    b = -1;
                    if (i6 != -1) {
                        zzvVarArr = zzvVarArrZzJ;
                        if (zzvVarZzP.zzx != -1) {
                            z = false;
                        }
                        z2 |= z;
                        iMax2 = Math.max(iMax2, i6);
                        iMax = Math.max(iMax, zzvVarZzP.zzx);
                        iZzbo = Math.max(iZzbo, zzbo(zzvpVar, zzvVarZzP));
                    } else {
                        zzvVarArr = zzvVarArrZzJ;
                    }
                    z = true;
                    z2 |= z;
                    iMax2 = Math.max(iMax2, i6);
                    iMax = Math.max(iMax, zzvVarZzP.zzx);
                    iZzbo = Math.max(iZzbo, zzbo(zzvpVar, zzvVarZzP));
                } else {
                    zzvVarArr = zzvVarArrZzJ;
                    b = -1;
                }
                i5++;
                zzvVarArrZzJ = zzvVarArr;
            }
            if (z2) {
                StringBuilder sb = new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax2);
                sb.append("x");
                sb.append(iMax);
                zzeh.zzc("MediaCodecVideoRenderer", sb.toString());
                boolean z3 = i3 > i4;
                int i7 = z3 ? i3 : i4;
                int i8 = true != z3 ? i3 : i4;
                int[] iArr = zzb;
                int i9 = 0;
                while (true) {
                    if (i9 < 9) {
                        float f2 = i8;
                        float f3 = i7;
                        int i10 = iArr[i9];
                        int i11 = i9;
                        float f4 = i10;
                        if (i10 > i7 && (i2 = (int) (f4 * (f2 / f3))) > i8) {
                            int i12 = i7;
                            int i13 = true != z3 ? i10 : i2;
                            if (true != z3) {
                                i10 = i2;
                            }
                            pointZzi = zzvpVar.zzi(i13, i10);
                            float f5 = zzvVar.zzA;
                            if (pointZzi != null) {
                                if (zzvpVar.zzg(pointZzi.x, pointZzi.y, f5)) {
                                    break;
                                }
                            }
                            i9 = i11 + 1;
                            i7 = i12;
                            i8 = i8;
                            z3 = z3;
                        }
                    }
                    pointZzi = null;
                    break;
                }
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzv(iMax2);
                    zztVarZza2.zzw(iMax);
                    iZzbo = Math.max(iZzbo, zzay(zzvpVar, zztVarZza2.zzP()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iMax2).length() + 35 + String.valueOf(iMax).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(iMax2);
                    sb2.append("x");
                    sb2.append(iMax);
                    zzeh.zzc("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzadfVar = new zzadf(iMax2, iMax, iZzbo);
        }
        String str = zzvpVar.zzc;
        this.zzo = zzadfVar;
        boolean z4 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i3);
        zzek.zza(mediaFormat, zzvVar.zzs);
        float f6 = zzvVar.zzA;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzek.zzb(mediaFormat, "rotation-degrees", zzvVar.zzB);
        zzi zziVar2 = zzvVar.zzF;
        if (zziVar2 != null) {
            zzek.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzek.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzek.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzp) && (pairZze = zzdr.zze(zzvVar)) != null) {
            zzek.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzadfVar.zza);
        mediaFormat.setInteger("max-height", zzadfVar.zzb);
        zzek.zzb(mediaFormat, "max-input-size", zzadfVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z4) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= i) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzN));
        }
        zzbk(mediaFormat);
        Surface surfaceZzbA = zzbA(zzvpVar);
        if (this.zzr != null && !zzfm.zzW(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzvj.zzb(zzvpVar, mediaFormat, zzvVar, surfaceZzbA, null);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final zzje zzaj(zzvp zzvpVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        int i;
        int i2;
        zzje zzjeVarZzf = zzvpVar.zzf(zzvVar, zzvVar2);
        int i3 = zzjeVarZzf.zze;
        zzadf zzadfVar = this.zzo;
        zzadfVar.getClass();
        if (zzvVar2.zzw > zzadfVar.zza || zzvVar2.zzx > zzadfVar.zzb) {
            i3 |= 256;
        }
        if (zzbo(zzvpVar, zzvVar2) > zzadfVar.zzc) {
            i3 |= 64;
        }
        if (this.zzA != Integer.MIN_VALUE && Build.VERSION.SDK_INT < 31 && (Build.VERSION.SDK_INT != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f = zzvVar.zzA;
            if (f != -1.0f) {
                float f2 = zzvVar2.zzA;
                if (f2 != -1.0f && (!zzvpVar.zzf || !z)) {
                    float fMax = Math.max(f2, f) / Math.min(f2, f);
                    if (Math.abs(fMax - Math.round(fMax)) > 0.01f) {
                        i3 |= 65536;
                    }
                }
            }
        }
        String str = zzvpVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzjeVarZzf.zzd;
        }
        return new zzje(str, zzvVar, zzvVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final float zzal(float f, zzv zzvVar, zzv[] zzvVarArr) {
        zzvp zzvpVarZzaN;
        float fMax = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f2 = zzvVar2.zzA;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.zzF == null || (zzvpVarZzaN = zzaN()) == null) {
            return f3;
        }
        float fZzh = zzvpVarZzaN.zzh(zzvVar.zzw, zzvVar.zzx);
        return f3 != -1.0f ? Math.max(f3, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzam(String str, zzvj zzvjVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzp = zzbs(str);
        zzvp zzvpVarZzaN = zzaN();
        zzvpVarZzaN.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzvpVarZzaN.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzvpVarZzaN.zzb()) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.zzq = z;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzan(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzao(Exception exc) {
        zzeh.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final zzje zzap(zzly zzlyVar) throws zzjm {
        zzje zzjeVarZzap = super.zzap(zzlyVar);
        zzv zzvVar = zzlyVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzjeVarZzap);
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            zzadxVar.zzd();
        }
        return zzjeVarZzap;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzaq(zzv zzvVar, MediaFormat mediaFormat) {
        zzvm zzvmVarZzaK = zzaK();
        if (zzvmVarZzaK != null) {
            zzvmVarZzaK.zzq(this.zzz);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzvVar.zzC;
        int i = zzvVar.zzB;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzL = new zzbv(integer, integer2, f);
        zzaew zzaewVar = this.zzr;
        if (zzaewVar == null || !this.zzR) {
            this.zzi.zze(zzvVar.zzA);
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzv(integer);
            zztVarZza.zzw(integer2);
            zztVarZza.zzB(f);
            zzv zzvVarZzP = zztVarZza.zzP();
            int i3 = this.zzt;
            List listZzi = this.zzu;
            if (listZzi == null) {
                listZzi = zzgwt.zzi();
            }
            zzaewVar.zzs(1, zzvVarZzP, zzbj(), i3, listZzi);
            this.zzt = 2;
        }
        this.zzR = false;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzar(long j, long j2, long j3, boolean z, boolean z2) throws zzjm {
        int iZzS;
        if (this.zzr != null && this.zzf) {
            j2 -= -this.zzQ;
        }
        if (j >= -500000 || z || (iZzS = zzS(j2)) == 0) {
            return false;
        }
        this.zzG = j2;
        if (z2) {
            zzjd zzjdVar = this.zza;
            int i = zzjdVar.zzd + iZzS;
            zzjdVar.zzd = i;
            zzjdVar.zzf += this.zzE;
            zzjdVar.zzd = i + this.zzn.size();
        } else {
            this.zza.zzj++;
            zzaB(iZzS + this.zzn.size(), this.zzE);
        }
        zzaP();
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzas() {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zzi();
            long jZzbj = this.zzQ;
            if (jZzbj == -9223372036854775807L) {
                jZzbj = zzbj();
                this.zzQ = jZzbj;
            }
            this.zzr.zzo(-jZzbj);
        } else {
            this.zzi.zza(2);
        }
        this.zzR = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzau(zzjb zzjbVar) {
        this.zzg.zzk(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzav() {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zzi();
        } else if (zzbg() != -9223372036854775807L) {
            zzbg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzax(zzix zzixVar) throws zzjm {
        if (this.zzq) {
            ByteBuffer byteBuffer = zzixVar.zze;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzvm zzvmVarZzaK = zzaK();
                        zzvmVarZzaK.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzvmVarZzaK.zzp(bundle);
                    }
                }
            }
        }
    }

    protected final void zzaz(zzvm zzvmVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzvmVar.zzc(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzbb(long j) {
        super.zzbb(j);
        this.zzE--;
    }

    final /* synthetic */ Surface zzbr() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    protected final void zzy(boolean z, boolean z2) throws zzjm {
        super.zzy(z, z2);
        zzK();
        this.zzg.zza(this.zza);
        if (!this.zzs) {
            if (this.zzu != null && this.zzr == null) {
                zzadk zzadkVar = new zzadk(this.zze, this.zzi);
                zzadkVar.zza(true);
                zzadkVar.zzc(-this.zzl);
                zzadkVar.zzb(zzM());
                zzads zzadsVarZzd = zzadkVar.zzd();
                zzadsVarZzd.zza(1);
                this.zzr = zzadsVarZzd.zzb(0);
            }
            this.zzs = true;
        }
        int i = !z2 ? 1 : 0;
        zzaew zzaewVar = this.zzr;
        if (zzaewVar == null) {
            zzadw zzadwVar = this.zzi;
            zzadwVar.zzg(zzM());
            zzadwVar.zza(i);
            return;
        }
        zzaewVar.zzc(new zzadb(this), zzhcw.zza());
        zzadt zzadtVar = this.zzP;
        if (zzadtVar != null) {
            this.zzr.zzl(zzadtVar);
        }
        if (this.zzv != null && !this.zzx.equals(zzev.zza)) {
            this.zzr.zzp(this.zzv, this.zzx);
        }
        this.zzr.zzr(this.zzA);
        this.zzr.zzm(zzbd());
        List list = this.zzu;
        if (list != null) {
            this.zzr.zzn(list);
        }
        this.zzt = i;
        zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    protected final void zzz(zzv[] zzvVarArr, long j, long j2, zzxl zzxlVar) throws zzjm {
        super.zzz(zzvVarArr, j, j2, zzxlVar);
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            zzadxVar.zzd();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    @Override // com.google.android.gms.internal.ads.zzvw
    protected final boolean zzat(long j, long j2, zzvm zzvmVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzjm {
        long jZzb;
        zzadg zzadgVar;
        long j4;
        zzvmVar.getClass();
        long jZzbi = j3 - zzbi();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzn;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        zzaB(i4, 0);
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            if (!z || z2) {
                return zzaewVar.zzu(j3, new zzadc(this, zzvmVar, i, jZzbi));
            }
            zzaz(zzvmVar, i, jZzbi);
            return true;
        }
        zzadw zzadwVar = this.zzi;
        long jZzbj = zzbj();
        zzadu zzaduVar = this.zzj;
        int iZzk = zzadwVar.zzk(j3, j, j2, jZzbj, z, z2, zzaduVar);
        zzadx zzadxVar = this.zzm;
        if (zzadxVar == null) {
            if (iZzk != 0) {
                long jZzc = zzM().zzc();
                zzby(jZzbi, jZzc, zzvVar);
                zzaD(zzvmVar, i, jZzbi, jZzc);
                zzaC(zzaduVar.zza());
                return true;
            }
            if (iZzk != 1) {
                jZzb = zzaduVar.zzb();
                long jZza = zzaduVar.zza();
                if (jZzb == this.zzK) {
                    zzaz(zzvmVar, i, jZzbi);
                    j4 = jZzb;
                    zzadgVar = this;
                } else {
                    zzby(jZzbi, jZzb, zzvVar);
                    zzaD(zzvmVar, i, jZzbi, jZzb);
                    zzadgVar = this;
                    j4 = jZzb;
                }
                zzadgVar.zzaC(jZza);
                zzadgVar.zzK = j4;
                return true;
            }
            if (iZzk != 2) {
                zzaA(zzvmVar, i, jZzbi);
                zzaC(zzaduVar.zza());
                return true;
            }
            if (iZzk == 3) {
                zzaz(zzvmVar, i, jZzbi);
                zzaC(zzaduVar.zza());
                return true;
            }
        } else if (iZzk != 5 && iZzk != 4) {
            zzadxVar.zza(j3, zzaduVar.zza());
            if (iZzk != 0) {
                long jZzc2 = zzM().zzc();
                zzby(jZzbi, jZzc2, zzvVar);
                zzaD(zzvmVar, i, jZzbi, jZzc2);
                zzaC(zzaduVar.zza());
                return true;
            }
            if (iZzk != 1) {
                jZzb = zzaduVar.zzb();
                long jZza2 = zzaduVar.zza();
                if (jZzb == this.zzK) {
                    zzaz(zzvmVar, i, jZzbi);
                    j4 = jZzb;
                    zzadgVar = this;
                } else {
                    zzby(jZzbi, jZzb, zzvVar);
                    zzaD(zzvmVar, i, jZzbi, jZzb);
                    zzadgVar = this;
                    j4 = jZzb;
                }
                zzadgVar.zzaC(jZza2);
                zzadgVar.zzK = j4;
                return true;
            }
            if (iZzk != 2) {
                zzaA(zzvmVar, i, jZzbi);
                zzaC(zzaduVar.zza());
                return true;
            }
            if (iZzk == 3) {
                zzaz(zzvmVar, i, jZzbi);
                zzaC(zzaduVar.zza());
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzmx
    public final void zzx(int i, Object obj) throws zzjm {
        if (i == 1) {
            zzbv(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzadt zzadtVar = (zzadt) obj;
            this.zzP = zzadtVar;
            zzaew zzaewVar = this.zzr;
            if (zzaewVar != null) {
                zzaewVar.zzl(zzadtVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzO != iIntValue) {
                this.zzO = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzz = iIntValue2;
            zzvm zzvmVarZzaK = zzaK();
            if (zzvmVarZzaK != null) {
                zzvmVarZzaK.zzq(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzA = iIntValue3;
            zzaew zzaewVar2 = this.zzr;
            if (zzaewVar2 != null) {
                zzaewVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzaew zzaewVar3 = this.zzr;
                if (zzaewVar3 == null || !zzaewVar3.zze()) {
                    return;
                }
                zzaewVar3.zzf();
                return;
            }
            this.zzu = list;
            zzaew zzaewVar4 = this.zzr;
            if (zzaewVar4 != null) {
                zzaewVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzev zzevVar = (zzev) obj;
            if (zzevVar.zza() == 0 || zzevVar.zzb() == 0) {
                return;
            }
            this.zzx = zzevVar;
            zzaew zzaewVar5 = this.zzr;
            if (zzaewVar5 != null) {
                Surface surface = this.zzv;
                surface.getClass();
                zzaewVar5.zzp(surface, zzevVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzN = ((Integer) obj).intValue();
                zzvm zzvmVarZzaK2 = zzaK();
                if (zzvmVarZzaK2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzN));
                    zzvmVarZzaK2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzv;
                zzbv(null);
                obj.getClass();
                ((zzadg) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z = this.zzF != null;
                zznj zznjVar = (zznj) obj;
                this.zzF = zznjVar;
                if (z != (zznjVar != null)) {
                    zzbf();
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }
}
