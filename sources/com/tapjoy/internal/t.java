package com.tapjoy.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class t implements Iterator<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f1909a;
    public int b;
    public int c = 0;

    public t(ViewGroup viewGroup) {
        this.f1909a = viewGroup;
        this.b = viewGroup.getChildCount();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public View next() {
        ViewGroup viewGroup = this.f1909a;
        int i = this.c;
        this.c = i + 1;
        return viewGroup.getChildAt(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f1909a.removeViewAt(this.c - 1);
    }
}
