package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzakl {
    public byte[] zzO;
    public zzahn zzV;
    public boolean zzX;
    public zzahm zzZ;
    public boolean zza;
    public zzv zzaa;
    public int zzab;
    private int zzac;
    public String zzb;
    public String zzc;
    public int zzd;
    public long zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public boolean zzi;
    public byte[] zzj;
    public zzahl zzk;
    public byte[] zzl;
    public zzq zzm;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = -1;
    public int zzs = 0;
    public int zzt = -1;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public float zzw = 0.0f;
    public byte[] zzx = null;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = -1;
    public int zzS = 8000;
    public long zzT = 0;
    public long zzU = 0;
    public boolean zzW = false;
    public boolean zzY = true;
    private String zzad = "eng";

    protected zzakl() {
    }

    private static Pair zzf(zzeu zzeuVar) throws zzat {
        try {
            zzeuVar.zzk(16);
            long jZzA = zzeuVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzA != 826496599) {
                zzeh.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzg = zzeuVar.zzg() + 20;
            byte[] bArrZzi = zzeuVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private final boolean zzh(zzeu zzeuVar) throws zzat {
        try {
            int iZzu = zzeuVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzeuVar.zzh(20);
                int iZzI = zzeuVar.zzI();
                if (zzft.zza(iZzI, this.zzP)) {
                    this.zzR = zzft.zzb(iZzI);
                }
                if (zzeuVar.zzD() == zzakm.zzf.getMostSignificantBits() && zzeuVar.zzD() == zzakm.zzf.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzl;
        if (bArr != null) {
            return bArr;
        }
        String.valueOf(str);
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0198  */
    /* JADX WARN: Code duplicated, block: B:179:0x044d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0465  */
    /* JADX WARN: Code duplicated, block: B:185:0x0471  */
    /* JADX WARN: Code duplicated, block: B:186:0x0474  */
    /* JADX WARN: Code duplicated, block: B:189:0x0483  */
    /* JADX WARN: Code duplicated, block: B:190:0x0497  */
    /* JADX WARN: Code duplicated, block: B:192:0x049d  */
    /* JADX WARN: Code duplicated, block: B:194:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:196:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:201:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:204:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:209:0x04cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:211:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:212:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:215:0x04da  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:221:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:223:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:224:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:227:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:247:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:250:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:252:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:255:0x0604  */
    /* JADX WARN: Code duplicated, block: B:274:0x0651  */
    /* JADX WARN: Code duplicated, block: B:276:0x0670  */
    /* JADX WARN: Code duplicated, block: B:278:0x0676  */
    /* JADX WARN: Code duplicated, block: B:293:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:295:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:298:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:299:0x06c3  */
    @RequiresNonNull({"codecId"})
    public final void zza(int i) throws zzat {
        byte b;
        List listZzj;
        int i2;
        int i3;
        int i4;
        int i5;
        List listZzk;
        String str;
        int i6;
        int iZzC;
        int i7;
        List list;
        String str2;
        int i8;
        int i9;
        List listZzg;
        int i10;
        String str3;
        String str4;
        int i11;
        zzt zztVar;
        int iIntValue;
        int i12;
        float f;
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        int i16;
        int i17;
        int i18;
        String str5;
        zzfw zzfwVarZza;
        String str6 = this.zzc;
        switch (str6) {
            case "V_MPEG4/ISO/AP":
                b = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b = 4;
                break;
            case "A_MS/ACM":
                b = Ascii.ETB;
                break;
            case "A_TRUEHD":
                b = Ascii.DC2;
                break;
            case "A_VORBIS":
                b = Ascii.VT;
                break;
            case "A_MPEG/L2":
                b = Ascii.SO;
                break;
            case "A_MPEG/L3":
                b = Ascii.SI;
                break;
            case "V_MS/VFW/FOURCC":
                b = 9;
                break;
            case "S_DVBSUB":
                b = 33;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 7;
                break;
            case "S_VOBSUB":
                b = Ascii.US;
                break;
            case "A_DTS/LOSSLESS":
                b = Ascii.NAK;
                break;
            case "A_AAC":
                b = Ascii.CR;
                break;
            case "A_AC3":
                b = Ascii.DLE;
                break;
            case "A_DTS":
                b = 19;
                break;
            case "V_AV1":
                b = 2;
                break;
            case "V_VP8":
                b = 0;
                break;
            case "V_VP9":
                b = 1;
                break;
            case "S_HDMV/PGS":
                b = 32;
                break;
            case "V_THEORA":
                b = 10;
                break;
            case "A_DTS/EXPRESS":
                b = Ascii.DC4;
                break;
            case "A_PCM/FLOAT/IEEE":
                b = Ascii.SUB;
                break;
            case "A_PCM/INT/BIG":
                b = Ascii.EM;
                break;
            case "A_PCM/INT/LIT":
                b = Ascii.CAN;
                break;
            case "S_TEXT/ASS":
                b = Ascii.FS;
                break;
            case "S_TEXT/SSA":
                b = Ascii.GS;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 8;
                break;
            case "S_TEXT/WEBVTT":
                b = Ascii.RS;
                break;
            case "S_TEXT/UTF8":
                b = Ascii.ESC;
                break;
            case "V_MPEG2":
                b = 3;
                break;
            case "A_EAC3":
                b = 17;
                break;
            case "A_FLAC":
                b = Ascii.SYN;
                break;
            case "A_OPUS":
                b = Ascii.FF;
                break;
            default:
                b = -1;
                break;
        }
        String str7 = "audio/raw";
        switch (b) {
            case 0:
                str7 = "video/x-vnd.on2.vp8";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null || (zzfwVarZza = zzfw.zza(new zzeu(this.zzO))) == null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str4 = zzfwVarZza.zza;
                    str3 = "video/dolby-vision";
                }
                boolean z = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i19 = (z ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue || (i16 = this.zzr) == iIntValue) {
                        f = -1.0f;
                    } else {
                        f = (this.zzo * i12) / (this.zzn * i16);
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue && this.zzB == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue && (i6 = this.zzp) == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else if (this.zzN == -1.0f) {
                        bArr = null;
                        i14 = 0;
                    } else {
                        bArr = new byte[25];
                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                        i14 = 0;
                        byteBufferOrder.put((byte) 0);
                        byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                        byteBufferOrder.putShort((short) (this.zzN + 0.5f));
                        byteBufferOrder.putShort((short) this.zzC);
                        byteBufferOrder.putShort((short) this.zzD);
                    }
                    zzh zzhVar = new zzh();
                    zzhVar.zza(i5);
                    zzhVar.zzb(i3);
                    zzhVar.zzc(i4);
                    zzhVar.zzd(bArr);
                    zzhVar.zze(i6);
                    zzhVar.zzf(i13);
                    zzi zziVarZzg = zzhVar.zzg();
                    if (this.zzb != null) {
                        int i20 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0 || Float.compare(this.zzu, 0.0f) != 0 || Float.compare(this.zzv, 0.0f) != 0) {
                        i15 = iIntValue;
                    } else if (Float.compare(this.zzw, 0.0f) == 0) {
                        i15 = i14;
                    } else if (Float.compare(this.zzw, 90.0f) == 0) {
                        i15 = 90;
                    } else if (Float.compare(this.zzw, -180.0f) == 0 || Float.compare(this.zzw, 180.0f) == 0) {
                        i15 = 180;
                    } else if (Float.compare(this.zzw, -90.0f) == 0) {
                        i15 = 270;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i21 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i19);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 1:
                byte[] bArr2 = this.zzl;
                listZzj = bArr2 == null ? null : zzgwt.zzj(bArr2);
                str7 = "video/x-vnd.on2.vp9";
                listZzk = listZzj;
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z2 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i110 = (z2 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar2 = new zzh();
                    zzhVar2.zza(i5);
                    zzhVar2.zzb(i3);
                    zzhVar2.zzc(i4);
                    zzhVar2.zzd(bArr);
                    zzhVar2.zze(i6);
                    zzhVar2.zzf(i13);
                    zzi zziVarZzg2 = zzhVar2.zzg();
                    if (this.zzb != null) {
                        int i22 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg2);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i23 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i110);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 2:
                byte[] bArr3 = this.zzl;
                str7 = "video/av01";
                if (bArr3 == null) {
                    iZzC = -1;
                    i6 = -1;
                    i7 = -1;
                    i5 = -1;
                    i4 = -1;
                    i3 = -1;
                    i2 = -1;
                    str = null;
                    listZzk = null;
                } else {
                    listZzj = zzgwt.zzj(bArr3);
                    zzafe zzafeVarZza = zzafe.zza(this.zzl);
                    if (zzafeVarZza == null) {
                        listZzk = listZzj;
                        iZzC = -1;
                        i6 = -1;
                        i7 = -1;
                        i5 = -1;
                        i4 = -1;
                        i3 = -1;
                        i2 = -1;
                        str = null;
                    } else {
                        String str8 = zzafeVarZza.zze;
                        i2 = zzafeVarZza.zza;
                        i3 = zzafeVarZza.zzc;
                        i4 = zzafeVarZza.zzd;
                        i5 = zzafeVarZza.zzb;
                        listZzk = listZzj;
                        str = str8;
                        i6 = i2;
                        iZzC = -1;
                        i7 = -1;
                    }
                }
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z3 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i111 = (z3 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar3 = new zzh();
                    zzhVar3.zza(i5);
                    zzhVar3.zzb(i3);
                    zzhVar3.zzc(i4);
                    zzhVar3.zzd(bArr);
                    zzhVar3.zze(i6);
                    zzhVar3.zzf(i13);
                    zzi zziVarZzg3 = zzhVar3.zzg();
                    if (this.zzb != null) {
                        int i24 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg3);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i25 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i111);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 3:
                str7 = "video/mpeg2";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z4 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i112 = (z4 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar4 = new zzh();
                    zzhVar4.zza(i5);
                    zzhVar4.zzb(i3);
                    zzhVar4.zzc(i4);
                    zzhVar4.zzd(bArr);
                    zzhVar4.zze(i6);
                    zzhVar4.zzf(i13);
                    zzi zziVarZzg4 = zzhVar4.zzg();
                    if (this.zzb != null) {
                        int i26 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg4);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i27 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i112);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.zzl;
                listZzj = bArr4 == null ? null : Collections.singletonList(bArr4);
                str7 = "video/mp4v-es";
                listZzk = listZzj;
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z5 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i113 = (z5 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar5 = new zzh();
                    zzhVar5.zza(i5);
                    zzhVar5.zzb(i3);
                    zzhVar5.zzc(i4);
                    zzhVar5.zzd(bArr);
                    zzhVar5.zze(i6);
                    zzhVar5.zzf(i13);
                    zzi zziVarZzg5 = zzhVar5.zzg();
                    if (this.zzb != null) {
                        int i28 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg5);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i29 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i113);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 7:
                zzaff zzaffVarZza = zzaff.zza(new zzeu(zzi(this.zzc)));
                list = zzaffVarZza.zza;
                this.zzab = zzaffVarZza.zzb;
                str2 = zzaffVarZza.zzl;
                i5 = zzaffVarZza.zzg;
                i4 = zzaffVarZza.zzi;
                i3 = zzaffVarZza.zzh;
                i8 = zzaffVarZza.zze;
                i9 = zzaffVarZza.zzf;
                str7 = "video/avc";
                listZzk = list;
                str = str2;
                i6 = i8;
                i7 = -1;
                i2 = i9;
                iZzC = -1;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z6 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i114 = (z6 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar6 = new zzh();
                    zzhVar6.zza(i5);
                    zzhVar6.zzb(i3);
                    zzhVar6.zzc(i4);
                    zzhVar6.zzd(bArr);
                    zzhVar6.zze(i6);
                    zzhVar6.zzf(i13);
                    zzi zziVarZzg6 = zzhVar6.zzg();
                    if (this.zzb != null) {
                        int i210 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg6);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i211 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i114);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 8:
                zzagu zzaguVarZza = zzagu.zza(new zzeu(zzi(this.zzc)));
                list = zzaguVarZza.zza;
                this.zzab = zzaguVarZza.zzb;
                str2 = zzaguVarZza.zzn;
                i5 = zzaguVarZza.zzh;
                i4 = zzaguVarZza.zzj;
                i3 = zzaguVarZza.zzi;
                i8 = zzaguVarZza.zzf;
                i9 = zzaguVarZza.zzg;
                str7 = "video/hevc";
                listZzk = list;
                str = str2;
                i6 = i8;
                i7 = -1;
                i2 = i9;
                iZzC = -1;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z7 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i115 = (z7 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar7 = new zzh();
                    zzhVar7.zza(i5);
                    zzhVar7.zzb(i3);
                    zzhVar7.zzc(i4);
                    zzhVar7.zzd(bArr);
                    zzhVar7.zze(i6);
                    zzhVar7.zzf(i13);
                    zzi zziVarZzg7 = zzhVar7.zzg();
                    if (this.zzb != null) {
                        int i212 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg7);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i213 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i115);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 9:
                Pair pairZzf = zzf(new zzeu(zzi(this.zzc)));
                str7 = (String) pairZzf.first;
                listZzj = (List) pairZzf.second;
                listZzk = listZzj;
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z8 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i116 = (z8 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar8 = new zzh();
                    zzhVar8.zza(i5);
                    zzhVar8.zzb(i3);
                    zzhVar8.zzc(i4);
                    zzhVar8.zzd(bArr);
                    zzhVar8.zze(i6);
                    zzhVar8.zzf(i13);
                    zzi zziVarZzg8 = zzhVar8.zzg();
                    if (this.zzb != null) {
                        int i214 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg8);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i215 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i116);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 10:
                str7 = "video/x-unknown";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z9 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i117 = (z9 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar9 = new zzh();
                    zzhVar9.zza(i5);
                    zzhVar9.zzb(i3);
                    zzhVar9.zzc(i4);
                    zzhVar9.zzd(bArr);
                    zzhVar9.zze(i6);
                    zzhVar9.zzf(i13);
                    zzi zziVarZzg9 = zzhVar9.zzg();
                    if (this.zzb != null) {
                        int i216 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg9);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i217 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i117);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 11:
                listZzg = zzg(zzi(str6));
                i10 = 8192;
                str7 = "audio/vorbis";
                listZzk = listZzg;
                i7 = i10;
                iZzC = -1;
                i6 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z10 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i118 = (z10 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar10 = new zzh();
                    zzhVar10.zza(i5);
                    zzhVar10.zzb(i3);
                    zzhVar10.zzc(i4);
                    zzhVar10.zzd(bArr);
                    zzhVar10.zze(i6);
                    zzhVar10.zzf(i13);
                    zzi zziVarZzg10 = zzhVar10.zzg();
                    if (this.zzb != null) {
                        int i218 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg10);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i219 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i118);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 12:
                listZzg = new ArrayList(3);
                listZzg.add(zzi(this.zzc));
                listZzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzT).array());
                listZzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzU).array());
                i10 = 5760;
                str7 = "audio/opus";
                listZzk = listZzg;
                i7 = i10;
                iZzC = -1;
                i6 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z11 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i119 = (z11 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar11 = new zzh();
                    zzhVar11.zza(i5);
                    zzhVar11.zzb(i3);
                    zzhVar11.zzc(i4);
                    zzhVar11.zzd(bArr);
                    zzhVar11.zze(i6);
                    zzhVar11.zzf(i13);
                    zzi zziVarZzg11 = zzhVar11.zzg();
                    if (this.zzb != null) {
                        int i2110 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg11);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i2111 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i119);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 13:
                List listSingletonList = Collections.singletonList(zzi(str6));
                zzaex zzaexVarZza = zzaey.zza(this.zzl);
                this.zzS = zzaexVarZza.zza;
                this.zzP = zzaexVarZza.zzb;
                str7 = "audio/mp4a-latm";
                listZzk = listSingletonList;
                str = zzaexVarZza.zzc;
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z12 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i1110 = (z12 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar12 = new zzh();
                    zzhVar12.zza(i5);
                    zzhVar12.zzb(i3);
                    zzhVar12.zzc(i4);
                    zzhVar12.zzd(bArr);
                    zzhVar12.zze(i6);
                    zzhVar12.zzf(i13);
                    zzi zziVarZzg12 = zzhVar12.zzg();
                    if (this.zzb != null) {
                        int i2112 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg12);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i2113 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i1110);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 14:
                str7 = "audio/mpeg-L2";
                i7 = 4096;
                iZzC = -1;
                i6 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z13 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i1111 = (z13 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar13 = new zzh();
                    zzhVar13.zza(i5);
                    zzhVar13.zzb(i3);
                    zzhVar13.zzc(i4);
                    zzhVar13.zzd(bArr);
                    zzhVar13.zze(i6);
                    zzhVar13.zzf(i13);
                    zzi zziVarZzg13 = zzhVar13.zzg();
                    if (this.zzb != null) {
                        int i2114 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg13);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i2115 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i1111);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 15:
                str7 = "audio/mpeg";
                i7 = 4096;
                iZzC = -1;
                i6 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z14 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i1112 = (z14 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar14 = new zzh();
                    zzhVar14.zza(i5);
                    zzhVar14.zzb(i3);
                    zzhVar14.zzc(i4);
                    zzhVar14.zzd(bArr);
                    zzhVar14.zze(i6);
                    zzhVar14.zzf(i13);
                    zzi zziVarZzg14 = zzhVar14.zzg();
                    if (this.zzb != null) {
                        int i2116 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg14);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i2117 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i1112);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 16:
                str7 = "audio/ac3";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z15 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i1113 = (z15 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar15 = new zzh();
                    zzhVar15.zza(i5);
                    zzhVar15.zzb(i3);
                    zzhVar15.zzc(i4);
                    zzhVar15.zzd(bArr);
                    zzhVar15.zze(i6);
                    zzhVar15.zzf(i13);
                    zzi zziVarZzg15 = zzhVar15.zzg();
                    if (this.zzb != null) {
                        int i2118 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg15);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i2119 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i1113);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 17:
                str7 = "audio/eac3";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z16 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i1114 = (z16 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar16 = new zzh();
                    zzhVar16.zza(i5);
                    zzhVar16.zzb(i3);
                    zzhVar16.zzc(i4);
                    zzhVar16.zzd(bArr);
                    zzhVar16.zze(i6);
                    zzhVar16.zzf(i13);
                    zzi zziVarZzg16 = zzhVar16.zzg();
                    if (this.zzb != null) {
                        int i21110 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg16);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i21111 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i1114);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 18:
                this.zzV = new zzahn();
                str7 = "audio/true-hd";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z17 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i1115 = (z17 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar17 = new zzh();
                    zzhVar17.zza(i5);
                    zzhVar17.zzb(i3);
                    zzhVar17.zzc(i4);
                    zzhVar17.zzd(bArr);
                    zzhVar17.zze(i6);
                    zzhVar17.zzf(i13);
                    zzi zziVarZzg17 = zzhVar17.zzg();
                    if (this.zzb != null) {
                        int i21112 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg17);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i21113 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i1115);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 19:
            case 20:
                this.zzW = true;
                str7 = "audio/vnd.dts";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z18 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i1116 = (z18 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar18 = new zzh();
                    zzhVar18.zza(i5);
                    zzhVar18.zzb(i3);
                    zzhVar18.zzc(i4);
                    zzhVar18.zzd(bArr);
                    zzhVar18.zze(i6);
                    zzhVar18.zzf(i13);
                    zzi zziVarZzg18 = zzhVar18.zzg();
                    if (this.zzb != null) {
                        int i21114 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg18);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i21115 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i1116);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 21:
                str7 = "audio/vnd.dts.hd";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z19 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i1117 = (z19 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar19 = new zzh();
                    zzhVar19.zza(i5);
                    zzhVar19.zzb(i3);
                    zzhVar19.zzc(i4);
                    zzhVar19.zzd(bArr);
                    zzhVar19.zze(i6);
                    zzhVar19.zzf(i13);
                    zzi zziVarZzg19 = zzhVar19.zzg();
                    if (this.zzb != null) {
                        int i21116 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg19);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i21117 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i1117);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 22:
                listZzj = Collections.singletonList(zzi(str6));
                str7 = "audio/flac";
                listZzk = listZzj;
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z110 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i1118 = (z110 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar110 = new zzh();
                    zzhVar110.zza(i5);
                    zzhVar110.zzb(i3);
                    zzhVar110.zzc(i4);
                    zzhVar110.zzd(bArr);
                    zzhVar110.zze(i6);
                    zzhVar110.zzf(i13);
                    zzi zziVarZzg110 = zzhVar110.zzg();
                    if (this.zzb != null) {
                        int i21118 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg110);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i21119 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i1118);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 23:
                if (zzh(new zzeu(zzi(this.zzc)))) {
                    iZzC = zzfm.zzC(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (iZzC == 0) {
                        int i30 = this.zzQ;
                        StringBuilder sb = new StringBuilder(String.valueOf(i30).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i30);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzeh.zzc("MatroskaExtractor", sb.toString());
                    }
                    i6 = -1;
                    i7 = -1;
                    i5 = -1;
                    i4 = -1;
                    i3 = -1;
                    i2 = -1;
                    str = null;
                    listZzk = null;
                    if (this.zzO != null) {
                        str3 = str7;
                        str4 = str;
                    } else {
                        str3 = str7;
                        str4 = str;
                    }
                    boolean z111 = this.zzY;
                    if (true != this.zzX) {
                        i11 = 0;
                    } else {
                        i11 = 2;
                    }
                    int i1119 = (z111 ? 1 : 0) | i11;
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                        zztVar.zzG(this.zzP);
                        zztVar.zzH(this.zzR);
                        zztVar.zzI(this.zzS);
                        zztVar.zzJ(iZzC);
                    } else if (zzas.zzb(str3)) {
                        if (this.zzs == 0) {
                            i17 = this.zzq;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.zzn;
                            }
                            this.zzq = i17;
                            i18 = this.zzr;
                            if (i18 == -1) {
                                i18 = this.zzo;
                            }
                            this.zzr = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzq;
                        if (i12 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (i5 == iIntValue) {
                            if (i4 != iIntValue) {
                                i5 = iIntValue;
                            } else if (i3 == iIntValue) {
                                i5 = this.zzz;
                                i4 = this.zzA;
                                i3 = this.zzB;
                            } else {
                                i5 = this.zzz;
                                i4 = this.zzA;
                                i3 = this.zzB;
                            }
                        }
                        if (i6 == iIntValue) {
                            i6 = 8;
                        }
                        if (i2 == iIntValue) {
                            i13 = this.zzp;
                            if (i13 == iIntValue) {
                                i13 = 8;
                            }
                        } else {
                            i13 = i2;
                        }
                        if (this.zzE != -1.0f) {
                            i14 = 0;
                            bArr = null;
                        } else {
                            i14 = 0;
                            bArr = null;
                        }
                        zzh zzhVar111 = new zzh();
                        zzhVar111.zza(i5);
                        zzhVar111.zzb(i3);
                        zzhVar111.zzc(i4);
                        zzhVar111.zzd(bArr);
                        zzhVar111.zze(i6);
                        zzhVar111.zzf(i13);
                        zzi zziVarZzg111 = zzhVar111.zzg();
                        if (this.zzb != null) {
                            int i211110 = zzakm.zza;
                            if (zzakm.zzg.containsKey(this.zzb)) {
                                iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                            }
                        }
                        if (this.zzt == 0) {
                            i15 = iIntValue;
                        } else {
                            i15 = iIntValue;
                        }
                        zztVar.zzv(this.zzn);
                        zztVar.zzw(this.zzo);
                        zztVar.zzB(f);
                        zztVar.zzA(i15);
                        zztVar.zzC(this.zzx);
                        zztVar.zzD(this.zzy);
                        zztVar.zzE(zziVarZzg111);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw zzat.zzb("Unexpected MIME type.", null);
                    }
                    if (this.zzb != null) {
                        int i211111 = zzakm.zza;
                        if (!zzakm.zzg.containsKey(this.zzb)) {
                            zztVar.zzc(this.zzb);
                        }
                    }
                    zztVar.zzb(i);
                    if (true != this.zza) {
                        str5 = "video/x-matroska";
                    } else {
                        str5 = "video/webm";
                    }
                    zztVar.zzn(str5);
                    zztVar.zzo(str3);
                    zztVar.zzp(i7);
                    zztVar.zze(this.zzad);
                    zztVar.zzf(i1119);
                    zztVar.zzr(listZzk);
                    zztVar.zzk(str4);
                    zztVar.zzs(this.zzm);
                    this.zzaa = zztVar.zzP();
                    return;
                }
                zzeh.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                str7 = "audio/x-unknown";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z112 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i11110 = (z112 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar112 = new zzh();
                    zzhVar112.zza(i5);
                    zzhVar112.zzb(i3);
                    zzhVar112.zzc(i4);
                    zzhVar112.zzd(bArr);
                    zzhVar112.zze(i6);
                    zzhVar112.zzf(i13);
                    zzi zziVarZzg112 = zzhVar112.zzg();
                    if (this.zzb != null) {
                        int i211112 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg112);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i211113 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i11110);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 24:
                iZzC = zzfm.zzC(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (iZzC == 0) {
                    int i31 = this.zzQ;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i31).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i31);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzeh.zzc("MatroskaExtractor", sb2.toString());
                    str7 = "audio/x-unknown";
                    iZzC = -1;
                }
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z113 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i11111 = (z113 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar113 = new zzh();
                    zzhVar113.zza(i5);
                    zzhVar113.zzb(i3);
                    zzhVar113.zzc(i4);
                    zzhVar113.zzd(bArr);
                    zzhVar113.zze(i6);
                    zzhVar113.zzf(i13);
                    zzi zziVarZzg113 = zzhVar113.zzg();
                    if (this.zzb != null) {
                        int i211114 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg113);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i211115 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i11111);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 25:
                iZzC = zzfm.zzC(this.zzQ, ByteOrder.BIG_ENDIAN);
                if (iZzC == 0) {
                    int i32 = this.zzQ;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i32).length() + 75);
                    sb3.append("Unsupported big endian PCM bit depth: ");
                    sb3.append(i32);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    zzeh.zzc("MatroskaExtractor", sb3.toString());
                    str7 = "audio/x-unknown";
                    iZzC = -1;
                }
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z114 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i11112 = (z114 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar114 = new zzh();
                    zzhVar114.zza(i5);
                    zzhVar114.zzb(i3);
                    zzhVar114.zzc(i4);
                    zzhVar114.zzd(bArr);
                    zzhVar114.zze(i6);
                    zzhVar114.zzf(i13);
                    zzi zziVarZzg114 = zzhVar114.zzg();
                    if (this.zzb != null) {
                        int i211116 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg114);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i211117 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i11112);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 26:
                iZzC = zzfm.zzD(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (iZzC == 0) {
                    int i33 = this.zzQ;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i33).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i33);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzeh.zzc("MatroskaExtractor", sb4.toString());
                    str7 = "audio/x-unknown";
                    iZzC = -1;
                }
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z115 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i11113 = (z115 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar115 = new zzh();
                    zzhVar115.zza(i5);
                    zzhVar115.zzb(i3);
                    zzhVar115.zzc(i4);
                    zzhVar115.zzd(bArr);
                    zzhVar115.zze(i6);
                    zzhVar115.zzf(i13);
                    zzi zziVarZzg115 = zzhVar115.zzg();
                    if (this.zzb != null) {
                        int i211118 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg115);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i211119 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i11113);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 27:
                str7 = "application/x-subrip";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z116 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i11114 = (z116 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar116 = new zzh();
                    zzhVar116.zza(i5);
                    zzhVar116.zzb(i3);
                    zzhVar116.zzc(i4);
                    zzhVar116.zzd(bArr);
                    zzhVar116.zze(i6);
                    zzhVar116.zzf(i13);
                    zzi zziVarZzg116 = zzhVar116.zzg();
                    if (this.zzb != null) {
                        int i2111110 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg116);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i2111111 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i11114);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 28:
            case 29:
                int i34 = zzakm.zza;
                listZzk = zzgwt.zzk(zzakm.zzc, zzi(this.zzc));
                str7 = "text/x-ssa";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z117 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i11115 = (z117 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar117 = new zzh();
                    zzhVar117.zza(i5);
                    zzhVar117.zzb(i3);
                    zzhVar117.zzc(i4);
                    zzhVar117.zzd(bArr);
                    zzhVar117.zze(i6);
                    zzhVar117.zzf(i13);
                    zzi zziVarZzg117 = zzhVar117.zzg();
                    if (this.zzb != null) {
                        int i2111112 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg117);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i2111113 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i11115);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 30:
                str7 = "text/vtt";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z118 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i11116 = (z118 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar118 = new zzh();
                    zzhVar118.zza(i5);
                    zzhVar118.zzb(i3);
                    zzhVar118.zzc(i4);
                    zzhVar118.zzd(bArr);
                    zzhVar118.zze(i6);
                    zzhVar118.zzf(i13);
                    zzi zziVarZzg118 = zzhVar118.zzg();
                    if (this.zzb != null) {
                        int i2111114 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg118);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i2111115 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i11116);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 31:
                listZzk = zzgwt.zzj(zzi(str6));
                str7 = "application/vobsub";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z119 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i11117 = (z119 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar119 = new zzh();
                    zzhVar119.zza(i5);
                    zzhVar119.zzb(i3);
                    zzhVar119.zzc(i4);
                    zzhVar119.zzd(bArr);
                    zzhVar119.zze(i6);
                    zzhVar119.zzf(i13);
                    zzi zziVarZzg119 = zzhVar119.zzg();
                    if (this.zzb != null) {
                        int i2111116 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg119);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i2111117 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i11117);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 32:
                str7 = "application/pgs";
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                listZzk = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z1110 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i11118 = (z1110 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1110 = new zzh();
                    zzhVar1110.zza(i5);
                    zzhVar1110.zzb(i3);
                    zzhVar1110.zzc(i4);
                    zzhVar1110.zzd(bArr);
                    zzhVar1110.zze(i6);
                    zzhVar1110.zzf(i13);
                    zzi zziVarZzg1110 = zzhVar1110.zzg();
                    if (this.zzb != null) {
                        int i2111118 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg1110);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i2111119 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i11118);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            case 33:
                byte[] bArr5 = new byte[4];
                System.arraycopy(zzi(str6), 0, bArr5, 0, 4);
                listZzj = zzgwt.zzj(bArr5);
                str7 = "application/dvbsubs";
                listZzk = listZzj;
                iZzC = -1;
                i6 = -1;
                i7 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                    str3 = str7;
                    str4 = str;
                } else {
                    str3 = str7;
                    str4 = str;
                }
                boolean z1111 = this.zzY;
                if (true != this.zzX) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                int i11119 = (z1111 ? 1 : 0) | i11;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(this.zzS);
                    zztVar.zzJ(iZzC);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        i17 = this.zzq;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                        i18 = this.zzr;
                        if (i18 == -1) {
                            i18 = this.zzo;
                        }
                        this.zzr = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzq;
                    if (i12 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (i5 == iIntValue) {
                        if (i4 != iIntValue) {
                            i5 = iIntValue;
                        } else if (i3 == iIntValue) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        }
                    }
                    if (i6 == iIntValue) {
                        i6 = 8;
                    }
                    if (i2 == iIntValue) {
                        i13 = this.zzp;
                        if (i13 == iIntValue) {
                            i13 = 8;
                        }
                    } else {
                        i13 = i2;
                    }
                    if (this.zzE != -1.0f) {
                        i14 = 0;
                        bArr = null;
                    } else {
                        i14 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1111 = new zzh();
                    zzhVar1111.zza(i5);
                    zzhVar1111.zzb(i3);
                    zzhVar1111.zzc(i4);
                    zzhVar1111.zzd(bArr);
                    zzhVar1111.zze(i6);
                    zzhVar1111.zzf(i13);
                    zzi zziVarZzg1111 = zzhVar1111.zzg();
                    if (this.zzb != null) {
                        int i21111110 = zzakm.zza;
                        if (zzakm.zzg.containsKey(this.zzb)) {
                            iIntValue = ((Integer) zzakm.zzg.get(this.zzb)).intValue();
                        }
                    }
                    if (this.zzt == 0) {
                        i15 = iIntValue;
                    } else {
                        i15 = iIntValue;
                    }
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzB(f);
                    zztVar.zzA(i15);
                    zztVar.zzC(this.zzx);
                    zztVar.zzD(this.zzy);
                    zztVar.zzE(zziVarZzg1111);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i21111111 = zzakm.zza;
                    if (!zzakm.zzg.containsKey(this.zzb)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                if (true != this.zza) {
                    str5 = "video/x-matroska";
                } else {
                    str5 = "video/webm";
                }
                zztVar.zzn(str5);
                zztVar.zzo(str3);
                zztVar.zzp(i7);
                zztVar.zze(this.zzad);
                zztVar.zzf(i11119);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzP();
                return;
            default:
                throw zzat.zzb("Unrecognized codec identifier.", null);
        }
    }

    final /* synthetic */ void zzb() {
        this.zzZ.getClass();
    }

    final /* synthetic */ int zzc() {
        return this.zzac;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzac = i;
    }

    final /* synthetic */ void zze(String str) {
        this.zzad = str;
    }
}
