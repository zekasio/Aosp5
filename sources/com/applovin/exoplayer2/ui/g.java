package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.m.o;
import com.applovin.exoplayer2.ui.AspectRatioFrameLayout;
import com.applovin.exoplayer2.ui.f;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g extends FrameLayout {
    private boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f690a;
    private final AspectRatioFrameLayout b;
    private final View c;
    private final View d;
    private final boolean e;
    private final ImageView f;
    private final SubtitleView g;
    private final View h;
    private final TextView i;
    private final f j;
    private final FrameLayout k;
    private final FrameLayout l;
    private an m;
    private boolean n;
    private f.d o;
    private boolean p;
    private Drawable q;
    private int r;
    private boolean s;
    private com.applovin.exoplayer2.l.k<? super ak> t;
    private CharSequence u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    private boolean a(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    public g(Context context) {
        this(context, null);
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        int i3;
        int integer;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        super(context, attributeSet, i);
        a aVar = new a();
        this.f690a = aVar;
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            ImageView imageView = new ImageView(context);
            if (ai.f611a >= 23) {
                a(getResources(), imageView);
            } else {
                b(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i7 = R.layout.applovin_exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinPlayerView, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.AppLovinPlayerView_al_shutter_background_color);
                int color = typedArrayObtainStyledAttributes.getColor(R.styleable.AppLovinPlayerView_al_shutter_background_color, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_player_layout_id, i7);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_controller, true);
                int i8 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_surface_type, 1);
                int i9 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_show_timeout, 5000);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_auto_show, true);
                integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                this.s = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.s);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z3 = z11;
                z = z12;
                i3 = i9;
                z6 = z10;
                i6 = resourceId2;
                z5 = z9;
                i5 = color;
                z4 = zHasValue;
                i4 = i8;
                i7 = resourceId;
                i2 = i10;
                z2 = z13;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = true;
            i3 = 0;
            integer = 0;
            z2 = true;
            z3 = true;
            i4 = 1;
            z4 = false;
            i5 = 0;
            z5 = true;
            i6 = 0;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i7, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.al_exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a(aspectRatioFrameLayout, i3);
        }
        View viewFindViewById = findViewById(R.id.al_exo_shutter);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z4) {
            viewFindViewById.setBackgroundColor(i5);
        }
        if (aspectRatioFrameLayout != null && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 == 2) {
                this.d = new TextureView(context);
            } else if (i4 == 3) {
                try {
                    this.d = (View) Class.forName("com.applovin.exoplayer2.m.a.i").getConstructor(Context.class).newInstance(context);
                    z8 = true;
                    this.d.setLayoutParams(layoutParams);
                    this.d.setOnClickListener(aVar);
                    this.d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.d, 0);
                    z7 = z8;
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i4 == 4) {
                try {
                    this.d = (View) Class.forName("com.applovin.exoplayer2.m.i").getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else {
                this.d = new SurfaceView(context);
            }
            z8 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(aVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
            z7 = z8;
        } else {
            this.d = null;
            z7 = false;
        }
        this.e = z7;
        this.k = (FrameLayout) findViewById(R.id.al_exo_ad_overlay);
        this.l = (FrameLayout) findViewById(R.id.al_exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_artwork);
        this.f = imageView2;
        this.p = z5 && imageView2 != null;
        if (i6 != 0) {
            this.q = ContextCompat.getDrawable(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.al_exo_subtitles);
        this.g = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.c();
        }
        View viewFindViewById2 = findViewById(R.id.al_exo_buffering);
        this.h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.r = integer;
        TextView textView = (TextView) findViewById(R.id.al_exo_error_message);
        this.i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        f fVar = (f) findViewById(R.id.al_exo_controller);
        View viewFindViewById3 = findViewById(R.id.al_exo_controller_placeholder);
        if (fVar != null) {
            this.j = fVar;
        } else if (viewFindViewById3 != null) {
            f fVar2 = new f(context, null, 0, attributeSet);
            this.j = fVar2;
            fVar2.setId(R.id.al_exo_controller);
            fVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(fVar2, iIndexOfChild);
        } else {
            this.j = null;
        }
        f fVar3 = this.j;
        this.v = fVar3 != null ? i2 : 0;
        this.y = z3;
        this.w = z;
        this.x = z2;
        this.n = z6 && fVar3 != null;
        b();
        m();
        f fVar4 = this.j;
        if (fVar4 != null) {
            fVar4.a(aVar);
        }
    }

    public an getPlayer() {
        return this.m;
    }

    public void setPlayer(an anVar) {
        com.applovin.exoplayer2.l.a.b(Looper.myLooper() == Looper.getMainLooper());
        com.applovin.exoplayer2.l.a.a(anVar == null || anVar.r() == Looper.getMainLooper());
        an anVar2 = this.m;
        if (anVar2 == anVar) {
            return;
        }
        if (anVar2 != null) {
            anVar2.b(this.f690a);
            if (anVar2.a(26)) {
                View view = this.d;
                if (view instanceof TextureView) {
                    anVar2.b((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    anVar2.b((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.m = anVar;
        if (c()) {
            this.j.setPlayer(anVar);
        }
        k();
        l();
        c(true);
        if (anVar != null) {
            if (anVar.a(26)) {
                View view2 = this.d;
                if (view2 instanceof TextureView) {
                    anVar.a((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    anVar.a((SurfaceView) view2);
                }
                h();
            }
            if (this.g != null && anVar.a(27)) {
                this.g.setCues(anVar.V());
            }
            anVar.a(this.f690a);
            a(false);
            return;
        }
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setResizeMode(int i) {
        com.applovin.exoplayer2.l.a.a(this.b);
        this.b.setResizeMode(i);
    }

    public int getResizeMode() {
        com.applovin.exoplayer2.l.a.a(this.b);
        return this.b.getResizeMode();
    }

    public boolean getUseArtwork() {
        return this.p;
    }

    public void setUseArtwork(boolean z) {
        com.applovin.exoplayer2.l.a.b((z && this.f == null) ? false : true);
        if (this.p != z) {
            this.p = z;
            c(false);
        }
    }

    public Drawable getDefaultArtwork() {
        return this.q;
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.q != drawable) {
            this.q = drawable;
            c(false);
        }
    }

    public boolean getUseController() {
        return this.n;
    }

    public void setUseController(boolean z) {
        com.applovin.exoplayer2.l.a.b((z && this.j == null) ? false : true);
        if (this.n == z) {
            return;
        }
        this.n = z;
        if (c()) {
            this.j.setPlayer(this.m);
        } else {
            f fVar = this.j;
            if (fVar != null) {
                fVar.b();
                this.j.setPlayer(null);
            }
        }
        m();
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.s != z) {
            this.s = z;
            c(false);
        }
    }

    public void setShowBuffering(int i) {
        if (this.r != i) {
            this.r = i;
            k();
        }
    }

    public void setErrorMessageProvider(com.applovin.exoplayer2.l.k<? super ak> kVar) {
        if (this.t != kVar) {
            this.t = kVar;
            l();
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        com.applovin.exoplayer2.l.a.b(this.i != null);
        this.u = charSequence;
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        an anVar = this.m;
        if (anVar != null && anVar.K()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zA = a(keyEvent.getKeyCode());
        if (zA && c() && !this.j.c()) {
            a(true);
            return true;
        }
        if (a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            a(true);
            return true;
        }
        if (zA && c()) {
            a(true);
        }
        return false;
    }

    public boolean a(KeyEvent keyEvent) {
        return c() && this.j.a(keyEvent);
    }

    public void a() {
        b(f());
    }

    public void b() {
        f fVar = this.j;
        if (fVar != null) {
            fVar.b();
        }
    }

    public int getControllerShowTimeoutMs() {
        return this.v;
    }

    public void setControllerShowTimeoutMs(int i) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.v = i;
        if (this.j.c()) {
            a();
        }
    }

    public boolean getControllerHideOnTouch() {
        return this.y;
    }

    public void setControllerHideOnTouch(boolean z) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.y = z;
        m();
    }

    public boolean getControllerAutoShow() {
        return this.w;
    }

    public void setControllerAutoShow(boolean z) {
        this.w = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.x = z;
    }

    public void setControllerVisibilityListener(f.d dVar) {
        com.applovin.exoplayer2.l.a.a(this.j);
        f.d dVar2 = this.o;
        if (dVar2 == dVar) {
            return;
        }
        if (dVar2 != null) {
            this.j.b(dVar2);
        }
        this.o = dVar;
        if (dVar != null) {
            this.j.a(dVar);
        }
    }

    @Deprecated
    public void setControlDispatcher(com.applovin.exoplayer2.i iVar) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setControlDispatcher(iVar);
    }

    public void setShowRewindButton(boolean z) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowRewindButton(z);
    }

    public void setShowFastForwardButton(boolean z) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowFastForwardButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowPreviousButton(z);
    }

    public void setShowNextButton(boolean z) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowNextButton(z);
    }

    public void setRepeatToggleModes(int i) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setRepeatToggleModes(i);
    }

    public void setShowShuffleButton(boolean z) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowShuffleButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowMultiWindowTimeBar(z);
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        com.applovin.exoplayer2.l.a.a(this.b);
        this.b.setAspectRatioListener(aVar);
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.l;
    }

    public SubtitleView getSubtitleView() {
        return this.g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c() || this.m == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A = true;
            return true;
        }
        if (action != 1 || !this.A) {
            return false;
        }
        this.A = false;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return e();
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!c() || this.m == null) {
            return false;
        }
        a(true);
        return true;
    }

    protected void a(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) com.applovin.exoplayer2.l.a.a(this.k, "exo_ad_overlay must be present for ad playback");
    }

    public List<com.applovin.exoplayer2.ui.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            arrayList.add(new com.applovin.exoplayer2.ui.a(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        f fVar = this.j;
        if (fVar != null) {
            arrayList.add(new com.applovin.exoplayer2.ui.a(fVar, 0));
        }
        return s.a((Collection) arrayList);
    }

    private boolean c() {
        if (!this.n) {
            return false;
        }
        com.applovin.exoplayer2.l.a.a(this.j);
        return true;
    }

    private boolean d() {
        if (!this.p) {
            return false;
        }
        com.applovin.exoplayer2.l.a.a(this.f);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        if (!c() || this.m == null) {
            return false;
        }
        if (!this.j.c()) {
            a(true);
        } else if (this.y) {
            this.j.b();
        }
        return true;
    }

    private void a(boolean z) {
        if (!(g() && this.x) && c()) {
            boolean z2 = this.j.c() && this.j.getShowTimeoutMs() <= 0;
            boolean zF = f();
            if (z || z2 || zF) {
                b(zF);
            }
        }
    }

    private boolean f() {
        an anVar = this.m;
        if (anVar == null) {
            return true;
        }
        int iT = anVar.t();
        return this.w && (iT == 1 || iT == 4 || !this.m.x());
    }

    private void b(boolean z) {
        if (c()) {
            this.j.setShowTimeoutMs(z ? 0 : this.v);
            this.j.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        an anVar = this.m;
        return anVar != null && anVar.K() && this.m.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        an anVar = this.m;
        if (anVar == null || anVar.P().a()) {
            if (this.s) {
                return;
            }
            i();
            j();
            return;
        }
        if (z && !this.s) {
            j();
        }
        com.applovin.exoplayer2.j.h hVarQ = anVar.Q();
        for (int i = 0; i < hVarQ.f565a; i++) {
            com.applovin.exoplayer2.j.g gVarA = hVarQ.a(i);
            if (gVarA != null) {
                for (int i2 = 0; i2 < gVarA.e(); i2++) {
                    if (u.e(gVarA.a(i2).l) == 2) {
                        i();
                        return;
                    }
                }
            }
        }
        j();
        if (d() && (a(anVar.R()) || a(this.q))) {
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        an anVar = this.m;
        o oVarT = anVar != null ? anVar.T() : o.f666a;
        int i = oVarT.b;
        int i2 = oVarT.c;
        int i3 = oVarT.d;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * oVarT.e) / i2;
        View view = this.d;
        if (view instanceof TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.z != 0) {
                view.removeOnLayoutChangeListener(this.f690a);
            }
            this.z = i3;
            if (i3 != 0) {
                this.d.addOnLayoutChangeListener(this.f690a);
            }
            b((TextureView) this.d, this.z);
        }
        a(this.b, this.e ? 0.0f : f);
    }

    private boolean a(ac acVar) {
        if (acVar.l == null) {
            return false;
        }
        return a(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(acVar.l, 0, acVar.l.length)));
    }

    private boolean a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(this.b, intrinsicWidth / intrinsicHeight);
                this.f.setImageDrawable(drawable);
                this.f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void i() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.f.setVisibility(4);
        }
    }

    private void j() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k() {
        /*
            r4 = this;
            android.view.View r0 = r4.h
            if (r0 == 0) goto L2b
            com.applovin.exoplayer2.an r0 = r4.m
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.t()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.r
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            com.applovin.exoplayer2.an r0 = r4.m
            boolean r0 = r0.x()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            android.view.View r0 = r4.h
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.g.k():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.applovin.exoplayer2.l.k<? super ak> kVar;
        TextView textView = this.i;
        if (textView != null) {
            CharSequence charSequence = this.u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.i.setVisibility(0);
                return;
            }
            an anVar = this.m;
            ak akVarE = anVar != null ? anVar.e() : null;
            if (akVarE != null && (kVar = this.t) != null) {
                this.i.setText((CharSequence) kVar.a(akVarE).second);
                this.i.setVisibility(0);
            } else {
                this.i.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        f fVar = this.j;
        if (fVar == null || !this.n) {
            setContentDescription(null);
        } else if (fVar.getVisibility() == 0) {
            setContentDescription(this.y ? getResources().getString(R.string.al_exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.al_exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (g() && this.x) {
            b();
        } else {
            a(false);
        }
    }

    private static void a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color, null));
    }

    private static void b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color));
    }

    private static void a(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    private final class a implements View.OnClickListener, View.OnLayoutChangeListener, an.d, f.d {
        private final ba.a b = new ba.a();
        private Object c;

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
        public /* synthetic */ void a(an anVar, an.c cVar) {
            an.d.CC.$default$a(this, anVar, cVar);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ba baVar, int i) {
            an.d.CC.$default$a(this, baVar, i);
        }

        @Override // com.applovin.exoplayer2.an.d
        public /* synthetic */ void a(com.applovin.exoplayer2.g.a aVar) {
            an.d.CC.$default$a(this, aVar);
        }

        @Override // com.applovin.exoplayer2.an.d
        public /* synthetic */ void a(com.applovin.exoplayer2.o oVar) {
            an.d.CC.$default$a(this, oVar);
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
        public /* synthetic */ void b(ak akVar) {
            an.d.CC.$default$b(this, akVar);
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

        public a() {
        }

        @Override // com.applovin.exoplayer2.an.d
        public void a(List<com.applovin.exoplayer2.i.a> list) {
            if (g.this.g != null) {
                g.this.g.setCues(list);
            }
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.m.n
        public void a(o oVar) {
            g.this.h();
        }

        @Override // com.applovin.exoplayer2.an.d
        public void a() {
            if (g.this.c != null) {
                g.this.c.setVisibility(4);
            }
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void a(ad adVar, com.applovin.exoplayer2.j.h hVar) {
            an anVar = (an) com.applovin.exoplayer2.l.a.b(g.this.m);
            ba baVarS = anVar.S();
            if (baVarS.d()) {
                this.c = null;
            } else if (!anVar.P().a()) {
                this.c = baVarS.a(anVar.F(), this.b, true).b;
            } else {
                Object obj = this.c;
                if (obj != null) {
                    int iC = baVarS.c(obj);
                    if (iC != -1) {
                        if (anVar.G() == baVarS.a(iC, this.b).c) {
                            return;
                        }
                    }
                    this.c = null;
                }
            }
            g.this.c(false);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void b(int i) {
            g.this.k();
            g.this.l();
            g.this.n();
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void b(boolean z, int i) {
            g.this.k();
            g.this.n();
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void a(an.e eVar, an.e eVar2, int i) {
            if (g.this.g() && g.this.x) {
                g.this.b();
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            g.b((TextureView) view, g.this.z);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.e();
        }

        @Override // com.applovin.exoplayer2.ui.f.d
        public void a(int i) {
            g.this.m();
        }
    }
}
