package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgug {
    private final zzgtf zza;
    private final boolean zzb;
    private final zzguf zzc;

    private zzgug(zzguf zzgufVar) {
        this(zzgufVar, false, zzgtd.zza, Integer.MAX_VALUE);
    }

    private zzgug(zzguf zzgufVar, boolean z, zzgtf zzgtfVar, int i) {
        this.zzc = zzgufVar;
        this.zzb = z;
        this.zza = zzgtfVar;
    }

    public static zzgug zza(final zzgtf zzgtfVar) {
        return new zzgug(new zzguf() { // from class: com.google.android.gms.internal.ads.zzgud
            @Override // com.google.android.gms.internal.ads.zzguf
            public final /* synthetic */ Iterator zza(zzgug zzgugVar, CharSequence charSequence) {
                return new zzgtx(zzgugVar, charSequence, zzgtfVar);
            }
        });
    }

    public static zzgug zzb(Pattern pattern) {
        final zzgtk zzgtkVar = new zzgtk(pattern);
        zzgtr.zzf(!((zzgtj) zzgtkVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzgtkVar);
        return new zzgug(new zzguf() { // from class: com.google.android.gms.internal.ads.zzgub
            @Override // com.google.android.gms.internal.ads.zzguf
            public final /* synthetic */ Iterator zza(zzgug zzgugVar, CharSequence charSequence) {
                return new zzgty(zzgugVar, charSequence, zzgtkVar.zza(charSequence));
            }
        });
    }

    public static zzgug zzc(int i) {
        final int i2 = 4000;
        return new zzgug(new zzguf(i2) { // from class: com.google.android.gms.internal.ads.zzguc
            @Override // com.google.android.gms.internal.ads.zzguf
            public final /* synthetic */ Iterator zza(zzgug zzgugVar, CharSequence charSequence) {
                return new zzgtz(zzgugVar, charSequence, 4000);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final Iterator zzh(CharSequence charSequence) {
        return this.zzc.zza(this, charSequence);
    }

    public final zzgug zzd() {
        return new zzgug(this.zzc, true, this.zza, Integer.MAX_VALUE);
    }

    public final zzgug zze(zzgtf zzgtfVar) {
        zzgtfVar.getClass();
        return new zzgug(this.zzc, this.zzb, zzgtfVar, Integer.MAX_VALUE);
    }

    final /* synthetic */ zzgtf zzi() {
        return this.zza;
    }

    final /* synthetic */ boolean zzj() {
        return this.zzb;
    }

    public final Iterable zzf(CharSequence charSequence) {
        charSequence.getClass();
        return new zzgua(this, charSequence);
    }

    public final List zzg(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZzh = zzh(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzh.hasNext()) {
            arrayList.add((String) itZzh.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
