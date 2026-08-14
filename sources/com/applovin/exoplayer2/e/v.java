package com.applovin.exoplayer2.e;

/* JADX INFO: loaded from: classes.dex */
public interface v {
    a a(long j);

    boolean a();

    long b();

    public static class b implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f388a;
        private final a b;

        @Override // com.applovin.exoplayer2.e.v
        public boolean a() {
            return false;
        }

        public b(long j) {
            this(j, 0L);
        }

        public b(long j, long j2) {
            this.f388a = j;
            this.b = new a(j2 == 0 ? w.f389a : new w(0L, j2));
        }

        @Override // com.applovin.exoplayer2.e.v
        public long b() {
            return this.f388a;
        }

        @Override // com.applovin.exoplayer2.e.v
        public a a(long j) {
            return this.b;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f387a;
        public final w b;

        public a(w wVar) {
            this(wVar, wVar);
        }

        public a(w wVar, w wVar2) {
            this.f387a = (w) com.applovin.exoplayer2.l.a.b(wVar);
            this.b = (w) com.applovin.exoplayer2.l.a.b(wVar2);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f387a);
            if (this.f387a.equals(this.b)) {
                str = "";
            } else {
                str = ", " + this.b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f387a.equals(aVar.f387a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (this.f387a.hashCode() * 31) + this.b.hashCode();
        }
    }
}
