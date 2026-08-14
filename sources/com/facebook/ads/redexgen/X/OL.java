package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OL implements DialogInterface.OnClickListener {
    public final /* synthetic */ ON A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public OL(ON on, String str, Map map) {
        this.A00 = on;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A04.A9N(this.A01, this.A02);
    }
}
