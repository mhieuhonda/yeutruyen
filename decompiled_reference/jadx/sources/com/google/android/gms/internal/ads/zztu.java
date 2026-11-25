package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.work.PeriodicWorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztu implements zzsg {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private float zzH;
    private ByteBuffer zzI;
    private int zzJ;
    private ByteBuffer zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private boolean zzQ;
    private zze zzR;
    private AudioDeviceInfo zzS;
    private int zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;
    private long zzX;
    private long zzY;
    private Handler zzZ;
    private final zztp zzaa;
    private final Context zzb;
    private final zztj zzc;
    private final zzug zzd;
    private final zzcw zze;
    private final zzuf zzf;
    private final zzgwt zzg;
    private final ArrayDeque zzh;
    private zztl zzi;
    private final zztt zzj;
    private final zztt zzk;
    private zzqh zzl;
    private zzsd zzm;
    private zzto zzn;
    private zzto zzo;
    private zzck zzp;
    private final zzrh zzq;
    private zzre zzr;
    private zzqx zzs;
    private zzd zzt;
    private zzts zzu;
    private zzts zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    static /* synthetic */ boolean zzI() {
        return zza.get() > 0;
    }

    private final void zzS(long j) {
        long j2;
        this.zzp = this.zzo.zzk();
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.zzG;
            if (this.zzo.zzl() != zzbf.zza && this.zzo.zzm() != null) {
                this.zzo.zzl().zzo(this.zzo.zzm(), new zzbd());
            }
        }
        zzck zzckVar = this.zzp;
        zzcm zzcmVar = new zzcm();
        zzcmVar.zzb(this.zzo.zzl());
        zzcmVar.zzc(this.zzo.zzm());
        zzcmVar.zza(j2);
        zzckVar.zzb(zzcmVar.zzd());
    }

    private final zzqx zzT(zzrg zzrgVar) throws zzsc {
        try {
            return ((zztg) this.zzq).zzf(zzrgVar);
        } catch (zzrd e) {
            zzsc zzscVar = new zzsc(0, zzrgVar.zzb, zzrgVar.zzc, zzrgVar.zza, zzrgVar.zze, this.zzo.zzf(), false, e);
            zzsd zzsdVar = this.zzm;
            if (zzsdVar == null) {
                throw zzscVar;
            }
            zzsdVar.zza(zzscVar);
            throw zzscVar;
        }
    }

    private final void zzU(long j) throws Exception {
        zzX(j);
        if (this.zzK != null) {
            return;
        }
        if (!this.zzp.zzc()) {
            ByteBuffer byteBuffer = this.zzI;
            if (byteBuffer != null) {
                zzW(byteBuffer);
                zzX(j);
                return;
            }
            return;
        }
        while (!this.zzp.zzg()) {
            do {
                ByteBuffer byteBufferZze = this.zzp.zze();
                if (byteBufferZze.hasRemaining()) {
                    zzW(byteBufferZze);
                    zzX(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzI;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzp.zzd(this.zzI);
                    }
                }
            } while (this.zzK == null);
            return;
        }
    }

    private final boolean zzV() throws Exception {
        if (!this.zzp.zzc()) {
            zzX(Long.MIN_VALUE);
            return this.zzK == null;
        }
        this.zzp.zzf();
        zzU(Long.MIN_VALUE);
        if (!this.zzp.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzK;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0285  */
    /* JADX WARN: Code duplicated, block: B:101:0x028c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[PHI: r11
      0x00e7: PHI (r11v51 double) = (r11v50 double), (r11v62 double) binds: [B:42:0x00e5, B:34:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[PHI: r11
      0x00eb: PHI (r11v56 double) = (r11v50 double), (r11v62 double) binds: [B:42:0x00e5, B:34:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0187 A[PHI: r11
      0x0187: PHI (r11v22 float) = (r11v21 float), (r11v59 float) binds: [B:54:0x0185, B:39:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x018b A[PHI: r11
      0x018b: PHI (r11v27 float) = (r11v21 float), (r11v59 float) binds: [B:54:0x0185, B:39:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x01be  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0208  */
    /* JADX WARN: Code duplicated, block: B:92:0x0211  */
    /* JADX WARN: Code duplicated, block: B:93:0x0219  */
    /* JADX WARN: Code duplicated, block: B:94:0x0231  */
    /* JADX WARN: Code duplicated, block: B:95:0x0244  */
    /* JADX WARN: Code duplicated, block: B:96:0x0251  */
    /* JADX WARN: Code duplicated, block: B:97:0x0268  */
    /* JADX WARN: Code duplicated, block: B:98:0x027b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x027d  */
    private final void zzW(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        double d;
        float fMax;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double dZzm;
        double d2;
        zzgtr.zzi(this.zzK == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzo.zze()) {
                int iZzv = (int) zzfm.zzv(zzfm.zzt(20L), this.zzo.zzj().zzb);
                long jZzaf = zzaf();
                long j = iZzv;
                if (jZzaf < j) {
                    int i12 = this.zzo.zzj().zza;
                    int iZzi = this.zzo.zzi();
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i13 = (int) jZzaf;
                    while (byteBuffer.hasRemaining() && i13 < iZzv) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i12 != 4) {
                                if (i12 != 21) {
                                    if (i12 == 22) {
                                        i8 = byteBuffer.get() & 255;
                                        i9 = (byteBuffer.get() & 255) << 8;
                                        i10 = (byteBuffer.get() & 255) << 16;
                                        i11 = (byteBuffer.get() & 255) << 24;
                                    } else if (i12 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i12 == 1342177280) {
                                        i5 = (byteBuffer.get() & 255) << 24;
                                        i6 = (byteBuffer.get() & 255) << 16;
                                        i7 = (byteBuffer.get() & 255) << 8;
                                    } else if (i12 != 1610612736) {
                                        if (i12 == 1879048192) {
                                            dZzm = zzfm.zzm(byteBuffer.getDouble(), -1.0d, 1.0d);
                                            if (dZzm < 0.0d) {
                                                d2 = (-dZzm) * (-2.147483648E9d);
                                            } else {
                                                d2 = dZzm * 2.147483647E9d;
                                            }
                                        } else if (i12 == 1895825408) {
                                            fMax = Math.max(-1.0f, Math.min(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), 1.0f));
                                            if (fMax < 0.0f) {
                                                f2 = (-fMax) * (-2.1474836E9f);
                                            } else {
                                                f2 = fMax * 2.1474836E9f;
                                            }
                                            i3 = (int) f2;
                                        } else {
                                            if (i12 != 1912602624) {
                                                throw new IllegalStateException();
                                            }
                                            dZzm = zzfm.zzm(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), -1.0d, 1.0d);
                                            if (dZzm < 0.0d) {
                                                d2 = (-dZzm) * (-2.147483648E9d);
                                            } else {
                                                d2 = dZzm * 2.147483647E9d;
                                            }
                                        }
                                        i3 = (int) d2;
                                    } else {
                                        i8 = (byteBuffer.get() & 255) << 24;
                                        i9 = (byteBuffer.get() & 255) << 16;
                                        i10 = (byteBuffer.get() & 255) << 8;
                                        i11 = byteBuffer.get() & 255;
                                    }
                                    i3 = i8 | i9 | i10 | i11;
                                } else {
                                    i5 = (byteBuffer.get() & 255) << 8;
                                    i6 = (byteBuffer.get() & 255) << 16;
                                    i7 = (byteBuffer.get() & 255) << 24;
                                }
                                i3 = i5 | i6 | i7;
                            } else {
                                fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                if (fMax < 0.0f) {
                                    f2 = (-fMax) * (-2.1474836E9f);
                                } else {
                                    f2 = fMax * 2.1474836E9f;
                                }
                                i3 = (int) f2;
                            }
                            i4 = (int) ((((long) i3) * ((long) i13)) / j);
                            if (i12 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 4) {
                                if (i12 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i12 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i12 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i12 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i12 != 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else if (i12 != 1879048192) {
                                    if (i12 != 1895825408) {
                                        if (i4 < 0) {
                                            f = (-i4) / (-2.1474836E9f);
                                        } else {
                                            f = i4 / 2.1474836E9f;
                                        }
                                        byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f)));
                                    } else {
                                        if (i12 == 1912602624) {
                                            throw new IllegalStateException();
                                        }
                                        if (i4 < 0) {
                                            d = (-i4) / (-2.147483648E9d);
                                        } else {
                                            d = ((double) i4) / 2.147483647E9d;
                                        }
                                        byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                    }
                                } else if (i4 < 0) {
                                    byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + iZzi) {
                                i13++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i13)) / j);
                        if (i12 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 4) {
                            if (i12 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i12 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i12 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else if (i12 != 1879048192) {
                                if (i12 != 1895825408) {
                                    if (i4 < 0) {
                                        f = (-i4) / (-2.1474836E9f);
                                    } else {
                                        f = i4 / 2.1474836E9f;
                                    }
                                    byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f)));
                                } else {
                                    if (i12 == 1912602624) {
                                        throw new IllegalStateException();
                                    }
                                    if (i4 < 0) {
                                        d = (-i4) / (-2.147483648E9d);
                                    } else {
                                        d = ((double) i4) / 2.147483647E9d;
                                    }
                                    byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + iZzi) {
                            i13++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.zzK = byteBuffer2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    private final void zzX(long j) throws Exception {
        zzsd zzsdVar;
        if (this.zzK == null || this.zzk.zzb()) {
            return;
        }
        int iRemaining = this.zzK.remaining();
        boolean z = true;
        try {
            boolean zZzc = this.zzs.zzc(this.zzK, this.zzJ, j);
            this.zzU = SystemClock.elapsedRealtime();
            this.zzk.zzc();
            if (this.zzs.zzg()) {
                if (this.zzB > 0) {
                    this.zzW = false;
                }
                if (this.zzO && (zzsdVar = this.zzm) != null && !zZzc) {
                }
            }
            if (this.zzo.zze()) {
                this.zzA += (long) (iRemaining - this.zzK.remaining());
            }
            if (zZzc) {
                if (!this.zzo.zze()) {
                    zzgtr.zzi(this.zzK == this.zzI);
                    this.zzB += ((long) this.zzC) * ((long) this.zzJ);
                }
                this.zzK = null;
            }
        } catch (zzqw e) {
            boolean z2 = e.zzb;
            if (!z2) {
                z = false;
            } else if (zzaf() <= 0) {
                if (this.zzs.zzg()) {
                    zzY();
                } else {
                    z = false;
                }
            }
            zzsf zzsfVar = new zzsf(e.zza, this.zzo.zzf(), z);
            zzsd zzsdVar2 = this.zzm;
            if (zzsdVar2 != null) {
                zzsdVar2.zza(zzsfVar);
            }
            if (z2) {
                throw zzsfVar;
            }
            this.zzk.zza(zzsfVar);
        }
    }

    private final void zzY() {
        this.zzo.zzj();
    }

    private final void zzZ() {
        if (zzae()) {
            this.zzs.zzf(this.zzH);
        }
    }

    private final void zzaa() {
        if (this.zzo != null) {
            zzto zztoVar = this.zzn;
            if (zztoVar != null) {
                this.zzo = zztoVar;
                this.zzn = null;
            }
            try {
                this.zzo = this.zzo.zza(this.zzq.zzb(zzag(this.zzo.zzg(), -1)));
            } catch (zzqy e) {
                throw new IllegalStateException(new zzsb(e, this.zzo.zzf()));
            }
        }
        zzC();
    }

    private final void zzab(zzav zzavVar) {
        zzts zztsVar = new zzts(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzae()) {
            this.zzu = zztsVar;
        } else {
            this.zzv = zztsVar;
        }
    }

    private final void zzac(long j) {
        zzav zzavVar;
        boolean z;
        if (zzad()) {
            zztp zztpVar = this.zzaa;
            zzavVar = this.zzw;
            zztpVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzad()) {
            zztp zztpVar2 = this.zzaa;
            z = this.zzx;
            zztpVar2.zzc(z);
        } else {
            z = false;
        }
        this.zzx = z;
        this.zzh.add(new zzts(zzavVar2, Math.max(0L, j), this.zzo.zzc(zzaf()), null));
        zzS(j);
        zzsd zzsdVar = this.zzm;
        if (zzsdVar != null) {
            ((zztz) zzsdVar).zza.zzaB().zzh(this.zzx);
        }
    }

    private final boolean zzad() {
        if (!this.zzo.zze()) {
            return false;
        }
        int i = this.zzo.zzf().zzK;
        return true;
    }

    private final boolean zzae() {
        return this.zzs != null;
    }

    private final long zzaf() {
        if (!this.zzo.zze()) {
            return this.zzB;
        }
        long j = this.zzA;
        long jZzi = this.zzo.zzi();
        String str = zzfm.zza;
        return ((j + jZzi) - 1) / jZzi;
    }

    private final zzra zzag(zzv zzvVar, int i) {
        zzqz zzqzVar = new zzqz(zzvVar);
        zzqzVar.zza(this.zzt);
        zzqzVar.zzb(this.zzS);
        zzqzVar.zzc(this.zzP);
        zzqzVar.zze(-1);
        zzqzVar.zzd(this.zzT);
        return new zzra(zzqzVar, null);
    }

    private final void zzah() {
        if (this.zzM) {
            return;
        }
        this.zzM = true;
        if (this.zzs.zzg()) {
            this.zzN = false;
        }
        this.zzs.zzd();
    }

    private static int zzai(int i) {
        if (i == 0 || i == -1) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzA(float f) {
        if (this.zzH != f) {
            this.zzH = f;
            zzZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzB() {
        this.zzO = false;
        if (zzae()) {
            this.zzs.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzC() {
        if (zzae()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzW = false;
            this.zzC = 0;
            this.zzv = new zzts(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzI = null;
            this.zzJ = 0;
            this.zzK = null;
            this.zzM = false;
            this.zzL = false;
            this.zzN = false;
            this.zzd.zzr();
            zzS(-9223372036854775807L);
            this.zzi = null;
            zzto zztoVar = this.zzn;
            if (zztoVar != null) {
                this.zzo = zztoVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzX = 0L;
        this.zzY = 0L;
        Handler handler = this.zzZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzD() {
        zzC();
        zzgwt zzgwtVar = this.zzg;
        int size = zzgwtVar.size();
        for (int i = 0; i < size; i++) {
            ((zzcp) zzgwtVar.get(i)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzO = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzE() {
        this.zzq.zze();
    }

    final /* synthetic */ void zzG() {
        if (this.zzY >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            ((zztz) this.zzm).zza.zzaD(true);
            this.zzY = 0L;
        }
    }

    final /* synthetic */ void zzH() {
        zzsd zzsdVar = this.zzm;
        if (zzsdVar != null) {
            ((zztz) zzsdVar).zza.zzU();
        }
    }

    final /* synthetic */ zztl zzK() {
        return this.zzi;
    }

    final /* synthetic */ zzsd zzL() {
        return this.zzm;
    }

    final /* synthetic */ zzto zzM() {
        return this.zzo;
    }

    final /* synthetic */ zzqx zzN() {
        return this.zzs;
    }

    final /* synthetic */ boolean zzO() {
        return this.zzM;
    }

    final /* synthetic */ void zzP(boolean z) {
        this.zzN = true;
    }

    final /* synthetic */ boolean zzQ() {
        return this.zzO;
    }

    final /* synthetic */ long zzR() {
        return this.zzU;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zza(zzsd zzsdVar) {
        this.zzm = zzsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzb(zzqh zzqhVar) {
        this.zzl = zzqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzc(zzdp zzdpVar) {
        this.zzq.zzd(zzdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final boolean zzd(zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final int zze(zzv zzvVar) {
        boolean z;
        int i = zzvVar.zzK;
        if (!zzfm.zzE(i) || i == 2) {
            z = false;
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzJ(2);
            zzvVar = zztVarZza.zzP();
            z = true;
        }
        int i2 = this.zzq.zza(zzag(zzvVar, -1)).zzd;
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 2) {
            return 0;
        }
        return z ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzqu zzf(zzv zzvVar) {
        if (this.zzV) {
            return zzqu.zza;
        }
        zzrc zzrcVarZza = this.zzq.zza(zzag(zzvVar, -1));
        zzqt zzqtVar = new zzqt();
        zzqtVar.zza(zzrcVarZza.zza);
        zzqtVar.zzb(zzrcVarZza.zzb);
        zzqtVar.zzc(zzrcVarZza.zzc);
        return zzqtVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzg(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzae() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzs.zzk(), this.zzo.zzc(zzaf()));
        while (true) {
            arrayDeque = this.zzh;
            if (arrayDeque.isEmpty() || jMin < ((zzts) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzv = (zzts) arrayDeque.remove();
        }
        zzts zztsVar = this.zzv;
        long j2 = jMin - zztsVar.zzc;
        long jZzy = zzfm.zzy(j2, zztsVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long jZzd = this.zzaa.zzd(j2);
            zzts zztsVar2 = this.zzv;
            j = zztsVar2.zzb + jZzd;
            zztsVar2.zzd = jZzd - jZzy;
        } else {
            zzts zztsVar3 = this.zzv;
            j = zztsVar3.zzb + jZzy + zztsVar3.zzd;
        }
        long jZze = this.zzaa.zze();
        long jZzc = j + this.zzo.zzc(jZze);
        long j3 = this.zzX;
        if (jZze > j3) {
            long jZzc2 = this.zzo.zzc(jZze - j3);
            this.zzX = jZze;
            this.zzY += jZzc2;
            if (this.zzZ == null) {
                this.zzZ = new Handler(Looper.myLooper());
            }
            this.zzZ.removeCallbacksAndMessages(null);
            this.zzZ.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zztr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzG();
                }
            }, 100L);
        }
        return jZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzh(zzrz zzrzVar) throws zzsb {
        int i;
        zzv zzvVar;
        zzck zzckVar;
        int iZzI;
        if (this.zzr == null && this.zzb != null) {
            zzre zzreVar = new zzre() { // from class: com.google.android.gms.internal.ads.zztq
                @Override // com.google.android.gms.internal.ads.zzre
                public final /* synthetic */ void zza() {
                    this.zza.zzH();
                }
            };
            this.zzr = zzreVar;
            this.zzq.zzc(zzreVar);
        }
        zzv zzvVar2 = zzrzVar.zza;
        if ("audio/raw".equals(zzvVar2.zzp)) {
            int i2 = zzvVar2.zzK;
            zzgtr.zza(zzfm.zzE(i2));
            int i3 = zzvVar2.zzH;
            int iZzI2 = zzfm.zzI(i2) * i3;
            zzgwq zzgwqVar = new zzgwq();
            zzgwqVar.zzh(this.zzg);
            zzgwqVar.zzf(this.zze);
            zzgwqVar.zzg(this.zzaa.zza());
            zzck zzckVar2 = new zzck(zzgwqVar.zzi());
            if (zzckVar2.equals(this.zzp)) {
                zzckVar2 = this.zzp;
            }
            this.zzd.zzq(zzvVar2.zzL, zzvVar2.zzM);
            this.zzc.zzq(zzrzVar.zzc);
            try {
                zzcl zzclVarZza = zzckVar2.zza(new zzcl(zzvVar2.zzJ, i3, i2));
                zzt zztVarZza = zzvVar2.zza();
                int i4 = zzclVarZza.zzd;
                zztVarZza.zzJ(i4);
                zztVarZza.zzI(zzclVarZza.zzb);
                int i5 = zzclVarZza.zzc;
                zztVarZza.zzG(i5);
                zztVarZza.zzH(i5 == zzvVar2.zzH ? zzvVar2.zzI : -1);
                zzv zzvVarZzP = zztVarZza.zzP();
                zzckVar = zzckVar2;
                iZzI = zzfm.zzI(i4) * i5;
                i = iZzI2;
                zzvVar = zzvVarZzP;
            } catch (zzco e) {
                throw new zzsb(e, zzvVar2);
            }
        } else {
            i = -1;
            zzvVar = zzvVar2;
            zzckVar = new zzck(zzgwt.zzi());
            iZzI = -1;
        }
        zzra zzraVarZzag = zzag(zzvVar, -1);
        try {
            zzrg zzrgVarZzb = this.zzq.zzb(zzraVarZzag);
            if (zzrgVarZzb.zza == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new zzsb(sb.toString(), zzraVarZzag.zza);
            }
            if (zzrgVarZzb.zzc == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new zzsb(sb2.toString(), zzraVarZzag.zza);
            }
            this.zzV = false;
            zzbf zzbfVar = zzrzVar.zzd;
            zzxl zzxlVar = zzrzVar.zze;
            zzto zztoVar = new zzto(zzvVar2, zzvVar, i, iZzI, zzrgVarZzb, zzckVar, zzbfVar, zzxlVar != null ? zzxlVar.zza : null, null);
            if (zzae()) {
                this.zzn = zztoVar;
            } else {
                this.zzo = zztoVar;
            }
        } catch (zzqy e2) {
            throw new zzsb(e2, zzvVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzi() {
        this.zzO = true;
        if (zzae()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzj() {
        this.zzD = true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzsg
    public final boolean zzk(ByteBuffer byteBuffer, long j, int i) throws Exception {
        zzqx zzqxVarZzT;
        zzqx zzqxVar;
        ByteBuffer byteBuffer2 = this.zzI;
        zzgtr.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        byte[] bArr = null;
        if (this.zzn != null) {
            if (!zzV()) {
                return false;
            }
            if (this.zzs != null) {
                zzrg zzrgVarZzj = this.zzo.zzj();
                zzag(this.zzn.zzg(), -1);
                if (this.zzn.zzj().equals(zzrgVarZzj)) {
                    this.zzo = this.zzn;
                    this.zzn = null;
                    zzqxVar = this.zzs;
                    if (zzqxVar != null && zzqxVar.zzg()) {
                        this.zzo.zzj();
                    }
                } else {
                    zzah();
                    if (zzn()) {
                        return false;
                    }
                    zzC();
                }
            } else {
                this.zzo = this.zzn;
                this.zzn = null;
                zzqxVar = this.zzs;
                if (zzqxVar != null) {
                    this.zzo.zzj();
                }
            }
            zzac(j);
        }
        if (!zzae()) {
            try {
                if (this.zzj.zzb()) {
                    return false;
                }
                try {
                    zzqxVarZzT = zzT(this.zzo.zzj());
                } catch (zzsc e) {
                    int i2 = this.zzo.zzj().zze;
                    while (true) {
                        if (i2 <= 1000000) {
                            zzY();
                            throw e;
                        }
                        int i3 = i2 >> 1;
                        int iZzi = this.zzo.zzi() != -1 ? this.zzo.zzi() : 1;
                        int i4 = i3 % iZzi;
                        if (i4 != 0) {
                            i3 += iZzi - i4;
                        }
                        int i5 = i3;
                        zzrf zzrfVar = new zzrf(this.zzo.zzj(), null);
                        zzrfVar.zze(i5);
                        zzrg zzrgVar = new zzrg(zzrfVar, null);
                        try {
                            zzqx zzqxVarZzT2 = zzT(zzrgVar);
                            this.zzo = this.zzo.zza(zzrgVar);
                            zzqxVarZzT = zzqxVarZzT2;
                            break;
                        } catch (zzsc e2) {
                            e.addSuppressed(e2);
                            i2 = i5;
                        }
                    }
                }
                this.zzs = zzqxVarZzT;
                zztl zztlVar = new zztl(this, this.zzo.zzj(), bArr);
                this.zzi = zztlVar;
                this.zzs.zzm(zztlVar);
                if (this.zzs.zzg()) {
                    this.zzo.zzj();
                }
                zzqh zzqhVar = this.zzl;
                if (zzqhVar != null) {
                    this.zzs.zzn(zzqhVar);
                }
                zzZ();
                int i6 = this.zzR.zza;
                AudioDeviceInfo audioDeviceInfo = this.zzS;
                if (audioDeviceInfo != null) {
                    this.zzs.zzo(audioDeviceInfo);
                }
                this.zzE = true;
                int iZzh = this.zzs.zzh();
                int i7 = this.zzP;
                this.zzP = iZzh;
                zzsd zzsdVar = this.zzm;
                if (zzsdVar != null) {
                    ((zztz) zzsdVar).zza.zzaB().zzk(this.zzo.zzd());
                    if (iZzh != i7) {
                        this.zzQ = true;
                        zzto zztoVar = this.zzo;
                        zzrf zzrfVar2 = new zzrf(zztoVar.zzj(), null);
                        zzrfVar2.zzg(this.zzP);
                        this.zzo = zztoVar.zza(new zzrg(zzrfVar2, null));
                        zzto zztoVar2 = this.zzn;
                        if (zztoVar2 != null) {
                            zzrf zzrfVar3 = new zzrf(zztoVar2.zzj(), null);
                            zzrfVar3.zzg(this.zzP);
                            this.zzn = zztoVar2.zza(new zzrg(zzrfVar3, null));
                        }
                        zzsd zzsdVar2 = this.zzm;
                        int i8 = this.zzP;
                        if (Build.VERSION.SDK_INT >= 35) {
                            zzua zzuaVar = ((zztz) zzsdVar2).zza;
                            if (zzuaVar.zzaC() != null) {
                                zzuaVar.zzaC().zza(i8);
                            }
                        }
                        ((zztz) zzsdVar2).zza.zzaB().zzm(i8);
                    }
                }
            } catch (zzsc e3) {
                this.zzj.zza(e3);
                return false;
            }
        }
        this.zzj.zzc();
        if (this.zzE) {
            this.zzF = Math.max(0L, j);
            this.zzD = false;
            this.zzE = false;
            zzac(j);
            if (this.zzO) {
                zzi();
            }
        }
        if (this.zzI == null) {
            zzgtr.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.zzo.zze() && this.zzC == 0) {
                int iZzF = zzF(this.zzo.zzj().zza, byteBuffer);
                this.zzC = iZzF;
                if (iZzF == 0) {
                    return true;
                }
            }
            if (this.zzu != null) {
                if (!zzV()) {
                    return false;
                }
                zzac(j);
                this.zzu = null;
            }
            long j2 = this.zzF;
            zzto zztoVar3 = this.zzo;
            long jZzb = j2 + zztoVar3.zzb((zztoVar3.zze() ? this.zzy / ((long) this.zzo.zzh()) : this.zzz) - this.zzd.zzs());
            if (!this.zzD && Math.abs(jZzb - j) > 200000) {
                zzsd zzsdVar3 = this.zzm;
                if (zzsdVar3 != null) {
                    zzsdVar3.zza(new zzse(j, jZzb));
                }
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzV()) {
                    return false;
                }
                long j3 = j - jZzb;
                this.zzF += j3;
                this.zzD = false;
                zzac(j);
                zzsd zzsdVar4 = this.zzm;
                if (zzsdVar4 != null && j3 != 0) {
                    ((zztz) zzsdVar4).zza.zzar();
                }
            }
            if (this.zzo.zze()) {
                this.zzy += (long) byteBuffer.remaining();
            } else {
                this.zzz += ((long) this.zzC) * ((long) i);
            }
            this.zzI = byteBuffer;
            this.zzJ = i;
        }
        zzU(j);
        if (!this.zzI.hasRemaining()) {
            this.zzI = null;
            this.zzJ = 0;
            return true;
        }
        if (!this.zzs.zzl()) {
            return false;
        }
        zzeh.zzc("DefaultAudioSink", "Resetting stalled audio output");
        zzC();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzl() throws zzsf {
        if (!this.zzL && zzae() && zzV()) {
            zzah();
            this.zzL = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final boolean zzm() {
        if (zzae()) {
            return this.zzL && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final boolean zzn() {
        if (!zzae()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.zzs.zzg() && this.zzN) {
            return false;
        }
        long jZzaf = zzaf();
        long jZzk = this.zzs.zzk();
        zzqx zzqxVar = this.zzs;
        zzqxVar.getClass();
        return jZzaf > zzfm.zzv(jZzk, zzqxVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzo(zzav zzavVar) {
        float f = zzavVar.zzb;
        String str = zzfm.zza;
        zzav zzavVar2 = new zzav(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        this.zzw = zzavVar2;
        zzab(zzavVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzq(boolean z) {
        this.zzx = z;
        zzab(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzqj zzs() {
        zzrh zzrhVar = this.zzq;
        if (zzrhVar instanceof zztg) {
            return ((zztg) zzrhVar).zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzt(int i) {
        if (this.zzQ) {
            if (this.zzP != i) {
                return;
            } else {
                this.zzQ = false;
            }
        }
        if (this.zzP != i) {
            this.zzP = i;
            zzaa();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzu(zze zzeVar) {
        if (this.zzR.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i = this.zzR.zza;
        }
        this.zzR = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzv(AudioDeviceInfo audioDeviceInfo) {
        this.zzS = audioDeviceInfo;
        zzqx zzqxVar = this.zzs;
        if (zzqxVar != null) {
            zzqxVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzw(int i) {
        int i2 = this.zzT;
        int iZzai = zzai(i);
        if (i2 == iZzai) {
            return;
        }
        this.zzT = iZzai;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzx(long j) {
        this.zzG = j;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzy() {
        if (!zzae()) {
            return -9223372036854775807L;
        }
        if (this.zzo.zze()) {
            return this.zzo.zzc(this.zzs.zzj());
        }
        long jZzj = this.zzs.zzj();
        int iZzf = zzage.zzf(this.zzo.zzj().zza);
        zzgtr.zzi(iZzf != -2147483647);
        return zzfm.zzw(jZzj, 1000000L, iZzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzz(int i, int i2) {
        zzqx zzqxVar = this.zzs;
        if (zzqxVar != null) {
            zzqxVar.zzg();
        }
    }

    /* synthetic */ zztu(zztn zztnVar, byte[] bArr) {
        this.zzb = zztnVar.zzb() == null ? null : zztnVar.zzb().getApplicationContext();
        this.zzt = zzd.zza;
        this.zzaa = zztnVar.zzd();
        this.zzq = zztnVar.zzc();
        zztj zztjVar = new zztj();
        this.zzc = zztjVar;
        zzug zzugVar = new zzug();
        this.zzd = zzugVar;
        this.zze = new zzcw();
        this.zzf = new zzuf();
        this.zzg = zzgwt.zzk(zzugVar, zztjVar);
        this.zzH = 1.0f;
        this.zzP = 0;
        this.zzR = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzv = new zzts(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new ArrayDeque();
        this.zzj = new zztt();
        this.zzk = new zztt();
        int iZzai = -1;
        if (Build.VERSION.SDK_INT >= 34 && zztnVar.zzb() != null) {
            iZzai = zzai(zztnVar.zzb().getDeviceId());
        }
        this.zzT = iZzai;
    }

    static int zzF(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        if (i == 20) {
            return zzgx.zzb(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iZzb = zzagy.zzb(zzfm.zzO(byteBuffer, byteBuffer.position()));
                    if (iZzb != -1) {
                        return iZzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int i6 = zzafa.zza;
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i7 = iPosition;
                            while (true) {
                                if (i7 > iLimit) {
                                    i5 = -1;
                                } else if ((zzfm.zzO(byteBuffer, i7 + 4) & (-2)) == -126718022) {
                                    i5 = i7 - iPosition;
                                } else {
                                    i7++;
                                }
                            }
                            if (i5 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            int i8 = zzafd.zza;
                            byte[] bArr = new byte[16];
                            int iPosition2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition2);
                            return zzafd.zzb(new zzet(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
                            sb.append("Unexpected audio encoding: ");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                    }
                    break;
            }
            return zzafa.zze(byteBuffer);
        }
        int i9 = zzafz.zza;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition3 = byteBuffer.position();
        byte b2 = byteBuffer.get(iPosition3);
        if (b2 != -2) {
            if (b2 != -1) {
                if (b2 != 31) {
                    i3 = (byteBuffer.get(iPosition3 + 4) & 1) << 6;
                    i4 = byteBuffer.get(iPosition3 + 5) & 252;
                } else {
                    i3 = (byteBuffer.get(iPosition3 + 5) & 7) << 4;
                    b = byteBuffer.get(iPosition3 + 6);
                }
                i2 = (i4 >> 2) | i3;
            } else {
                i3 = (byteBuffer.get(iPosition3 + 4) & 7) << 4;
                b = byteBuffer.get(iPosition3 + 7);
            }
            i4 = b & 60;
            i2 = (i4 >> 2) | i3;
        } else {
            i2 = ((byteBuffer.get(iPosition3 + 5) & 1) << 6) | ((byteBuffer.get(iPosition3 + 4) & 252) >> 2);
        }
        return (i2 + 1) * 32;
    }
}
