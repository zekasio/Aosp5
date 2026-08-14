package com.tapjoy.internal;

import com.tapjoy.FiveRocksIntegration;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJPlacement;

/* JADX INFO: loaded from: classes2.dex */
public class i4 implements l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1818a;

    public class a implements TJActionRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1819a;

        public a(i4 i4Var, String str) {
            this.f1819a = str;
        }

        @Override // com.tapjoy.TJActionRequest
        public void cancelled() {
        }

        @Override // com.tapjoy.TJActionRequest
        public void completed() {
        }

        @Override // com.tapjoy.TJActionRequest
        public String getRequestId() {
            return this.f1819a;
        }

        @Override // com.tapjoy.TJActionRequest
        public String getToken() {
            return null;
        }
    }

    public class b implements TJActionRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1820a;
        public final /* synthetic */ String b;

        public b(i4 i4Var, String str, String str2) {
            this.f1820a = str;
            this.b = str2;
        }

        @Override // com.tapjoy.TJActionRequest
        public void cancelled() {
        }

        @Override // com.tapjoy.TJActionRequest
        public void completed() {
        }

        @Override // com.tapjoy.TJActionRequest
        public String getRequestId() {
            return this.f1820a;
        }

        @Override // com.tapjoy.TJActionRequest
        public String getToken() {
            return this.b;
        }
    }

    public i4(j4 j4Var, String str) {
        this.f1818a = str;
    }

    public void a(String str, String str2) {
        TJPlacement tJPlacement;
        synchronized (FiveRocksIntegration.f1622a) {
            tJPlacement = FiveRocksIntegration.f1622a.get(this.f1818a);
        }
        if (tJPlacement == null || tJPlacement.a() == null) {
            return;
        }
        tJPlacement.a().onPurchaseRequest(tJPlacement, new a(this, str), str2);
    }

    public void a(String str, String str2, int i, String str3) {
        TJPlacement tJPlacement;
        synchronized (FiveRocksIntegration.f1622a) {
            tJPlacement = FiveRocksIntegration.f1622a.get(this.f1818a);
        }
        if (tJPlacement == null || tJPlacement.a() == null) {
            return;
        }
        tJPlacement.a().onRewardRequest(tJPlacement, new b(this, str, str3), str2, i);
    }
}
