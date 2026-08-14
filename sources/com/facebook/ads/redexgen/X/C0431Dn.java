package com.facebook.ads.redexgen.X;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0431Dn {
    public static String[] A0D = {"AytN1i9iULWpAtR2eIfx7QogEUuyUUX4", "EimBg0", "4eNGQSgLmn9gvaK14R8kSqnFmk3YDtSi", "2fyuIcJ7pz76VyZl9SMNa1chyaGQvScm", "P7Bhpggufyl3vqAGq89SAtaTbaXWozcC", "R5XBsX91lZ7HUyZ9KaLj5rOllXZCV26j", "kcg4Z6bP9bO4onTQZ6Z5ctV", "10vbbYYZLuUPLbeNO2JvVvesRy5vOtek"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC0417Co A0C;

    public C0431Dn(InterfaceC0417Co interfaceC0417Co) {
        this.A0C = interfaceC0417Co;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void A00(int i) {
        boolean z = this.A0A;
        this.A0C.AEH(this.A04, z ? 1 : 0, (int) (this.A01 - this.A03), i, null);
    }

    public final void A01() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A09 = false;
        this.A0B = false;
    }

    public final void A02(long j, int i) {
        if (this.A0B && this.A06) {
            this.A0A = this.A08;
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0D[7] = "hh10uoQ2wjGgTUsUevn281NORx98TkB1";
            this.A0B = false;
            return;
        }
        if (!this.A05 && !this.A06) {
            return;
        }
        if (this.A09) {
            A00(i + ((int) (j - this.A01)));
        }
        this.A03 = this.A01;
        this.A04 = this.A02;
        this.A09 = true;
        this.A0A = this.A08;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(long r7, int r9, int r10, long r11) {
        /*
            r6 = this;
            r3 = 0
            r6.A06 = r3
            r6.A05 = r3
            r6.A02 = r11
            r6.A00 = r3
            r6.A01 = r7
            r4 = 1
            r0 = 32
            if (r10 < r0) goto L48
            boolean r0 = r6.A0B
            if (r0 != 0) goto L1d
            boolean r0 = r6.A09
            if (r0 == 0) goto L1d
            r6.A00(r9)
            r6.A09 = r3
        L1d:
            r0 = 34
            if (r10 > r0) goto L48
            boolean r5 = r6.A0B
            r5 = r5 ^ r4
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0431Dn.A0D
            r0 = 2
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 16
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L7f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0431Dn.A0D
            java.lang.String r1 = "wqfZZQZmQi2aSzTJgSnfuEG5zpWvg4YI"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "uUijDIjLUkfNDtGFhTuIbp3J3vWPjHax"
            r0 = 3
            r2[r0] = r1
            r6.A05 = r5
            r6.A0B = r4
        L48:
            r4 = 16
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0431Dn.A0D
            r0 = 2
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 16
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L7a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0431Dn.A0D
            java.lang.String r1 = "VgXbI0fWsc6LBLXRTGKiMc1TRthchDi6"
            r0 = 7
            r2[r0] = r1
            if (r10 < r4) goto L7d
        L67:
            r0 = 21
            if (r10 > r0) goto L7d
            r0 = 1
        L6c:
            r6.A08 = r0
            boolean r0 = r6.A08
            if (r0 != 0) goto L76
            r0 = 9
            if (r10 > r0) goto L77
        L76:
            r3 = 1
        L77:
            r6.A07 = r3
            return
        L7a:
            if (r10 < r4) goto L7d
            goto L67
        L7d:
            r0 = 0
            goto L6c
        L7f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0431Dn.A03(long, int, int, long):void");
    }

    public final void A04(byte[] bArr, int i, int i2) {
        if (this.A07) {
            int i3 = this.A00;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.A06 = (bArr[i4] & ByteCompanionObject.MIN_VALUE) != 0;
                this.A07 = false;
                return;
            }
            int i5 = i3 + (i2 - i);
            if (A0D[0].charAt(24) != 'E') {
                throw new RuntimeException();
            }
            A0D[0] = "OWSyVtAwrfkSOzobpeDsxETSEBQPa9qP";
            this.A00 = i5;
        }
    }
}
