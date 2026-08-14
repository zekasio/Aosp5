package com.vungle.warren.utility;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PriorityRunnable implements Comparable, Runnable {
    public abstract Integer getPriority();

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof PriorityRunnable)) {
            return -1;
        }
        return ((PriorityRunnable) obj).getPriority().compareTo(getPriority());
    }
}
