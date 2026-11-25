package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzict;
import com.google.android.gms.internal.ads.zzicu;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzicu<MessageType extends zzicu<MessageType, BuilderType>, BuilderType extends zzict<MessageType, BuilderType>> implements zzifz {
    protected transient int zzq = 0;

    protected static void zzaV(zzidl zzidlVar) throws IllegalArgumentException {
        if (!zzidlVar.zzi()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    protected static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzict.zzaT(iterable, list);
    }

    private String zzdV(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 18 + String.valueOf(str).length() + 44);
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    public zzidl zzaM() {
        try {
            int iZzbr = zzbr();
            zzidl zzidlVar = zzidl.zza;
            byte[] bArr = new byte[iZzbr];
            int i = zzidu.zzb;
            zzidr zzidrVar = new zzidr(bArr, 0, iZzbr);
            zzcX(zzidrVar);
            return zzidh.zza(zzidrVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdV("ByteString"), e);
        }
    }

    public byte[] zzaN() {
        try {
            int iZzbr = zzbr();
            byte[] bArr = new byte[iZzbr];
            int i = zzidu.zzb;
            zzidr zzidrVar = new zzidr(bArr, 0, iZzbr);
            zzcX(zzidrVar);
            zzidrVar.zzI();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdV("byte array"), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    public void zzaO(OutputStream outputStream) throws IOException {
        zzidt zzidtVar = new zzidt(outputStream, zzidu.zzE(zzbr()));
        zzcX(zzidtVar);
        zzidtVar.zzx();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int iZzbr = zzbr();
        zzidt zzidtVar = new zzidt(outputStream, zzidu.zzE(zzidu.zzF(iZzbr) + iZzbr));
        zzidtVar.zzr(iZzbr);
        zzcX(zzidtVar);
        zzidtVar.zzx();
    }

    int zzaQ() {
        throw new UnsupportedOperationException();
    }

    void zzaR(int i) {
        throw new UnsupportedOperationException();
    }

    public zzige zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    int zzaT(zzigr zzigrVar) {
        return zzaQ();
    }

    zzihc zzaU() {
        return new zzihc(this);
    }
}
