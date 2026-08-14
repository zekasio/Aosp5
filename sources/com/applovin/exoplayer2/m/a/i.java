package com.applovin.exoplayer2.m.a;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.m.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f649a;
    private final SensorManager b;
    private final Sensor c;
    private final d d;
    private final Handler e;
    private final h f;
    private SurfaceTexture g;
    private Surface h;
    private boolean i;
    private boolean j;
    private boolean k;

    public interface a {
        void a(Surface surface);
    }

    public void a(a aVar) {
        this.f649a.add(aVar);
    }

    public void b(a aVar) {
        this.f649a.remove(aVar);
    }

    public Surface getVideoSurface() {
        return this.h;
    }

    public l getVideoFrameMetadataListener() {
        return this.f;
    }

    public com.applovin.exoplayer2.m.a.a getCameraMotionListener() {
        return this.f;
    }

    public void setDefaultStereoMode(int i) {
        this.f.a(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.i = z;
        a();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.j = true;
        a();
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new Runnable() { // from class: com.applovin.exoplayer2.m.a.i$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Surface surface = this.h;
        if (surface != null) {
            Iterator<a> it = this.f649a.iterator();
            while (it.hasNext()) {
                it.next().a(surface);
            }
        }
        a(this.g, surface);
        this.g = null;
        this.h = null;
    }

    private void a() {
        boolean z = this.i && this.j;
        Sensor sensor = this.c;
        if (sensor == null || z == this.k) {
            return;
        }
        if (z) {
            this.b.registerListener(this.d, sensor, 0);
        } else {
            this.b.unregisterListener(this.d);
        }
        this.k = z;
    }

    private static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
