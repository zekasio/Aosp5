package com.applovin.exoplayer2.b;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class d implements com.applovin.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f61a = new a().a();
    public static final g.a<d> f = new g.a() { // from class: com.applovin.exoplayer2.b.d$$ExternalSyntheticLambda2
        @Override // com.applovin.exoplayer2.g.a
        public final com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
            return d.a(bundle);
        }
    };
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    private AudioAttributes g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f62a = 0;
        private int b = 0;
        private int c = 1;
        private int d = 1;

        public a a(int i) {
            this.f62a = i;
            return this;
        }

        public a b(int i) {
            this.b = i;
            return this;
        }

        public a c(int i) {
            this.c = i;
            return this;
        }

        public a d(int i) {
            this.d = i;
            return this;
        }

        public d a() {
            return new d(this.f62a, this.b, this.c, this.d);
        }
    }

    private d(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public AudioAttributes a() {
        if (this.g == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.b).setFlags(this.c).setUsage(this.d);
            if (ai.f611a >= 29) {
                usage.setAllowedCapturePolicy(this.e);
            }
            this.g = usage.build();
        }
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e;
    }

    public int hashCode() {
        return ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d a(Bundle bundle) {
        a aVar = new a();
        if (bundle.containsKey(a(0))) {
            aVar.a(bundle.getInt(a(0)));
        }
        if (bundle.containsKey(a(1))) {
            aVar.b(bundle.getInt(a(1)));
        }
        if (bundle.containsKey(a(2))) {
            aVar.c(bundle.getInt(a(2)));
        }
        if (bundle.containsKey(a(3))) {
            aVar.d(bundle.getInt(a(3)));
        }
        return aVar.a();
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
