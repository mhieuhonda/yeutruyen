package com.google.android.gms.internal.ads;

import android.R;
import com.google.android.gms.internal.ads.zzict;
import com.google.android.gms.internal.ads.zzicu;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzict<MessageType extends zzicu<MessageType, BuilderType>, BuilderType extends zzict<MessageType, BuilderType>> implements zzify {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 16 + String.valueOf(str).length() + 44);
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    protected static zzihc zzaR(zzifz zzifzVar) {
        return new zzihc(zzifzVar);
    }

    @Deprecated
    protected static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    protected static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        iterable.getClass();
        if (!(iterable instanceof zzifk)) {
            if (iterable instanceof zzigi) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzifk) iterable).zza();
        zzifk zzifkVar = (zzifk) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                int size2 = zzifkVar.size() - size;
                StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                sb.append("Element at index ");
                sb.append(size2);
                sb.append(" is null.");
                String string = sb.toString();
                int size3 = zzifkVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(string);
                    }
                    zzifkVar.remove(size3);
                }
            } else if (obj instanceof zzidl) {
                zzifkVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                zzidl.zzt(bArr, 0, bArr.length);
                zzifkVar.zzb();
            } else {
                zzifkVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzigk) {
                ((zzigk) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            R.anim animVar = (Object) list2.get(i);
            if (animVar == null) {
                zzc(list, size2);
            }
            list.add(animVar);
        }
    }

    private static void zzc(List<?> list, int i) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    @Override // 
    public abstract BuilderType zzbf();

    /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zzidp zzidpVar) throws IOException {
        int i = zzidz.zzb;
        int i2 = zzicy.zza;
        return (BuilderType) zzbd(zzidpVar, zzidz.zza);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zzidp zzidpVar, zzidz zzidzVar) throws IOException;

    public BuilderType zzaF(zzidl zzidlVar) throws zzifh {
        try {
            zzidp zzidpVarZzm = zzidlVar.zzm();
            zzbe(zzidpVarZzm);
            zzidpVarZzm.zzb(0);
            return this;
        } catch (zzifh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    public BuilderType zzaG(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        try {
            zzidp zzidpVarZzm = zzidlVar.zzm();
            zzbd(zzidpVarZzm, zzidzVar);
            zzidpVarZzm.zzb(0);
            return this;
        } catch (zzifh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzifh {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzifh {
        try {
            zzidp zzidpVarZzI = zzidp.zzI(bArr, i, i2, false);
            zzbe(zzidpVarZzI);
            zzidpVarZzI.zzb(0);
            return this;
        } catch (zzifh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzidz zzidzVar) throws zzifh {
        return (BuilderType) zzaX(bArr, 0, bArr.length, zzidzVar);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i, int i2, zzidz zzidzVar) throws zzifh {
        try {
            zzidp zzidpVarZzI = zzidp.zzI(bArr, i, i2, false);
            zzbd(zzidpVarZzI, zzidzVar);
            zzidpVarZzI.zzb(0);
            return this;
        } catch (zzifh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zzidp zzidpVarZzH = zzidp.zzH(inputStream, 4096);
        zzbe(zzidpVarZzH);
        zzidpVarZzH.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzidz zzidzVar) throws IOException {
        zzidp zzidpVarZzH = zzidp.zzH(inputStream, 4096);
        zzbd(zzidpVarZzH, zzidzVar);
        zzidpVarZzH.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzidz zzidzVar) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        zzaM(new zzics(inputStream, zzidp.zzO(i, inputStream)), zzidzVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i = zzidz.zzb;
        int i2 = zzicy.zza;
        return zzaN(inputStream, zzidz.zza);
    }

    /* JADX INFO: renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzifz zzifzVar) {
        if (zzbw().getClass().isInstance(zzifzVar)) {
            return (BuilderType) zzaQ((zzicu) zzifzVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzify zzaV(InputStream inputStream, zzidz zzidzVar) throws IOException {
        zzaM(inputStream, zzidzVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzify zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzify zzbb(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        zzaG(zzidlVar, zzidzVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzify zzbc(zzidl zzidlVar) throws zzifh {
        zzaF(zzidlVar);
        return this;
    }
}
