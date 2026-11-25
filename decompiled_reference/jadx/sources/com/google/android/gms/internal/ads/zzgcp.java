package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import androidx.lifecycle.CoroutineLiveDataKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcp implements zzgbf {
    private final CoroutineScope zza;
    private final zzgst zzb;
    private final Mutex zzc;
    private final Mutex zzd;
    private final Mutex zze;
    private boolean zzf;
    private zzgbd zzg;
    private boolean zzh;
    private final DataStore zzi;
    private final zzdxe zzj;

    public zzgcp(DataStore adQualityDataStore, zzgbr coroutineScopeProvider, zzdxe dataPinger, zzgbo clock) {
        Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.zzj = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = new zzgst();
        this.zzc = MutexKt.Mutex$default(false, 1, null);
        this.zzd = MutexKt.Mutex$default(false, 1, null);
        this.zze = MutexKt.Mutex$default(false, 1, null);
        this.zzi = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzA(Continuation continuation) throws Throwable {
        zzgbx zzgbxVar;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        if (continuation instanceof zzgbx) {
            zzgbxVar = (zzgbx) continuation;
            int i = zzgbxVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgbxVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzgbxVar = new zzgbx(this, continuation);
            }
        } else {
            zzgbxVar = new zzgbx(this, continuation);
        }
        Object obj = zzgbxVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgbxVar.zzd;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.zze;
                zzgbxVar.zza = mutex;
                zzgbxVar.zzd = 1;
                if (mutex.lock(null, zzgbxVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) zzgbxVar.zza;
                try {
                    ResultKt.throwOnFailure(obj);
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) zzgbxVar.zza;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            DataStore dataStore = this.zzi;
            zzgby zzgbyVar = new zzgby(null);
            zzgbxVar.zza = mutex;
            zzgbxVar.zzd = 2;
            Object objUpdateData = dataStore.updateData(zzgbyVar, zzgbxVar);
            if (objUpdateData != coroutine_suspended) {
                mutex2 = mutex;
                obj = objUpdateData;
                mutex2.unlock(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzB(long j, Continuation continuation) throws Throwable {
        zzgbw zzgbwVar;
        Mutex mutex;
        if (continuation instanceof zzgbw) {
            zzgbwVar = (zzgbw) continuation;
            int i = zzgbwVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgbwVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgbwVar = new zzgbw(this, continuation);
            }
        } else {
            zzgbwVar = new zzgbw(this, continuation);
        }
        Object obj = zzgbwVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgbwVar.zze;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.zzc;
            zzgbwVar.zzb = mutex2;
            zzgbwVar.zza = j;
            zzgbwVar.zze = 1;
            if (mutex2.lock(null, zzgbwVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zzgbwVar.zza;
            mutex = (Mutex) zzgbwVar.zzb;
            ResultKt.throwOnFailure(obj);
        }
        try {
            zzgbd zzgbdVar = this.zzg;
            if (zzgbdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgbdVar = null;
            }
            zzgbd zzgbdVar2 = this.zzg;
            if (zzgbdVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgbdVar2 = null;
            }
            long jZzi = j - zzgbdVar2.zzi();
            zzgbd zzgbdVar3 = this.zzg;
            if (zzgbdVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgbdVar3 = null;
            }
            zzgbdVar.zzb(jZzi - zzgbdVar3.zzg());
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzC(Continuation continuation) throws Throwable {
        zzgcb zzgcbVar;
        Mutex mutex;
        Mutex mutex2;
        zzgbe zzgbeVar;
        Mutex mutex3;
        if (continuation instanceof zzgcb) {
            zzgcbVar = (zzgcb) continuation;
            int i = zzgcbVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgcbVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgcbVar = new zzgcb(this, continuation);
            }
        } else {
            zzgcbVar = new zzgcb(this, continuation);
        }
        Object objUpdateData = zzgcbVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgcbVar.zze;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUpdateData);
                mutex = this.zzc;
                zzgcbVar.zza = mutex;
                zzgcbVar.zze = 1;
                if (mutex.lock(null, zzgcbVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex3 = (Mutex) zzgcbVar.zza;
                    try {
                        ResultKt.throwOnFailure(objUpdateData);
                        mutex3.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        mutex3.unlock(null);
                        throw th;
                    }
                }
                mutex2 = (Mutex) zzgcbVar.zzb;
                zzgbeVar = (zzgbe) zzgcbVar.zza;
                ResultKt.throwOnFailure(objUpdateData);
                try {
                    DataStore dataStore = this.zzi;
                    zzgcc zzgccVar = new zzgcc(zzgbeVar, null);
                    zzgcbVar.zza = mutex2;
                    zzgcbVar.zzb = null;
                    zzgcbVar.zze = 3;
                    objUpdateData = dataStore.updateData(zzgccVar, zzgcbVar);
                    if (objUpdateData != coroutine_suspended) {
                        mutex3 = mutex2;
                        mutex3.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    mutex3 = mutex2;
                    mutex3.unlock(null);
                    throw th;
                }
            }
            mutex = (Mutex) zzgcbVar.zza;
            ResultKt.throwOnFailure(objUpdateData);
            zzgbd zzgbdVar = this.zzg;
            if (zzgbdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgbdVar = null;
            }
            zzgbe zzgbeVar2 = (zzgbe) zzgbdVar.zzbu();
            mutex.unlock(null);
            Intrinsics.checkNotNull(zzgbeVar2);
            mutex2 = this.zze;
            zzgcbVar.zza = zzgbeVar2;
            zzgcbVar.zzb = mutex2;
            zzgcbVar.zze = 2;
            if (mutex2.lock(null, zzgcbVar) != coroutine_suspended) {
                zzgbeVar = zzgbeVar2;
                DataStore dataStore2 = this.zzi;
                zzgcc zzgccVar2 = new zzgcc(zzgbeVar, null);
                zzgcbVar.zza = mutex2;
                zzgcbVar.zzb = null;
                zzgcbVar.zze = 3;
                objUpdateData = dataStore2.updateData(zzgccVar2, zzgcbVar);
                if (objUpdateData != coroutine_suspended) {
                    mutex3 = mutex2;
                    mutex3.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex.unlock(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    private static final boolean zzD(zzgbe zzgbeVar) {
        boolean z;
        List listZzk = zzgbeVar.zzk();
        Long l = listZzk != null ? (Long) CollectionsKt.lastOrNull(listZzk) : null;
        boolean z2 = zzgbeVar.zzl() > zzgbeVar.zzm() && !zzgbeVar.zzd();
        if (l != null) {
            if (zzgbeVar.zzi() - l.longValue() > CoroutineLiveDataKt.DEFAULT_TIMEOUT) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z2 || z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (zzA(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgcp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzs(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzs(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzt(String str, Continuation continuation) throws Throwable {
        zzgce zzgceVar;
        String str2;
        Mutex mutex;
        long j;
        if (continuation instanceof zzgce) {
            zzgceVar = (zzgce) continuation;
            int i = zzgceVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgceVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgceVar = new zzgce(this, continuation);
            }
        } else {
            zzgceVar = new zzgce(this, continuation);
        }
        Object obj = zzgceVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgceVar.zze;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgceVar.zzf = str;
            zzgceVar.zza = mutex2;
            zzgceVar.zzb = jCurrentTimeMillis;
            zzgceVar.zze = 1;
            if (mutex2.lock(null, zzgceVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            mutex = mutex2;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zzgceVar.zzb;
            mutex = (Mutex) zzgceVar.zza;
            str2 = zzgceVar.zzf;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (this.zzf) {
                return Unit.INSTANCE;
            }
            this.zzf = true;
            zziej zziejVarZzcc = zzgbe.zzp().zzcc();
            Intrinsics.checkNotNullExpressionValue(zziejVarZzcc, "toBuilder(...)");
            zzgbd zzgbdVar = (zzgbd) zziejVarZzcc;
            this.zzg = zzgbdVar;
            if (zzgbdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgbdVar = null;
            }
            zzgbdVar.zza(str2);
            zzgbdVar.zzj(j);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:31:0x0085, B:33:0x0089, B:34:0x008f), top: B:50:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (zzC(r0) != r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzu(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.zzgca
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.zzgca r0 = (com.google.android.gms.internal.ads.zzgca) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgca r0 = new com.google.android.gms.internal.ads.zzgca
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zzc
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.zze
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.ResultKt.throwOnFailure(r11)
            goto La8
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            kotlin.ResultKt.throwOnFailure(r11)
            goto La0
        L40:
            long r5 = r0.zzb
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L85
        L4a:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L61
        L52:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.sync.Mutex r2 = r10.zzd
            r0.zza = r2
            r0.zze = r6
            java.lang.Object r11 = r2.lock(r7, r0)
            if (r11 == r1) goto Lb5
        L61:
            boolean r11 = r10.zzh     // Catch: java.lang.Throwable -> Lb0
            if (r11 == 0) goto L6b
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb0
            r2.unlock(r7)
            return r11
        L6b:
            r10.zzh = r6     // Catch: java.lang.Throwable -> Lb0
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb0
            r2.unlock(r7)
            kotlinx.coroutines.sync.Mutex r2 = r10.zzc
            long r8 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r8
            r0.zze = r5
            java.lang.Object r11 = r2.lock(r7, r0)
            if (r11 == r1) goto Lb5
            r5 = r8
        L85:
            com.google.android.gms.internal.ads.zzgbd r11 = r10.zzg     // Catch: java.lang.Throwable -> Lab
            if (r11 != 0) goto L8f
            java.lang.String r11 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)     // Catch: java.lang.Throwable -> Lab
            r11 = r7
        L8f:
            r11.zzo(r5)     // Catch: java.lang.Throwable -> Lab
            r2.unlock(r7)
            r0.zza = r7
            r0.zze = r4
            java.lang.Object r11 = r10.zzB(r5, r0)
            if (r11 != r1) goto La0
            goto Lb5
        La0:
            r0.zze = r3
            java.lang.Object r11 = r10.zzC(r0)
            if (r11 == r1) goto Lb5
        La8:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        Lab:
            r11 = move-exception
            r2.unlock(r7)
            throw r11
        Lb0:
            r11 = move-exception
            r2.unlock(r7)
            throw r11
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzu(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x007e A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010d A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzv(Continuation continuation) throws Throwable {
        zzgco zzgcoVar;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgbd zzgbdVar;
        zzgbd zzgbdVar2;
        zzgbd zzgbdVar3;
        zzgbd zzgbdVar4;
        zzgbd zzgbdVar5;
        zzgbd zzgbdVar6;
        long jLongValue;
        zzgbd zzgbdVar7;
        zzgbd zzgbdVar8;
        if (continuation instanceof zzgco) {
            zzgcoVar = (zzgco) continuation;
            int i = zzgcoVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgcoVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgcoVar = new zzgco(this, continuation);
            }
        } else {
            zzgcoVar = new zzgco(this, continuation);
        }
        Object obj = zzgcoVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgcoVar.zze;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.zzd;
                zzgcoVar.zza = mutex;
                zzgcoVar.zze = 1;
                if (mutex.lock(null, zzgcoVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                mutex = (Mutex) zzgcoVar.zza;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = zzgcoVar.zzb;
                mutex2 = (Mutex) zzgcoVar.zza;
                ResultKt.throwOnFailure(obj);
            }
            try {
                zzgbdVar = this.zzg;
                if (zzgbdVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgbdVar = null;
                }
                if (zzgbdVar.zzr() > 0) {
                    zzgbdVar6 = this.zzg;
                    if (zzgbdVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbdVar6 = null;
                    }
                    List listZzq = zzgbdVar6.zzq();
                    Intrinsics.checkNotNullExpressionValue(listZzq, "getAdClickTimestampsMsList(...)");
                    Object objLast = CollectionsKt.last((List<? extends Object>) listZzq);
                    Intrinsics.checkNotNullExpressionValue(objLast, "last(...)");
                    jLongValue = j - ((Number) objLast).longValue();
                    zzgbdVar7 = this.zzg;
                    if (zzgbdVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbdVar7 = null;
                    }
                    zzgbdVar7.zzt();
                    if (jLongValue < CoroutineLiveDataKt.DEFAULT_TIMEOUT) {
                        zzgbdVar8 = this.zzg;
                        if (zzgbdVar8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                            zzgbdVar8 = null;
                        }
                        zzgbdVar8.zzd(zzgbdVar8.zzc() + 1);
                    }
                }
                zzgbdVar2 = this.zzg;
                if (zzgbdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgbdVar2 = null;
                }
                if (zzgbdVar2.zzn() > 0) {
                    zzgbdVar4 = this.zzg;
                    if (zzgbdVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbdVar4 = null;
                    }
                    List listZzm = zzgbdVar4.zzm();
                    Intrinsics.checkNotNullExpressionValue(listZzm, "getAppBackgroundTimestampsMsList(...)");
                    Object objLast2 = CollectionsKt.last((List<? extends Object>) listZzm);
                    Intrinsics.checkNotNullExpressionValue(objLast2, "last(...)");
                    long jLongValue2 = j - ((Number) objLast2).longValue();
                    zzgbdVar5 = this.zzg;
                    if (zzgbdVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbdVar5 = null;
                    }
                    zzgbdVar5.zzh(zzgbdVar5.zzg() + jLongValue2);
                }
                zzgbdVar3 = this.zzg;
                if (zzgbdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgbdVar3 = null;
                }
                zzgbdVar3.zzp(j);
                return Unit.INSTANCE;
            } finally {
                mutex2.unlock(null);
            }
            if (!this.zzh) {
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return unit;
            }
            this.zzh = false;
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            Mutex mutex3 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgcoVar.zza = mutex3;
            zzgcoVar.zzb = jCurrentTimeMillis;
            zzgcoVar.zze = 2;
            if (mutex3.lock(null, zzgcoVar) != coroutine_suspended) {
                mutex2 = mutex3;
                j = jCurrentTimeMillis;
                zzgbdVar = this.zzg;
                if (zzgbdVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgbdVar = null;
                }
                if (zzgbdVar.zzr() > 0) {
                    zzgbdVar6 = this.zzg;
                    if (zzgbdVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbdVar6 = null;
                    }
                    List listZzq2 = zzgbdVar6.zzq();
                    Intrinsics.checkNotNullExpressionValue(listZzq2, "getAdClickTimestampsMsList(...)");
                    Object objLast3 = CollectionsKt.last((List<? extends Object>) listZzq2);
                    Intrinsics.checkNotNullExpressionValue(objLast3, "last(...)");
                    jLongValue = j - ((Number) objLast3).longValue();
                    zzgbdVar7 = this.zzg;
                    if (zzgbdVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbdVar7 = null;
                    }
                    zzgbdVar7.zzt();
                    if (jLongValue < CoroutineLiveDataKt.DEFAULT_TIMEOUT) {
                        zzgbdVar8 = this.zzg;
                        if (zzgbdVar8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                            zzgbdVar8 = null;
                        }
                        zzgbdVar8.zzd(zzgbdVar8.zzc() + 1);
                    }
                }
                zzgbdVar2 = this.zzg;
                if (zzgbdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgbdVar2 = null;
                }
                if (zzgbdVar2.zzn() > 0) {
                    zzgbdVar4 = this.zzg;
                    if (zzgbdVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbdVar4 = null;
                    }
                    List listZzm2 = zzgbdVar4.zzm();
                    Intrinsics.checkNotNullExpressionValue(listZzm2, "getAppBackgroundTimestampsMsList(...)");
                    Object objLast4 = CollectionsKt.last((List<? extends Object>) listZzm2);
                    Intrinsics.checkNotNullExpressionValue(objLast4, "last(...)");
                    long jLongValue3 = j - ((Number) objLast4).longValue();
                    zzgbdVar5 = this.zzg;
                    if (zzgbdVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbdVar5 = null;
                    }
                    zzgbdVar5.zzh(zzgbdVar5.zzg() + jLongValue3);
                }
                zzgbdVar3 = this.zzg;
                if (zzgbdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgbdVar3 = null;
                }
                zzgbdVar3.zzp(j);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (zzz(r14, r0) == r1) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzw(kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzw(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: all -> 0x0106, TRY_ENTER, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (zzz(r15, r0) == r1) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzx(kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzx(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzy(Continuation continuation) throws Throwable {
        zzgcg zzgcgVar;
        Mutex mutex;
        long j;
        if (continuation instanceof zzgcg) {
            zzgcgVar = (zzgcg) continuation;
            int i = zzgcgVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgcgVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgcgVar = new zzgcg(this, continuation);
            }
        } else {
            zzgcgVar = new zzgcg(this, continuation);
        }
        Object obj = zzgcgVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgcgVar.zze;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgcgVar.zzb = mutex2;
            zzgcgVar.zza = jCurrentTimeMillis;
            zzgcgVar.zze = 1;
            if (mutex2.lock(null, zzgcgVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zzgcgVar.zza;
            mutex = (Mutex) zzgcgVar.zzb;
            ResultKt.throwOnFailure(obj);
        }
        try {
            zzgbd zzgbdVar = this.zzg;
            if (zzgbdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgbdVar = null;
            }
            zzgbdVar.zzs(j);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzz(String str, Continuation continuation) throws Throwable {
        zzgbu zzgbuVar;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        if (continuation instanceof zzgbu) {
            zzgbuVar = (zzgbu) continuation;
            int i = zzgbuVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgbuVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgbuVar = new zzgbu(this, continuation);
            }
        } else {
            zzgbuVar = new zzgbu(this, continuation);
        }
        Object obj = zzgbuVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgbuVar.zze;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.zze;
                zzgbuVar.zza = str;
                zzgbuVar.zzb = mutex;
                zzgbuVar.zze = 1;
                if (mutex.lock(null, zzgbuVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) zzgbuVar.zza;
                try {
                    ResultKt.throwOnFailure(obj);
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) zzgbuVar.zzb;
            String str2 = (String) zzgbuVar.zza;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            str = str2;
            DataStore dataStore = this.zzi;
            zzgbv zzgbvVar = new zzgbv(str, null);
            zzgbuVar.zza = mutex;
            zzgbuVar.zzb = null;
            zzgbuVar.zze = 2;
            Object objUpdateData = dataStore.updateData(zzgbvVar, zzgbuVar);
            if (objUpdateData != coroutine_suspended) {
                Mutex mutex4 = mutex;
                obj = objUpdateData;
                mutex2 = mutex4;
                mutex2.unlock(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zza() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzgcj(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zzb(String gwsQueryId) {
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        zzgsw.zza(this.zza, this.zzb, new zzgcd(this, gwsQueryId, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zzc() {
        zzgsw.zza(this.zza, this.zzb, new zzgbz(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zzd() {
        zzgsw.zza(this.zza, this.zzb, new zzgcn(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zze() {
        zzgsw.zza(this.zza, this.zzb, new zzgch(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zzf() {
        zzgsw.zza(this.zza, this.zzb, new zzgcl(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zzg() {
        zzgsw.zza(this.zza, this.zzb, new zzgcf(this, null));
    }
}
