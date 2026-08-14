package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zznc extends IllegalArgumentException {
    zznc(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
