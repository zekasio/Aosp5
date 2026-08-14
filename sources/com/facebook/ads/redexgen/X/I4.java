package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.NavigableSet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface I4 {
    void A3P(String str, IG ig) throws I2;

    void A44(File file) throws I2;

    long A5v();

    long A5w(String str, long j, long j2);

    @NonNull
    NavigableSet<I8> A5x(String str);

    long A68(String str);

    IE A69(String str);

    void ADq(I8 i8);

    void ADx(I8 i8) throws I2;

    void AEW(String str, long j) throws I2;

    File AEx(String str, long j, long j2) throws I2;

    I8 AEz(String str, long j) throws InterruptedException, I2;

    @Nullable
    I8 AF0(String str, long j) throws I2;
}
