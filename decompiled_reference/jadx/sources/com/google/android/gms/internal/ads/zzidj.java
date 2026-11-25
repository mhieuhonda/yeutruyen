package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzidj extends zzidi {
    private final byte[] zzb;

    zzidj(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzc(int i, int i2) {
        byte[] bArr = this.zzb;
        int iZzD = zzD(i, i2, bArr.length);
        return iZzD == 0 ? zzidl.zza : new zzidf(bArr, i, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzd(int i, int i2) {
        byte[] bArr = this.zzb;
        int iZzD = zzD(i, i2, bArr.length);
        return iZzD == 0 ? zzidl.zza : new zzidf(bArr, i, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    final void zzg(zzidc zzidcVar) throws IOException {
        byte[] bArr = this.zzb;
        zzidcVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzi() {
        return zzihp.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final boolean zzj(zzidl zzidlVar) {
        if (zzidlVar instanceof zzidj) {
            return Arrays.equals(this.zzb, ((zzidj) zzidlVar).zzb);
        }
        return zzidlVar instanceof zzidf ? zzk(zzidlVar, 0, this.zzb.length) : zzidlVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidi
    final boolean zzk(zzidl zzidlVar, int i, int i2) {
        if (i2 > zzidlVar.zzb()) {
            byte[] bArr = this.zzb;
            int length = String.valueOf(i2).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 <= zzidlVar.zzb()) {
            if (zzidlVar instanceof zzidj) {
                return zzidl.zzE(this.zzb, 0, ((zzidj) zzidlVar).zzb, i, i2);
            }
            if (!(zzidlVar instanceof zzidf)) {
                return zzidlVar.zzd(i, i3).equals(zzd(0, i2));
            }
            zzidf zzidfVar = (zzidf) zzidlVar;
            return zzidl.zzE(this.zzb, 0, zzidfVar.zzn(), zzidfVar.zzo() + i, i2);
        }
        int iZzb = zzidlVar.zzb();
        int length3 = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iZzb).length());
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(iZzb);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final int zzl(int i, int i2, int i3) {
        return zzifc.zzc(i, this.zzb, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidp zzm() {
        byte[] bArr = this.zzb;
        return zzidp.zzI(bArr, 0, bArr.length, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
