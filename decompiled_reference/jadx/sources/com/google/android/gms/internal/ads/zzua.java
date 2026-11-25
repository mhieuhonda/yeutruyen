package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.WorkRequest;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzua extends zzvw implements zzmd {
    private final Context zzb;
    private final zzrw zzc;
    private final zzsg zzd;
    private final zzvi zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzv zzi;
    private zzv zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzua(Context context, zzvk zzvkVar, zzvy zzvyVar, boolean z, Handler handler, zzrx zzrxVar, zzsg zzsgVar) {
        super(context.getApplicationContext(), 1, zzvkVar, zzvyVar, false, 44100.0f);
        zzvi zzviVar = Build.VERSION.SDK_INT >= 35 ? new zzvi(zzvh.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzsgVar;
        this.zze = zzviVar;
        this.zzp = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.zzc = new zzrw(handler, zzrxVar);
        this.zzr = -9223372036854775807L;
        zzsgVar.zza(new zztz(this, null));
    }

    private static List zzbo(zzvy zzvyVar, zzv zzvVar, boolean z, zzsg zzsgVar) throws zzwa {
        zzvp zzvpVarZza;
        if (zzvVar.zzp == null) {
            return zzgwt.zzi();
        }
        return (!zzsgVar.zzd(zzvVar) || (zzvpVarZza = zzwi.zza()) == null) ? zzwi.zzc(zzvyVar, zzvVar, false, false) : zzgwt.zzj(zzvpVarZza);
    }

    private final int zzbp(zzvp zzvpVar, zzv zzvVar) {
        "OMX.google.raw.decoder".equals(zzvpVar.zza);
        return zzvVar.zzq;
    }

    private final void zzbq() {
        long jZzg = this.zzd.zzg(zzac());
        if (jZzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzg = Math.max(this.zzk, jZzg);
            }
            this.zzk = jZzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    protected final void zzA(long j, boolean z, boolean z2) throws zzjm {
        super.zzA(j, z, z2);
        this.zzd.zzC();
        this.zzk = j;
        this.zzr = -9223372036854775807L;
        this.zzn = false;
        this.zzo = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected final void zzB() {
        this.zzd.zzi();
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected final void zzC() {
        zzbq();
        this.zzq = false;
        this.zzd.zzB();
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    protected final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzr = -9223372036854775807L;
        this.zzo = false;
        try {
            this.zzd.zzC();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    protected final void zzE() {
        this.zzn = false;
        this.zzo = false;
        this.zzr = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzm) {
            }
        } finally {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzD();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    protected final void zzF() {
        zzvi zzviVar;
        this.zzd.zzE();
        if (Build.VERSION.SDK_INT < 35 || (zzviVar = this.zze) == null) {
            return;
        }
        zzviVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zznc, com.google.android.gms.internal.ads.zzne
    public final String zzV() {
        return "MediaCodecAudioRenderer";
    }

    final /* synthetic */ zzrw zzaB() {
        return this.zzc;
    }

    final /* synthetic */ zzvi zzaC() {
        return this.zze;
    }

    final /* synthetic */ void zzaD(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzaE(boolean z) {
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final boolean zzab() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final boolean zzac() {
        return super.zzac() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final int zzaf(zzvy zzvyVar, zzv zzvVar) throws zzwa {
        int i;
        boolean z;
        String str = zzvVar.zzp;
        if (!zzas.zza(str)) {
            return 128;
        }
        int i2 = zzvVar.zzP;
        boolean zZzbl = zzbl(zzvVar);
        int i3 = 1;
        if (!zZzbl || (i2 != 0 && zzwi.zza() == null)) {
            i = 0;
        } else {
            zzsg zzsgVar = this.zzd;
            zzqu zzquVarZzf = zzsgVar.zzf(zzvVar);
            if (zzquVarZzf.zzb) {
                i = true != zzquVarZzf.zzc ? 512 : 1536;
                if (zzquVarZzf.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (zzsgVar.zzd(zzvVar)) {
                return i | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            zzsg zzsgVar2 = this.zzd;
            if (zzsgVar2.zzd(zzfm.zzB(2, zzvVar.zzH, zzvVar.zzJ))) {
                List listZzbo = zzbo(zzvyVar, zzvVar, false, zzsgVar2);
                if (!listZzbo.isEmpty()) {
                    if (zZzbl) {
                        zzvp zzvpVar = (zzvp) listZzbo.get(0);
                        Context context = this.zzb;
                        boolean zZzc = zzvpVar.zzc(context, zzvVar);
                        if (!zZzc) {
                            int i4 = 1;
                            while (true) {
                                if (i4 >= listZzbo.size()) {
                                    z = true;
                                    break;
                                }
                                zzvp zzvpVar2 = (zzvp) listZzbo.get(i4);
                                if (zzvpVar2.zzc(context, zzvVar)) {
                                    z = false;
                                    zZzc = true;
                                    zzvpVar = zzvpVar2;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            z = true;
                            break;
                        }
                        int i5 = true != zZzc ? 3 : 4;
                        int i6 = 8;
                        if (zZzc && zzvpVar.zze(zzvVar)) {
                            i6 = 16;
                        }
                        return i5 | i6 | 32 | (true != zzvpVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                    }
                    i3 = 2;
                }
            }
        }
        return i3 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final List zzag(zzvy zzvyVar, zzv zzvVar, boolean z) throws zzwa {
        return zzwi.zze(this.zzb, zzbo(zzvyVar, zzvVar, false, this.zzd), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final boolean zzah(zzv zzvVar) {
        zzK();
        return this.zzd.zzd(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final zzvj zzai(zzvp zzvpVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        zzv[] zzvVarArrZzJ = zzJ();
        int length = zzvVarArrZzJ.length;
        int iZzbp = zzbp(zzvpVar, zzvVar);
        if (length != 1) {
            for (zzv zzvVar2 : zzvVarArrZzJ) {
                if (zzvpVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    iZzbp = Math.max(iZzbp, zzbp(zzvpVar, zzvVar2));
                }
            }
        }
        this.zzf = iZzbp;
        String str = zzvpVar.zza;
        this.zzg = false;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzvpVar.zzc;
        int i = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i2 = zzvVar.zzH;
        mediaFormat.setInteger("channel-count", i2);
        int i3 = zzvVar.zzJ;
        mediaFormat.setInteger("sample-rate", i3);
        zzek.zza(mediaFormat, zzvVar.zzs);
        zzek.zzb(mediaFormat, "max-input-size", i);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = zzvVar.zzp;
        if ("audio/ac4".equals(str3)) {
            Pair pairZze = zzdr.zze(zzvVar);
            if (pairZze != null) {
                zzek.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
                zzek.zzb(mediaFormat, "level", ((Integer) pairZze.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzfm.zzB(4, i2, i3)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzp));
        }
        if (Objects.equals(str3, "audio/iamf")) {
            zzqj zzqjVarZzs = this.zzd.zzs();
            if (zzqjVarZzs == null) {
                zzeh.zzc("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int iZza = zzty.zza(zzqjVarZzs);
                int iBitCount = Integer.bitCount(iZza);
                mediaFormat.setInteger("channel-mask", iZza);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        zzbk(mediaFormat);
        this.zzj = (!"audio/raw".equals(zzvpVar.zzb) || "audio/raw".equals(str3)) ? null : zzvVar;
        return zzvj.zza(zzvpVar, mediaFormat, zzvVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final zzje zzaj(zzvp zzvpVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        int i;
        int i2;
        zzje zzjeVarZzf = zzvpVar.zzf(zzvVar, zzvVar2);
        int i3 = zzjeVarZzf.zze;
        if (zzaH(zzvVar2)) {
            i3 |= 32768;
        }
        if (zzbp(zzvpVar, zzvVar2) > this.zzf) {
            i3 |= 64;
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
    protected final long zzak(long j, long j2, boolean z) {
        zzsg zzsgVar = this.zzd;
        boolean z2 = false;
        if (zzsgVar.zzn() && this.zzr != -9223372036854775807L) {
            z2 = true;
        }
        if (!this.zzq) {
            if (z2 || super.zzac()) {
                return 1000000L;
            }
            return WorkRequest.MIN_BACKOFF_MILLIS;
        }
        long jZzy = zzsgVar.zzy();
        if (this.zzo && z2 && jZzy != -9223372036854775807L) {
            return Math.max(WorkRequest.MIN_BACKOFF_MILLIS, (long) ((Math.min(jZzy, this.zzr - j) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f));
        }
        return WorkRequest.MIN_BACKOFF_MILLIS;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final float zzal(float f, zzv zzvVar, zzv[] zzvVarArr) {
        int iMax = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i = zzvVar2.zzJ;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzam(String str, zzvj zzvjVar, long j, long j2) {
        this.zzc.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzan(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzao(Exception exc) {
        zzeh.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    protected final void zzar() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzas() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzau(zzjb zzjbVar) {
        this.zzc.zzn(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzav() throws zzjm {
        try {
            this.zzd.zzl();
            if (zzbg() != -9223372036854775807L) {
                this.zzr = zzbg();
            }
        } catch (zzsf e) {
            throw zzQ(e, e.zzc, e.zzb, true != zzaJ() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzaw(long j) {
        this.zzd.zzx(j);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzax(zzix zzixVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zzixVar.zza) == null || !Objects.equals(zzvVar.zzp, "audio/opus") || !zzaJ()) {
            return;
        }
        ByteBuffer byteBuffer = zzixVar.zze;
        byteBuffer.getClass();
        zzv zzvVar2 = zzixVar.zza;
        zzvVar2.getClass();
        int i = zzvVar2.zzL;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzz(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zznc
    public final zzmd zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final long zzg() {
        if (zze() == 2) {
            zzbq();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final boolean zzh() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzi(zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final zzav zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    protected final void zzy(boolean z, boolean z2) throws zzjm {
        super.zzy(z, z2);
        this.zzc.zza(this.zza);
        zzK();
        zzsg zzsgVar = this.zzd;
        zzsgVar.zzb(zzL());
        zzsgVar.zzc(zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final zzje zzap(zzly zzlyVar) throws zzjm {
        zzv zzvVar = zzlyVar.zzb;
        zzvVar.getClass();
        this.zzi = zzvVar;
        zzje zzjeVarZzap = super.zzap(zzlyVar);
        this.zzc.zzc(zzvVar, zzjeVarZzap);
        return zzjeVarZzap;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final boolean zzat(long j, long j2, zzvm zzvmVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzjm {
        byteBuffer.getClass();
        this.zzr = -9223372036854775807L;
        if (this.zzj != null && (i2 & 2) != 0) {
            zzvmVar.getClass();
            zzvmVar.zzc(i, false);
            return true;
        }
        if (z) {
            if (zzvmVar != null) {
                zzvmVar.zzc(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j3, i3)) {
                this.zzr = j3;
                return false;
            }
            if (zzvmVar != null) {
                zzvmVar.zzc(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zzsc e) {
            zzv zzvVar2 = this.zzi;
            if (zzaJ()) {
                zzK();
            }
            throw zzQ(e, zzvVar2, false, 5001);
        } catch (zzsf e2) {
            if (zzaJ()) {
                zzK();
            }
            throw zzQ(e2, zzvVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzmx
    public final void zzx(int i, Object obj) throws zzjm {
        zzvi zzviVar;
        if (i == 2) {
            zzsg zzsgVar = this.zzd;
            obj.getClass();
            zzsgVar.zzA(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzd zzdVar = (zzd) obj;
            zzsg zzsgVar2 = this.zzd;
            zzdVar.getClass();
            zzsgVar2.zzr(zzdVar);
            return;
        }
        if (i == 6) {
            zze zzeVar = (zze) obj;
            zzsg zzsgVar3 = this.zzd;
            zzeVar.getClass();
            zzsgVar3.zzu(zzeVar);
            return;
        }
        if (i == 12) {
            this.zzd.zzv((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzp = ((Integer) obj).intValue();
            zzvm zzvmVarZzaK = zzaK();
            if (zzvmVarZzaK == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzp));
            zzvmVarZzaK.zzp(bundle);
            return;
        }
        if (i == 19) {
            zzsg zzsgVar4 = this.zzd;
            obj.getClass();
            zzsgVar4.zzw(((Integer) obj).intValue());
            return;
        }
        if (i == 9) {
            zzsg zzsgVar5 = this.zzd;
            obj.getClass();
            zzsgVar5.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzx(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzt(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zzviVar = this.zze) == null) {
                return;
            }
            zzviVar.zza(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final void zzaq(zzv zzvVar, MediaFormat mediaFormat) throws zzjm {
        int iZzC;
        int i;
        int integer;
        zzv zzvVar2 = this.zzj;
        zzham zzhamVarZza = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaK() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzvVar.zzp)) {
                iZzC = zzvVar.zzK;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iZzC = mediaFormat.getInteger("pcm-encoding");
            } else {
                iZzC = mediaFormat.containsKey("v-bits-per-sample") ? zzfm.zzC(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i2 = zzvVar.zzI;
            if (i2 == -1 || zzvVar.zzH != integer2) {
                i2 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i2 = integer;
            }
            zzt zztVar = new zzt();
            zztVar.zzo("audio/raw");
            zztVar.zzJ(iZzC);
            zztVar.zzK(zzvVar.zzL);
            zztVar.zzL(zzvVar.zzM);
            zztVar.zzl(zzvVar.zzl);
            Object obj = zzvVar.zzm;
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzG(integer2);
            zztVar.zzH(i2);
            zztVar.zzI(mediaFormat.getInteger("sample-rate"));
            zzv zzvVarZzP = zztVar.zzP();
            if (this.zzg && zzvVarZzP.zzH == 6 && (i = zzvVar.zzH) < 6) {
                zzhal zzhalVarZzg = zzham.zzg(i);
                for (int i3 = 0; i3 < i; i3++) {
                    zzhalVarZzg.zza(i3);
                }
                zzhamVarZza = zzhalVarZzg.zzb();
            } else if (this.zzh) {
                zzhamVarZza = zzaho.zza(zzvVarZzP.zzH);
            }
            zzvVar = zzvVarZzP;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (zzaJ()) {
                    zzK();
                }
                zzgtr.zzi(Build.VERSION.SDK_INT >= 29);
            }
            zzsg zzsgVar = this.zzd;
            zzry zzryVar = new zzry(zzvVar);
            zzryVar.zza(zzhamVarZza);
            zzryVar.zzb(zzN());
            zzryVar.zzc(zzO());
            zzsgVar.zzh(zzryVar.zzd());
        } catch (zzsb e) {
            throw zzQ(e, e.zza, false, 5001);
        }
    }
}
