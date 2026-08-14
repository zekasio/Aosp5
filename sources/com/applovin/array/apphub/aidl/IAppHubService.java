package com.applovin.array.apphub.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback;

/* JADX INFO: loaded from: classes.dex */
public interface IAppHubService extends IInterface {
    void directInstall(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException;

    void dismissDirectDownloadAppDetails(String str) throws RemoteException;

    long getAppHubVersionCode() throws RemoteException;

    Bundle getEnabledFeatures() throws RemoteException;

    String getRandomUserToken() throws RemoteException;

    void showDirectDownloadAppDetails(String str, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException;

    void showDirectDownloadAppDetailsWithExtra(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements IAppHubService {
        private static final String DESCRIPTOR = "com.applovin.array.apphub.aidl.IAppHubService";
        static final int TRANSACTION_directInstall = 7;
        static final int TRANSACTION_dismissDirectDownloadAppDetails = 5;
        static final int TRANSACTION_getAppHubVersionCode = 2;
        static final int TRANSACTION_getEnabledFeatures = 3;
        static final int TRANSACTION_getRandomUserToken = 1;
        static final int TRANSACTION_showDirectDownloadAppDetails = 4;
        static final int TRANSACTION_showDirectDownloadAppDetailsWithExtra = 6;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAppHubService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IAppHubService)) {
                return (IAppHubService) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    String randomUserToken = getRandomUserToken();
                    parcel2.writeNoException();
                    parcel2.writeString(randomUserToken);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    long appHubVersionCode = getAppHubVersionCode();
                    parcel2.writeNoException();
                    parcel2.writeLong(appHubVersionCode);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    Bundle enabledFeatures = getEnabledFeatures();
                    parcel2.writeNoException();
                    if (enabledFeatures != null) {
                        parcel2.writeInt(1);
                        enabledFeatures.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    showDirectDownloadAppDetails(parcel.readString(), IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    dismissDirectDownloadAppDetails(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    showDirectDownloadAppDetailsWithExtra(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    directInstall(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements IAppHubService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public String getRandomUserToken() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public long getAppHubVersionCode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public Bundle getEnabledFeatures() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void showDirectDownloadAppDetails(String str, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iAppHubDirectDownloadServiceCallback != null ? iAppHubDirectDownloadServiceCallback.asBinder() : null);
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void dismissDirectDownloadAppDetails(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void showDirectDownloadAppDetailsWithExtra(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iAppHubDirectDownloadServiceCallback != null ? iAppHubDirectDownloadServiceCallback.asBinder() : null);
                    this.mRemote.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void directInstall(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iAppHubDirectDownloadServiceCallback != null ? iAppHubDirectDownloadServiceCallback.asBinder() : null);
                    this.mRemote.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }
}
