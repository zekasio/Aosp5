package com.facebook.ads.redexgen.X;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZH implements InterfaceC02856v {
    public final /* synthetic */ ZF A00;

    public ZH(ZF zf) {
        this.A00 = zf;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() throws Exception {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        HashMap map = new HashMap();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
            map.put(networkInterfaceNextElement.getDisplayName(), new ZG(networkInterfaceNextElement.getInetAddresses(), null));
        }
        return this.A00.A02(map);
    }
}
