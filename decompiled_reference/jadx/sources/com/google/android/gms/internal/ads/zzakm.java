package com.google.android.gms.internal.ads;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzakm implements zzaga {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private boolean zzE;
    private zzakg zzF;
    private zzakl zzG;
    private boolean zzH;
    private int zzI;
    private long zzJ;
    private final SparseArray zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private boolean zzR;
    private long zzS;
    private long zzT;
    private long zzU;
    private boolean zzV;
    private int zzW;
    private long zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int[] zzab;
    private int zzac;
    private int zzad;
    private int zzae;
    private int zzaf;
    private boolean zzag;
    private long zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private boolean zzal;
    private boolean zzam;
    private boolean zzan;
    private int zzao;
    private byte zzap;
    private boolean zzaq;
    private zzagd zzar;
    private final zzake zzas;
    private final zzako zzh;
    private final SparseArray zzi;
    private final LongSparseArray zzj;
    private final boolean zzk;
    private final boolean zzl;
    private final zzanq zzm;
    private final zzeu zzn;
    private final zzeu zzo;
    private final zzeu zzp;
    private final zzeu zzq;
    private final zzeu zzr;
    private final zzeu zzs;
    private final zzeu zzt;
    private final zzeu zzu;
    private final zzeu zzv;
    private final zzeu zzw;
    private ByteBuffer zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzaki.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = zzfm.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzakm() {
        this(new zzake(), 2, zzanq.zza);
    }

    private final long zzA(long j) throws zzat {
        long j2 = this.zzA;
        if (j2 != -9223372036854775807L) {
            return zzfm.zzw(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzB(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final void zzC() {
        if (!this.zzE) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                zzagd zzagdVar = this.zzar;
                zzagdVar.getClass();
                zzagdVar.zzv();
                this.zzE = false;
                return;
            }
            if (((zzakl) sparseArray.valueAt(i)).zzW) {
                return;
            } else {
                i++;
            }
        }
    }

    @EnsuresNonNull({"currentChapter"})
    private final void zzq(int i) throws zzat {
        if (this.zzF != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in an EditionEntry");
        throw zzat.zzb(sb.toString(), null);
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzr(int i) throws zzat {
        if (this.zzG != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw zzat.zzb(sb.toString(), null);
    }

    private final void zzs(int i) throws zzat {
        if (this.zzL) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf A[LOOP:0: B:36:0x00ad->B:41:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
    
        r2 = zzy(r11, "%01d:%02d:%02d:%02d", androidx.work.WorkRequest.MIN_BACKOFF_MILLIS);
        r3 = 21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzt(com.google.android.gms.internal.ads.zzakl r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakm.zzt(com.google.android.gms.internal.ads.zzakl, long, int, int, int):void");
    }

    private final void zzu(zzagb zzagbVar, int i) throws IOException {
        zzeu zzeuVar = this.zzp;
        if (zzeuVar.zze() >= i) {
            return;
        }
        if (zzeuVar.zzj() < i) {
            int iZzj = zzeuVar.zzj();
            zzeuVar.zzc(Math.max(iZzj + iZzj, i));
        }
        zzagbVar.zzc(zzeuVar.zzi(), zzeuVar.zze(), i - zzeuVar.zze());
        zzeuVar.zzf(i);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzv(zzagb zzagbVar, zzakl zzaklVar, int i, boolean z) throws IOException {
        int i2;
        String str = zzaklVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzx(zzagbVar, zzb, i);
            int i3 = this.zzaj;
            zzw();
            return i3;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzx(zzagbVar, zzd, i);
            int i4 = this.zzaj;
            zzw();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzx(zzagbVar, zze, i);
            int i5 = this.zzaj;
            zzw();
            return i5;
        }
        if (zzaklVar.zzW) {
            zzaklVar.zzaa.getClass();
            int i6 = zzafz.zza;
            zzeu zzeuVar = new zzeu(i);
            if (zzagbVar.zzh(zzeuVar.zzi(), 0, i, true)) {
                zzagbVar.zzl();
                if (zzafz.zza(zzeuVar.zzr()) == 1 && zzeuVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzeuVar.zzm(bArr, 0, 10);
                    zzeuVar.zzh(0);
                    int iZzc = zzafz.zzc(bArr);
                    if (zzeuVar.zzd() >= iZzc + 4) {
                        zzeuVar.zzk(iZzc);
                        if (zzafz.zza(zzeuVar.zzB()) == 2) {
                            zzt zztVarZza = zzaklVar.zzaa.zza();
                            zztVarZza.zzo("audio/vnd.dts.hd");
                            zzaklVar.zzaa = zztVarZza.zzP();
                        }
                    }
                }
            }
            zzaklVar.zzZ.zzA(zzaklVar.zzaa);
            zzaklVar.zzW = false;
            zzC();
        }
        zzahm zzahmVar = zzaklVar.zzZ;
        if (!this.zzal) {
            if (zzaklVar.zzi) {
                this.zzae &= -1073741825;
                if (!this.zzam) {
                    zzeu zzeuVar2 = this.zzp;
                    zzagbVar.zzc(zzeuVar2.zzi(), 0, 1);
                    this.zzai++;
                    if ((zzeuVar2.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzap = zzeuVar2.zzi()[0];
                    this.zzam = true;
                }
                byte b = this.zzap;
                if ((b & 1) == 1) {
                    int i7 = b & 2;
                    this.zzae |= 1073741824;
                    if (!this.zzaq) {
                        zzeu zzeuVar3 = this.zzu;
                        zzagbVar.zzc(zzeuVar3.zzi(), 0, 8);
                        this.zzai += 8;
                        this.zzaq = true;
                        zzeu zzeuVar4 = this.zzp;
                        zzeuVar4.zzi()[0] = (byte) ((i7 != 2 ? 0 : 128) | 8);
                        zzeuVar4.zzh(0);
                        zzahmVar.zzd(zzeuVar4, 1, 1);
                        this.zzaj++;
                        zzeuVar3.zzh(0);
                        zzahmVar.zzd(zzeuVar3, 8, 1);
                        this.zzaj += 8;
                    }
                    if (i7 == 2) {
                        if (!this.zzan) {
                            zzeu zzeuVar5 = this.zzp;
                            zzagbVar.zzc(zzeuVar5.zzi(), 0, 1);
                            this.zzai++;
                            zzeuVar5.zzh(0);
                            this.zzao = zzeuVar5.zzs();
                            this.zzan = true;
                        }
                        int i8 = this.zzao * 4;
                        zzeu zzeuVar6 = this.zzp;
                        zzeuVar6.zza(i8);
                        zzagbVar.zzc(zzeuVar6.zzi(), 0, i8);
                        this.zzai += i8;
                        int i9 = (this.zzao >> 1) + 1;
                        int i10 = (i9 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzx;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.zzx = ByteBuffer.allocate(i10);
                        }
                        this.zzx.position(0);
                        this.zzx.putShort((short) i9);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i2 = this.zzao;
                            if (i11 >= i2) {
                                break;
                            }
                            int iZzH = zzeuVar6.zzH();
                            int i13 = iZzH - i12;
                            int i14 = i11 % 2;
                            ByteBuffer byteBuffer2 = this.zzx;
                            if (i14 == 0) {
                                byteBuffer2.putShort((short) i13);
                            } else {
                                byteBuffer2.putInt(i13);
                            }
                            i11++;
                            i12 = iZzH;
                        }
                        int i15 = (i - this.zzai) - i12;
                        int i16 = i2 & 1;
                        ByteBuffer byteBuffer3 = this.zzx;
                        if (i16 == 1) {
                            byteBuffer3.putInt(i15);
                        } else {
                            byteBuffer3.putShort((short) i15);
                            this.zzx.putInt(0);
                        }
                        zzeu zzeuVar7 = this.zzv;
                        zzeuVar7.zzb(this.zzx.array(), i10);
                        zzahmVar.zzd(zzeuVar7, i10, 1);
                        this.zzaj += i10;
                    }
                }
            } else {
                byte[] bArr2 = zzaklVar.zzj;
                if (bArr2 != null) {
                    this.zzs.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzaklVar.zzc) ? zzaklVar.zzh > 0 : z) {
                this.zzae |= 268435456;
                this.zzw.zza(0);
                int iZze = (this.zzs.zze() + i) - this.zzai;
                zzeu zzeuVar8 = this.zzp;
                zzeuVar8.zza(4);
                zzeuVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzeuVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzeuVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzeuVar8.zzi()[3] = (byte) (iZze & 255);
                zzahmVar.zzd(zzeuVar8, 4, 2);
                this.zzaj += 4;
            }
            this.zzal = true;
        }
        zzeu zzeuVar9 = this.zzs;
        int iZze2 = i + zzeuVar9.zze();
        String str2 = zzaklVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzaklVar.zzV != null) {
                zzgtr.zzi(zzeuVar9.zze() == 0);
                zzaklVar.zzV.zzb(zzagbVar);
            }
            while (true) {
                int i17 = this.zzai;
                if (i17 >= iZze2) {
                    break;
                }
                int iZzz = zzz(zzagbVar, zzahmVar, iZze2 - i17);
                this.zzai += iZzz;
                this.zzaj += iZzz;
            }
        } else {
            zzeu zzeuVar10 = this.zzo;
            byte[] bArrZzi = zzeuVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i18 = zzaklVar.zzab;
            int i19 = 4 - i18;
            while (this.zzai < iZze2) {
                int i20 = this.zzak;
                if (i20 == 0) {
                    int iMin = Math.min(i18, zzeuVar9.zzd());
                    zzagbVar.zzc(bArrZzi, i19 + iMin, i18 - iMin);
                    if (iMin > 0) {
                        zzeuVar9.zzm(bArrZzi, i19, iMin);
                    }
                    this.zzai += i18;
                    zzeuVar10.zzh(0);
                    this.zzak = zzeuVar10.zzH();
                    zzeu zzeuVar11 = this.zzn;
                    zzeuVar11.zzh(0);
                    zzahmVar.zzc(zzeuVar11, 4);
                    this.zzaj += 4;
                } else {
                    int iZzz2 = zzz(zzagbVar, zzahmVar, i20);
                    this.zzai += iZzz2;
                    this.zzaj += iZzz2;
                    this.zzak -= iZzz2;
                }
            }
        }
        if ("A_VORBIS".equals(zzaklVar.zzc)) {
            zzeu zzeuVar12 = this.zzq;
            zzeuVar12.zzh(0);
            zzahmVar.zzc(zzeuVar12, 4);
            this.zzaj += 4;
        }
        int i21 = this.zzaj;
        zzw();
        return i21;
    }

    private final void zzw() {
        this.zzai = 0;
        this.zzaj = 0;
        this.zzak = 0;
        this.zzal = false;
        this.zzam = false;
        this.zzan = false;
        this.zzao = 0;
        this.zzap = (byte) 0;
        this.zzaq = false;
        this.zzs.zza(0);
    }

    private final void zzx(zzagb zzagbVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        zzeu zzeuVar = this.zzt;
        if (zzeuVar.zzj() < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            zzeuVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzeuVar.zzi(), 0, length);
        }
        zzagbVar.zzc(zzeuVar.zzi(), length, i);
        zzeuVar.zzh(0);
        zzeuVar.zzf(i2);
    }

    private static byte[] zzy(long j, String str, long j2) {
        zzgtr.zza(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = zzfm.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzz(zzagb zzagbVar, zzahm zzahmVar, int i) throws IOException {
        zzeu zzeuVar = this.zzs;
        int iZzd = zzeuVar.zzd();
        if (iZzd <= 0) {
            return zzahmVar.zza(zzagbVar, i, false);
        }
        int iMin = Math.min(i, iZzd);
        zzahmVar.zzc(zzeuVar, iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        return new zzakn().zza(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        if (this.zzl) {
            zzagdVar = new zzant(zzagdVar, this.zzm);
        }
        this.zzar = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        int i = 0;
        this.zzV = false;
        while (!this.zzV) {
            boolean zZzc = this.zzas.zzc(zzagbVar);
            if (zZzc) {
                long jZzn = zzagbVar.zzn();
                if (this.zzR) {
                    this.zzT = jZzn;
                    zzahaVar.zza = this.zzS;
                    this.zzR = false;
                    return 1;
                }
                if (this.zzH) {
                    long j = this.zzT;
                    if (j != -1) {
                        zzahaVar.zza = j;
                        this.zzT = -1L;
                        return 1;
                    }
                }
            }
            if (!zZzc) {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzakl zzaklVar = (zzakl) sparseArray.valueAt(i);
                    zzaklVar.zzb();
                    zzahn zzahnVar = zzaklVar.zzV;
                    if (zzahnVar != null) {
                        zzahnVar.zzd(zzaklVar.zzZ, zzaklVar.zzk);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        this.zzU = -9223372036854775807L;
        int i = 0;
        this.zzW = 0;
        this.zzas.zzb();
        this.zzh.zza();
        zzw();
        this.zzL = false;
        this.zzM = -9223372036854775807L;
        this.zzN = -1;
        this.zzO = -1L;
        this.zzP = -1L;
        if (!this.zzH) {
            this.zzK.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                return;
            }
            zzahn zzahnVar = ((zzakl) sparseArray.valueAt(i)).zzV;
            if (zzahnVar != null) {
                zzahnVar.zza();
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    protected final void zzh(int i, long j, long j2) throws zzat {
        zzagd zzagdVar = this.zzar;
        zzagdVar.getClass();
        if (i == 128) {
            zzq(i);
            this.zzF.zzh = null;
            zzq(i);
            this.zzF.zzi = null;
            return;
        }
        if (i == 160) {
            this.zzag = false;
            this.zzah = 0L;
            return;
        }
        if (i == 174) {
            zzakl zzaklVar = new zzakl();
            this.zzG = zzaklVar;
            zzaklVar.zza = this.zzD;
            return;
        }
        if (i == 187) {
            if (this.zzH) {
                return;
            }
            zzs(i);
            this.zzM = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            this.zzI = -1;
            this.zzJ = -1L;
            return;
        }
        if (i == 20533) {
            zzr(i);
            this.zzG.zzi = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzz;
            if (j3 != -1 && j3 != j) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzz = j;
            this.zzy = j2;
            return;
        }
        if (i == 475249515) {
            if (this.zzH) {
                return;
            }
            this.zzL = true;
            return;
        }
        if (i == 524531317) {
            if (this.zzH) {
                return;
            }
            if (this.zzk && this.zzS != -1) {
                this.zzR = true;
                return;
            } else {
                zzagdVar.zzw(new zzahc(this.zzC, 0L));
                this.zzH = true;
                return;
            }
        }
        if (i == 182) {
            this.zzF = new zzakg();
            return;
        }
        if (i == 183 && !this.zzH) {
            zzs(i);
            this.zzN = -1;
            this.zzO = -1L;
            this.zzP = -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:318:0x0568  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:98:0x0208  */
    /* JADX WARN: Code duplicated, block: B:99:0x0215  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected final void zzi(int i) throws zzat {
        String str;
        int i2;
        SparseArray sparseArray;
        List list;
        long j;
        int i3;
        int i4;
        SparseArray sparseArray2;
        long jZza;
        long jZzb;
        long jZzb2;
        long jZza2;
        zzap zzapVar;
        zzajd zzajdVar;
        zzap zzapVarZzg;
        int i5;
        this.zzar.getClass();
        if (i == 128) {
            zzakg zzakgVar = this.zzF;
            zzakgVar.getClass();
            if (zzakgVar.zzf != null || (str = zzakgVar.zzh) == null) {
                return;
            }
            zzakgVar.zzf = str;
            String str2 = zzakgVar.zzi;
            if (str2 != null) {
                zzakgVar.zzg = str2;
                return;
            }
            return;
        }
        int i6 = 2;
        long j2 = 0;
        int i7 = 0;
        if (i == 160) {
            if (this.zzW == 2) {
                zzakl zzaklVar = (zzakl) this.zzi.get(this.zzac);
                zzaklVar.zzb();
                if (this.zzah > 0 && "A_OPUS".equals(zzaklVar.zzc)) {
                    zzeu zzeuVar = this.zzw;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzah).array();
                    zzeuVar.zzb(bArrArray, bArrArray.length);
                }
                int i8 = 0;
                for (int i9 = 0; i9 < this.zzaa; i9++) {
                    i8 += this.zzab[i9];
                }
                int i10 = 0;
                while (i10 < this.zzaa) {
                    long j3 = this.zzX + ((long) ((zzaklVar.zzg * i10) / 1000));
                    int i11 = this.zzae;
                    if (i10 == 0) {
                        if (!this.zzag) {
                            i11 |= 1;
                        }
                        i2 = 0;
                    } else {
                        i2 = i10;
                    }
                    int i12 = this.zzab[i2];
                    int i13 = i8 - i12;
                    zzt(zzaklVar, j3, i11, i12, i13);
                    i10 = i2 + 1;
                    i8 = i13;
                }
                this.zzW = 0;
                return;
            }
            return;
        }
        if (i == 174) {
            zzakl zzaklVar2 = this.zzG;
            zzaklVar2.getClass();
            String str3 = zzaklVar2.zzc;
            if (str3 == null) {
                throw zzat.zzb("CodecId is missing in TrackEntry element", null);
            }
            switch (str3.hashCode()) {
                case -2095576542:
                    if (str3.equals("V_MPEG4/ISO/AP")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -2095575984:
                    if (str3.equals("V_MPEG4/ISO/SP")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -1985379776:
                    if (str3.equals("A_MS/ACM")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -1784763192:
                    if (str3.equals("A_TRUEHD")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -1730367663:
                    if (str3.equals("A_VORBIS")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -1482641358:
                    if (str3.equals("A_MPEG/L2")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -1482641357:
                    if (str3.equals("A_MPEG/L3")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -1373388978:
                    if (str3.equals("V_MS/VFW/FOURCC")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -933872740:
                    if (str3.equals("S_DVBSUB")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -538363189:
                    if (str3.equals("V_MPEG4/ISO/ASP")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -538363109:
                    if (str3.equals("V_MPEG4/ISO/AVC")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -425012669:
                    if (str3.equals("S_VOBSUB")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case -356037306:
                    if (str3.equals("A_DTS/LOSSLESS")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 62923557:
                    if (str3.equals("A_AAC")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 62923603:
                    if (str3.equals("A_AC3")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 62927045:
                    if (str3.equals("A_DTS")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 82318131:
                    if (str3.equals("V_AV1")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 82338133:
                    if (str3.equals("V_VP8")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 82338134:
                    if (str3.equals("V_VP9")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 99146302:
                    if (str3.equals("S_HDMV/PGS")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 444813526:
                    if (str3.equals("V_THEORA")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 542569478:
                    if (str3.equals("A_DTS/EXPRESS")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 635596514:
                    if (str3.equals("A_PCM/FLOAT/IEEE")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 725948237:
                    if (str3.equals("A_PCM/INT/BIG")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 725957860:
                    if (str3.equals("A_PCM/INT/LIT")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 738597099:
                    if (str3.equals("S_TEXT/ASS")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 738614379:
                    if (str3.equals("S_TEXT/SSA")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 855502857:
                    if (str3.equals("V_MPEGH/ISO/HEVC")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 1045209816:
                    if (str3.equals("S_TEXT/WEBVTT")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 1422270023:
                    if (str3.equals("S_TEXT/UTF8")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 1809237540:
                    if (str3.equals("V_MPEG2")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 1950749482:
                    if (str3.equals("A_EAC3")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 1950789798:
                    if (str3.equals("A_FLAC")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
                case 1951062397:
                    if (str3.equals("A_OPUS")) {
                        zzaklVar2.zza(zzaklVar2.zzd);
                        zzaklVar2.zzZ = this.zzar.zzs(zzaklVar2.zzd, zzaklVar2.zzf);
                        this.zzi.put(zzaklVar2.zzd, zzaklVar2);
                    }
                    break;
            }
            this.zzG = null;
            return;
        }
        if (i != 17849) {
            int i14 = -1;
            if (i == 19899) {
                int i15 = this.zzI;
                if (i15 != -1) {
                    long j4 = this.zzJ;
                    if (j4 != -1) {
                        if (i15 == 475249515) {
                            this.zzS = j4;
                            return;
                        }
                        return;
                    }
                }
                throw zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzr(i);
                zzakl zzaklVar3 = this.zzG;
                if (zzaklVar3.zzi) {
                    if (zzaklVar3.zzk == null) {
                        throw zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzaklVar3.zzm = new zzq(null, new zzp(zzg.zza, null, "video/webm", this.zzG.zzk.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzr(i);
                zzakl zzaklVar4 = this.zzG;
                if (zzaklVar4.zzi && zzaklVar4.zzj != null) {
                    throw zzat.zzb("Combining encryption and compression is not supported", null);
                }
                return;
            }
            long j5 = -9223372036854775807L;
            if (i == 357149030) {
                if (this.zzA == -9223372036854775807L) {
                    this.zzA = 1000000L;
                }
                long j6 = this.zzB;
                if (j6 != -9223372036854775807L) {
                    this.zzC = zzA(j6);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                SparseArray sparseArray3 = this.zzi;
                if (sparseArray3.size() == 0) {
                    throw zzat.zzb("No valid tracks were found", null);
                }
                boolean z = !this.zzk || this.zzS == -1;
                int i16 = -1;
                int i17 = -1;
                int i18 = -1;
                int i19 = -1;
                for (int i20 = 0; i20 < sparseArray3.size(); i20++) {
                    zzakl zzaklVar5 = (zzakl) sparseArray3.valueAt(i20);
                    int i21 = zzaklVar5.zzf;
                    if (i21 == 2) {
                        if (zzaklVar5.zzY) {
                            i17 = zzaklVar5.zzd;
                        }
                        if (i18 == -1) {
                            i18 = zzaklVar5.zzd;
                        }
                    } else if (i21 == 1) {
                        if (zzaklVar5.zzY) {
                            i19 = zzaklVar5.zzd;
                        }
                        if (i16 == -1) {
                            i16 = zzaklVar5.zzd;
                        }
                    }
                    if (z) {
                        zzaklVar5.zzb();
                        if (!zzaklVar5.zzW) {
                            zzahm zzahmVar = zzaklVar5.zzZ;
                            zzv zzvVar = zzaklVar5.zzaa;
                            zzvVar.getClass();
                            zzahmVar.zzA(zzvVar);
                        }
                    }
                }
                if (i17 != -1) {
                    this.zzQ = i17;
                } else if (i18 != -1) {
                    this.zzQ = i18;
                } else if (i19 != -1) {
                    this.zzQ = i19;
                } else if (i16 != -1) {
                    this.zzQ = i16;
                } else {
                    this.zzQ = sparseArray3.size() > 0 ? ((zzakl) sparseArray3.valueAt(0)).zzd : -1;
                }
                if (z) {
                    zzC();
                    return;
                }
                return;
            }
            if (i != 475249515) {
                if (i == 182) {
                    zzakg zzakgVar2 = this.zzF;
                    zzakgVar2.getClass();
                    long j7 = zzakgVar2.zza;
                    if (j7 != 0) {
                        this.zzj.put(j7, zzakgVar2);
                    }
                    this.zzF = null;
                    return;
                }
                if (i == 183 && !this.zzH) {
                    zzs(i);
                    if (this.zzM == -9223372036854775807L || (i5 = this.zzN) == -1 || this.zzO == -1) {
                        return;
                    }
                    SparseArray sparseArray4 = this.zzK;
                    List arrayList = (List) sparseArray4.get(i5);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        sparseArray4.put(this.zzN, arrayList);
                    }
                    arrayList.add(new zzakj(this.zzM, this.zzz + this.zzO, this.zzP, null));
                    return;
                }
                return;
            }
            if (this.zzH) {
                return;
            }
            int i22 = 0;
            while (true) {
                sparseArray = this.zzK;
                if (i22 < sparseArray.size()) {
                    if (!((List) sparseArray.valueAt(i22)).isEmpty()) {
                        if (this.zzC != -9223372036854775807L) {
                            for (int i23 = 0; i23 < sparseArray.size(); i23++) {
                                Collections.sort((List) sparseArray.valueAt(i23));
                            }
                            this.zzar.zzw(new zzakk(sparseArray, this.zzC, this.zzQ, this.zzz, this.zzy));
                            break;
                        }
                        break;
                    }
                    i22++;
                }
                this.zzar.zzw(new zzahc(this.zzC, 0L));
                break;
            }
            this.zzH = true;
            this.zzL = false;
            int i24 = 0;
            while (true) {
                SparseArray sparseArray5 = this.zzi;
                if (i24 >= sparseArray5.size()) {
                    zzC();
                    return;
                }
                zzakl zzaklVar6 = (zzakl) sparseArray5.valueAt(i24);
                long j8 = this.zzC;
                long j9 = this.zzz;
                long j10 = this.zzy;
                if (zzaklVar6.zzf != i6 || (list = (List) sparseArray.get(zzaklVar6.zzd)) == null || list.isEmpty()) {
                    i4 = i24;
                    sparseArray2 = sparseArray;
                    j = j2;
                    i3 = i7;
                } else {
                    if (list.isEmpty()) {
                        i4 = i24;
                        sparseArray2 = sparseArray;
                        j = j2;
                        i3 = i7;
                    } else {
                        j = j2;
                        int iMin = Math.min(list.size(), 20);
                        double d = 0.0d;
                        i3 = i7;
                        int i25 = i14;
                        while (i7 < iMin) {
                            zzakj zzakjVar = (zzakj) list.get(i7);
                            if (zzakjVar.zza() > 10000000) {
                                break;
                            }
                            int i26 = i7 + 1;
                            if (i7 < list.size() - 1) {
                                zzakj zzakjVar2 = (zzakj) list.get(i26);
                                jZzb = zzakjVar2.zzb() + zzakjVar2.zzc();
                                jZzb2 = zzakjVar.zzb() + zzakjVar.zzc();
                                jZza2 = zzakjVar2.zza() - zzakjVar.zza();
                            } else {
                                jZzb = j9 + j10;
                                jZzb2 = zzakjVar.zzb() + zzakjVar.zzc();
                                jZza2 = j8 - zzakjVar.zza();
                            }
                            long j11 = jZzb - jZzb2;
                            int i27 = i24;
                            SparseArray sparseArray6 = sparseArray;
                            int i28 = iMin;
                            long j12 = jZza2;
                            if (j12 > j) {
                                double d2 = j11 / j12;
                                if (d2 > d) {
                                    d = d2;
                                    i25 = i7;
                                }
                            }
                            iMin = i28;
                            sparseArray = sparseArray6;
                            i24 = i27;
                            i7 = i26;
                        }
                        i4 = i24;
                        sparseArray2 = sparseArray;
                        if (i25 != i14) {
                            jZza = ((zzakj) list.get(i25)).zza();
                        }
                        if (jZza != j5) {
                            zzv zzvVar2 = zzaklVar6.zzaa;
                            zzvVar2.getClass();
                            zzapVar = zzvVar2.zzl;
                            zzajdVar = new zzajd(jZza);
                            if (zzapVar == null) {
                                zzao[] zzaoVarArr = new zzao[1];
                                zzaoVarArr[i3] = zzajdVar;
                                zzapVarZzg = new zzap(j5, zzaoVarArr);
                            } else {
                                zzao[] zzaoVarArr2 = new zzao[1];
                                zzaoVarArr2[i3] = zzajdVar;
                                zzapVarZzg = zzapVar.zzg(zzaoVarArr2);
                            }
                            zzt zztVarZza = zzaklVar6.zzaa.zza();
                            zztVarZza.zzl(zzapVarZzg);
                            zzaklVar6.zzaa = zztVarZza.zzP();
                        }
                    }
                    jZza = j5;
                    if (jZza != j5) {
                        zzv zzvVar3 = zzaklVar6.zzaa;
                        zzvVar3.getClass();
                        zzapVar = zzvVar3.zzl;
                        zzajdVar = new zzajd(jZza);
                        if (zzapVar == null) {
                            zzao[] zzaoVarArr3 = new zzao[1];
                            zzaoVarArr3[i3] = zzajdVar;
                            zzapVarZzg = new zzap(j5, zzaoVarArr3);
                        } else {
                            zzao[] zzaoVarArr4 = new zzao[1];
                            zzaoVarArr4[i3] = zzajdVar;
                            zzapVarZzg = zzapVar.zzg(zzaoVarArr4);
                        }
                        zzt zztVarZza2 = zzaklVar6.zzaa.zza();
                        zztVarZza2.zzl(zzapVarZzg);
                        zzaklVar6.zzaa = zztVarZza2.zzP();
                    }
                }
                if (!zzaklVar6.zzW) {
                    zzaklVar6.zzb();
                    zzahm zzahmVar2 = zzaklVar6.zzZ;
                    zzv zzvVar4 = zzaklVar6.zzaa;
                    zzvVar4.getClass();
                    zzahmVar2.zzA(zzvVar4);
                }
                i24 = i4 + 1;
                sparseArray = sparseArray2;
                j2 = j;
                i7 = i3;
                i6 = 2;
                j5 = -9223372036854775807L;
                i14 = -1;
            }
        } else {
            int i29 = 0;
            while (true) {
                SparseArray sparseArray7 = this.zzi;
                if (i29 >= sparseArray7.size()) {
                    return;
                }
                zzakl zzaklVar7 = (zzakl) sparseArray7.valueAt(i29);
                LongSparseArray longSparseArray = this.zzj;
                ArrayList arrayList2 = new ArrayList(longSparseArray.size());
                for (int i30 = 0; i30 < longSparseArray.size(); i30++) {
                    zzakg zzakgVar3 = (zzakg) longSparseArray.valueAt(i30);
                    long j13 = zzakgVar3.zze;
                    if (j13 == 0 || j13 == zzaklVar7.zze) {
                        zzaiy zzaiyVar = new zzaiy();
                        zzaiyVar.zza(zzfm.zzr(zzakgVar3.zzb));
                        zzaiyVar.zzb(zzfm.zzr(zzakgVar3.zzc));
                        zzaiyVar.zzc(zzakgVar3.zzd);
                        if (zzakgVar3.zzf != null) {
                            zzaiyVar.zzd(new zzx(zzakgVar3.zzg, zzakgVar3.zzf));
                        }
                        arrayList2.add(zzaiyVar.zze());
                    }
                }
                if (!arrayList2.isEmpty()) {
                    zzv zzvVar5 = zzaklVar7.zzaa;
                    zzvVar5.getClass();
                    zzt zztVarZza3 = zzvVar5.zza();
                    zzap zzapVar2 = zzvVar5.zzl;
                    zztVarZza3.zzl(zzapVar2 != null ? zzapVar2.zzg((zzao[]) arrayList2.toArray(new zzaiz[0])) : new zzap(arrayList2));
                    zzaklVar7.zzaa = zztVarZza3.zzP();
                }
                i29++;
            }
        }
    }

    protected final void zzj(int i, long j) throws zzat {
        boolean z;
        if (i == 136) {
            z = j == 1;
            zzr(i);
            this.zzG.zzY = z;
            return;
        }
        if (i == 137) {
            zzq(i);
            this.zzF.zze = j;
            return;
        }
        if (i == 145) {
            zzq(i);
            this.zzF.zzb = j;
            return;
        }
        if (i == 146) {
            zzq(i);
            this.zzF.zzc = j;
            return;
        }
        if (i == 240) {
            if (this.zzH) {
                return;
            }
            zzs(i);
            if (this.zzP == -1) {
                this.zzP = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.zzH) {
                return;
            }
            zzs(i);
            if (this.zzO == -1) {
                this.zzO = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw zzat.zzb(sb.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i == 29636) {
            zzq(i);
            this.zzF.zza = j;
            return;
        }
        if (i == 29637) {
            zzr(i);
            this.zzG.zze = j;
            return;
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    zzr(i);
                    this.zzG.zzf = 2;
                    return;
                }
                if (i2 == 2) {
                    zzr(i);
                    this.zzG.zzf = 1;
                    return;
                } else if (i2 == 17) {
                    zzr(i);
                    this.zzG.zzf = 3;
                    return;
                } else if (i2 != 33) {
                    zzr(i);
                    this.zzG.zzf = -1;
                    return;
                } else {
                    zzr(i);
                    this.zzG.zzf = 5;
                    return;
                }
            case 152:
                z = j == 1;
                zzq(i);
                this.zzF.zzd = z;
                return;
            case 155:
                this.zzY = zzA(j);
                return;
            case 159:
                zzr(i);
                this.zzG.zzP = (int) j;
                return;
            case 176:
                zzr(i);
                this.zzG.zzn = (int) j;
                return;
            case 179:
                if (this.zzH) {
                    return;
                }
                zzs(i);
                this.zzM = zzA(j);
                return;
            case 186:
                zzr(i);
                this.zzG.zzo = (int) j;
                return;
            case 215:
                zzr(i);
                this.zzG.zzd = (int) j;
                return;
            case 231:
                this.zzU = zzA(j);
                return;
            case 238:
                this.zzaf = (int) j;
                return;
            case 247:
                if (this.zzH) {
                    return;
                }
                zzs(i);
                this.zzN = (int) j;
                return;
            case 251:
                this.zzag = true;
                return;
            case 16871:
                zzr(i);
                this.zzG.zzd((int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw zzat.zzb(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw zzat.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw zzat.zzb(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 21420:
                this.zzJ = j + this.zzz;
                return;
            case 21432:
                int i3 = (int) j;
                zzr(i);
                if (i3 == 0) {
                    this.zzG.zzy = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzG.zzy = 2;
                    return;
                } else if (i3 == 3) {
                    this.zzG.zzy = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.zzG.zzy = 3;
                    return;
                }
            case 21680:
                zzr(i);
                this.zzG.zzq = (int) j;
                return;
            case 21682:
                zzr(i);
                this.zzG.zzs = (int) j;
                return;
            case 21690:
                zzr(i);
                this.zzG.zzr = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzr(i);
                this.zzG.zzX = z;
                return;
            case 21938:
                zzr(i);
                this.zzG.zzp = (int) j;
                return;
            case 21998:
                zzr(i);
                this.zzG.zzh = (int) j;
                return;
            case 22186:
                zzr(i);
                this.zzG.zzT = j;
                return;
            case 22203:
                zzr(i);
                this.zzG.zzU = j;
                return;
            case 25188:
                zzr(i);
                this.zzG.zzQ = (int) j;
                return;
            case 30114:
                this.zzah = j;
                return;
            case 30321:
                int i4 = (int) j;
                zzr(i);
                if (i4 == 0) {
                    this.zzG.zzt = 0;
                    return;
                }
                if (i4 == 1) {
                    this.zzG.zzt = 1;
                    return;
                } else if (i4 == 2) {
                    this.zzG.zzt = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.zzG.zzt = 3;
                    return;
                }
            case 2352003:
                zzr(i);
                this.zzG.zzg = (int) j;
                return;
            case 2807729:
                this.zzA = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i5 = (int) j;
                        zzr(i);
                        if (i5 == 1) {
                            this.zzG.zzB = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.zzG.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzr(i);
                        int iZzc = zzi.zzc((int) j);
                        if (iZzc != -1) {
                            this.zzG.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzr(i);
                        int iZzb = zzi.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzG.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzr(i);
                        this.zzG.zzC = (int) j;
                        return;
                    case 21949:
                        zzr(i);
                        this.zzG.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    zzakm(zzake zzakeVar, int i, zzanq zzanqVar) {
        this.zzz = -1L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzC = -9223372036854775807L;
        this.zzM = -9223372036854775807L;
        this.zzN = -1;
        this.zzO = -1L;
        this.zzP = -1L;
        this.zzQ = -1;
        this.zzS = -1L;
        this.zzT = -1L;
        this.zzU = -9223372036854775807L;
        this.zzas = zzakeVar;
        zzakeVar.zza(new zzakh(this, null));
        this.zzm = zzanqVar;
        this.zzK = new SparseArray();
        this.zzk = 1 == ((i & 1) ^ 1);
        this.zzl = (i & 2) == 0;
        this.zzh = new zzako();
        this.zzj = new LongSparseArray();
        this.zzi = new SparseArray();
        this.zzp = new zzeu(4);
        this.zzq = new zzeu(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzr = new zzeu(4);
        this.zzn = new zzeu(zzgr.zza);
        this.zzo = new zzeu(4);
        this.zzs = new zzeu();
        this.zzt = new zzeu();
        this.zzu = new zzeu(8);
        this.zzv = new zzeu();
        this.zzw = new zzeu();
        this.zzab = new int[1];
        this.zzE = true;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c5  */
    protected final void zzm(int i, int i2, zzagb zzagbVar) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13 = i;
        zzagb zzagbVar2 = zzagbVar;
        int i14 = 2;
        int i15 = 0;
        if (i13 != 161 && i13 != 163) {
            if (i13 == 165) {
                if (this.zzW != 2) {
                    return;
                }
                zzakl zzaklVar = (zzakl) this.zzi.get(this.zzac);
                if (this.zzaf != 4 || !"V_VP9".equals(zzaklVar.zzc)) {
                    zzagbVar2.zzf(i2);
                    return;
                }
                zzeu zzeuVar = this.zzw;
                zzeuVar.zza(i2);
                zzagbVar2.zzc(zzeuVar.zzi(), 0, i2);
                return;
            }
            if (i13 == 16877) {
                zzr(i);
                zzakl zzaklVar2 = this.zzG;
                if (zzaklVar2.zzc() != 1685485123 && zzaklVar2.zzc() != 1685480259) {
                    zzagbVar2.zzf(i2);
                    return;
                } else {
                    zzaklVar2.zzO = new byte[i2];
                    zzagbVar2.zzc(zzaklVar2.zzO, 0, i2);
                    return;
                }
            }
            if (i13 == 16981) {
                zzr(i);
                zzakl zzaklVar3 = this.zzG;
                zzaklVar3.zzj = new byte[i2];
                zzagbVar2.zzc(zzaklVar3.zzj, 0, i2);
                return;
            }
            if (i13 == 18402) {
                byte[] bArr = new byte[i2];
                zzagbVar2.zzc(bArr, 0, i2);
                zzr(i);
                this.zzG.zzk = new zzahl(1, bArr, 0, 0);
                return;
            }
            if (i13 == 21419) {
                zzeu zzeuVar2 = this.zzr;
                Arrays.fill(zzeuVar2.zzi(), (byte) 0);
                zzagbVar2.zzc(zzeuVar2.zzi(), 4 - i2, i2);
                zzeuVar2.zzh(0);
                this.zzI = (int) zzeuVar2.zzz();
                return;
            }
            if (i13 == 25506) {
                zzr(i);
                zzakl zzaklVar4 = this.zzG;
                zzaklVar4.zzl = new byte[i2];
                zzagbVar2.zzc(zzaklVar4.zzl, 0, i2);
                return;
            }
            if (i13 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i13);
                throw zzat.zzb(sb.toString(), null);
            }
            zzr(i);
            zzakl zzaklVar5 = this.zzG;
            zzaklVar5.zzx = new byte[i2];
            zzagbVar2.zzc(zzaklVar5.zzx, 0, i2);
            return;
        }
        int i16 = 8;
        if (this.zzW == 0) {
            zzako zzakoVar = this.zzh;
            this.zzac = (int) zzakoVar.zzb(zzagbVar2, false, true, 8);
            this.zzad = zzakoVar.zzc();
            this.zzY = -9223372036854775807L;
            this.zzW = 1;
            this.zzp.zza(0);
        }
        zzakl zzaklVar6 = (zzakl) this.zzi.get(this.zzac);
        if (zzaklVar6 == null) {
            zzagbVar2.zzf(i2 - this.zzad);
            this.zzW = 0;
            return;
        }
        zzaklVar6.zzb();
        if (this.zzW == 1) {
            zzu(zzagbVar2, 3);
            zzeu zzeuVar3 = this.zzp;
            int i17 = (zzeuVar3.zzi()[2] & 6) >> 1;
            if (i17 == 0) {
                this.zzaa = 1;
                int[] iArrZzB = zzB(this.zzab, 1);
                this.zzab = iArrZzB;
                iArrZzB[0] = (i2 - this.zzad) - 3;
            } else {
                zzu(zzagbVar2, 4);
                int i18 = (zzeuVar3.zzi()[3] & 255) + 1;
                this.zzaa = i18;
                int[] iArrZzB2 = zzB(this.zzab, i18);
                this.zzab = iArrZzB2;
                if (i17 == 2) {
                    int i19 = (i2 - this.zzad) - 4;
                    int i20 = this.zzaa;
                    Arrays.fill(iArrZzB2, 0, i20, i19 / i20);
                } else {
                    if (i17 == 1) {
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = 4;
                        while (true) {
                            i9 = this.zzaa - 1;
                            iArr = this.zzab;
                            if (i21 >= i9) {
                                break;
                            }
                            iArr[i21] = 0;
                            while (true) {
                                i10 = i23 + 1;
                                zzu(zzagbVar2, i10);
                                int i24 = zzeuVar3.zzi()[i23] & 255;
                                int[] iArr2 = this.zzab;
                                i11 = iArr2[i21] + i24;
                                iArr2[i21] = i11;
                                if (i24 != 255) {
                                    break;
                                } else {
                                    i23 = i10;
                                }
                            }
                            i22 += i11;
                            i21++;
                            i23 = i10;
                        }
                        iArr[i9] = ((i2 - this.zzad) - i23) - i22;
                    } else {
                        if (i17 != 3) {
                            throw zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = 4;
                        while (true) {
                            int i28 = this.zzaa - 1;
                            i4 = i15;
                            int[] iArr3 = this.zzab;
                            if (i25 >= i28) {
                                i5 = i14;
                                iArr3[i28] = ((i2 - this.zzad) - i27) - i26;
                                break;
                            }
                            iArr3[i25] = i4;
                            int i29 = i27 + 1;
                            zzu(zzagbVar2, i29);
                            if (zzeuVar3.zzi()[i27] == 0) {
                                throw zzat.zzb("No valid varint length mask found", null);
                            }
                            int i30 = i4;
                            while (true) {
                                if (i30 >= i16) {
                                    i6 = i14;
                                    i7 = i16;
                                    i8 = i26;
                                    j = 0;
                                    break;
                                }
                                i7 = i16;
                                int i31 = 1 << (7 - i30);
                                if ((zzeuVar3.zzi()[i27] & i31) != 0) {
                                    i29 += i30;
                                    zzu(zzagbVar2, i29);
                                    int i32 = i27 + 1;
                                    int i33 = zzeuVar3.zzi()[i27] & 255 & (~i31);
                                    int i34 = i14;
                                    j = i33;
                                    while (true) {
                                        int i35 = i32;
                                        if (i35 >= i29) {
                                            break;
                                        }
                                        i32 = i35 + 1;
                                        j = (j << i7) | ((long) (zzeuVar3.zzi()[i35] & 255));
                                        i26 = i26;
                                        i34 = i34;
                                    }
                                    i6 = i34;
                                    i8 = i26;
                                    if (i25 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i30 * 7) + 6)) - 1;
                                    break;
                                }
                                i30++;
                                zzagbVar2 = zzagbVar;
                                i16 = i7;
                            }
                            i27 = i29;
                            if (j < -2147483648L || j > 2147483647L) {
                                throw zzat.zzb("EBML lacing sample size out of range.", null);
                            }
                            int[] iArr4 = this.zzab;
                            int i36 = (int) j;
                            if (i25 != 0) {
                                i36 += iArr4[i25 - 1];
                            }
                            iArr4[i25] = i36;
                            i26 = i8 + i36;
                            i25++;
                            zzagbVar2 = zzagbVar;
                            i15 = i4;
                            i16 = i7;
                            i14 = i6;
                        }
                    }
                    this.zzX = this.zzU + zzA((zzeuVar3.zzi()[i4] << 8) | (zzeuVar3.zzi()[1] & 255));
                    if (zzaklVar6.zzf != 1) {
                        i12 = 1;
                    } else if (i13 == 163) {
                        if ((zzeuVar3.zzi()[i5] & 128) == 128) {
                            i12 = 1;
                        } else {
                            i12 = i4;
                        }
                        i13 = 163;
                    } else {
                        i12 = i4;
                    }
                    this.zzae = i12;
                    this.zzW = i5;
                    this.zzZ = i4;
                    i3 = 163;
                }
            }
            i5 = 2;
            i4 = 0;
            this.zzX = this.zzU + zzA((zzeuVar3.zzi()[i4] << 8) | (zzeuVar3.zzi()[1] & 255));
            if (zzaklVar6.zzf != 1) {
                i12 = 1;
            } else if (i13 == 163) {
                if ((zzeuVar3.zzi()[i5] & 128) == 128) {
                    i12 = 1;
                } else {
                    i12 = i4;
                }
                i13 = 163;
            } else {
                i12 = i4;
            }
            this.zzae = i12;
            this.zzW = i5;
            this.zzZ = i4;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i13 == i3) {
            while (true) {
                int i37 = this.zzZ;
                if (i37 >= this.zzaa) {
                    this.zzW = 0;
                    return;
                }
                int iZzv = zzv(zzagbVar, zzaklVar6, this.zzab[i37], false);
                zzakl zzaklVar7 = zzaklVar6;
                zzt(zzaklVar7, this.zzX + ((long) ((this.zzZ * zzaklVar6.zzg) / 1000)), this.zzae, iZzv, 0);
                this.zzZ++;
                zzaklVar6 = zzaklVar7;
            }
        } else {
            while (true) {
                int i38 = this.zzZ;
                if (i38 >= this.zzaa) {
                    return;
                }
                int[] iArr5 = this.zzab;
                iArr5[i38] = zzv(zzagbVar, zzaklVar6, iArr5[i38], true);
                this.zzZ++;
            }
        }
    }

    protected final void zzl(int i, String str) throws zzat {
        if (i == 133) {
            zzq(i);
            this.zzF.zzh = str;
            return;
        }
        if (i == 134) {
            zzr(i);
            this.zzG.zzc = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                this.zzD = Objects.equals(str, "webm");
                return;
            }
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw zzat.zzb(sb.toString(), null);
        }
        if (i == 17276) {
            zzq(i);
            this.zzF.zzi = str;
        } else if (i == 21358) {
            zzr(i);
            this.zzG.zzb = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzr(i);
            this.zzG.zze(str);
        }
    }

    public zzakm(zzanq zzanqVar, int i) {
        this(new zzake(), 0, zzanqVar);
    }

    protected final void zzk(int i, double d) throws zzat {
        if (i == 181) {
            zzr(i);
            this.zzG.zzS = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzB = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzr(i);
                this.zzG.zzE = (float) d;
                break;
            case 21970:
                zzr(i);
                this.zzG.zzF = (float) d;
                break;
            case 21971:
                zzr(i);
                this.zzG.zzG = (float) d;
                break;
            case 21972:
                zzr(i);
                this.zzG.zzH = (float) d;
                break;
            case 21973:
                zzr(i);
                this.zzG.zzI = (float) d;
                break;
            case 21974:
                zzr(i);
                this.zzG.zzJ = (float) d;
                break;
            case 21975:
                zzr(i);
                this.zzG.zzK = (float) d;
                break;
            case 21976:
                zzr(i);
                this.zzG.zzL = (float) d;
                break;
            case 21977:
                zzr(i);
                this.zzG.zzM = (float) d;
                break;
            case 21978:
                zzr(i);
                this.zzG.zzN = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzr(i);
                        this.zzG.zzu = (float) d;
                        break;
                    case 30324:
                        zzr(i);
                        this.zzG.zzv = (float) d;
                        break;
                    case 30325:
                        zzr(i);
                        this.zzG.zzw = (float) d;
                        break;
                }
                break;
        }
    }
}
