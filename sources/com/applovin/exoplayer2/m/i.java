package com.applovin.exoplayer2.m;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import androidx.work.Data;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class i extends GLSurfaceView implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f659a;

    @Deprecated
    public k getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(j jVar) {
        this.f659a.a(jVar);
    }

    private static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final float[] f660a = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        private static final float[] b = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        private static final float[] c = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        private static final String[] d = {"y_tex", "u_tex", "v_tex"};
        private static final FloatBuffer e = com.applovin.exoplayer2.l.n.a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        private final GLSurfaceView f;
        private final int[] g;
        private final int[] h;
        private final int[] i;
        private final int[] j;
        private final AtomicReference<j> k;
        private final FloatBuffer[] l;
        private int m;
        private int n;
        private j o;

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int iA = com.applovin.exoplayer2.l.n.a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.m = iA;
            GLES20.glUseProgram(iA);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.m, "in_pos");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) e);
            this.h[0] = GLES20.glGetAttribLocation(this.m, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.h[0]);
            this.h[1] = GLES20.glGetAttribLocation(this.m, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.h[1]);
            this.h[2] = GLES20.glGetAttribLocation(this.m, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.h[2]);
            com.applovin.exoplayer2.l.n.b();
            this.n = GLES20.glGetUniformLocation(this.m, "mColorConversion");
            com.applovin.exoplayer2.l.n.b();
            a();
            com.applovin.exoplayer2.l.n.b();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            j andSet = this.k.getAndSet(null);
            if (andSet == null && this.o == null) {
                return;
            }
            if (andSet != null) {
                j jVar = this.o;
                if (jVar != null) {
                    jVar.f();
                }
                this.o = andSet;
            }
            j jVar2 = (j) com.applovin.exoplayer2.l.a.b(this.o);
            float[] fArr = b;
            int i = jVar2.g;
            if (i == 1) {
                fArr = f660a;
            } else if (i == 3) {
                fArr = c;
            }
            GLES20.glUniformMatrix3fv(this.n, 1, false, fArr, 0);
            int[] iArr = (int[]) com.applovin.exoplayer2.l.a.b(jVar2.f);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) com.applovin.exoplayer2.l.a.b(jVar2.e);
            int i2 = 0;
            while (i2 < 3) {
                int i3 = i2 == 0 ? jVar2.d : (jVar2.d + 1) / 2;
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.g[i2]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i3, 0, 6409, 5121, byteBufferArr[i2]);
                i2++;
            }
            int i4 = jVar2.c;
            int i5 = (i4 + 1) / 2;
            int[] iArr2 = {i4, i5, i5};
            for (int i6 = 0; i6 < 3; i6++) {
                if (this.i[i6] != iArr2[i6] || this.j[i6] != iArr[i6]) {
                    com.applovin.exoplayer2.l.a.b(iArr[i6] != 0);
                    float f = iArr2[i6] / iArr[i6];
                    this.l[i6] = com.applovin.exoplayer2.l.n.a(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.h[i6], 2, 5126, false, 0, (Buffer) this.l[i6]);
                    this.i[i6] = iArr2[i6];
                    this.j[i6] = iArr[i6];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            com.applovin.exoplayer2.l.n.b();
        }

        public void a(j jVar) {
            j andSet = this.k.getAndSet(jVar);
            if (andSet != null) {
                andSet.f();
            }
            this.f.requestRender();
        }

        private void a() {
            GLES20.glGenTextures(3, this.g, 0);
            for (int i = 0; i < 3; i++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.m, d[i]), i);
                GLES20.glActiveTexture(33984 + i);
                GLES20.glBindTexture(3553, this.g[i]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            com.applovin.exoplayer2.l.n.b();
        }
    }
}
