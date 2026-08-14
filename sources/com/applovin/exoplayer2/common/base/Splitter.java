package com.applovin.exoplayer2.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final b strategy;
    private final CharMatcher trimmer;

    private interface b {
        Iterator<String> b(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(b bVar) {
        this(bVar, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    private Splitter(b bVar, boolean z, CharMatcher charMatcher, int i) {
        this.strategy = bVar;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    public static Splitter on(char c) {
        return on(CharMatcher.is(c));
    }

    public static Splitter on(final CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new b() { // from class: com.applovin.exoplayer2.common.base.Splitter.1
            @Override // com.applovin.exoplayer2.common.base.Splitter.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) { // from class: com.applovin.exoplayer2.common.base.Splitter.1.1
                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    int b(int i) {
                        return i + 1;
                    }

                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    int a(int i) {
                        return charMatcher.indexIn(this.b, i);
                    }
                };
            }
        });
    }

    public static Splitter on(final String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new Splitter(new b() { // from class: com.applovin.exoplayer2.common.base.Splitter.2
            @Override // com.applovin.exoplayer2.common.base.Splitter.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) { // from class: com.applovin.exoplayer2.common.base.Splitter.2.1
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                    
                        r6 = r6 + 1;
                     */
                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public int a(int r6) {
                        /*
                            r5 = this;
                            com.applovin.exoplayer2.common.base.Splitter$2 r0 = com.applovin.exoplayer2.common.base.Splitter.AnonymousClass2.this
                            java.lang.String r0 = r1
                            int r0 = r0.length()
                            java.lang.CharSequence r1 = r5.b
                            int r1 = r1.length()
                            int r1 = r1 - r0
                        Lf:
                            if (r6 > r1) goto L2d
                            r2 = 0
                        L12:
                            if (r2 >= r0) goto L2c
                            java.lang.CharSequence r3 = r5.b
                            int r4 = r2 + r6
                            char r3 = r3.charAt(r4)
                            com.applovin.exoplayer2.common.base.Splitter$2 r4 = com.applovin.exoplayer2.common.base.Splitter.AnonymousClass2.this
                            java.lang.String r4 = r1
                            char r4 = r4.charAt(r2)
                            if (r3 == r4) goto L29
                            int r6 = r6 + 1
                            goto Lf
                        L29:
                            int r2 = r2 + 1
                            goto L12
                        L2c:
                            return r6
                        L2d:
                            r6 = -1
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.Splitter.AnonymousClass2.AnonymousClass1.a(int):int");
                    }

                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int b(int i) {
                        return i + str.length();
                    }
                };
            }
        });
    }

    public static Splitter fixedLength(final int i) {
        Preconditions.checkArgument(i > 0, "The length may not be less than 1");
        return new Splitter(new b() { // from class: com.applovin.exoplayer2.common.base.Splitter.3
            @Override // com.applovin.exoplayer2.common.base.Splitter.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) { // from class: com.applovin.exoplayer2.common.base.Splitter.3.1
                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int b(int i2) {
                        return i2;
                    }

                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int a(int i2) {
                        int i3 = i2 + i;
                        if (i3 < this.b.length()) {
                            return i3;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public Splitter limit(int i) {
        Preconditions.checkArgument(i > 0, "must be greater than zero: %s", i);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.b(this, charSequence);
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> itSplittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itSplittingIterator.hasNext()) {
            arrayList.add(itSplittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static abstract class a extends com.applovin.exoplayer2.common.base.b<String> {
        final CharSequence b;
        final CharMatcher c;
        final boolean d;
        int e = 0;
        int f;

        abstract int a(int i);

        abstract int b(int i);

        protected a(Splitter splitter, CharSequence charSequence) {
            this.c = splitter.trimmer;
            this.d = splitter.omitEmptyStrings;
            this.f = splitter.limit;
            this.b = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.applovin.exoplayer2.common.base.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String a() {
            int iA;
            int i = this.e;
            while (true) {
                int i2 = this.e;
                if (i2 != -1) {
                    iA = a(i2);
                    if (iA == -1) {
                        iA = this.b.length();
                        this.e = -1;
                    } else {
                        this.e = b(iA);
                    }
                    int i3 = this.e;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.e = i4;
                        if (i4 > this.b.length()) {
                            this.e = -1;
                        }
                    } else {
                        while (i < iA && this.c.matches(this.b.charAt(i))) {
                            i++;
                        }
                        while (iA > i && this.c.matches(this.b.charAt(iA - 1))) {
                            iA--;
                        }
                        if (!this.d || i != iA) {
                            break;
                        }
                        i = this.e;
                    }
                } else {
                    return b();
                }
            }
            int i5 = this.f;
            if (i5 == 1) {
                iA = this.b.length();
                this.e = -1;
                while (iA > i && this.c.matches(this.b.charAt(iA - 1))) {
                    iA--;
                }
            } else {
                this.f = i5 - 1;
            }
            return this.b.subSequence(i, iA).toString();
        }
    }
}
