package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzimk implements Iterator, Closeable, zzaux {
    private static final zzauw zza = new zzimj("eof ");
    protected zzaut zzb;
    protected zziml zzc;
    zzauw zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzimr.zzb(zzimk.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzauw zzauwVar = this.zzd;
        if (zzauwVar == zza) {
            return false;
        }
        if (zzauwVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            List list = this.zzg;
            if (i >= list.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzauw) list.get(i)).toString());
            i++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzimq(this.zzg, this);
    }

    public final void zzd(zziml zzimlVar, long j, zzaut zzautVar) throws IOException {
        this.zzc = zzimlVar;
        this.zze = zzimlVar.zzc();
        zzimlVar.zzd(zzimlVar.zzc() + j);
        this.zzf = zzimlVar.zzc();
        this.zzb = zzautVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzauw next() {
        zzauw zzauwVarZzb;
        zzauw zzauwVar = this.zzd;
        if (zzauwVar != null && zzauwVar != zza) {
            this.zzd = null;
            return zzauwVar;
        }
        zziml zzimlVar = this.zzc;
        if (zzimlVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzimlVar) {
                this.zzc.zzd(this.zze);
                zzauwVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzauwVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }
}
