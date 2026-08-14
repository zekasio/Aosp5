package com.applovin.impl.b.b;

import android.app.Activity;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public class h extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f898a;
    private final p b;

    h(String str, Activity activity, p pVar) {
        super(str);
        this.f898a = activity;
        this.b = pVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        Utils.showWebViewActivity(Uri.parse(getURL()), this.f898a, this.b);
    }
}
