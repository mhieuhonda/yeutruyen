package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzick extends Writer {
    private final Appendable zza;
    private final zzicj zzb = new zzicj(null);

    zzick(Appendable appendable) {
        this.zza = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.zza.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        this.zza.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        Objects.requireNonNull(str);
        this.zza.append(str, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        this.zza.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        zzicj zzicjVar = this.zzb;
        zzicjVar.zza(cArr);
        this.zza.append(zzicjVar, i, i2 + i);
    }
}
