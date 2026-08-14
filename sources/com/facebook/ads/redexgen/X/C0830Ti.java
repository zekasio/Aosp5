package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0830Ti extends L8 {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC0646Mf A01;

    public C0830Ti(DialogInterfaceOnClickListenerC0646Mf dialogInterfaceOnClickListenerC0646Mf, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC0646Mf;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        if (this.A01.A01.A02 != null) {
            this.A01.A01.A02.ADB(C0606Ko.A03(this.A01.A01.A00), new RG().A05(this.A01.A01.A04(this.A01.A00.getText().toString())).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
