package com.tapjoy.internal;

import com.loopj.android.http.RequestParams;
import cz.msebera.android.httpclient.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class r1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1894a;
    public final URL b;

    public r1(String str, URL url) {
        this.f1894a = str;
        this.b = url;
    }

    public <Result> Result a(n1<Result> n1Var) throws IOException {
        URI uri;
        HttpURLConnection httpURLConnection = (HttpURLConnection) k5.b(new URL(this.b, n1Var.c()));
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", this.f1894a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(HttpHeaders.ACCEPT, RequestParams.APPLICATION_JSON);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), entry.getValue().toString());
        }
        a.a(httpURLConnection, "application/json; charset=utf-8", t0.a(n1Var.b()), Charset.forName("UTF-8"));
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200 && responseCode != 201 && responseCode != 409) {
            StringBuilder sbA = w1.a("Unexpected status code: ");
            sbA.append(httpURLConnection.getResponseCode());
            throw new IOException(sbA.toString());
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            try {
                uri = httpURLConnection.getURL().toURI();
            } catch (URISyntaxException unused) {
                uri = null;
            }
            return n1Var.a(uri, inputStream);
        } finally {
            inputStream.close();
        }
    }
}
