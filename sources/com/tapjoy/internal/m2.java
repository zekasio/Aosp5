package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;

/* JADX INFO: loaded from: classes2.dex */
public enum m2 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(TJAdUnitConstants.String.VIDEO_LOADED),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1849a;

    m2(String str) {
        this.f1849a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1849a;
    }
}
