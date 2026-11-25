.class public interface abstract Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi;
.super Ljava/lang/Object;
.source "Messages.g.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000cH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000fH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fH&J,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00052\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fH&\u00a8\u0006\u0016\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi;",
        "",
        "remove",
        "",
        "key",
        "",
        "setBool",
        "value",
        "setString",
        "setInt",
        "",
        "setDouble",
        "",
        "setEncodedStringList",
        "setDeprecatedStringList",
        "",
        "clear",
        "prefix",
        "allowList",
        "getAll",
        "",
        "Companion",
        "shared_preferences_android_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi$Companion;->$$INSTANCE:Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi$Companion;

    sput-object v0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi;->Companion:Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi$Companion;

    return-void
.end method


# virtual methods
.method public abstract clear(Ljava/lang/String;Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract getAll(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract remove(Ljava/lang/String;)Z
.end method

.method public abstract setBool(Ljava/lang/String;Z)Z
.end method

.method public abstract setDeprecatedStringList(Ljava/lang/String;Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract setDouble(Ljava/lang/String;D)Z
.end method

.method public abstract setEncodedStringList(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public abstract setInt(Ljava/lang/String;J)Z
.end method

.method public abstract setString(Ljava/lang/String;Ljava/lang/String;)Z
.end method
