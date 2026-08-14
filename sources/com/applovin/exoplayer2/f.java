package com.applovin.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.exoplayer2.common.a.s;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f396a;
    private final com.applovin.exoplayer2.common.a.s<Bundle> b;

    static {
        f396a = com.applovin.exoplayer2.l.ai.f611a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.b.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < f396a) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.b.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }

    public static com.applovin.exoplayer2.common.a.s<Bundle> a(IBinder iBinder) {
        int i;
        s.a aVarI = com.applovin.exoplayer2.common.a.s.i();
        int i2 = 1;
        int i3 = 0;
        while (i2 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i3);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            aVarI.a((Bundle) com.applovin.exoplayer2.l.a.b(parcelObtain2.readBundle()));
                            i3++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i2 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return aVarI.a();
    }
}
