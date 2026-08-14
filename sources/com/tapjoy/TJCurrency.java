package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.r5;
import java.util.Map;
import java.util.UUID;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes2.dex */
public class TJCurrency {
    public static TJGetCurrencyBalanceListener d;
    public static TJSpendCurrencyListener e;
    public static TJAwardCurrencyListener f;
    public static TJEarnedCurrencyListener g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1673a = null;
    public int b = 0;
    public Context c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f1674a;

        public a(Map map) {
            this.f1674a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            TJCurrency.this.b(new TapjoyURLConnection().getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_GET_CURRENCY_BALANCE_URL_PATH, this.f1674a));
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f1675a;

        public b(Map map) {
            this.f1675a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            TJCurrency.this.c(new TapjoyURLConnection().getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_SPEND_CURRENCY_URL_PATH, this.f1675a));
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f1676a;

        public c(Map map) {
            this.f1676a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            TJCurrency.this.a(new TapjoyURLConnection().getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_AWARD_CURRENCY_URL_PATH, this.f1676a));
        }
    }

    public TJCurrency(Context context) {
        this.c = context;
    }

    public final synchronized void a(TapjoyHttpURLResponse tapjoyHttpURLResponse) {
        String nodeTrimValue = "Failed to award currency";
        String str = tapjoyHttpURLResponse.response;
        if (str != null) {
            Document documentBuildDocument = TapjoyUtil.buildDocument(str);
            if (documentBuildDocument != null) {
                String nodeTrimValue2 = TapjoyUtil.getNodeTrimValue(documentBuildDocument.getElementsByTagName("Success"));
                if (nodeTrimValue2 != null && nodeTrimValue2.equals("true")) {
                    String nodeTrimValue3 = TapjoyUtil.getNodeTrimValue(documentBuildDocument.getElementsByTagName("TapPoints"));
                    String nodeTrimValue4 = TapjoyUtil.getNodeTrimValue(documentBuildDocument.getElementsByTagName("CurrencyName"));
                    if (nodeTrimValue3 != null && nodeTrimValue4 != null) {
                        int i = Integer.parseInt(nodeTrimValue3);
                        saveCurrencyBalance(i);
                        TJAwardCurrencyListener tJAwardCurrencyListener = f;
                        if (tJAwardCurrencyListener != null) {
                            tJAwardCurrencyListener.onAwardCurrencyResponse(nodeTrimValue4, i);
                        }
                        return;
                    }
                    TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "awardCurrency response is invalid -- missing tags."));
                } else if (nodeTrimValue2 == null || !nodeTrimValue2.endsWith(TJAdUnitConstants.String.FALSE)) {
                    TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "awardCurrency response is invalid -- missing <Success> tag."));
                } else {
                    nodeTrimValue = TapjoyUtil.getNodeTrimValue(documentBuildDocument.getElementsByTagName("Message"));
                    TapjoyLog.i("TJCurrency", nodeTrimValue);
                }
            }
        } else {
            TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "awardCurrency response is NULL"));
        }
        TJAwardCurrencyListener tJAwardCurrencyListener2 = f;
        if (tJAwardCurrencyListener2 != null) {
            tJAwardCurrencyListener2.onAwardCurrencyResponseFailure(nodeTrimValue);
        }
    }

    public void awardCurrency(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        if (i < 0) {
            TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Amount must be a positive number for the awardCurrency API"));
            return;
        }
        this.b = i;
        f = tJAwardCurrencyListener;
        String string = UUID.randomUUID().toString();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Map<String, String> genericURLParams = TapjoyConnectCore.getGenericURLParams();
        TapjoyUtil.safePut(genericURLParams, TapjoyConstants.TJC_CURRENCY, String.valueOf(this.b), true);
        TapjoyUtil.safePut(genericURLParams, TapjoyConstants.TJC_GUID, string, true);
        TapjoyUtil.safePut(genericURLParams, "timestamp", String.valueOf(jCurrentTimeMillis), true);
        TapjoyUtil.safePut(genericURLParams, TapjoyConstants.TJC_VERIFIER, TapjoyConnectCore.getAwardCurrencyVerifier(jCurrentTimeMillis, this.b, string), true);
        new Thread(new c(genericURLParams)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00be A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:10:0x0019, B:12:0x0021, B:15:0x0039, B:21:0x004d, B:22:0x0063, B:24:0x006a, B:28:0x0070, B:29:0x008e, B:30:0x009d, B:32:0x00ba, B:34:0x00be, B:31:0x00ac), top: B:42:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(com.tapjoy.TapjoyHttpURLResponse r6) {
        /*
            r5 = this;
            java.lang.String r0 = "earned: "
            monitor-enter(r5)
            java.lang.String r6 = r6.response     // Catch: java.lang.Throwable -> Lc5
            if (r6 == 0) goto Lac
            org.w3c.dom.Document r6 = com.tapjoy.TapjoyUtil.buildDocument(r6)     // Catch: java.lang.Throwable -> Lc5
            if (r6 == 0) goto Lba
            java.lang.String r1 = "Success"
            org.w3c.dom.NodeList r1 = r6.getElementsByTagName(r1)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = com.tapjoy.TapjoyUtil.getNodeTrimValue(r1)     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto L9d
            java.lang.String r2 = "true"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto L9d
            java.lang.String r1 = "TapPoints"
            org.w3c.dom.NodeList r1 = r6.getElementsByTagName(r1)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = com.tapjoy.TapjoyUtil.getNodeTrimValue(r1)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = "CurrencyName"
            org.w3c.dom.NodeList r6 = r6.getElementsByTagName(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = com.tapjoy.TapjoyUtil.getNodeTrimValue(r6)     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto L8e
            if (r6 == 0) goto L8e
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            int r2 = r5.getLocalCurrencyBalance()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            com.tapjoy.TJEarnedCurrencyListener r3 = com.tapjoy.TJCurrency.g     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            if (r3 == 0) goto L63
            r3 = -9999(0xffffffffffffd8f1, float:NaN)
            if (r2 == r3) goto L63
            if (r1 <= r2) goto L63
            java.lang.String r3 = "TJCurrency"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            r4.<init>(r0)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            int r0 = r1 - r2
            r4.append(r0)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            com.tapjoy.TapjoyLog.i(r3, r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            com.tapjoy.TJEarnedCurrencyListener r2 = com.tapjoy.TJCurrency.g     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            r2.onEarnedCurrency(r6, r0)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
        L63:
            r5.saveCurrencyBalance(r1)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            com.tapjoy.TJGetCurrencyBalanceListener r0 = com.tapjoy.TJCurrency.d     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
            if (r0 == 0) goto L6d
            r0.onGetCurrencyBalanceResponse(r6, r1)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lc5
        L6d:
            monitor-exit(r5)
            return
        L6f:
            r6 = move-exception
            com.tapjoy.TapjoyErrorMessage r0 = new com.tapjoy.TapjoyErrorMessage     // Catch: java.lang.Throwable -> Lc5
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.SERVER_ERROR     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = "Error parsing XML and calling listener: "
            java.lang.StringBuilder r2 = com.tapjoy.internal.w1.a(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc5
            r2.append(r6)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> Lc5
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = "TJCurrency"
            com.tapjoy.TapjoyLog.e(r6, r0)     // Catch: java.lang.Throwable -> Lc5
            goto Lba
        L8e:
            com.tapjoy.TapjoyErrorMessage r6 = new com.tapjoy.TapjoyErrorMessage     // Catch: java.lang.Throwable -> Lc5
            com.tapjoy.TapjoyErrorMessage$ErrorType r0 = com.tapjoy.TapjoyErrorMessage.ErrorType.SERVER_ERROR     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "getCurrencyBalance response is invalid -- missing tags."
            r6.<init>(r0, r1)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = "TJCurrency"
            com.tapjoy.TapjoyLog.e(r0, r6)     // Catch: java.lang.Throwable -> Lc5
            goto Lba
        L9d:
            com.tapjoy.TapjoyErrorMessage r6 = new com.tapjoy.TapjoyErrorMessage     // Catch: java.lang.Throwable -> Lc5
            com.tapjoy.TapjoyErrorMessage$ErrorType r0 = com.tapjoy.TapjoyErrorMessage.ErrorType.SERVER_ERROR     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "getCurrencyBalance response is invalid -- missing <Success> tag."
            r6.<init>(r0, r1)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = "TJCurrency"
            com.tapjoy.TapjoyLog.e(r0, r6)     // Catch: java.lang.Throwable -> Lc5
            goto Lba
        Lac:
            com.tapjoy.TapjoyErrorMessage r6 = new com.tapjoy.TapjoyErrorMessage     // Catch: java.lang.Throwable -> Lc5
            com.tapjoy.TapjoyErrorMessage$ErrorType r0 = com.tapjoy.TapjoyErrorMessage.ErrorType.SERVER_ERROR     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "getCurrencyBalance response is NULL"
            r6.<init>(r0, r1)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = "TJCurrency"
            com.tapjoy.TapjoyLog.e(r0, r6)     // Catch: java.lang.Throwable -> Lc5
        Lba:
            com.tapjoy.TJGetCurrencyBalanceListener r6 = com.tapjoy.TJCurrency.d     // Catch: java.lang.Throwable -> Lc5
            if (r6 == 0) goto Lc3
            java.lang.String r0 = "Failed to get currency balance"
            r6.onGetCurrencyBalanceResponseFailure(r0)     // Catch: java.lang.Throwable -> Lc5
        Lc3:
            monitor-exit(r5)
            return
        Lc5:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc5
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJCurrency.b(com.tapjoy.TapjoyHttpURLResponse):void");
    }

    public final synchronized void c(TapjoyHttpURLResponse tapjoyHttpURLResponse) {
        String nodeTrimValue = "Failed to spend currency";
        String str = tapjoyHttpURLResponse.response;
        if (str != null) {
            Document documentBuildDocument = TapjoyUtil.buildDocument(str);
            if (documentBuildDocument != null) {
                String nodeTrimValue2 = TapjoyUtil.getNodeTrimValue(documentBuildDocument.getElementsByTagName("Success"));
                if (nodeTrimValue2 != null && nodeTrimValue2.equals("true")) {
                    String nodeTrimValue3 = TapjoyUtil.getNodeTrimValue(documentBuildDocument.getElementsByTagName("TapPoints"));
                    String nodeTrimValue4 = TapjoyUtil.getNodeTrimValue(documentBuildDocument.getElementsByTagName("CurrencyName"));
                    if (nodeTrimValue3 != null && nodeTrimValue4 != null) {
                        int i = Integer.parseInt(nodeTrimValue3);
                        saveCurrencyBalance(i);
                        TJSpendCurrencyListener tJSpendCurrencyListener = e;
                        if (tJSpendCurrencyListener != null) {
                            tJSpendCurrencyListener.onSpendCurrencyResponse(nodeTrimValue4, i);
                        }
                        return;
                    }
                    TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "spendCurrency response is invalid -- missing tags."));
                } else if (nodeTrimValue2 == null || !nodeTrimValue2.endsWith(TJAdUnitConstants.String.FALSE)) {
                    TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "spendCurrency response is invalid -- missing <Success> tag."));
                } else {
                    nodeTrimValue = TapjoyUtil.getNodeTrimValue(documentBuildDocument.getElementsByTagName("Message"));
                    TapjoyLog.i("TJCurrency", nodeTrimValue);
                    if ("BalanceTooLowError".equals(TapjoyUtil.getNodeTrimValue(documentBuildDocument.getElementsByTagName("MessageCode")))) {
                        r5.f1898a.b();
                    }
                }
            }
        } else {
            TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "spendCurrency response is NULL"));
        }
        TJSpendCurrencyListener tJSpendCurrencyListener2 = e;
        if (tJSpendCurrencyListener2 != null) {
            tJSpendCurrencyListener2.onSpendCurrencyResponseFailure(nodeTrimValue);
        }
    }

    public void getCurrencyBalance(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        d = tJGetCurrencyBalanceListener;
        new Thread(new a(TapjoyConnectCore.getURLParams())).start();
    }

    public int getLocalCurrencyBalance() {
        return this.c.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).getInt(TapjoyConstants.PREF_LAST_CURRENCY_BALANCE, -9999);
    }

    public void saveCurrencyBalance(int i) {
        SharedPreferences.Editor editorEdit = this.c.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        editorEdit.putInt(TapjoyConstants.PREF_LAST_CURRENCY_BALANCE, i);
        editorEdit.apply();
    }

    public void setEarnedCurrencyListener(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        g = tJEarnedCurrencyListener;
    }

    public void spendCurrency(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        if (i < 0) {
            TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Amount must be a positive number for the spendCurrency API"));
            return;
        }
        this.f1673a = "" + i;
        e = tJSpendCurrencyListener;
        Map<String, String> uRLParams = TapjoyConnectCore.getURLParams();
        TapjoyUtil.safePut(uRLParams, TapjoyConstants.TJC_CURRENCY, this.f1673a, true);
        new Thread(new b(uRLParams)).start();
    }
}
