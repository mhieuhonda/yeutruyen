package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzidf extends zzidi {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzidf(byte[] bArr, int i, int i2) {
        super(null);
        zzD(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    final byte zza(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzc(int i, int i2) {
        int iZzD = zzD(i, i2, this.zzd);
        return iZzD == 0 ? zzidl.zza : new zzidf(this.zzb, this.zzc + i, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzd(int i, int i2) {
        int iZzD = zzD(i, i2, this.zzd);
        return iZzD == 0 ? zzidl.zza : new zzidf(this.zzb, this.zzc + i, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, this.zzc + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    final void zzg(zzidc zzidcVar) throws IOException {
        zzidcVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        return zzihp.zzb(bArr, i, this.zzd + i);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final boolean zzj(zzidl zzidlVar) {
        return ((zzidlVar instanceof zzidj) || (zzidlVar instanceof zzidf)) ? zzk(zzidlVar, 0, this.zzd) : zzidlVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidi
    final boolean zzk(zzidl zzidlVar, int i, int i2) {
        if (i2 > zzidlVar.zzb()) {
            int i3 = this.zzd;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(i3).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = i + i2;
        if (i4 <= zzidlVar.zzb()) {
            if (zzidlVar instanceof zzidj) {
                return zzidl.zzE(this.zzb, this.zzc, ((zzidj) zzidlVar).zzn(), i, i2);
            }
            if (zzidlVar instanceof zzidf) {
                zzidf zzidfVar = (zzidf) zzidlVar;
                return zzidl.zzE(this.zzb, this.zzc, zzidfVar.zzb, zzidfVar.zzc + i, i2);
            }
            zzidl zzidlVarZzd = zzidlVar.zzd(i, i4);
            int i5 = this.zzc;
            return zzidlVarZzd.equals(zzd(i5, i2 + i5));
        }
        int iZzb = zzidlVar.zzb();
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iZzb).length());
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
        return zzifc.zzc(i, this.zzb, this.zzc + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidp zzm() {
        return zzidp.zzI(this.zzb, this.zzc, this.zzd, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    final /* synthetic */ int zzo() {
        return this.zzc;
    }
}
