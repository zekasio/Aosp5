package com.tapjoy;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.drive.DriveFile;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import cz.msebera.android.httpclient.HttpHost;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TJSplitWebView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TJWebView f1697a;
    public i b;
    public i c;
    public String d;
    public String e;
    public String f;
    public Uri g;
    public HashSet<String> h;
    public JSONObject i;
    public TJAdUnitJSBridge j;
    public Context k;
    public Boolean l;
    public RelativeLayout m;
    public FrameLayout n;
    public ProgressBar o;
    public TextView p;
    public TJImageButton q;
    public TJImageButton r;
    public String s;
    public boolean t;
    public String u;
    public String v;
    public String w;

    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            TJSplitWebView.this.o.setProgress(i);
            TJSplitWebView.this.isFirstOrLastPage();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TJSplitWebView.this.f1697a.canGoBack()) {
                TJSplitWebView.this.f1697a.goBack();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TJSplitWebView.this.f1697a.goForward();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TJSplitWebView.this.a();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TJSplitWebView.this.openInExternalBrowser();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (TextUtils.isEmpty(TJSplitWebView.this.getLastUrl())) {
                TJSplitWebView tJSplitWebView = TJSplitWebView.this;
                tJSplitWebView.loadUrl(tJSplitWebView.d);
            } else {
                TJSplitWebView tJSplitWebView2 = TJSplitWebView.this;
                tJSplitWebView2.loadUrl(tJSplitWebView2.getLastUrl());
            }
            dialogInterface.cancel();
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g(TJSplitWebView tJSplitWebView) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    public class h extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f1704a;

        public h(TJSplitWebView tJSplitWebView, float f) {
            this.f1704a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = view.getWidth();
            float height = view.getHeight();
            float f = this.f1704a;
            outline.setRoundRect(0, 0, width, (int) (height + f), f);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f1705a;
        public final double b;
        public final double c;
        public final double d;
        public final float e;

        public i(JSONObject jSONObject) {
            this.f1705a = jSONObject.optDouble(TJAdUnitConstants.String.WIDTH, 0.0d);
            this.b = jSONObject.optDouble(TJAdUnitConstants.String.HEIGHT, 0.0d);
            this.c = jSONObject.optDouble(TJAdUnitConstants.String.LEFT, 0.0d);
            this.d = jSONObject.optDouble(TJAdUnitConstants.String.TOP, 0.0d);
            this.e = (float) jSONObject.optDouble("cornerRadius", 0.0d);
        }
    }

    public class j extends WebViewClient {
        public /* synthetic */ j(a aVar) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (TJSplitWebView.this.l.booleanValue()) {
                ProgressBar progressBar = TJSplitWebView.this.o;
                if (progressBar != null) {
                    progressBar.setProgress(0);
                    TJSplitWebView.this.o.setVisibility(8);
                }
                TJSplitWebView.this.isFirstOrLastPage();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (TJSplitWebView.this.l.booleanValue()) {
                TJSplitWebView.this.p.setText(TapjoyUrlFormatter.getDomain(str));
                TJSplitWebView.this.o.setVisibility(0);
            }
            TapjoyLog.d("TJSplitWebView", "onPageStarted: " + str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            TapjoyLog.d("TJSplitWebView", "onReceivedError: " + str2 + " firstUrl:" + TJSplitWebView.this.d);
            TJSplitWebView tJSplitWebView = TJSplitWebView.this;
            if (tJSplitWebView.t) {
                tJSplitWebView.showErrorDialog();
            } else if (str2.equals(tJSplitWebView.d)) {
                TJSplitWebView.this.a();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            TJWebView tJWebView = TJSplitWebView.this.f1697a;
            if (tJWebView != null) {
                ViewGroup viewGroup = (ViewGroup) tJWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(TJSplitWebView.this.f1697a);
                    viewGroup.removeAllViews();
                }
                TJSplitWebView.this.f1697a.destroy();
                TJSplitWebView.this.f1697a = null;
            }
            TJAdUnitJSBridge tJAdUnitJSBridge = TJSplitWebView.this.j;
            if (tJAdUnitJSBridge != null) {
                tJAdUnitJSBridge.cleanUpJSBridge();
                TJSplitWebView.this.j = null;
            }
            TapjoyLog.e("TJSplitWebView", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "WebView rendering process exited while instantiating a WebViewClient unexpectedly"));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            TJSplitWebView tJSplitWebView = TJSplitWebView.this;
            String str2 = tJSplitWebView.f;
            Uri uri = tJSplitWebView.g;
            if (str2 != null && uri != null && str != null && str.startsWith(str2)) {
                TJSplitWebView.this.k.startActivity(new Intent("android.intent.action.VIEW", uri));
                TJSplitWebView.this.a();
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashSet<String> hashSet;
            TapjoyLog.d("TJSplitWebView", "shouldOverrideUrlLoading: " + str);
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String host = uri.getHost();
                String scheme = uri.getScheme();
                if (scheme != null && host != null && ((scheme.equals(HttpHost.DEFAULT_SCHEME_NAME) || scheme.equals("https")) && ((hashSet = TJSplitWebView.this.h) == null || !hashSet.contains(host)))) {
                    TJSplitWebView.this.e = str;
                    return false;
                }
            }
            try {
                TJSplitWebView.this.k.startActivity(new Intent("android.intent.action.VIEW", uri));
                if (TJSplitWebView.this.l.booleanValue()) {
                    return true;
                }
                TJSplitWebView.this.a();
                return true;
            } catch (Exception e) {
                TapjoyLog.e("TJSplitWebView", e.getMessage());
                return true;
            }
        }
    }

    public TJSplitWebView(Context context, JSONObject jSONObject, TJAdUnitJSBridge tJAdUnitJSBridge) {
        super(context);
        this.j = tJAdUnitJSBridge;
        this.k = context;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_LAYOUT);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.SPLIT_VIEW_EXIT_HOSTS);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_ERROR_DIALOG_STRINGS);
        this.s = jSONObject.optString(TJAdUnitConstants.String.SPLIT_VIEW_URL_FOR_EXTERNAL_OPEN);
        this.i = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
        setLayoutOption(jSONObjectOptJSONObject);
        setExitHosts(jSONArrayOptJSONArray);
        setErrorDialog(jSONObjectOptJSONObject2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        TJWebView tJWebView = new TJWebView(this.k);
        this.f1697a = tJWebView;
        tJWebView.setId(TapjoyUtil.generateViewId());
        this.f1697a.setBackgroundColor(-1);
        WebSettings settings = this.f1697a.getSettings();
        if (settings != null) {
            settings.setUseWideViewPort(true);
        }
        this.f1697a.setWebViewClient(new j(null));
        Boolean boolValueOf = Boolean.valueOf(jSONObject.optBoolean(TJAdUnitConstants.String.SPLIT_VIEW_SHOW_TOOLBAR));
        this.l = boolValueOf;
        if (boolValueOf.booleanValue()) {
            addToolbar();
            addLineBreak();
            addProgressBar();
            this.f1697a.setWebChromeClient(new a());
        }
        addView(this.f1697a, layoutParams);
    }

    public void a() {
        this.j.dismissSplitView(null, null);
    }

    public void addLineBreak() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.n = frameLayout;
        frameLayout.setBackgroundColor(Color.parseColor("#dddddd"));
        addView(this.n);
    }

    public void addProgressBar() {
        ProgressBar progressBar = new ProgressBar(this.k, null, R.attr.progressBarStyleHorizontal);
        this.o = progressBar;
        progressBar.setMax(100);
        this.o.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#5d95ff")));
        this.o.setProgressBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#dddddd")));
        addView(this.o);
    }

    public void addToolbar() {
        RelativeLayout relativeLayout = new RelativeLayout(this.k);
        this.m = relativeLayout;
        relativeLayout.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale() * 40.0f));
        layoutParams.addRule(6);
        this.m.setBackgroundColor(-1);
        this.m.setVisibility(0);
        setupToolbarUI();
        addView(this.m, layoutParams);
    }

    public void animateOpen(ViewGroup viewGroup) {
        JSONObject jSONObject = this.i;
        if (jSONObject != null && jSONObject.has(TJAdUnitConstants.String.ANIMATION_EVENT_ON_OPEN) && this.i.optString(TJAdUnitConstants.String.ANIMATION_EVENT_ON_OPEN).equalsIgnoreCase(TJAdUnitConstants.String.ANIMATION_TYPE_SLIDE_UP)) {
            setY(viewGroup.getHeight());
            animate().translationY(0.0f);
        }
    }

    public void applyLayoutOption(JSONObject jSONObject) {
        setLayoutOption(jSONObject);
        a(getWidth(), getHeight());
    }

    public String getLastUrl() {
        return this.e;
    }

    public boolean goBack() {
        if (!this.f1697a.canGoBack()) {
            return false;
        }
        this.f1697a.goBack();
        return true;
    }

    public void isFirstOrLastPage() {
        this.q.setEnabled(this.f1697a.canGoBack());
        this.r.setEnabled(this.f1697a.canGoForward());
    }

    public void loadUrl(String str) {
        TJWebView tJWebView = this.f1697a;
        if (tJWebView != null) {
            this.d = str;
            this.e = str;
            tJWebView.loadUrl(str);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (this.f1697a != null) {
            a(size, size2);
        }
        super.onMeasure(i2, i3);
    }

    public void openInExternalBrowser() {
        Uri uri;
        if (TextUtils.isEmpty(this.s)) {
            uri = Uri.parse(this.f1697a.getUrl());
            if (uri == null) {
                uri = Uri.parse(getLastUrl());
            }
        } else {
            uri = Uri.parse(this.s);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(DriveFile.MODE_READ_ONLY);
        if (this.f1697a.getContext() != null) {
            try {
                this.f1697a.getContext().startActivity(intent);
            } catch (Exception e2) {
                TapjoyLog.d("TJSplitWebView", e2.getMessage());
            }
        }
    }

    public void setErrorDialog(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.t = true;
            this.u = jSONObject.optString("description");
            this.v = jSONObject.optString("close");
            this.w = jSONObject.optString("reload");
        }
    }

    public void setExitHosts(JSONArray jSONArray) {
        if (jSONArray == null) {
            this.h = null;
            return;
        }
        this.h = new HashSet<>();
        for (int i2 = 0; i2 <= jSONArray.length(); i2++) {
            String strOptString = jSONArray.optString(i2);
            if (strOptString != null) {
                this.h.add(strOptString);
            }
        }
    }

    public void setLayoutOption(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.LANDSCAPE);
            this.c = jSONObjectOptJSONObject != null ? new i(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.PORTRAIT);
            this.b = jSONObjectOptJSONObject2 != null ? new i(jSONObjectOptJSONObject2) : null;
        }
    }

    public void setTrigger(String str, String str2) {
        this.f = com.tapjoy.internal.a.a(str);
        this.g = str2 != null ? Uri.parse(str2) : null;
    }

    public void setUserAgent(String str) {
        this.f1697a.getSettings().setUserAgentString(str);
    }

    public void setupToolbarUI() {
        float screenDensityScale = new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        TJImageButton tJImageButton = new TJImageButton(this.k);
        this.q = tJImageButton;
        tJImageButton.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        int i2 = (int) (10.0f * screenDensityScale);
        layoutParams.setMargins(i2, i2, i2, i2);
        int i3 = (int) (5.0f * screenDensityScale);
        this.q.setPadding(i3, i2, i2, i2);
        this.q.setEnabledImageBitmap(TapjoyIcons.getBackEnabledImage(screenDensityScale));
        this.q.setDisableImageBitmap(TapjoyIcons.getBackDisabledImage(screenDensityScale));
        this.q.setBackgroundColor(0);
        this.q.setOnClickListener(new b());
        relativeLayout.addView(this.q, layoutParams);
        this.r = new TJImageButton(this.k);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, this.q.getId());
        layoutParams2.setMargins(i2, i2, i2, i2);
        this.r.setPadding(i2, i2, i3, i2);
        this.r.setEnabledImageBitmap(TapjoyIcons.getForwardEnabledImage(screenDensityScale));
        this.r.setDisableImageBitmap(TapjoyIcons.getForwardDisabledImage(screenDensityScale));
        this.r.setBackgroundColor(0);
        this.r.setOnClickListener(new c());
        relativeLayout.addView(this.r, layoutParams2);
        ImageButton imageButton = new ImageButton(this.k);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(i2, i2, i2, i2);
        imageButton.setPadding(i3, i3, i3, i3);
        imageButton.setImageBitmap(TapjoyIcons.getCloseImage(screenDensityScale));
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(new d());
        relativeLayout.addView(imageButton, layoutParams3);
        TextView textView = new TextView(this.k);
        this.p = textView;
        textView.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(13);
        this.p.setMaxLines(1);
        this.p.setMaxEms(200);
        this.p.setTextAlignment(4);
        this.p.setTextColor(Color.parseColor("#5d95ff"));
        this.p.setBackgroundColor(0);
        this.p.setEnabled(false);
        this.p.setTypeface(Typeface.create("sans-serif-medium", 0));
        relativeLayout.addView(this.p, layoutParams4);
        ImageButton imageButton2 = new ImageButton(this.k);
        imageButton2.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(1, this.p.getId());
        layoutParams5.addRule(15);
        imageButton2.setPadding(i3, i3, i3, i3);
        imageButton2.setImageBitmap(TapjoyIcons.getOpenBrowserImage(screenDensityScale));
        imageButton2.setBackgroundColor(0);
        imageButton2.setOnClickListener(new e());
        relativeLayout.addView(imageButton2, layoutParams5);
        this.m.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -2));
    }

    public void showErrorDialog() {
        new AlertDialog.Builder(this.k, R.style.Theme.Material.Light.Dialog.Alert).setMessage(this.u).setPositiveButton(this.v, new g(this)).setNegativeButton(this.w, new f()).create().show();
    }

    public void a(int i2, int i3) {
        i iVar = i2 <= i3 ? this.b : this.c;
        if (iVar == null) {
            this.f1697a.setVisibility(4);
            return;
        }
        double d2 = i2;
        double d3 = iVar.f1705a;
        Double.isNaN(d2);
        int i4 = (int) (d3 * d2);
        double d4 = i3;
        double d5 = iVar.b;
        Double.isNaN(d4);
        int i5 = (int) (d5 * d4);
        if (i4 == 0 || i5 == 0) {
            this.f1697a.setVisibility(4);
            return;
        }
        double d6 = iVar.c;
        Double.isNaN(d2);
        int i6 = (int) (d2 * d6);
        double d7 = iVar.d;
        Double.isNaN(d4);
        int i7 = (int) (d4 * d7);
        int i8 = (i2 - i4) - i6;
        int i9 = (i3 - i5) - i7;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1697a.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i5;
        Boolean bool = this.l;
        if (bool == null || !bool.booleanValue()) {
            layoutParams.setMargins(i6, i7, i8, i9);
        } else {
            float screenDensityScale = new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale();
            int height = this.n.getHeight() + ((int) (40.0f * screenDensityScale));
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams2.setMargins(i6, i7, i8, i9);
            this.m.setLayoutParams(layoutParams2);
            layoutParams.setMargins(i6, i7 + height, i8, i9);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i4, (int) screenDensityScale);
            layoutParams3.setMargins(i6, layoutParams.topMargin - this.o.getHeight(), i8, i9);
            this.o.setLayoutParams(layoutParams3);
            this.n.setLayoutParams(layoutParams3);
        }
        this.f1697a.setLayoutParams(layoutParams);
        this.f1697a.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 21) {
            float f2 = iVar.e;
            if (f2 <= 0.0f) {
                this.f1697a.setBackground(null);
                this.f1697a.setClipToOutline(false);
                Boolean bool2 = this.l;
                if (bool2 == null || !bool2.booleanValue()) {
                    return;
                }
                this.m.setClipToOutline(false);
                return;
            }
            float[] fArr = new float[8];
            float f3 = f2 * getResources().getDisplayMetrics().density;
            Boolean bool3 = this.l;
            if (bool3 != null && bool3.booleanValue()) {
                this.m.setOutlineProvider(new h(this, f3));
                this.m.setClipToOutline(true);
                return;
            }
            Arrays.fill(fArr, f3);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(-1);
            this.f1697a.setBackground(shapeDrawable);
            this.f1697a.setClipToOutline(true);
        }
    }
}
