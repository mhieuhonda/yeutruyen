.class Lcom/tekartik/sqflite/Database;
.super Ljava/lang/Object;
.source "Database.java"


# static fields
.field static final WAL_ENABLED_BY_DEFAULT:Z = false

.field private static final WAL_ENABLED_META_NAME:Ljava/lang/String; = "com.tekartik.sqflite.wal_enabled"

.field private static walGloballyEnabled:Ljava/lang/Boolean;


# instance fields
.field final context:Landroid/content/Context;

.field private currentTransactionId:Ljava/lang/Integer;

.field final cursors:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/tekartik/sqflite/SqfliteCursor;",
            ">;"
        }
    .end annotation
.end field

.field public databaseWorkerPool:Lcom/tekartik/sqflite/DatabaseWorkerPool;

.field final id:I

.field private lastCursorId:I

.field private lastTransactionId:I

.field final logLevel:I

.field final noTransactionOperationQueue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tekartik/sqflite/operation/QueuedOperation;",
            ">;"
        }
    .end annotation
.end field

.field final path:Ljava/lang/String;

.field final singleInstance:Z

.field sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;

.field private transactionDepth:I


# direct methods
.method public static synthetic $r8$lambda$GlK_UlnvC23u32dLYejKG3EbHLo(Lcom/tekartik/sqflite/Database;Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->lambda$queryCursorNext$2(Lcom/tekartik/sqflite/operation/Operation;)V

    return-void
.end method

.method public static synthetic $r8$lambda$QYOdnxLeXSEwH_kEol4_Du-vnAg(Lcom/tekartik/sqflite/Database;)V
    .locals 0

    invoke-direct {p0}, Lcom/tekartik/sqflite/Database;->runQueuedOperations()V

    return-void
.end method

.method public static synthetic $r8$lambda$RUfQKbTFhgcoTvjKMr7dGnUan_M(Lcom/tekartik/sqflite/Database;Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->lambda$query$0(Lcom/tekartik/sqflite/operation/Operation;)V

    return-void
.end method

.method public static synthetic $r8$lambda$TKxpZloX3MB_jh4ATabXKmDqIHs(Lcom/tekartik/sqflite/Database;Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->lambda$update$5(Lcom/tekartik/sqflite/operation/Operation;)V

    return-void
.end method

.method public static synthetic $r8$lambda$g4iIvnmcoCVWrirudrOsMtP8zMM(Lcom/tekartik/sqflite/Database;Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->lambda$insert$4(Lcom/tekartik/sqflite/operation/Operation;)V

    return-void
.end method

.method public static synthetic $r8$lambda$p3jrsswxQjU6mRSinYgSYNzOLB4(Lcom/tekartik/sqflite/Database;Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->lambda$execute$3(Lcom/tekartik/sqflite/operation/Operation;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;IZI)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tekartik/sqflite/Database;->noTransactionOperationQueue:Ljava/util/List;

    .line 70
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/tekartik/sqflite/Database;->cursors:Ljava/util/Map;

    const/4 v0, 0x0

    .line 75
    iput v0, p0, Lcom/tekartik/sqflite/Database;->transactionDepth:I

    .line 77
    iput v0, p0, Lcom/tekartik/sqflite/Database;->lastTransactionId:I

    .line 81
    iput v0, p0, Lcom/tekartik/sqflite/Database;->lastCursorId:I

    .line 84
    iput-object p1, p0, Lcom/tekartik/sqflite/Database;->context:Landroid/content/Context;

    .line 85
    iput-object p2, p0, Lcom/tekartik/sqflite/Database;->path:Ljava/lang/String;

    .line 86
    iput-boolean p4, p0, Lcom/tekartik/sqflite/Database;->singleInstance:Z

    .line 87
    iput p3, p0, Lcom/tekartik/sqflite/Database;->id:I

    .line 88
    iput p5, p0, Lcom/tekartik/sqflite/Database;->logLevel:I

    return-void
.end method

.method private bindArgs(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    .line 436
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_7

    .line 437
    aget-object v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    if-nez v1, :cond_0

    .line 441
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 442
    :cond_0
    instance-of v2, v1, [B

    if-eqz v2, :cond_1

    .line 443
    check-cast v1, [B

    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteStatement;->bindBlob(I[B)V

    goto :goto_0

    .line 444
    :cond_1
    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_6

    instance-of v2, v1, Ljava/lang/Float;

    if-eqz v2, :cond_2

    goto :goto_2

    .line 446
    :cond_2
    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_3

    .line 447
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    goto :goto_0

    .line 448
    :cond_3
    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_5

    .line 449
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    const-wide/16 v1, 0x1

    goto :goto_1

    :cond_4
    const-wide/16 v1, 0x0

    :goto_1
    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    goto :goto_0

    .line 451
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_0

    .line 445
    :cond_6
    :goto_2
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindDouble(ID)V

    goto :goto_0

    :cond_7
    return-void
.end method

.method protected static checkMetaBoolean(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 3

    .line 106
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 108
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_0

    .line 109
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-wide/16 v1, 0x80

    invoke-static {v1, v2}, Landroid/content/pm/PackageManager$ApplicationInfoFlags;->of(J)Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/16 v1, 0x80

    .line 111
    invoke-static {p0, v0, v1}, Lcom/tekartik/sqflite/Database;->getApplicationInfoWithMeta32(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    .line 113
    :goto_0
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p0

    .line 119
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method protected static checkWalEnabled(Landroid/content/Context;)Z
    .locals 2

    .line 94
    const-string v0, "com.tekartik.sqflite.wal_enabled"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/tekartik/sqflite/Database;->checkMetaBoolean(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method private closeCursor(I)V
    .locals 1

    .line 401
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->cursors:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tekartik/sqflite/SqfliteCursor;

    if-eqz p1, :cond_0

    .line 403
    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->closeCursor(Lcom/tekartik/sqflite/SqfliteCursor;)V

    :cond_0
    return-void
.end method

.method private closeCursor(Lcom/tekartik/sqflite/SqfliteCursor;)V
    .locals 4

    .line 389
    :try_start_0
    iget v0, p1, Lcom/tekartik/sqflite/SqfliteCursor;->cursorId:I

    .line 390
    iget v1, p0, Lcom/tekartik/sqflite/Database;->logLevel:I

    invoke-static {v1}, Lcom/tekartik/sqflite/LogLevel;->hasVerboseLevel(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 391
    const-string v1, "Sqflite"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getThreadLogPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "closing cursor "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 393
    :cond_0
    iget-object v1, p0, Lcom/tekartik/sqflite/Database;->cursors:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    iget-object p1, p1, Lcom/tekartik/sqflite/SqfliteCursor;->cursor:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private cursorToResults(Landroid/database/Cursor;Ljava/lang/Integer;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/Cursor;",
            "Ljava/lang/Integer;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v1

    move-object v1, v0

    .line 216
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_2

    if-nez v0, :cond_1

    .line 219
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 220
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 221
    invoke-interface {p1}, Landroid/database/Cursor;->getColumnCount()I

    move-result v2

    .line 222
    invoke-interface {p1}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v4, "columns"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    const-string v3, "rows"

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    .line 225
    :cond_1
    invoke-static {p1, v2}, Lcom/tekartik/sqflite/Utils;->cursorRowToList(Landroid/database/Cursor;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p2, :cond_0

    .line 229
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lt v3, v4, :cond_0

    :cond_2
    if-nez v0, :cond_3

    .line 236
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1

    :cond_3
    return-object v0
.end method

.method static deleteDatabase(Ljava/lang/String;)V
    .locals 1

    .line 126
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/database/sqlite/SQLiteDatabase;->deleteDatabase(Ljava/io/File;)Z

    return-void
.end method

.method private doExecute(Lcom/tekartik/sqflite/operation/Operation;)Z
    .locals 1

    .line 494
    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->executeOrError(Lcom/tekartik/sqflite/operation/Operation;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    .line 497
    invoke-interface {p1, v0}, Lcom/tekartik/sqflite/operation/Operation;->success(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method private doInsert(Lcom/tekartik/sqflite/operation/Operation;)Z
    .locals 3

    .line 507
    invoke-interface {p1}, Lcom/tekartik/sqflite/operation/Operation;->getSqlCommand()Lcom/tekartik/sqflite/SqlCommand;

    move-result-object v0

    .line 508
    iget v1, p0, Lcom/tekartik/sqflite/Database;->logLevel:I

    invoke-static {v1}, Lcom/tekartik/sqflite/LogLevel;->hasSqlLevel(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 509
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getThreadLogPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Sqflite"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 513
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 515
    invoke-virtual {v0}, Lcom/tekartik/sqflite/SqlCommand;->getSql()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1

    .line 516
    invoke-virtual {v0}, Lcom/tekartik/sqflite/SqlCommand;->getSqlArguments()[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/tekartik/sqflite/Database;->bindArgs(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)V

    .line 517
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    move-result-wide v0

    .line 518
    invoke-interface {p1}, Lcom/tekartik/sqflite/operation/Operation;->getNoResult()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    .line 519
    invoke-interface {p1, v0}, Lcom/tekartik/sqflite/operation/Operation;->success(Ljava/lang/Object;)V

    goto :goto_0

    .line 521
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/tekartik/sqflite/operation/Operation;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v0

    .line 525
    invoke-virtual {p0, v0, p1}, Lcom/tekartik/sqflite/Database;->handleException(Ljava/lang/Exception;Lcom/tekartik/sqflite/operation/Operation;)V

    const/4 p1, 0x0

    return p1
.end method

.method private doQuery(Lcom/tekartik/sqflite/operation/Operation;)Z
    .locals 8

    .line 278
    const-string v0, "cursorPageSize"

    invoke-interface {p1, v0}, Lcom/tekartik/sqflite/operation/Operation;->getArgument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 281
    invoke-interface {p1}, Lcom/tekartik/sqflite/operation/Operation;->getSqlCommand()Lcom/tekartik/sqflite/SqlCommand;

    move-result-object v1

    .line 286
    iget v2, p0, Lcom/tekartik/sqflite/Database;->logLevel:I

    invoke-static {v2}, Lcom/tekartik/sqflite/LogLevel;->hasSqlLevel(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 287
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getThreadLogPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Sqflite"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v2, 0x0

    .line 292
    :try_start_0
    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    new-instance v4, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda6;

    invoke-direct {v4, v1}, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda6;-><init>(Lcom/tekartik/sqflite/SqlCommand;)V

    .line 296
    invoke-virtual {v1}, Lcom/tekartik/sqflite/SqlCommand;->getSql()Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lcom/tekartik/sqflite/Constant;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    .line 292
    invoke-virtual {v3, v4, v1, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 298
    :try_start_1
    invoke-direct {p0, v1, v0}, Lcom/tekartik/sqflite/Database;->cursorToResults(Landroid/database/Cursor;Ljava/lang/Integer;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    .line 301
    invoke-interface {v1}, Landroid/database/Cursor;->isLast()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v5

    if-nez v5, :cond_1

    .line 306
    iget v5, p0, Lcom/tekartik/sqflite/Database;->lastCursorId:I

    add-int/2addr v5, v4

    iput v5, p0, Lcom/tekartik/sqflite/Database;->lastCursorId:I

    .line 307
    const-string v6, "cursorId"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    new-instance v6, Lcom/tekartik/sqflite/SqfliteCursor;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v6, v5, v0, v1}, Lcom/tekartik/sqflite/SqfliteCursor;-><init>(IILandroid/database/Cursor;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 309
    :try_start_2
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->cursors:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v2, v6

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v2, v6

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v2, v6

    goto :goto_1

    .line 311
    :cond_1
    :goto_0
    :try_start_3
    invoke-interface {p1, v3}, Lcom/tekartik/sqflite/operation/Operation;->success(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-nez v2, :cond_2

    if-eqz v1, :cond_2

    .line 326
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    return v4

    :catch_1
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v1, v2

    goto :goto_2

    :catch_2
    move-exception v0

    move-object v1, v2

    .line 316
    :goto_1
    :try_start_4
    invoke-virtual {p0, v0, p1}, Lcom/tekartik/sqflite/Database;->handleException(Ljava/lang/Exception;Lcom/tekartik/sqflite/operation/Operation;)V

    if-eqz v2, :cond_3

    .line 319
    invoke-direct {p0, v2}, Lcom/tekartik/sqflite/Database;->closeCursor(Lcom/tekartik/sqflite/SqfliteCursor;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_3
    if-nez v2, :cond_4

    if-eqz v1, :cond_4

    .line 326
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    const/4 p1, 0x0

    return p1

    :catchall_2
    move-exception p1

    :goto_2
    if-nez v2, :cond_5

    if-eqz v1, :cond_5

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 329
    :cond_5
    throw p1
.end method

.method private doQueryCursorNext(Lcom/tekartik/sqflite/operation/Operation;)Z
    .locals 10

    const-string v0, "Cursor "

    .line 338
    const-string v1, "cursorId"

    invoke-interface {p1, v1}, Lcom/tekartik/sqflite/operation/Operation;->getArgument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 339
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v4, "cancel"

    invoke-interface {p1, v4}, Lcom/tekartik/sqflite/operation/Operation;->getArgument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v3

    .line 340
    iget v4, p0, Lcom/tekartik/sqflite/Database;->logLevel:I

    invoke-static {v4}, Lcom/tekartik/sqflite/LogLevel;->hasVerboseLevel(I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 341
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getThreadLogPrefix()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "cursor "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    if-eqz v3, :cond_0

    const-string v5, " cancel"

    goto :goto_0

    :cond_0
    const-string v5, " next"

    :goto_0
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Sqflite"

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    .line 344
    invoke-direct {p0, v2}, Lcom/tekartik/sqflite/Database;->closeCursor(I)V

    .line 345
    invoke-interface {p1, v4}, Lcom/tekartik/sqflite/operation/Operation;->success(Ljava/lang/Object;)V

    return v5

    .line 348
    :cond_2
    iget-object v3, p0, Lcom/tekartik/sqflite/Database;->cursors:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tekartik/sqflite/SqfliteCursor;

    const/4 v6, 0x0

    if-eqz v3, :cond_6

    .line 354
    :try_start_0
    iget-object v0, v3, Lcom/tekartik/sqflite/SqfliteCursor;->cursor:Landroid/database/Cursor;

    .line 356
    iget v7, v3, Lcom/tekartik/sqflite/SqfliteCursor;->pageSize:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {p0, v0, v7}, Lcom/tekartik/sqflite/Database;->cursorToResults(Landroid/database/Cursor;Ljava/lang/Integer;)Ljava/util/Map;

    move-result-object v7

    .line 359
    invoke-interface {v0}, Landroid/database/Cursor;->isLast()Z

    move-result v8

    if-nez v8, :cond_3

    invoke-interface {v0}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_3

    move v0, v5

    goto :goto_1

    :cond_3
    move v0, v6

    :goto_1
    if-eqz v0, :cond_4

    .line 363
    :try_start_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v7, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    :cond_4
    invoke-interface {p1, v7}, Lcom/tekartik/sqflite/operation/Operation;->success(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_5

    if-eqz v3, :cond_5

    .line 381
    invoke-direct {p0, v3}, Lcom/tekartik/sqflite/Database;->closeCursor(Lcom/tekartik/sqflite/SqfliteCursor;)V

    :cond_5
    return v5

    :catchall_0
    move-exception p1

    move v6, v0

    goto :goto_4

    :catch_0
    move-exception v1

    move-object v9, v1

    move v1, v0

    move-object v0, v9

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception v0

    move v1, v6

    goto :goto_2

    .line 352
    :cond_6
    :try_start_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " not found"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 370
    :goto_2
    :try_start_3
    invoke-virtual {p0, v0, p1}, Lcom/tekartik/sqflite/Database;->handleException(Ljava/lang/Exception;Lcom/tekartik/sqflite/operation/Operation;)V

    if-eqz v3, :cond_7

    .line 373
    invoke-direct {p0, v3}, Lcom/tekartik/sqflite/Database;->closeCursor(Lcom/tekartik/sqflite/SqfliteCursor;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :cond_7
    move-object v4, v3

    :goto_3
    if-nez v1, :cond_8

    if-eqz v4, :cond_8

    .line 381
    invoke-direct {p0, v4}, Lcom/tekartik/sqflite/Database;->closeCursor(Lcom/tekartik/sqflite/SqfliteCursor;)V

    :cond_8
    return v6

    :catchall_2
    move-exception p1

    move v6, v1

    :goto_4
    if-nez v6, :cond_9

    if-eqz v3, :cond_9

    invoke-direct {p0, v3}, Lcom/tekartik/sqflite/Database;->closeCursor(Lcom/tekartik/sqflite/SqfliteCursor;)V

    .line 384
    :cond_9
    throw p1
.end method

.method private doUpdate(Lcom/tekartik/sqflite/operation/Operation;)Z
    .locals 3

    .line 536
    invoke-interface {p1}, Lcom/tekartik/sqflite/operation/Operation;->getSqlCommand()Lcom/tekartik/sqflite/SqlCommand;

    move-result-object v0

    .line 537
    iget v1, p0, Lcom/tekartik/sqflite/Database;->logLevel:I

    invoke-static {v1}, Lcom/tekartik/sqflite/LogLevel;->hasSqlLevel(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 538
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getThreadLogPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Sqflite"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 542
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 544
    invoke-virtual {v0}, Lcom/tekartik/sqflite/SqlCommand;->getSql()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1

    .line 545
    invoke-virtual {v0}, Lcom/tekartik/sqflite/SqlCommand;->getSqlArguments()[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/tekartik/sqflite/Database;->bindArgs(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)V

    .line 546
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    move-result v0

    .line 547
    invoke-interface {p1}, Lcom/tekartik/sqflite/operation/Operation;->getNoResult()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    .line 548
    invoke-interface {p1, v0}, Lcom/tekartik/sqflite/operation/Operation;->success(Ljava/lang/Object;)V

    goto :goto_0

    .line 550
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/tekartik/sqflite/operation/Operation;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v0

    .line 554
    invoke-virtual {p0, v0, p1}, Lcom/tekartik/sqflite/Database;->handleException(Ljava/lang/Exception;Lcom/tekartik/sqflite/operation/Operation;)V

    const/4 p1, 0x0

    return p1
.end method

.method private executeOrError(Lcom/tekartik/sqflite/operation/Operation;)Z
    .locals 4

    .line 420
    invoke-interface {p1}, Lcom/tekartik/sqflite/operation/Operation;->getSqlCommand()Lcom/tekartik/sqflite/SqlCommand;

    move-result-object v0

    .line 421
    iget v1, p0, Lcom/tekartik/sqflite/Database;->logLevel:I

    invoke-static {v1}, Lcom/tekartik/sqflite/LogLevel;->hasSqlLevel(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 422
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getThreadLogPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Sqflite"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 424
    :cond_0
    invoke-interface {p1}, Lcom/tekartik/sqflite/operation/Operation;->getInTransactionChange()Ljava/lang/Boolean;

    move-result-object v1

    .line 426
    :try_start_0
    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-virtual {v0}, Lcom/tekartik/sqflite/SqlCommand;->getSql()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/tekartik/sqflite/SqlCommand;->getSqlArguments()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    invoke-virtual {p0, v1}, Lcom/tekartik/sqflite/Database;->enterOrLeaveInTransaction(Ljava/lang/Boolean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v0

    .line 430
    invoke-virtual {p0, v0, p1}, Lcom/tekartik/sqflite/Database;->handleException(Ljava/lang/Exception;Lcom/tekartik/sqflite/operation/Operation;)V

    const/4 p1, 0x0

    return p1
.end method

.method public static existsDatabase(Ljava/lang/String;)Z
    .locals 1

    .line 135
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method static getApplicationInfoWithMeta32(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .line 99
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$doQuery$1(Lcom/tekartik/sqflite/SqlCommand;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 0

    .line 294
    invoke-virtual {p0, p4}, Lcom/tekartik/sqflite/SqlCommand;->bindTo(Landroid/database/sqlite/SQLiteProgram;)V

    .line 295
    new-instance p0, Landroid/database/sqlite/SQLiteCursor;

    invoke-direct {p0, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    return-object p0
.end method

.method private synthetic lambda$execute$3(Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 4

    .line 465
    invoke-interface {p1}, Lcom/tekartik/sqflite/operation/Operation;->getInTransactionChange()Ljava/lang/Boolean;

    move-result-object v0

    .line 467
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lcom/tekartik/sqflite/operation/Operation;->hasNullTransactionId()Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 469
    iget v3, p0, Lcom/tekartik/sqflite/Database;->lastTransactionId:I

    add-int/2addr v3, v2

    iput v3, p0, Lcom/tekartik/sqflite/Database;->lastTransactionId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/tekartik/sqflite/Database;->currentTransactionId:Ljava/lang/Integer;

    .line 471
    :cond_1
    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->executeOrError(Lcom/tekartik/sqflite/operation/Operation;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_3

    if-eqz v1, :cond_2

    .line 474
    iput-object v3, p0, Lcom/tekartik/sqflite/Database;->currentTransactionId:Ljava/lang/Integer;

    :cond_2
    return-void

    :cond_3
    if-eqz v1, :cond_4

    .line 479
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 480
    const-string v1, "transactionId"

    iget-object v2, p0, Lcom/tekartik/sqflite/Database;->currentTransactionId:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    invoke-interface {p1, v0}, Lcom/tekartik/sqflite/operation/Operation;->success(Ljava/lang/Object;)V

    return-void

    .line 483
    :cond_4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 485
    iput-object v3, p0, Lcom/tekartik/sqflite/Database;->currentTransactionId:Ljava/lang/Integer;

    .line 487
    :cond_5
    invoke-interface {p1, v3}, Lcom/tekartik/sqflite/operation/Operation;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic lambda$insert$4(Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 0

    .line 502
    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->doInsert(Lcom/tekartik/sqflite/operation/Operation;)Z

    return-void
.end method

.method private synthetic lambda$query$0(Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 0

    .line 273
    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->doQuery(Lcom/tekartik/sqflite/operation/Operation;)Z

    return-void
.end method

.method private synthetic lambda$queryCursorNext$2(Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 0

    .line 333
    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->doQueryCursorNext(Lcom/tekartik/sqflite/operation/Operation;)Z

    return-void
.end method

.method private synthetic lambda$update$5(Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 0

    .line 531
    invoke-direct {p0, p1}, Lcom/tekartik/sqflite/Database;->doUpdate(Lcom/tekartik/sqflite/operation/Operation;)Z

    return-void
.end method

.method private runQueuedOperations()V
    .locals 2

    .line 243
    :goto_0
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->noTransactionOperationQueue:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 244
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->currentTransactionId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 247
    :cond_0
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->noTransactionOperationQueue:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tekartik/sqflite/operation/QueuedOperation;

    .line 248
    invoke-virtual {v0}, Lcom/tekartik/sqflite/operation/QueuedOperation;->run()V

    .line 249
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->noTransactionOperationQueue:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private wrapSqlOperationHandler(Lcom/tekartik/sqflite/operation/Operation;Ljava/lang/Runnable;)V
    .locals 2

    .line 254
    invoke-interface {p1}, Lcom/tekartik/sqflite/operation/Operation;->getTransactionId()Ljava/lang/Integer;

    move-result-object v0

    .line 255
    iget-object v1, p0, Lcom/tekartik/sqflite/Database;->currentTransactionId:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 257
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    if-eqz v0, :cond_3

    .line 258
    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 259
    :cond_1
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 261
    iget-object p1, p0, Lcom/tekartik/sqflite/Database;->currentTransactionId:Ljava/lang/Integer;

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/tekartik/sqflite/Database;->noTransactionOperationQueue:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 262
    iget-object p1, p0, Lcom/tekartik/sqflite/Database;->databaseWorkerPool:Lcom/tekartik/sqflite/DatabaseWorkerPool;

    new-instance p2, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda2;

    invoke-direct {p2, p0}, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda2;-><init>(Lcom/tekartik/sqflite/Database;)V

    invoke-interface {p1, p0, p2}, Lcom/tekartik/sqflite/DatabaseWorkerPool;->post(Lcom/tekartik/sqflite/Database;Ljava/lang/Runnable;)V

    :cond_2
    return-void

    .line 267
    :cond_3
    new-instance v0, Lcom/tekartik/sqflite/operation/QueuedOperation;

    invoke-direct {v0, p1, p2}, Lcom/tekartik/sqflite/operation/QueuedOperation;-><init>(Lcom/tekartik/sqflite/operation/Operation;Ljava/lang/Runnable;)V

    .line 268
    iget-object p1, p0, Lcom/tekartik/sqflite/Database;->noTransactionOperationQueue:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method batch(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 8

    .line 560
    new-instance v0, Lcom/tekartik/sqflite/operation/MethodCallOperation;

    invoke-direct {v0, p1, p2}, Lcom/tekartik/sqflite/operation/MethodCallOperation;-><init>(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 562
    invoke-virtual {v0}, Lcom/tekartik/sqflite/operation/MethodCallOperation;->getNoResult()Z

    move-result p1

    .line 563
    invoke-virtual {v0}, Lcom/tekartik/sqflite/operation/MethodCallOperation;->getContinueOnError()Z

    move-result v1

    .line 565
    const-string v2, "operations"

    invoke-virtual {v0, v2}, Lcom/tekartik/sqflite/operation/MethodCallOperation;->getArgument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 566
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 569
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    .line 571
    new-instance v5, Lcom/tekartik/sqflite/operation/BatchOperation;

    invoke-direct {v5, v3, p1}, Lcom/tekartik/sqflite/operation/BatchOperation;-><init>(Ljava/util/Map;Z)V

    .line 572
    invoke-virtual {v5}, Lcom/tekartik/sqflite/operation/BatchOperation;->getMethod()Ljava/lang/String;

    move-result-object v3

    .line 573
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, -0x1

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v6, "query"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v7, 0x3

    goto :goto_1

    :sswitch_1
    const-string v6, "update"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v7, 0x2

    goto :goto_1

    :sswitch_2
    const-string v6, "insert"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    const/4 v7, 0x1

    goto :goto_1

    :sswitch_3
    const-string v6, "execute"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    packed-switch v7, :pswitch_data_0

    .line 624
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Batch method \'"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, "\' not supported"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "bad_param"

    invoke-interface {p2, v0, p1, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 599
    :pswitch_0
    invoke-direct {p0, v5}, Lcom/tekartik/sqflite/Database;->doQuery(Lcom/tekartik/sqflite/operation/Operation;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 601
    invoke-virtual {v5, v2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleSuccess(Ljava/util/List;)V

    goto :goto_0

    :cond_4
    if-eqz v1, :cond_5

    .line 603
    invoke-virtual {v5, v2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleErrorContinue(Ljava/util/List;)V

    goto :goto_0

    .line 606
    :cond_5
    invoke-virtual {v5, p2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleError(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    .line 612
    :pswitch_1
    invoke-direct {p0, v5}, Lcom/tekartik/sqflite/Database;->doUpdate(Lcom/tekartik/sqflite/operation/Operation;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 614
    invoke-virtual {v5, v2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleSuccess(Ljava/util/List;)V

    goto/16 :goto_0

    :cond_6
    if-eqz v1, :cond_7

    .line 616
    invoke-virtual {v5, v2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleErrorContinue(Ljava/util/List;)V

    goto/16 :goto_0

    .line 619
    :cond_7
    invoke-virtual {v5, p2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleError(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    .line 587
    :pswitch_2
    invoke-direct {p0, v5}, Lcom/tekartik/sqflite/Database;->doInsert(Lcom/tekartik/sqflite/operation/Operation;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 589
    invoke-virtual {v5, v2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleSuccess(Ljava/util/List;)V

    goto/16 :goto_0

    :cond_8
    if-eqz v1, :cond_9

    .line 591
    invoke-virtual {v5, v2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleErrorContinue(Ljava/util/List;)V

    goto/16 :goto_0

    .line 594
    :cond_9
    invoke-virtual {v5, p2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleError(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    .line 575
    :pswitch_3
    invoke-direct {p0, v5}, Lcom/tekartik/sqflite/Database;->doExecute(Lcom/tekartik/sqflite/operation/Operation;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 577
    invoke-virtual {v5, v2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleSuccess(Ljava/util/List;)V

    goto/16 :goto_0

    :cond_a
    if-eqz v1, :cond_b

    .line 579
    invoke-virtual {v5, v2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleErrorContinue(Ljava/util/List;)V

    goto/16 :goto_0

    .line 582
    :cond_b
    invoke-virtual {v5, p2}, Lcom/tekartik/sqflite/operation/BatchOperation;->handleError(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    :cond_c
    if-eqz p1, :cond_d

    .line 631
    invoke-interface {p2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 633
    :cond_d
    invoke-interface {p2, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4ea7088b -> :sswitch_3
        -0x468f3d47 -> :sswitch_2
        -0x31ffc737 -> :sswitch_1
        0x66f18c8 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public close()V
    .locals 2

    .line 177
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->cursors:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 178
    iget v0, p0, Lcom/tekartik/sqflite/Database;->logLevel:I

    invoke-static {v0}, Lcom/tekartik/sqflite/LogLevel;->hasSqlLevel(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getThreadLogPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tekartik/sqflite/Database;->cursors:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " cursor(s) are left opened"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Sqflite"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 182
    :cond_0
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    return-void
.end method

.method public enableWriteAheadLogging()Z
    .locals 3

    .line 195
    :try_start_0
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->enableWriteAheadLogging()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 197
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getThreadLogPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "enable WAL error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Sqflite"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0
.end method

.method declared-synchronized enterOrLeaveInTransaction(Ljava/lang/Boolean;)V
    .locals 1

    monitor-enter p0

    .line 642
    :try_start_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 643
    iget p1, p0, Lcom/tekartik/sqflite/Database;->transactionDepth:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/tekartik/sqflite/Database;->transactionDepth:I

    goto :goto_0

    .line 644
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 645
    iget p1, p0, Lcom/tekartik/sqflite/Database;->transactionDepth:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/tekartik/sqflite/Database;->transactionDepth:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 647
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public execute(Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 1

    .line 464
    new-instance v0, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda5;

    invoke-direct {v0, p0, p1}, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda5;-><init>(Lcom/tekartik/sqflite/Database;Lcom/tekartik/sqflite/operation/Operation;)V

    invoke-direct {p0, p1, v0}, Lcom/tekartik/sqflite/Database;->wrapSqlOperationHandler(Lcom/tekartik/sqflite/operation/Operation;Ljava/lang/Runnable;)V

    return-void
.end method

.method public getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method

.method getThreadLogPrefix()Ljava/lang/String;
    .locals 2

    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getThreadLogTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getThreadLogTag()Ljava/lang/String;
    .locals 4

    .line 203
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 205
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/tekartik/sqflite/Database;->id:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Lcom/tekartik/sqflite/Utils;->getThreadId(Ljava/lang/Thread;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method

.method handleException(Ljava/lang/Exception;Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 2

    .line 408
    instance-of v0, p1, Landroid/database/sqlite/SQLiteCantOpenDatabaseException;

    const-string v1, "sqlite_error"

    if-eqz v0, :cond_0

    .line 409
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "open_failed "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->path:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p2, v1, p1, v0}, Lcom/tekartik/sqflite/operation/Operation;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 411
    :cond_0
    instance-of v0, p1, Landroid/database/SQLException;

    if-eqz v0, :cond_1

    .line 412
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/tekartik/sqflite/operation/SqlErrorInfo;->getMap(Lcom/tekartik/sqflite/operation/Operation;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {p2, v1, p1, v0}, Lcom/tekartik/sqflite/operation/Operation;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 415
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/tekartik/sqflite/operation/SqlErrorInfo;->getMap(Lcom/tekartik/sqflite/operation/Operation;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {p2, v1, p1, v0}, Lcom/tekartik/sqflite/operation/Operation;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public insert(Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 1

    .line 502
    new-instance v0, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda4;

    invoke-direct {v0, p0, p1}, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda4;-><init>(Lcom/tekartik/sqflite/Database;Lcom/tekartik/sqflite/operation/Operation;)V

    invoke-direct {p0, p1, v0}, Lcom/tekartik/sqflite/Database;->wrapSqlOperationHandler(Lcom/tekartik/sqflite/operation/Operation;Ljava/lang/Runnable;)V

    return-void
.end method

.method declared-synchronized isInTransaction()Z
    .locals 1

    monitor-enter p0

    .line 638
    :try_start_0
    iget v0, p0, Lcom/tekartik/sqflite/Database;->transactionDepth:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public open()V
    .locals 3

    .line 145
    sget-object v0, Lcom/tekartik/sqflite/Database;->walGloballyEnabled:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tekartik/sqflite/Database;->checkWalEnabled(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/tekartik/sqflite/Database;->walGloballyEnabled:Ljava/lang/Boolean;

    .line 147
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    iget v0, p0, Lcom/tekartik/sqflite/Database;->logLevel:I

    invoke-static {v0}, Lcom/tekartik/sqflite/LogLevel;->hasVerboseLevel(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tekartik/sqflite/Database;->getThreadLogPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "[sqflite] WAL enabled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Sqflite"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    :cond_0
    sget-object v0, Lcom/tekartik/sqflite/Database;->walGloballyEnabled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/high16 v0, 0x30000000

    goto :goto_0

    :cond_1
    const/high16 v0, 0x10000000

    .line 158
    :goto_0
    iget-object v1, p0, Lcom/tekartik/sqflite/Database;->path:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/tekartik/sqflite/Database;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method

.method public openReadOnly()V
    .locals 4

    .line 163
    iget-object v0, p0, Lcom/tekartik/sqflite/Database;->path:Ljava/lang/String;

    new-instance v1, Lcom/tekartik/sqflite/Database$1;

    invoke-direct {v1, p0}, Lcom/tekartik/sqflite/Database$1;-><init>(Lcom/tekartik/sqflite/Database;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/tekartik/sqflite/Database;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method

.method public query(Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 1

    .line 273
    new-instance v0, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p1}, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda1;-><init>(Lcom/tekartik/sqflite/Database;Lcom/tekartik/sqflite/operation/Operation;)V

    invoke-direct {p0, p1, v0}, Lcom/tekartik/sqflite/Database;->wrapSqlOperationHandler(Lcom/tekartik/sqflite/operation/Operation;Ljava/lang/Runnable;)V

    return-void
.end method

.method public queryCursorNext(Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 1

    .line 333
    new-instance v0, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p1}, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda0;-><init>(Lcom/tekartik/sqflite/Database;Lcom/tekartik/sqflite/operation/Operation;)V

    invoke-direct {p0, p1, v0}, Lcom/tekartik/sqflite/Database;->wrapSqlOperationHandler(Lcom/tekartik/sqflite/operation/Operation;Ljava/lang/Runnable;)V

    return-void
.end method

.method public update(Lcom/tekartik/sqflite/operation/Operation;)V
    .locals 1

    .line 531
    new-instance v0, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0, p1}, Lcom/tekartik/sqflite/Database$$ExternalSyntheticLambda3;-><init>(Lcom/tekartik/sqflite/Database;Lcom/tekartik/sqflite/operation/Operation;)V

    invoke-direct {p0, p1, v0}, Lcom/tekartik/sqflite/Database;->wrapSqlOperationHandler(Lcom/tekartik/sqflite/operation/Operation;Ljava/lang/Runnable;)V

    return-void
.end method
