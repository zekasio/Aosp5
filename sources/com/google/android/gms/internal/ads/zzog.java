package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzog extends Exception {
    public zzog(long j, long j2) {
        super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
    }
}
