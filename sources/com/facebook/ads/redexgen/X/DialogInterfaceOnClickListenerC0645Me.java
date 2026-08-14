package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0645Me implements DialogInterface.OnClickListener {
    public final /* synthetic */ C0829Th A00;

    public DialogInterfaceOnClickListenerC0645Me(C0829Th c0829Th) {
        this.A00 = c0829Th;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
