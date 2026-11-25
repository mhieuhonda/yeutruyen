.class Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;
.super Ljava/lang/Object;
.source "FlutterSecureStoragePlugin.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MethodRunner"
.end annotation


# instance fields
.field private final call:Lio/flutter/plugin/common/MethodCall;

.field private final result:Lio/flutter/plugin/common/MethodChannel$Result;

.field final synthetic this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;


# direct methods
.method constructor <init>(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0,
            0x0
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    .line 118
    iput-object p1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->call:Lio/flutter/plugin/common/MethodCall;

    .line 120
    iput-object p3, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method

.method private handleException(Ljava/lang/Exception;)V
    .locals 3

    .line 199
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 200
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p1, v1}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 201
    iget-object p1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->call:Lio/flutter/plugin/common/MethodCall;

    iget-object v1, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Exception encountered"

    invoke-interface {p1, v2, v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v0, 0x0

    .line 128
    :try_start_0
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v1

    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->call:Lio/flutter/plugin/common/MethodCall;

    iget-object v2, v2, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    const-string v3, "options"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    iput-object v2, v1, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->options:Ljava/util/Map;

    .line 129
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->ensureOptions()V

    .line 130
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->getResetOnError()Z

    move-result v0

    .line 131
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->call:Lio/flutter/plugin/common/MethodCall;

    iget-object v1, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x0

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "readAll"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 156
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->readAll()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 131
    :sswitch_1
    const-string v2, "containsKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 160
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->call:Lio/flutter/plugin/common/MethodCall;

    invoke-static {v1, v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$100(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object v1

    .line 162
    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->containsKey(Ljava/lang/String;)Z

    move-result v1

    .line 163
    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 131
    :sswitch_2
    const-string v2, "write"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 133
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->call:Lio/flutter/plugin/common/MethodCall;

    invoke-static {v1, v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$100(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object v1

    .line 134
    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    iget-object v4, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->call:Lio/flutter/plugin/common/MethodCall;

    invoke-static {v2, v4}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$200(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 137
    iget-object v4, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v4}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->write(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v1, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 140
    :cond_0
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v2, "null"

    invoke-interface {v1, v2, v3, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 131
    :sswitch_3
    const-string v2, "read"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 145
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->call:Lio/flutter/plugin/common/MethodCall;

    invoke-static {v1, v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$100(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object v1

    .line 147
    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 148
    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->read(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 149
    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 151
    :cond_1
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v1, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 131
    :sswitch_4
    const-string v2, "deleteAll"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 174
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->deleteAll()V

    .line 175
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v1, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 131
    :sswitch_5
    const-string v2, "delete"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 167
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->call:Lio/flutter/plugin/common/MethodCall;

    invoke-static {v1, v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$100(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object v1

    .line 169
    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v2}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->delete(Ljava/lang/String;)V

    .line 170
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v1, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 179
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v1}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    if-eqz v0, :cond_3

    .line 187
    :try_start_1
    iget-object v0, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->this$0:Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;

    invoke-static {v0}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;->access$000(Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin;)Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStorage;->deleteAll()V

    .line 188
    iget-object v0, p0, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v1, "Data has been reset"

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 190
    invoke-direct {p0, v0}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->handleException(Ljava/lang/Exception;)V

    goto :goto_1

    .line 193
    :cond_3
    invoke-direct {p0, v1}, Lcom/it_nomads/fluttersecurestorage/FlutterSecureStoragePlugin$MethodRunner;->handleException(Ljava/lang/Exception;)V

    goto :goto_1

    :catch_2
    move-exception v0

    .line 183
    const-string v1, "Creating sharedPrefs"

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f997a55 -> :sswitch_5
        -0x1561e80a -> :sswitch_4
        0x355996 -> :sswitch_3
        0x6c257df -> :sswitch_2
        0xc6607c0 -> :sswitch_1
        0x4065382b -> :sswitch_0
    .end sparse-switch
.end method
