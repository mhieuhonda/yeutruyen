package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzavr implements zzawl {
    public static final /* synthetic */ zzavr zza;
    public static final /* synthetic */ zzavr zzb;
    public static final /* synthetic */ zzavr zzc;
    public static final /* synthetic */ zzavr zzd;
    public static final /* synthetic */ zzavr zze;
    public static final /* synthetic */ zzavr zzf;
    public static final /* synthetic */ zzavr zzg;
    public static final /* synthetic */ zzavr zzh;
    public static final /* synthetic */ zzavr zzi;
    public static final /* synthetic */ zzavr zzj;
    public static final /* synthetic */ zzavr zzk;
    public static final /* synthetic */ zzavr zzl;
    public static final /* synthetic */ zzavr zzm;
    public static final /* synthetic */ zzavr zzn;
    public static final /* synthetic */ zzavr zzo;
    public static final /* synthetic */ zzavr zzp;
    public static final /* synthetic */ zzavr zzq;
    public static final /* synthetic */ zzavr zzr;
    public static final /* synthetic */ zzavr zzs;
    public static final /* synthetic */ zzavr zzt;
    public static final /* synthetic */ zzavr zzu;
    private final /* synthetic */ int zzv;

    static {
        int i = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i2 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i3 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i4 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i5 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i6 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i7 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        zzu = new zzavr((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        zzt = new zzavr((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        zzs = new zzavr((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        zzr = new zzavr(i7);
        zzq = new zzavr(i4);
        zzp = new zzavr(i5);
        zzavr zzavrVar = new zzavr(i6);
        int i8 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i9 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i10 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i11 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i12 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i13 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i14 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i15 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i16 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        zzo = zzavrVar;
        zzn = new zzavr(i3);
        zzm = new zzavr(i8);
        zzl = new zzavr(i9);
        zzk = new zzavr(i10);
        zzj = new zzavr(i2);
        zzi = new zzavr(i11);
        zzh = new zzavr(i12);
        zzg = new zzavr(i13);
        zzf = new zzavr(i);
        zze = new zzavr(i14);
        zzd = new zzavr(i15);
        zzc = new zzavr(i16);
        zzb = new zzavr(1);
        zza = new zzavr(0);
    }

    private /* synthetic */ zzavr(int i) {
        this.zzv = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzavd zzavdVar;
        zzavd zzavdVar2;
        long j = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.zzv) {
                                            case 0:
                                                zzawo zzawoVar = (zzawo) obj;
                                                zzawk zzawkVar = zzawoVar.zzb;
                                                long jZzm = zzawkVar.zzc().zzm();
                                                if (zzawkVar.zzc().zzm() != 0) {
                                                    zzawoVar.zzd.zza(jZzm);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    zzawk zzawkVar2 = ((zzawo) obj).zzb;
                                                    long jZzm2 = zzawkVar2.zzc().zzm();
                                                    zzawt zzawtVarZzc = zzawkVar2.zzc();
                                                    zzawt zzawtVarZzc2 = zzawkVar2.zzc();
                                                    List listZzo = zzawtVarZzc2.zzo();
                                                    if (jZzm2 < 0) {
                                                        jZzm2 += (long) (listZzo.size() + 1);
                                                    }
                                                    if (jZzm2 < 0 || jZzm2 >= listZzo.size() + 1) {
                                                        throw new zzawr();
                                                    }
                                                    listZzo.add((int) jZzm2, zzawtVarZzc);
                                                    zzawkVar2.zzb(zzawtVarZzc2);
                                                    return Optional.empty();
                                                } catch (zzawr unused) {
                                                    zzavdVar = zzavd.zzI;
                                                }
                                                break;
                                            case 2:
                                                zzawo zzawoVar2 = (zzawo) obj;
                                                zzawk zzawkVar3 = zzawoVar2.zzb;
                                                long jZzm3 = zzawkVar3.zzc().zzm();
                                                if (zzawkVar3.zzc().zzm() == 0) {
                                                    zzawoVar2.zzd.zza(jZzm3);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                zzawk zzawkVar4 = ((zzawo) obj).zzb;
                                                zzawkVar4.zzb(zzawt.zzb(zzawkVar4.zzc().zzo().size()));
                                                return Optional.empty();
                                            case 4:
                                                zzawk zzawkVar5 = ((zzawo) obj).zzb;
                                                zzawkVar5.zzb(zzawt.zzb(zzawkVar5.zzc().zzn().zza.length));
                                                return Optional.empty();
                                            case 5:
                                                zzawk zzawkVar6 = ((zzawo) obj).zzb;
                                                zzawkVar6.zzb(zzawt.zzc(Math.log(zzawkVar6.zzc().zzq())));
                                                return Optional.empty();
                                            case 6:
                                                zzawk zzawkVar7 = ((zzawo) obj).zzb;
                                                long jZzm4 = zzawkVar7.zzc().zzm();
                                                long jZzm5 = zzawkVar7.zzc().zzm();
                                                if (jZzm4 == 0 || jZzm5 == 0) {
                                                    j = 0;
                                                }
                                                zzawkVar7.zzb(zzawt.zzb(j));
                                                return Optional.empty();
                                            case 7:
                                                zzawk zzawkVar8 = ((zzawo) obj).zzb;
                                                if (zzawkVar8.zzc().zzm() != 0) {
                                                    j = 0;
                                                }
                                                zzawkVar8.zzb(zzawt.zzb(j));
                                                return Optional.empty();
                                            case 8:
                                                zzawk zzawkVar9 = ((zzawo) obj).zzb;
                                                long jZzm6 = zzawkVar9.zzc().zzm();
                                                long jZzm7 = zzawkVar9.zzc().zzm();
                                                if (jZzm6 == 0 && jZzm7 == 0) {
                                                    j = 0;
                                                }
                                                zzawkVar9.zzb(zzawt.zzb(j));
                                                return Optional.empty();
                                            case 9:
                                                zzawo zzawoVar3 = (zzawo) obj;
                                                zzawk zzawkVar10 = zzawoVar3.zzb;
                                                try {
                                                    int iCompare = new zzawp(false).compare(zzawkVar10.zzc(), zzawkVar10.zzc());
                                                    zzawk zzawkVar11 = zzawoVar3.zzb;
                                                    if (iCompare >= 0) {
                                                        j = 0;
                                                    }
                                                    zzawkVar11.zzb(zzawt.zzb(j));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(zzavd.zzd);
                                                }
                                            case 10:
                                                int[] iArr = {1944216249, 348137722, 926438168, 13122018, 1882968836, -1273372307, 246144337, 1723705710, 1677157265};
                                                int i = iArr[0];
                                                int i2 = iArr[1];
                                                int i3 = iArr[2];
                                                int i4 = iArr[3];
                                                int i5 = iArr[4];
                                                int i6 = iArr[5];
                                                int i7 = iArr[6];
                                                int i8 = iArr[7];
                                                int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
                                                int i10 = i8 % 1677157265;
                                                zzawo zzawoVar4 = (zzawo) obj;
                                                try {
                                                    zzawk zzawkVar12 = zzawoVar4.zzb;
                                                    long jZzm8 = zzawkVar12.zzc().zzm();
                                                    zzavj zzavjVar = zzawoVar4.zza;
                                                    zzawk zzawkVar13 = new zzawk(i10 ^ i9);
                                                    for (int i11 = 0; i11 < zzawkVar12.zzb; i11++) {
                                                        try {
                                                            zzawkVar13.zzb(zzawt.zzj((zzawt) zzawkVar12.zza.get(i11)));
                                                        } catch (zzawj e) {
                                                            throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e);
                                                        }
                                                    }
                                                    zzawc zzawcVar = zzawoVar4.zzd;
                                                    new zzawo(zzavjVar, zzawkVar13, new zzawc(zzawcVar.zzb, zzawcVar.zza, zzawcVar.zzc.zzc(), zzawcVar.zzd)).zzd.zza(jZzm8);
                                                    zzawkVar12.zzb(zzawt.zza(new zzavt()));
                                                    return Optional.empty();
                                                } catch (zzawa | zzawb unused3) {
                                                    zzavdVar = zzavd.zzt;
                                                }
                                                break;
                                            case 11:
                                                try {
                                                    zzawk zzawkVar14 = ((zzawo) obj).zzb;
                                                    zzawkVar14.zzb(zzawt.zza(zzawkVar14.zzc().zzi((Class) zzawkVar14.zzc().zzl())));
                                                    return Optional.empty();
                                                } catch (zzawq unused4) {
                                                    zzavdVar = zzavd.zzp;
                                                }
                                                break;
                                            case 12:
                                                zzawk zzawkVar15 = ((zzawo) obj).zzb;
                                                long jZzm9 = zzawkVar15.zzc().zzm();
                                                long jZzm10 = zzawkVar15.zzc().zzm();
                                                if (jZzm9 == 0) {
                                                    return Optional.of(zzavd.zzF);
                                                }
                                                zzawkVar15.zzb(zzawt.zzb(jZzm10 % jZzm9));
                                                return Optional.empty();
                                            case 13:
                                                zzawk zzawkVar16 = ((zzawo) obj).zzb;
                                                zzawkVar16.zzb(zzawt.zzc(zzawkVar16.zzc().zzq() * zzawkVar16.zzc().zzq()));
                                                return Optional.empty();
                                            case 14:
                                                zzawk zzawkVar17 = ((zzawo) obj).zzb;
                                                zzawkVar17.zzb(zzawt.zzb(zzawkVar17.zzc().zzm() * zzawkVar17.zzc().zzm()));
                                                return Optional.empty();
                                            case 15:
                                                zzawk zzawkVar18 = ((zzawo) obj).zzb;
                                                long jZzm11 = zzawkVar18.zzc().zzm();
                                                ArrayList arrayList = new ArrayList();
                                                for (long j2 = 0; j2 < jZzm11; j2++) {
                                                    arrayList.add(zzawkVar18.zzc());
                                                }
                                                Collections.reverse(arrayList);
                                                zzawkVar18.zzb(zzawt.zze(arrayList));
                                                return Optional.empty();
                                            case 16:
                                                zzawk zzawkVar19 = ((zzawo) obj).zzb;
                                                zzawkVar19.zzb(zzawt.zzc(Math.pow(zzawkVar19.zzc().zzq(), zzawkVar19.zzc().zzq())));
                                                return Optional.empty();
                                            case 17:
                                                ((zzawo) obj).zzb.zzb(zzawt.zza(null));
                                                return Optional.empty();
                                            case 18:
                                                zzawo zzawoVar5 = (zzawo) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(zzawoVar5.zzd.zzf((((((~1201162069L) & 403189074) | 1043752718) + ((1201162069 & 95979632) | 900760100)) - 1766798336) ^ (507611410 % 329370448)).zza());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                zzawoVar5.zzb.zzb(zzawt.zzc(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                zzawo zzawoVar6 = (zzawo) obj;
                                                zzawoVar6.zzb.zzb(zzawt.zzb(zzawoVar6.zzd.zze()));
                                                return Optional.empty();
                                            default:
                                                long j3 = ((((~346030096L) & 203234088) | 575197286) + ((346030096 & 2352425736L) | 2745332883L)) - 1505840317;
                                                long j4 = 1246101662 % 372004513;
                                                long j5 = ((((~1810821955L) & 1747262537) | 563863662) + ((1810821955 & 1295301633) | 94020008)) - 1690999106;
                                                long j6 = 1675644664 % 749217043;
                                                zzawo zzawoVar7 = (zzawo) obj;
                                                zzawc zzawcVar2 = zzawoVar7.zzd;
                                                long jZze = zzawcVar2.zze();
                                                if (jZze < 0 || jZze > (j3 ^ j4)) {
                                                    zzavdVar2 = zzavd.zzz;
                                                } else {
                                                    if (((j5 ^ j6) & jZze) == 0) {
                                                        zzawoVar7.zzb.zzb(zzawt.zzd(zzawcVar2.zzf(jZze)));
                                                        return Optional.empty();
                                                    }
                                                    zzavdVar2 = zzavd.zze;
                                                }
                                                return Optional.of(zzavdVar2);
                                        }
                                    } catch (zzawj unused5) {
                                        zzavdVar = zzavd.zza;
                                    }
                                } catch (zzawq unused6) {
                                    zzavdVar = zzavd.zzy;
                                }
                            } catch (zzawi unused7) {
                                zzavdVar = zzavd.zzx;
                            }
                        } catch (zzavz unused8) {
                            zzavdVar = zzavd.zzD;
                        }
                    } catch (zzawj e2) {
                        e = e2;
                        throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (zzawa e3) {
                    e = e3;
                    throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zzawb unused9) {
                zzavdVar = zzavd.zzz;
            }
        } catch (zzawa | zzawb unused10) {
            zzavdVar = zzavd.zzi;
        }
        return Optional.of(zzavdVar);
    }
}
