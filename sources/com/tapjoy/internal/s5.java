package com.tapjoy.internal;

import java.util.Observable;

/* JADX INFO: loaded from: classes2.dex */
public class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1906a = new a();
    public static final a b = new a();
    public static final a c = new a();
    public static final a d = new a();
    public static final a e = new a();

    public static class a extends Observable {
        @Override // java.util.Observable
        public void notifyObservers() {
            setChanged();
            super.notifyObservers();
        }

        @Override // java.util.Observable
        public void notifyObservers(Object obj) {
            setChanged();
            super.notifyObservers(obj);
        }
    }
}
