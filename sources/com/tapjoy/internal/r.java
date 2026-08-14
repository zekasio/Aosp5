package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public enum r {
    UNSPECIFIED,
    PORTRAIT,
    LANDSCAPE,
    SQUARE,
    NATURAL_PORTRAIT(PORTRAIT),
    RIGHT_LANDSCAPE(LANDSCAPE, NATURAL_PORTRAIT),
    REVERSE_PORTRAIT(PORTRAIT, NATURAL_PORTRAIT),
    LEFT_LANDSCAPE(LANDSCAPE, NATURAL_PORTRAIT),
    NATURAL_LANDSCAPE(LANDSCAPE),
    RIGHT_PORTRAIT(PORTRAIT, NATURAL_LANDSCAPE),
    REVERSE_LANDSCAPE(LANDSCAPE, NATURAL_LANDSCAPE),
    LEFT_PORTRAIT(PORTRAIT, NATURAL_LANDSCAPE),
    NATURAL_SQUARE(SQUARE),
    RIGHT_SQUARE(SQUARE, NATURAL_SQUARE),
    REVERSE_SQUARE(SQUARE, NATURAL_SQUARE),
    LEFT_SQUARE(SQUARE, NATURAL_SQUARE);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f1893a;
    public final r b;

    r() {
        this.f1893a = this;
        this.b = null;
    }

    public int a() {
        if (this.b != null) {
            return ordinal() - this.b.ordinal();
        }
        return 0;
    }

    public boolean b() {
        r rVar = LANDSCAPE;
        return this == rVar || this.f1893a == rVar;
    }

    public boolean c() {
        r rVar = PORTRAIT;
        return this == rVar || this.f1893a == rVar;
    }

    public static r a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = point.x;
        int i2 = point.y;
        if (i < i2) {
            int i3 = rotation & 3;
            return i3 != 1 ? i3 != 2 ? i3 != 3 ? NATURAL_PORTRAIT : LEFT_PORTRAIT : REVERSE_PORTRAIT : RIGHT_PORTRAIT;
        }
        if (i > i2) {
            int i4 = rotation & 3;
            return i4 != 1 ? i4 != 2 ? i4 != 3 ? NATURAL_LANDSCAPE : LEFT_LANDSCAPE : REVERSE_LANDSCAPE : RIGHT_LANDSCAPE;
        }
        int i5 = rotation & 3;
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? NATURAL_SQUARE : LEFT_SQUARE : REVERSE_SQUARE : RIGHT_SQUARE;
    }

    r(r rVar) {
        this.f1893a = rVar;
        this.b = this;
    }

    r(r rVar, r rVar2) {
        this.f1893a = rVar;
        this.b = rVar2;
    }
}
