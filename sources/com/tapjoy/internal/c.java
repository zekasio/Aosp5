package com.tapjoy.internal;

import android.R;
import android.app.Dialog;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class c extends Dialog {
    public c(Context context, boolean z) {
        super(context, R.style.Theme.Dialog);
        if (z) {
            requestWindowFeature(1);
        }
        getWindow().setBackgroundDrawableResource(R.color.transparent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        super.cancel();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }
}
