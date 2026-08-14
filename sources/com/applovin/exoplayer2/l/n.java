package com.applovin.exoplayer2.l;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f621a = false;

    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static boolean a(Context context) {
        String strEglQueryString;
        if (ai.f611a < 24) {
            return false;
        }
        if (ai.f611a >= 26 || !("samsung".equals(ai.c) || "XT1650".equals(ai.d))) {
            return (ai.f611a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean a() {
        String strEglQueryString;
        return ai.f611a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static void b() {
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            q.d("GlUtil", "glError " + GLU.gluErrorString(iGlGetError));
            i = iGlGetError;
        }
        if (i != 0) {
            a("glError " + GLU.gluErrorString(i));
        }
    }

    public static int a(String str, String str2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        b();
        a(35633, str, iGlCreateProgram);
        a(35632, str2, iGlCreateProgram);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        }
        b();
        return iGlCreateProgram;
    }

    public static FloatBuffer a(float[] fArr) {
        return (FloatBuffer) a(fArr.length).put(fArr).flip();
    }

    public static FloatBuffer a(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    private static void a(int i, String str, int i2) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            a(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i2, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        b();
    }

    private static void a(String str) {
        q.d("GlUtil", str);
        if (f621a) {
            throw new a(str);
        }
    }
}
