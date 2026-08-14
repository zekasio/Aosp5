package com.facebook.ads.redexgen.X;

import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1011aA implements InterfaceC02856v {
    public final /* synthetic */ C1009a8 A00;

    public C1011aA(C1009a8 c1009a8) {
        this.A00 = c1009a8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() throws Exception {
        if (this.A00.A00 == null) {
            return this.A00.A07(AnonymousClass76.A06);
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : this.A00.A00.getBondedDevices()) {
            arrayList.add(new C1010a9(bluetoothDevice));
        }
        return this.A00.A0D(arrayList);
    }
}
