.class public final Lcom/google/android/gms/internal/ads/zzdxe;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@25.3.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdzt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzdzt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdxe;->zza:Lcom/google/android/gms/internal/ads/zzdzt;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzgbe;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgbe;->zzj()Z

    move-result v0

    .line 24
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdxe;->zza:Lcom/google/android/gms/internal/ads/zzdzt;

    .line 1
    const-string v2, "aq_time_away"

    const-string v3, "aq_ad_bounce_cnt"

    const-string v4, "aq_ad_duration"

    const-string v5, "gqi"

    const-string v6, "action"

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdzt;->zza()Lcom/google/android/gms/internal/ads/zzdzs;

    move-result-object v0

    const-string v1, "aq_ad_closed"

    .line 15
    invoke-virtual {v0, v6, v1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgbe;->zza()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgbe;->zzb()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-virtual {v0, v4, v1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgbe;->zzc()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 21
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgbe;->zzg()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-virtual {v0, v2, p1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 23
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdzs;->zze()Lcom/google/android/gms/ads/internal/util/client/zzt;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/ads/internal/util/client/zzt;->zza:Lcom/google/android/gms/ads/internal/util/client/zzt;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzt;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 2
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdzt;->zza()Lcom/google/android/gms/internal/ads/zzdzs;

    move-result-object v0

    const-string v1, "aq_ad_kill"

    .line 3
    invoke-virtual {v0, v6, v1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgbe;->zza()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgbe;->zzb()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v4, v1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgbe;->zzc()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgbe;->zzg()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgbe;->zze()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v1, "aq_is_os_kill"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdzs;->zze()Lcom/google/android/gms/ads/internal/util/client/zzt;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/ads/internal/util/client/zzt;->zza:Lcom/google/android/gms/ads/internal/util/client/zzt;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzt;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
