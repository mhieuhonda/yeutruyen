.class public final enum Lio/flutter/plugins/imagepicker/SourceCamera;
.super Ljava/lang/Enum;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/SourceCamera$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/imagepicker/SourceCamera;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/SourceCamera;",
        "",
        "raw",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getRaw",
        "()I",
        "REAR",
        "FRONT",
        "Companion",
        "image_picker_android_release"
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

.field private static final synthetic $VALUES:[Lio/flutter/plugins/imagepicker/SourceCamera;

.field public static final Companion:Lio/flutter/plugins/imagepicker/SourceCamera$Companion;

.field public static final enum FRONT:Lio/flutter/plugins/imagepicker/SourceCamera;

.field public static final enum REAR:Lio/flutter/plugins/imagepicker/SourceCamera;


# instance fields
.field private final raw:I


# direct methods
.method private static final synthetic $values()[Lio/flutter/plugins/imagepicker/SourceCamera;
    .locals 2

    sget-object v0, Lio/flutter/plugins/imagepicker/SourceCamera;->REAR:Lio/flutter/plugins/imagepicker/SourceCamera;

    sget-object v1, Lio/flutter/plugins/imagepicker/SourceCamera;->FRONT:Lio/flutter/plugins/imagepicker/SourceCamera;

    filled-new-array {v0, v1}, [Lio/flutter/plugins/imagepicker/SourceCamera;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 194
    new-instance v0, Lio/flutter/plugins/imagepicker/SourceCamera;

    const-string v1, "REAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/imagepicker/SourceCamera;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/imagepicker/SourceCamera;->REAR:Lio/flutter/plugins/imagepicker/SourceCamera;

    .line 195
    new-instance v0, Lio/flutter/plugins/imagepicker/SourceCamera;

    const-string v1, "FRONT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/imagepicker/SourceCamera;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/imagepicker/SourceCamera;->FRONT:Lio/flutter/plugins/imagepicker/SourceCamera;

    invoke-static {}, Lio/flutter/plugins/imagepicker/SourceCamera;->$values()[Lio/flutter/plugins/imagepicker/SourceCamera;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/imagepicker/SourceCamera;->$VALUES:[Lio/flutter/plugins/imagepicker/SourceCamera;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/imagepicker/SourceCamera;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lio/flutter/plugins/imagepicker/SourceCamera$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/imagepicker/SourceCamera$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/imagepicker/SourceCamera;->Companion:Lio/flutter/plugins/imagepicker/SourceCamera$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 193
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/flutter/plugins/imagepicker/SourceCamera;->raw:I

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lio/flutter/plugins/imagepicker/SourceCamera;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/flutter/plugins/imagepicker/SourceCamera;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/imagepicker/SourceCamera;
    .locals 1

    const-class v0, Lio/flutter/plugins/imagepicker/SourceCamera;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/imagepicker/SourceCamera;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/imagepicker/SourceCamera;
    .locals 1

    sget-object v0, Lio/flutter/plugins/imagepicker/SourceCamera;->$VALUES:[Lio/flutter/plugins/imagepicker/SourceCamera;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/imagepicker/SourceCamera;

    return-object v0
.end method


# virtual methods
.method public final getRaw()I
    .locals 1

    .line 193
    iget v0, p0, Lio/flutter/plugins/imagepicker/SourceCamera;->raw:I

    return v0
.end method
