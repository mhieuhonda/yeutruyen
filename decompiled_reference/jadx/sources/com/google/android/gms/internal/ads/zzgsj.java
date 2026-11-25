package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsj implements ServiceConnection {
    final /* synthetic */ zzgsp zza;

    /* synthetic */ zzgsj(zzgsp zzgspVar, byte[] bArr) {
        Objects.requireNonNull(zzgspVar);
        this.zza = zzgspVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzgsp zzgspVar = this.zza;
        zzgspVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzgspVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgsi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgqt zzgqtVarZzb = zzgqs.zzb(iBinder);
                zzgsj zzgsjVar = this.zza;
                zzgsp zzgspVar2 = zzgsjVar.zza;
                zzgspVar2.zzn(zzgqtVarZzb);
                zzgspVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    IInterface iInterfaceZzm = zzgspVar2.zzm();
                    if (iInterfaceZzm == null) {
                        throw null;
                    }
                    IInterface iInterface = iInterfaceZzm;
                    iInterfaceZzm.asBinder().linkToDeath(zzgspVar2.zzl(), 0);
                    zzgsp zzgspVar3 = zzgsjVar.zza;
                    zzgspVar3.zzk(false);
                    synchronized (zzgspVar3.zzj()) {
                        Iterator it = zzgspVar3.zzj().iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        zzgspVar3.zzj().clear();
                    }
                } catch (RemoteException e) {
                    zzgsjVar.zza.zzi().zzd(e, "linkToDeath failed", new Object[0]);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzgsp zzgspVar = this.zza;
        zzgspVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzgspVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgsh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgsp zzgspVar2 = this.zza.zza;
                zzgspVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface iInterfaceZzm = zzgspVar2.zzm();
                iInterfaceZzm.getClass();
                iInterfaceZzm.asBinder().unlinkToDeath(zzgspVar2.zzl(), 0);
                zzgspVar2.zzn(null);
                zzgspVar2.zzk(false);
            }
        });
    }
}
