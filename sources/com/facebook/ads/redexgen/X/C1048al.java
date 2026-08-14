package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1048al implements InterfaceC02856v {
    public final /* synthetic */ C1035aY A00;

    public C1048al(C1035aY c1035aY) {
        this.A00 = c1035aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        Signature[] signatureArr = this.A00.A00.getPackageManager().getPackageInfo(this.A00.A00.getPackageName(), 64).signatures;
        HashMap map = new HashMap();
        for (int i = 0; i < signatureArr.length; i++) {
            map.put(Integer.valueOf(i), new C1036aZ(signatureArr[i]));
        }
        return this.A00.A05(map);
    }
}
