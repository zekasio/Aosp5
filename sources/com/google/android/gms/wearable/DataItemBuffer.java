package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;
import com.google.android.gms.wearable.internal.zzdf;
import cz.msebera.android.httpclient.cookie.ClientCookie;

/* JADX INFO: loaded from: classes2.dex */
public class DataItemBuffer extends EntityBuffer<DataItem> implements Result {
    private final Status zzp;

    public DataItemBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzp = new Status(dataHolder.getStatusCode());
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    protected String getPrimaryDataMarkerColumn() {
        return ClientCookie.PATH_ATTR;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzp;
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    protected /* synthetic */ DataItem getEntry(int i, int i2) {
        return new zzdf(this.mDataHolder, i, i2);
    }
}
