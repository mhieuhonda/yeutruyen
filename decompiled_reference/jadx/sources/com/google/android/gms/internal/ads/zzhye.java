package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhye implements zzhev {
    static final zzhlv zza;
    static final zzhlv zzb;
    static final zzhlv zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zziad zzi;
    private final byte[] zzj;
    private final byte[] zzk;

    @Nullable
    private final Provider zzl;

    static {
        zzhlu zzhluVarZza = zzhlv.zza();
        zzhluVarZza.zza(zziat.SHA256, zzhvc.zza);
        zzhluVarZza.zza(zziat.SHA384, zzhvc.zzb);
        zzhluVarZza.zza(zziat.SHA512, zzhvc.zzc);
        zza = zzhluVarZza.zzb();
        zzhlu zzhluVarZza2 = zzhlv.zza();
        zzhluVarZza2.zza(zziad.IEEE_P1363, zzhvd.zza);
        zzhluVarZza2.zza(zziad.DER, zzhvd.zzb);
        zzb = zzhluVarZza2.zzb();
        zzhlu zzhluVarZza3 = zzhlv.zza();
        zzhluVarZza3.zza(zziac.NIST_P256, zzhvb.zza);
        zzhluVarZza3.zza(zziac.NIST_P384, zzhvb.zzb);
        zzhluVarZza3.zza(zziac.NIST_P521, zzhvb.zzc);
        zzc = zzhluVarZza3.zzb();
    }

    private zzhye(ECPublicKey eCPublicKey, zziat zziatVar, zziad zziadVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhle.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.zzh = zzibh.zza(zziatVar);
        this.zzg = eCPublicKey;
        this.zzi = zziadVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static zzhev zzb(zzhvj zzhvjVar, @Nullable Provider provider) throws GeneralSecurityException {
        return new zzhye((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zziak.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhvjVar.zzd(), zziae.zzb((zziac) zzc.zzb(zzhvjVar.zzf().zzd())))), (zziat) zza.zzb(zzhvjVar.zzf().zze()), (zziad) zzb.zzb(zzhvjVar.zzf().zzc()), zzhvjVar.zze().zzc(), zzhvjVar.zzf().zzf().equals(zzhve.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[RETURN] */
    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        byte b2;
        String str;
        Provider provider;
        Signature signature;
        byte[] bArr3;
        if (this.zzi == zziad.IEEE_P1363) {
            EllipticCurve curve = this.zzg.getParams().getCurve();
            int length = bArr.length;
            int iBitLength = (zzhlt.zzc(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != iBitLength + iBitLength) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = zziae.zza(bArr);
        }
        int length2 = bArr.length;
        if (length2 >= 8 && bArr[0] == 48) {
            int i7 = bArr[1] & 255;
            if (i7 == 129) {
                i7 = bArr[2] & 255;
                if (i7 >= 128) {
                    i = 2;
                    if (i7 == (length2 - 1) - i && bArr[i + 1] == 2 && (i5 = (i4 = (i3 = i + 3) + (i2 = bArr[i + 2] & 255)) + 1) < length2 && i2 != 0) {
                        b = bArr[i3];
                        if ((b & 255) < 128 && ((i2 <= 1 || b != 0 || (bArr[i + 4] & 255) >= 128) && bArr[i4] == 2)) {
                            i6 = bArr[i5] & 255;
                            if (i4 + 2 + i6 == length2 && i6 != 0) {
                                b2 = bArr[i + 5 + i2];
                                if ((b2 & 255) < 128 && (i6 <= 1 || b2 != 0 || (bArr[i + 6 + i2] & 255) >= 128)) {
                                    str = this.zzh;
                                    provider = this.zzl;
                                    if (provider != null) {
                                        signature = Signature.getInstance(str, provider);
                                    } else {
                                        signature = (Signature) zziak.zzc.zzb(str);
                                    }
                                    signature.initVerify(this.zzg);
                                    signature.update(bArr2);
                                    bArr3 = this.zzk;
                                    if (bArr3.length > 0) {
                                        signature.update(bArr3);
                                    }
                                    try {
                                        if (signature.verify(bArr)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i7 != 128 && i7 <= 129) {
                i = 1;
                if (i7 == (length2 - 1) - i) {
                    b = bArr[i3];
                    if ((b & 255) < 128) {
                        i6 = bArr[i5] & 255;
                        if (i4 + 2 + i6 == length2) {
                            b2 = bArr[i + 5 + i2];
                            if ((b2 & 255) < 128) {
                                str = this.zzh;
                                provider = this.zzl;
                                if (provider != null) {
                                    signature = Signature.getInstance(str, provider);
                                } else {
                                    signature = (Signature) zziak.zzc.zzb(str);
                                }
                                signature.initVerify(this.zzg);
                                signature.update(bArr2);
                                bArr3 = this.zzk;
                                if (bArr3.length > 0) {
                                    signature.update(bArr3);
                                }
                                if (signature.verify(bArr)) {
                                    return;
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhok.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
