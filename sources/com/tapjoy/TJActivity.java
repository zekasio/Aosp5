package com.tapjoy;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.internal.z6;

/* JADX INFO: loaded from: classes2.dex */
public class TJActivity extends Activity implements View.OnClickListener {
    public ViewGroup.LayoutParams b;
    public TJCloseButton c;
    public ProgressBar d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RelativeLayout f1623a = null;
    public boolean e = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f1624a;

        public a(boolean z) {
            this.f1624a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1624a) {
                TJActivity.this.d.setVisibility(0);
            } else {
                TJActivity.this.d.setVisibility(4);
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            TJActivity.this.e();
            dialogInterface.cancel();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            TJActivity.this.e();
            dialogInterface.cancel();
        }
    }

    public int a() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public boolean a(int i) {
        return i == 0 || i == 8 || i == 6 || i == 11;
    }

    public String b() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels > displayMetrics.heightPixels ? TJAdUnitConstants.String.LANDSCAPE : TJAdUnitConstants.String.PORTRAIT;
    }

    public boolean b(int i) {
        return i == 1 || i == 9 || i == 7 || i == 12;
    }

    public int c() {
        int rotation = getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (((rotation == 0 || rotation == 2) && i2 > i) || ((rotation == 1 || rotation == 3) && i > i2)) {
            if (rotation == 1) {
                return 0;
            }
            if (rotation != 2) {
                return rotation != 3 ? 1 : 8;
            }
            return 9;
        }
        if (rotation == 0) {
            return 0;
        }
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    TapjoyLog.w("TJActivity", "Unknown screen orientation. Defaulting to landscape.");
                    return 0;
                }
                return 9;
            }
        }
    }

    public int d() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public void e() {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        e();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().setFlags(16777216, 16777216);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.b = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f1623a = relativeLayout;
        relativeLayout.setLayoutParams(this.b);
        this.f1623a.setBackgroundColor(0);
        this.d = new ProgressBar(this, null, R.attr.progressBarStyleLarge);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.d.setLayoutParams(layoutParams);
        TJCloseButton tJCloseButton = new TJCloseButton(this);
        this.c = tJCloseButton;
        tJCloseButton.setOnClickListener(this);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (z6.r.n) {
            this.e = true;
            com.tapjoy.internal.a.a((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        if (this.e) {
            this.e = false;
            com.tapjoy.internal.a.b(this);
        }
        super.onStop();
    }

    public void setCloseButtonClickable(boolean z) {
        this.c.setClickableRequested(z);
    }

    public void setCloseButtonVisibility(boolean z) {
        if (z) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(4);
        }
    }

    public void setProgressSpinnerVisibility(boolean z) {
        TapjoyUtil.runOnMainThread(new a(z));
    }

    public void showErrorDialog() {
        if (isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AlertDialog.Builder(this, R.style.Theme.Material.Light.Dialog.Alert).setMessage("An error occurred. Please try again later.").setPositiveButton("OK", new b()).create().show();
        } else {
            new AlertDialog.Builder(this).setMessage("An error occurred. Please try again later.").setPositiveButton("OK", new c()).create().show();
        }
    }
}
