package com.applovin.exoplayer2.d;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import com.applovin.exoplayer2.c$$ExternalSyntheticApiModelOutline0;
import com.applovin.exoplayer2.d.c;
import com.applovin.exoplayer2.l.ai;
import com.google.android.gms.games.GamesStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static int a(Exception exc, int i) {
        if (ai.f611a >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (ai.f611a >= 23 && c.a(exc)) {
            return 6006;
        }
        if (ai.f611a >= 18 && a.a(exc)) {
            return 6002;
        }
        if (ai.f611a >= 18 && a.b(exc)) {
            return 6007;
        }
        if (exc instanceof t) {
            return 6001;
        }
        if (exc instanceof c.d) {
            return 6003;
        }
        if (exc instanceof q) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static final class a {
        public static boolean a(Throwable th) {
            return th instanceof NotProvisionedException;
        }

        public static boolean b(Throwable th) {
            return th instanceof DeniedByServerException;
        }
    }

    private static final class b {
        public static boolean a(Throwable th) {
            return c$$ExternalSyntheticApiModelOutline0.m229m((Object) th);
        }

        public static int b(Throwable th) {
            return com.applovin.exoplayer2.h.b(ai.d(c$$ExternalSyntheticApiModelOutline0.m221m((Object) th).getDiagnosticInfo()));
        }
    }

    private static final class c {
        public static boolean a(Throwable th) {
            return c$$ExternalSyntheticApiModelOutline0.m$1(th);
        }
    }
}
