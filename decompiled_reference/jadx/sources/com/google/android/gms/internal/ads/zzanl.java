package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzanl implements zzanq {
    @Override // com.google.android.gms.internal.ads.zzanq
    public final boolean zza(zzv zzvVar) {
        String str = zzvVar.zzp;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzanq
    public final int zzb(zzv zzvVar) {
        String str = zzvVar.zzp;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return 2;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return 2;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return 2;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return 1;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return 2;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return 1;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return 2;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return 1;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return 1;
                    }
                    break;
            }
        }
        String.valueOf(str);
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzanq
    public final zzans zzc(zzv zzvVar) {
        String str = zzvVar.zzp;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return new zzaoe(zzvVar.zzs);
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new zzaog();
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new zzapa();
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new zzapk();
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new zzaox(zzvVar.zzs);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new zzaoi(zzvVar.zzs);
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return new zzaoz(zzvVar.zzs);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new zzaom();
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new zzaos();
                    }
                    break;
            }
        }
        String.valueOf(str);
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }
}
