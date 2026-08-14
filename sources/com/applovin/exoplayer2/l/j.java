package com.applovin.exoplayer2.l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f618a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final Handler b;
    private final int[] c;
    private final b d;
    private EGLDisplay e;
    private EGLContext f;
    private EGLSurface g;
    private SurfaceTexture h;

    public interface b {
        void a();
    }

    public static final class a extends RuntimeException {
        private a(String str) {
            super(str);
        }
    }

    public j(Handler handler) {
        this(handler, null);
    }

    public j(Handler handler, b bVar) {
        this.b = handler;
        this.d = bVar;
        this.c = new int[1];
    }

    public void a(int i) {
        EGLDisplay eGLDisplayD = d();
        this.e = eGLDisplayD;
        EGLConfig eGLConfigA = a(eGLDisplayD);
        EGLContext eGLContextA = a(this.e, eGLConfigA, i);
        this.f = eGLContextA;
        this.g = a(this.e, eGLConfigA, eGLContextA, i);
        a(this.c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.c[0]);
        this.h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        this.b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.e, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface = this.g;
            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.e, this.g);
            }
            EGLContext eGLContext = this.f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.e, eGLContext);
            }
            if (ai.f611a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay2 = this.e;
            if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.e);
            }
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }
    }

    public SurfaceTexture b() {
        return (SurfaceTexture) com.applovin.exoplayer2.l.a.b(this.h);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        c();
        SurfaceTexture surfaceTexture = this.h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    private void c() {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a();
        }
    }

    private static EGLDisplay d() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new a("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new a("eglInitialize failed");
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f618a, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new a(ai.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new a("eglCreateContext failed");
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        int[] iArr;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new a("eglMakeCurrent failed");
    }

    private static void a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        n.b();
    }
}
