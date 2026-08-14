package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.m.o;
import com.applovin.exoplayer2.t;
import com.applovin.exoplayer2.ui.k;
import com.applovin.sdk.R;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends FrameLayout {
    private final Drawable A;
    private final Drawable B;
    private final float C;
    private final float D;
    private final String E;
    private final String F;
    private an G;
    private com.applovin.exoplayer2.i H;
    private c I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private long[] W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f688a;
    private boolean[] aa;
    private long[] ab;
    private boolean[] ac;
    private long ad;
    private long ae;
    private long af;
    private final CopyOnWriteArrayList<d> b;
    private final View c;
    private final View d;
    private final View e;
    private final View f;
    private final View g;
    private final View h;
    private final ImageView i;
    private final ImageView j;
    private final View k;
    private final TextView l;
    private final TextView m;
    private final k n;
    private final StringBuilder o;
    private final Formatter p;
    private final ba.a q;
    private final ba.c r;
    private final Runnable s;
    private final Runnable t;
    private final Drawable u;
    private final Drawable v;
    private final Drawable w;
    private final String x;
    private final String y;
    private final String z;

    public interface c {
        void a(long j, long j2);
    }

    public interface d {
        void a(int i);
    }

    private static boolean a(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        t.a("goog.exo.ui");
    }

    public f(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = R.layout.applovin_exo_player_control_view;
        this.N = 5000;
        this.P = 0;
        this.O = 200;
        this.V = -9223372036854775807L;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinPlayerControlView, i, 0);
            try {
                this.N = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_show_timeout, this.N);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerControlView_al_controller_layout_id, resourceId);
                this.P = a(typedArrayObtainStyledAttributes, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_rewind_button, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_fastforward_button, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_previous_button, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_next_button, this.T);
                this.U = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_shuffle_button, this.U);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_time_bar_min_update_interval, this.O));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.b = new CopyOnWriteArrayList<>();
        this.q = new ba.a();
        this.r = new ba.c();
        StringBuilder sb = new StringBuilder();
        this.o = sb;
        this.p = new Formatter(sb, Locale.getDefault());
        this.W = new long[0];
        this.aa = new boolean[0];
        this.ab = new long[0];
        this.ac = new boolean[0];
        b bVar = new b();
        this.f688a = bVar;
        this.H = new com.applovin.exoplayer2.j();
        this.s = new Runnable() { // from class: com.applovin.exoplayer2.ui.f$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.k();
            }
        };
        this.t = new Runnable() { // from class: com.applovin.exoplayer2.ui.f$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        k kVar = (k) findViewById(R.id.al_exo_progress);
        View viewFindViewById = findViewById(R.id.al_exo_progress_placeholder);
        if (kVar != null) {
            this.n = kVar;
        } else if (viewFindViewById != null) {
            com.applovin.exoplayer2.ui.d dVar = new com.applovin.exoplayer2.ui.d(context, null, 0, attributeSet2);
            dVar.setId(R.id.al_exo_progress);
            dVar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(dVar, iIndexOfChild);
            this.n = dVar;
        } else {
            this.n = null;
        }
        this.l = (TextView) findViewById(R.id.al_exo_duration);
        this.m = (TextView) findViewById(R.id.al_exo_position);
        k kVar2 = this.n;
        if (kVar2 != null) {
            kVar2.a(bVar);
        }
        View viewFindViewById2 = findViewById(R.id.al_exo_play);
        this.e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(bVar);
        }
        View viewFindViewById3 = findViewById(R.id.al_exo_pause);
        this.f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(bVar);
        }
        View viewFindViewById4 = findViewById(R.id.al_exo_prev);
        this.c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(bVar);
        }
        View viewFindViewById5 = findViewById(R.id.al_exo_next);
        this.d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(bVar);
        }
        View viewFindViewById6 = findViewById(R.id.al_exo_rew);
        this.h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(bVar);
        }
        View viewFindViewById7 = findViewById(R.id.al_exo_ffwd);
        this.g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.al_exo_repeat_toggle);
        this.i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_shuffle);
        this.j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View viewFindViewById8 = findViewById(R.id.al_exo_vr);
        this.k = viewFindViewById8;
        setShowVrButton(false);
        a(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.C = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.D = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.u = resources.getDrawable(R.drawable.al_exo_controls_repeat_off);
        this.v = resources.getDrawable(R.drawable.al_exo_controls_repeat_one);
        this.w = resources.getDrawable(R.drawable.al_exo_controls_repeat_all);
        this.A = resources.getDrawable(R.drawable.al_exo_controls_shuffle_on);
        this.B = resources.getDrawable(R.drawable.al_exo_controls_shuffle_off);
        this.x = resources.getString(R.string.al_exo_controls_repeat_off_description);
        this.y = resources.getString(R.string.al_exo_controls_repeat_one_description);
        this.z = resources.getString(R.string.al_exo_controls_repeat_all_description);
        this.E = resources.getString(R.string.al_exo_controls_shuffle_on_description);
        this.F = resources.getString(R.string.al_exo_controls_shuffle_off_description);
    }

    public an getPlayer() {
        return this.G;
    }

    public void setPlayer(an anVar) {
        boolean z = true;
        com.applovin.exoplayer2.l.a.b(Looper.myLooper() == Looper.getMainLooper());
        if (anVar != null && anVar.r() != Looper.getMainLooper()) {
            z = false;
        }
        com.applovin.exoplayer2.l.a.a(z);
        an anVar2 = this.G;
        if (anVar2 == anVar) {
            return;
        }
        if (anVar2 != null) {
            anVar2.b(this.f688a);
        }
        this.G = anVar;
        if (anVar != null) {
            anVar.a(this.f688a);
        }
        e();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.K = z;
        j();
    }

    public void a(d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.b.add(dVar);
    }

    public void b(d dVar) {
        this.b.remove(dVar);
    }

    public void setProgressUpdateListener(c cVar) {
        this.I = cVar;
    }

    @Deprecated
    public void setControlDispatcher(com.applovin.exoplayer2.i iVar) {
        if (this.H != iVar) {
            this.H = iVar;
            g();
        }
    }

    public void setShowRewindButton(boolean z) {
        this.Q = z;
        g();
    }

    public void setShowFastForwardButton(boolean z) {
        this.R = z;
        g();
    }

    public void setShowPreviousButton(boolean z) {
        this.S = z;
        g();
    }

    public void setShowNextButton(boolean z) {
        this.T = z;
        g();
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public void setShowTimeoutMs(int i) {
        this.N = i;
        if (c()) {
            d();
        }
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public void setRepeatToggleModes(int i) {
        this.P = i;
        an anVar = this.G;
        if (anVar != null) {
            int iY = anVar.y();
            if (i == 0 && iY != 0) {
                this.H.a(this.G, 0);
            } else if (i == 1 && iY == 2) {
                this.H.a(this.G, 1);
            } else if (i == 2 && iY == 1) {
                this.H.a(this.G, 2);
            }
        }
        h();
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public void setShowShuffleButton(boolean z) {
        this.U = z;
        i();
    }

    public boolean getShowVrButton() {
        View view = this.k;
        return view != null && view.getVisibility() == 0;
    }

    public void setShowVrButton(boolean z) {
        View view = this.k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            a(getShowVrButton(), onClickListener != null, this.k);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.O = ai.a(i, 16, 1000);
    }

    public void a() {
        if (!c()) {
            setVisibility(0);
            Iterator<d> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            e();
            l();
            m();
        }
        d();
    }

    public void b() {
        if (c()) {
            setVisibility(8);
            Iterator<d> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            removeCallbacks(this.s);
            removeCallbacks(this.t);
            this.V = -9223372036854775807L;
        }
    }

    public boolean c() {
        return getVisibility() == 0;
    }

    private void d() {
        removeCallbacks(this.t);
        if (this.N > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i = this.N;
            this.V = jUptimeMillis + ((long) i);
            if (this.J) {
                postDelayed(this.t, i);
                return;
            }
            return;
        }
        this.V = -9223372036854775807L;
    }

    private void e() {
        f();
        g();
        h();
        i();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        boolean z;
        boolean z2;
        if (c() && this.J) {
            boolean zN = n();
            View view = this.e;
            boolean z3 = true;
            if (view != null) {
                z = zN && view.isFocused();
                if (ai.f611a < 21) {
                    z2 = z;
                } else {
                    z2 = zN && a.a(this.e);
                }
                this.e.setVisibility(zN ? 8 : 0);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f;
            if (view2 != null) {
                z |= !zN && view2.isFocused();
                if (ai.f611a < 21) {
                    z3 = z;
                } else if (zN || !a.a(this.f)) {
                    z3 = false;
                }
                z2 |= z3;
                this.f.setVisibility(zN ? 0 : 8);
            }
            if (z) {
                l();
            }
            if (z2) {
                m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        boolean z;
        boolean zA;
        boolean z2;
        boolean z3;
        if (c() && this.J) {
            an anVar = this.G;
            boolean z4 = false;
            if (anVar != null) {
                boolean zA2 = anVar.a(4);
                boolean zA3 = anVar.a(6);
                z3 = anVar.a(10) && this.H.a();
                if (anVar.a(11) && this.H.b()) {
                    z4 = true;
                }
                zA = anVar.a(8);
                z = z4;
                z4 = zA3;
                z2 = zA2;
            } else {
                z = false;
                zA = false;
                z2 = false;
                z3 = false;
            }
            a(this.S, z4, this.c);
            a(this.Q, z3, this.h);
            a(this.R, z, this.g);
            a(this.T, zA, this.d);
            k kVar = this.n;
            if (kVar != null) {
                kVar.setEnabled(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ImageView imageView;
        if (c() && this.J && (imageView = this.i) != null) {
            if (this.P == 0) {
                a(false, false, (View) imageView);
                return;
            }
            an anVar = this.G;
            if (anVar == null) {
                a(true, false, (View) imageView);
                this.i.setImageDrawable(this.u);
                this.i.setContentDescription(this.x);
                return;
            }
            a(true, true, (View) imageView);
            int iY = anVar.y();
            if (iY == 0) {
                this.i.setImageDrawable(this.u);
                this.i.setContentDescription(this.x);
            } else if (iY == 1) {
                this.i.setImageDrawable(this.v);
                this.i.setContentDescription(this.y);
            } else if (iY == 2) {
                this.i.setImageDrawable(this.w);
                this.i.setContentDescription(this.z);
            }
            this.i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ImageView imageView;
        String str;
        if (c() && this.J && (imageView = this.j) != null) {
            an anVar = this.G;
            if (!this.U) {
                a(false, false, (View) imageView);
                return;
            }
            if (anVar == null) {
                a(true, false, (View) imageView);
                this.j.setImageDrawable(this.B);
                this.j.setContentDescription(this.F);
                return;
            }
            a(true, true, (View) imageView);
            this.j.setImageDrawable(anVar.z() ? this.A : this.B);
            ImageView imageView2 = this.j;
            if (anVar.z()) {
                str = this.E;
            } else {
                str = this.F;
            }
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.f.j():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long jN;
        long jO;
        if (c() && this.J) {
            an anVar = this.G;
            if (anVar != null) {
                jN = this.ad + anVar.N();
                jO = this.ad + anVar.O();
            } else {
                jN = 0;
                jO = 0;
            }
            boolean z = jN != this.ae;
            boolean z2 = jO != this.af;
            this.ae = jN;
            this.af = jO;
            TextView textView = this.m;
            if (textView != null && !this.M && z) {
                textView.setText(ai.a(this.o, this.p, jN));
            }
            k kVar = this.n;
            if (kVar != null) {
                kVar.setPosition(jN);
                this.n.setBufferedPosition(jO);
            }
            c cVar = this.I;
            if (cVar != null && (z || z2)) {
                cVar.a(jN, jO);
            }
            removeCallbacks(this.s);
            int iT = anVar == null ? 1 : anVar.t();
            if (anVar == null || !anVar.a()) {
                if (iT == 4 || iT == 1) {
                    return;
                }
                postDelayed(this.s, 1000L);
                return;
            }
            k kVar2 = this.n;
            long jMin = Math.min(kVar2 != null ? kVar2.getPreferredUpdateDelay() : 1000L, 1000 - (jN % 1000));
            float f = anVar.D().b;
            postDelayed(this.s, ai.a(f > 0.0f ? (long) (jMin / f) : 1000L, this.O, 1000L));
        }
    }

    private void l() {
        View view;
        View view2;
        boolean zN = n();
        if (!zN && (view2 = this.e) != null) {
            view2.requestFocus();
        } else {
            if (!zN || (view = this.f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void m() {
        View view;
        View view2;
        boolean zN = n();
        if (!zN && (view2 = this.e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!zN || (view = this.f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void a(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.C : this.D);
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(an anVar, long j) {
        int iG;
        ba baVarS = anVar.S();
        if (this.L && !baVarS.d()) {
            int iB = baVarS.b();
            iG = 0;
            while (true) {
                long jC = baVarS.a(iG, this.r).c();
                if (j < jC) {
                    break;
                }
                if (iG == iB - 1) {
                    j = jC;
                    break;
                } else {
                    j -= jC;
                    iG++;
                }
            }
        } else {
            iG = anVar.G();
        }
        a(anVar, iG, j);
        k();
    }

    private boolean a(an anVar, int i, long j) {
        return this.H.a(anVar, i, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j = this.V;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                b();
            } else {
                postDelayed(this.t, jUptimeMillis);
            }
        } else if (c()) {
            d();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.s);
        removeCallbacks(this.t);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.t);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        an anVar = this.G;
        if (anVar == null || !a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (anVar.t() == 4) {
                return true;
            }
            this.H.e(anVar);
            return true;
        }
        if (keyCode == 89) {
            this.H.d(anVar);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            a(anVar);
            return true;
        }
        if (keyCode == 87) {
            this.H.c(anVar);
            return true;
        }
        if (keyCode == 88) {
            this.H.b(anVar);
            return true;
        }
        if (keyCode == 126) {
            b(anVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        c(anVar);
        return true;
    }

    private boolean n() {
        an anVar = this.G;
        return (anVar == null || anVar.t() == 4 || this.G.t() == 1 || !this.G.x()) ? false : true;
    }

    private void a(an anVar) {
        int iT = anVar.t();
        if (iT == 1 || iT == 4 || !anVar.x()) {
            b(anVar);
        } else {
            c(anVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(an anVar) {
        int iT = anVar.t();
        if (iT == 1) {
            this.H.a(anVar);
        } else if (iT == 4) {
            a(anVar, anVar.G(), -9223372036854775807L);
        }
        this.H.a(anVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(an anVar) {
        this.H.a(anVar, false);
    }

    private static boolean a(ba baVar, ba.c cVar) {
        if (baVar.b() > 100) {
            return false;
        }
        int iB = baVar.b();
        for (int i = 0; i < iB; i++) {
            if (baVar.a(i, cVar).o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    private static int a(TypedArray typedArray, int i) {
        return typedArray.getInt(R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i);
    }

    private final class b implements View.OnClickListener, an.d, k.a {
        @Override // com.applovin.exoplayer2.an.d
        public /* synthetic */ void a() {
            an.d.CC.$default$a(this);
        }

        @Override // com.applovin.exoplayer2.an.d
        public /* synthetic */ void a(float f) {
            an.d.CC.$default$a(this, f);
        }

        @Override // com.applovin.exoplayer2.an.d
        public /* synthetic */ void a(int i, int i2) {
            an.d.CC.$default$a(this, i, i2);
        }

        @Override // com.applovin.exoplayer2.an.d
        public /* synthetic */ void a(int i, boolean z) {
            an.d.CC.$default$a(this, i, z);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ab abVar, int i) {
            an.d.CC.$default$a(this, abVar, i);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ac acVar) {
            an.d.CC.$default$a(this, acVar);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ak akVar) {
            an.d.CC.$default$a(this, akVar);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(am amVar) {
            an.d.CC.$default$a(this, amVar);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(an.a aVar) {
            an.d.CC.$default$a(this, aVar);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(an.e eVar, an.e eVar2, int i) {
            an.d.CC.$default$a(this, eVar, eVar2, i);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ba baVar, int i) {
            an.d.CC.$default$a(this, baVar, i);
        }

        @Override // com.applovin.exoplayer2.an.d
        public /* synthetic */ void a(com.applovin.exoplayer2.g.a aVar) {
            an.d.CC.$default$a(this, aVar);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ad adVar, com.applovin.exoplayer2.j.h hVar) {
            an.d.CC.$default$a(this, adVar, hVar);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.m.n
        public /* synthetic */ void a(o oVar) {
            an.d.CC.$default$a(this, oVar);
        }

        @Override // com.applovin.exoplayer2.an.d
        public /* synthetic */ void a(com.applovin.exoplayer2.o oVar) {
            an.d.CC.$default$a(this, oVar);
        }

        @Override // com.applovin.exoplayer2.an.d
        public /* synthetic */ void a(List list) {
            an.d.CC.$default$a(this, list);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(boolean z, int i) {
            an.b.CC.$default$a(this, z, i);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.b.g
        public /* synthetic */ void a_(boolean z) {
            an.d.CC.$default$a_(this, z);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void b() {
            an.b.CC.$default$b(this);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void b(int i) {
            an.d.CC.$default$b(this, i);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void b(ak akVar) {
            an.d.CC.$default$b(this, akVar);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void b(boolean z, int i) {
            an.d.CC.$default$b(this, z, i);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void b_(boolean z) {
            an.d.CC.$default$b_(this, z);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void c(int i) {
            an.d.CC.$default$c(this, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void c(boolean z) {
            an.b.CC.$default$c(this, z);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void d(int i) {
            an.d.CC.$default$d(this, i);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void d(boolean z) {
            an.d.CC.$default$d(this, z);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void e(int i) {
            an.b.CC.$default$e(this, i);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void e(boolean z) {
            an.d.CC.$default$e(this, z);
        }

        private b() {
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void a(an anVar, an.c cVar) {
            if (cVar.a(4, 5)) {
                f.this.f();
            }
            if (cVar.a(4, 5, 7)) {
                f.this.k();
            }
            if (cVar.a(8)) {
                f.this.h();
            }
            if (cVar.a(9)) {
                f.this.i();
            }
            if (cVar.a(8, 9, 11, 0, 13)) {
                f.this.g();
            }
            if (cVar.a(11, 0)) {
                f.this.j();
            }
        }

        @Override // com.applovin.exoplayer2.ui.k.a
        public void a(k kVar, long j) {
            f.this.M = true;
            if (f.this.m != null) {
                f.this.m.setText(ai.a(f.this.o, f.this.p, j));
            }
        }

        @Override // com.applovin.exoplayer2.ui.k.a
        public void b(k kVar, long j) {
            if (f.this.m != null) {
                f.this.m.setText(ai.a(f.this.o, f.this.p, j));
            }
        }

        @Override // com.applovin.exoplayer2.ui.k.a
        public void a(k kVar, long j, boolean z) {
            f.this.M = false;
            if (z || f.this.G == null) {
                return;
            }
            f fVar = f.this;
            fVar.a(fVar.G, j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            an anVar = f.this.G;
            if (anVar == null) {
                return;
            }
            if (f.this.d == view) {
                f.this.H.c(anVar);
                return;
            }
            if (f.this.c == view) {
                f.this.H.b(anVar);
                return;
            }
            if (f.this.g != view) {
                if (f.this.h == view) {
                    f.this.H.d(anVar);
                    return;
                }
                if (f.this.e == view) {
                    f.this.b(anVar);
                    return;
                }
                if (f.this.f == view) {
                    f.this.c(anVar);
                    return;
                } else {
                    if (f.this.i != view) {
                        if (f.this.j == view) {
                            f.this.H.b(anVar, !anVar.z());
                            return;
                        }
                        return;
                    }
                    f.this.H.a(anVar, com.applovin.exoplayer2.l.ab.a(anVar.y(), f.this.P));
                    return;
                }
            }
            if (anVar.t() != 4) {
                f.this.H.e(anVar);
            }
        }
    }

    private static final class a {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }
}
