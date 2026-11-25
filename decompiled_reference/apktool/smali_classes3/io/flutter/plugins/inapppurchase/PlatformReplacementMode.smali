.class public final enum Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;
.super Ljava/lang/Enum;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/PlatformReplacementMode$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;",
        "",
        "raw",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getRaw",
        "()I",
        "UNKNOWN_REPLACEMENT_MODE",
        "WITH_TIME_PRORATION",
        "CHARGE_PRORATED_PRICE",
        "WITHOUT_PRORATION",
        "DEFERRED",
        "CHARGE_FULL_PRICE",
        "Companion",
        "in_app_purchase_android_release"
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

.field public static final enum CHARGE_FULL_PRICE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

.field public static final enum CHARGE_PRORATED_PRICE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

.field public static final Companion:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode$Companion;

.field public static final enum DEFERRED:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

.field public static final enum UNKNOWN_REPLACEMENT_MODE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

.field public static final enum WITHOUT_PRORATION:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

.field public static final enum WITH_TIME_PRORATION:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;


# instance fields
.field private final raw:I


# direct methods
.method private static final synthetic $values()[Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;
    .locals 6

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->UNKNOWN_REPLACEMENT_MODE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    sget-object v1, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->WITH_TIME_PRORATION:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    sget-object v2, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->CHARGE_PRORATED_PRICE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    sget-object v3, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->WITHOUT_PRORATION:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    sget-object v4, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->DEFERRED:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    sget-object v5, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->CHARGE_FULL_PRICE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    filled-new-array/range {v0 .. v5}, [Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 248
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    const-string v1, "UNKNOWN_REPLACEMENT_MODE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->UNKNOWN_REPLACEMENT_MODE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    .line 249
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    const-string v1, "WITH_TIME_PRORATION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->WITH_TIME_PRORATION:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    .line 250
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    const-string v1, "CHARGE_PRORATED_PRICE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->CHARGE_PRORATED_PRICE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    .line 251
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    const-string v1, "WITHOUT_PRORATION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->WITHOUT_PRORATION:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    .line 252
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    const-string v1, "DEFERRED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->DEFERRED:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    .line 253
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    const-string v1, "CHARGE_FULL_PRICE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->CHARGE_FULL_PRICE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    invoke-static {}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->$values()[Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->$VALUES:[Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->Companion:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 247
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->raw:I

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;
    .locals 1

    const-class v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;
    .locals 1

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->$VALUES:[Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    return-object v0
.end method


# virtual methods
.method public final getRaw()I
    .locals 1

    .line 247
    iget v0, p0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->raw:I

    return v0
.end method
