package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zziej;
import com.google.android.gms.internal.ads.zziep;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zziep<MessageType extends zziep<MessageType, BuilderType>, BuilderType extends zziej<MessageType, BuilderType>> extends zzicu<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, zziep<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzihe zzt = zzihe.zza();

    static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 43 + String.valueOf(str).length() + 2);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    static Object zzbB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static zziex zzbC() {
        return zzieq.zzd();
    }

    protected static zziex zzbD(zziex zziexVar) {
        int size = zziexVar.size();
        return zziexVar.zzh(size + size);
    }

    protected static zzifa zzbE() {
        return zzifn.zzg();
    }

    protected static zzifa zzbF(zzifa zzifaVar) {
        int size = zzifaVar.size();
        return zzifaVar.zzh(size + size);
    }

    protected static zziew zzbG() {
        return zzieg.zzd();
    }

    protected static zziew zzbH(zziew zziewVar) {
        int size = zziewVar.size();
        return zziewVar.zzh(size + size);
    }

    protected static zzies zzbI() {
        return zzidw.zzd();
    }

    protected static zzies zzbJ(zzies zziesVar) {
        int size = zziesVar.size();
        return zziesVar.zzh(size + size);
    }

    protected static zzier zzbK() {
        return zzidb.zzd();
    }

    protected static zzier zzbL(zzier zzierVar) {
        int size = zzierVar.size();
        return zzierVar.zzh(size + size);
    }

    protected static <E> zzifb<E> zzbM() {
        return zzigk.zzd();
    }

    protected static <E> zzifb<E> zzbN(zzifb<E> zzifbVar) {
        int size = zzifbVar.size();
        return zzifbVar.zzh(size + size);
    }

    static <T extends zziep<T, ?>> T zzbO(T t, zzidp zzidpVar, zzidz zzidzVar) throws zzifh {
        T t2 = (T) t.zzbg();
        try {
            zzigr zzigrVarZzb = zzigj.zza().zzb(t2.getClass());
            zzigrVarZzb.zzg(t2, zzidq.zza(zzidpVar), zzidzVar);
            zzigrVarZzb.zzk(t2);
            return t2;
        } catch (zzifh e) {
            if (e.zzb()) {
                throw new zzifh(e);
            }
            throw e;
        } catch (zzihc e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzifh) {
                throw ((zzifh) e3.getCause());
            }
            throw new zzifh(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzifh) {
                throw ((zzifh) e4.getCause());
            }
            throw e4;
        }
    }

    protected static <T extends zziep<T, ?>> T zzbP(T t, zzidp zzidpVar) throws zzifh {
        int i = zzidz.zzb;
        int i2 = zzicy.zza;
        return (T) zzbO(t, zzidpVar, zzidz.zza);
    }

    protected static <T extends zziep<T, ?>> T zzbQ(T t, ByteBuffer byteBuffer, zzidz zzidzVar) throws zzifh {
        zzidp zzidpVarZzI;
        int i = zzidp.zze;
        if (byteBuffer.hasArray()) {
            zzidpVarZzI = zzidp.zzI(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzidpVarZzI = zzidp.zzI(bArr, 0, iRemaining, true);
        }
        T t2 = (T) zzbZ(t, zzidpVarZzI, zzidzVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zziep<T, ?>> T zzbR(T t, ByteBuffer byteBuffer) throws zzifh {
        int i = zzidz.zzb;
        int i2 = zzicy.zza;
        return (T) zzbQ(t, byteBuffer, zzidz.zza);
    }

    protected static <T extends zziep<T, ?>> T zzbS(T t, zzidl zzidlVar) throws zzifh {
        int i = zzidz.zzb;
        int i2 = zzicy.zza;
        T t2 = (T) zzbT(t, zzidlVar, zzidz.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zziep<T, ?>> T zzbT(T t, zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        T t2 = (T) zzj(t, zzidlVar, zzidzVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zziep<T, ?>> T zzbU(T t, byte[] bArr) throws zzifh {
        int length = bArr.length;
        int i = zzidz.zzb;
        int i2 = zzicy.zza;
        T t2 = (T) zzh(t, bArr, 0, length, zzidz.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zziep<T, ?>> T zzbV(T t, byte[] bArr, zzidz zzidzVar) throws zzifh {
        T t2 = (T) zzh(t, bArr, 0, bArr.length, zzidzVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zziep<T, ?>> T zzbW(T t, InputStream inputStream) throws zzifh {
        zzidp zzidpVarZzH = zzidp.zzH(inputStream, 4096);
        int i = zzidz.zzb;
        int i2 = zzicy.zza;
        T t2 = (T) zzbO(t, zzidpVarZzH, zzidz.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zziep<T, ?>> T zzbX(T t, InputStream inputStream, zzidz zzidzVar) throws zzifh {
        T t2 = (T) zzbO(t, zzidp.zzH(inputStream, 4096), zzidzVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zziep<T, ?>> T zzbY(T t, zzidp zzidpVar) throws zzifh {
        int i = zzidz.zzb;
        int i2 = zzicy.zza;
        return (T) zzbZ(t, zzidpVar, zzidz.zza);
    }

    protected static <T extends zziep<T, ?>> T zzbZ(T t, zzidp zzidpVar, zzidz zzidzVar) throws zzifh {
        T t2 = (T) zzbO(t, zzidpVar, zzidzVar);
        zzi(t2);
        return t2;
    }

    static <T extends zziep> T zzbt(Class<T> cls) {
        Map<Class<?>, zziep<?, ?>> map = zzd;
        zziep<?, ?> zziepVar = map.get(cls);
        if (zziepVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zziepVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zziepVar != null) {
            return zziepVar;
        }
        zziep<?, ?> zziepVarZzbw = ((zziep) zzihk.zzb(cls)).zzbw();
        if (zziepVarZzbw == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zziepVarZzbw);
        return zziepVarZzbw;
    }

    protected static <T extends zziep> void zzbu(Class<T> cls, T t) {
        t.zzaY();
        zzd.put(cls, t);
    }

    protected static Object zzbv(zzifz zzifzVar, String str, Object[] objArr) {
        return new zzigl(zzifzVar, str, objArr);
    }

    public static <ContainingType extends zzifz, Type> zzien<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzifz zzifzVar, zzieu zzieuVar, int i, zzihq zzihqVar, Class cls) {
        return new zzien<>(containingtype, type, zzifzVar, new zziem(zzieuVar, i, zzihqVar, false, false), cls);
    }

    public static <ContainingType extends zzifz, Type> zzien<ContainingType, Type> zzbz(ContainingType containingtype, zzifz zzifzVar, zzieu zzieuVar, int i, zzihq zzihqVar, boolean z, Class cls) {
        return new zzien<>(containingtype, zzigk.zzd(), zzifzVar, new zziem(zzieuVar, i, zzihqVar, true, z), cls);
    }

    private void zzc() {
        if (this.zzt == zzihe.zza()) {
            this.zzt = zzihe.zzb();
        }
    }

    protected static <T extends zziep<T, ?>> T zzca(T t, InputStream inputStream) throws zzifh {
        int i = zzidz.zzb;
        int i2 = zzicy.zza;
        T t2 = (T) zzk(t, inputStream, zzidz.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zziep<T, ?>> T zzcb(T t, InputStream inputStream, zzidz zzidzVar) throws zzifh {
        T t2 = (T) zzk(t, inputStream, zzidzVar);
        zzi(t2);
        return t2;
    }

    private int zzd(zzigr<?> zzigrVar) {
        if (zzigrVar != null) {
            return zzigrVar.zze(this);
        }
        return zzigj.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zziel<MessageType, BuilderType>, BuilderType, T> zzien<MessageType, T> zze(zzidx<MessageType, T> zzidxVar) {
        return (zzien) zzidxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zziep<T, ?>> boolean zzg(T t, boolean z) {
        byte bByteValue = ((Byte) t.zzdc(zzieo.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzigj.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdc(zzieo.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t, null);
        }
        return zZzl;
    }

    private static <T extends zziep<T, ?>> T zzh(T t, byte[] bArr, int i, int i2, zzidz zzidzVar) throws zzifh {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbg();
        try {
            zzigr zzigrVarZzb = zzigj.zza().zzb(t2.getClass());
            zzigrVarZzb.zzj(t2, bArr, i, i + i2, new zzicz(zzidzVar));
            zzigrVarZzb.zzk(t2);
            return t2;
        } catch (zzifh e) {
            if (e.zzb()) {
                throw new zzifh(e);
            }
            throw e;
        } catch (zzihc e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzifh) {
                throw ((zzifh) e3.getCause());
            }
            throw new zzifh(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zziep<T, ?>> T zzi(T t) throws zzifh {
        if (t == null || t.zzbi()) {
            return t;
        }
        throw t.zzaU().zza();
    }

    private static <T extends zziep<T, ?>> T zzj(T t, zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        zzidp zzidpVarZzm = zzidlVar.zzm();
        T t2 = (T) zzbO(t, zzidpVarZzm, zzidzVar);
        zzidpVarZzm.zzb(0);
        return t2;
    }

    private static <T extends zziep<T, ?>> T zzk(T t, InputStream inputStream, zzidz zzidzVar) throws zzifh {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            zzidp zzidpVarZzH = zzidp.zzH(new zzics(inputStream, zzidp.zzO(i, inputStream)), 4096);
            T t2 = (T) zzbO(t, zzidpVarZzH, zzidzVar);
            zzidpVarZzH.zzb(0);
            return t2;
        } catch (zzifh e) {
            if (e.zzb()) {
                throw new zzifh(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzifh(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzigj.zza().zzb(getClass()).zzb(this, (zziep) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzigb.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    final int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    void zzaR(int i) {
        if (i >= 0) {
            this.zzc = i | (this.zzc & Integer.MIN_VALUE);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    int zzaT(zzigr zzigrVar) {
        if (!zzaX()) {
            if (zzaQ() != Integer.MAX_VALUE) {
                return zzaQ();
            }
            int iZzd = zzd(zzigrVar);
            zzaR(iZzd);
            return iZzd;
        }
        int iZzd2 = zzd(zzigrVar);
        if (iZzd2 >= 0) {
            return iZzd2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzd2).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(iZzd2);
        throw new IllegalStateException(sb.toString());
    }

    final boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    final void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    final int zzaZ() {
        return this.zzq;
    }

    final void zzba(int i) {
        this.zzq = i;
    }

    final void zzbb() {
        this.zzq = 0;
    }

    final boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    public final zzigh<MessageType> zzbd() {
        return (zzigh) zzdc(zzieo.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zziga
    /* JADX INFO: renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(zzieo.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    /* JADX INFO: renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(zzieo.NEW_BUILDER, null, null);
    }

    final MessageType zzbg() {
        return (MessageType) zzdc(zzieo.NEW_MUTABLE_INSTANCE, null, null);
    }

    final int zzbh() {
        return zzigj.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zziga
    public final boolean zzbi() {
        return zzg(this, true);
    }

    protected final boolean zzbj(int i, zzidp zzidpVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i, zzidpVar);
    }

    protected final void zzbk(int i, int i2) {
        zzc();
        zzihe zziheVar = this.zzt;
        zziheVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziheVar.zzk(i << 3, Long.valueOf(i2));
    }

    protected final void zzbl(int i, zzidl zzidlVar) {
        zzc();
        zzihe zziheVar = this.zzt;
        zziheVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziheVar.zzk((i << 3) | 2, zzidlVar);
    }

    protected final void zzbm() {
        zzigj.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    protected final <MessageType2 extends zziep<MessageType2, BuilderType2>, BuilderType2 extends zziej<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(zzieo.NEW_BUILDER, null, null);
    }

    protected final <MessageType2 extends zziep<MessageType2, BuilderType2>, BuilderType2 extends zziej<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(zzieo.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    final void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    public int zzbr() {
        return zzaT(null);
    }

    final Object zzbs() throws Exception {
        return zzdc(zzieo.BUILD_MESSAGE_INFO, null, null);
    }

    protected final void zzbx(zzihe zziheVar) {
        this.zzt = zzihe.zzc(this.zzt, zziheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    public void zzcX(zzidu zziduVar) throws IOException {
        zzigj.zza().zzb(getClass()).zzf(this, zzidv.zza(zziduVar));
    }

    protected abstract Object zzdc(zzieo zzieoVar, Object obj, Object obj2);
}
