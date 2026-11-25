package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zziej;
import com.google.android.gms.internal.ads.zziep;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zziej<MessageType extends zziep<MessageType, BuilderType>, BuilderType extends zziej<MessageType, BuilderType>> extends zzict<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zziej(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbg();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzigj.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzict
    /* JADX INFO: renamed from: zzaE */
    public /* bridge */ /* synthetic */ zzict zzbd(zzidp zzidpVar, zzidz zzidzVar) throws IOException {
        zzbr(zzidpVar, zzidzVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzict
    /* JADX INFO: renamed from: zzaI */
    public /* bridge */ /* synthetic */ zzict zzaZ(byte[] bArr, int i, int i2) throws zzifh {
        zzbq(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzict
    /* JADX INFO: renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzict zzaX(byte[] bArr, int i, int i2, zzidz zzidzVar) throws zzifh {
        zzbp(bArr, i, i2, zzidzVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzict
    protected /* bridge */ /* synthetic */ zzict zzaQ(zzicu zzicuVar) {
        zzbn((zziep) zzicuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzict
    public /* bridge */ /* synthetic */ zzify zzaX(byte[] bArr, int i, int i2, zzidz zzidzVar) throws zzifh {
        zzbp(bArr, i, i2, zzidzVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzict
    public /* bridge */ /* synthetic */ zzify zzaZ(byte[] bArr, int i, int i2) throws zzifh {
        zzbq(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzict
    public /* bridge */ /* synthetic */ zzify zzbd(zzidp zzidpVar, zzidz zzidzVar) throws IOException {
        zzbr(zzidpVar, zzidzVar);
        return this;
    }

    protected final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    protected void zzbh() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zziga
    public final boolean zzbi() {
        return zziep.zzg(this.zza, false);
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzict
    /* JADX INFO: renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzcY();
        buildertype.zza = (MessageType) zzbt();
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzify
    /* JADX INFO: renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        boolean zZzaX = this.zza.zzaX();
        MessageType messagetype = this.zza;
        if (!zZzaX) {
            return messagetype;
        }
        messagetype.zzbm();
        return this.zza;
    }

    /* JADX INFO: renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbu() {
        MessageType messagetype = (MessageType) zzbt();
        if (messagetype.zzbi()) {
            return messagetype;
        }
        throw zzaR(messagetype);
    }

    protected BuilderType zzbn(MessageType messagetype) {
        zzbo(messagetype);
        return this;
    }

    public BuilderType zzbo(MessageType messagetype) {
        if (zzbw().equals(messagetype)) {
            return this;
        }
        zzbg();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbp(byte[] bArr, int i, int i2, zzidz zzidzVar) throws zzifh {
        zzbg();
        try {
            zzigj.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i, i + i2, new zzicz(zzidzVar));
            return this;
        } catch (zzifh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbq(byte[] bArr, int i, int i2) throws zzifh {
        int i3 = zzidz.zzb;
        int i4 = zzicy.zza;
        zzbp(bArr, i, i2, zzidz.zza);
        return this;
    }

    public BuilderType zzbr(zzidp zzidpVar, zzidz zzidzVar) throws IOException {
        zzbg();
        try {
            zzigj.zza().zzb(this.zza.getClass()).zzg(this.zza, zzidq.zza(zzidpVar), zzidzVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziga
    /* JADX INFO: renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzify zzbv() {
        zzbj();
        return this;
    }
}
