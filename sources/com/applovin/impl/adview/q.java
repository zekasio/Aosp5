package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.impl.adview.i;

/* JADX INFO: loaded from: classes.dex */
public final class q extends i {
    public q(Context context) {
        super(context);
    }

    @Override // com.applovin.impl.adview.i
    public i.a getStyle() {
        return i.a.INVISIBLE;
    }

    @Override // com.applovin.impl.adview.i
    public void a(int i) {
        setViewScale(i / 30.0f);
    }
}
