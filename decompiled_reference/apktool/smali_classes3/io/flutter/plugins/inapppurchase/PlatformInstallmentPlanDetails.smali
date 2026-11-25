.class public final Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u0014\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;",
        "",
        "commitmentPaymentsCount",
        "",
        "subsequentCommitmentPaymentsCount",
        "<init>",
        "(JJ)V",
        "getCommitmentPaymentsCount",
        "()J",
        "getSubsequentCommitmentPaymentsCount",
        "toList",
        "",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "component1",
        "component2",
        "copy",
        "toString",
        "",
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
.field public static final Companion:Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails$Companion;


# instance fields
.field private final commitmentPaymentsCount:J

.field private final subsequentCommitmentPaymentsCount:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->Companion:Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails$Companion;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 1449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1450
    iput-wide p1, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->commitmentPaymentsCount:J

    .line 1451
    iput-wide p3, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:J

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;JJILjava/lang/Object;)Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->commitmentPaymentsCount:J

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    iget-wide p3, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->copy(JJ)Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->commitmentPaymentsCount:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:J

    return-wide v0
.end method

.method public final copy(JJ)Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;
    .locals 1

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;-><init>(JJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 1470
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    .line 1476
    :cond_1
    check-cast p1, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;

    .line 1477
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    .line 1478
    iget-wide v3, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->commitmentPaymentsCount:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p1, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->commitmentPaymentsCount:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 1477
    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1479
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    .line 1480
    iget-wide v3, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p1, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 1479
    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getCommitmentPaymentsCount()J
    .locals 2

    .line 1450
    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->commitmentPaymentsCount:J

    return-wide v0
.end method

.method public final getSubsequentCommitmentPaymentsCount()J
    .locals 2

    .line 1451
    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    .line 1484
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 1485
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-wide v2, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->commitmentPaymentsCount:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1486
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-wide v2, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toList()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 1464
    new-array v0, v0, [Ljava/lang/Long;

    iget-wide v1, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->commitmentPaymentsCount:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 1465
    iget-wide v1, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 1463
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->commitmentPaymentsCount:J

    iget-wide v2, p0, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:J

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PlatformInstallmentPlanDetails(commitmentPaymentsCount="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subsequentCommitmentPaymentsCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
