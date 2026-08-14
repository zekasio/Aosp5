package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static void a(boolean z, String str) throws ai {
        if (!z) {
            throw ai.b(str, null);
        }
    }

    public static int a(i iVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iC = iVar.c(bArr, i + i3, i2 - i3);
            if (iC == -1) {
                break;
            }
            i3 += iC;
        }
        return i3;
    }

    public static boolean b(i iVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            iVar.b(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean a(i iVar, int i) throws IOException {
        try {
            iVar.b(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean a(i iVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return iVar.b(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }
}
