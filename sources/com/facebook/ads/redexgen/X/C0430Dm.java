package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0430Dm {
    public static String[] A0I = {"4oBn500ONSa7zUcj69ZejwliI7fNkQe9", "sao3", "S05M", "dUQbnZGK3vs92wXndxl51oc8w6Wzg5UK", "r2dYBwwJ6wCRp20YpqJDniAkemsUTuNE", "fcxFuh", "wirhT", "AIyirGzN48rHG0XGibSi5d9zNx7vdYO1"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC0417Co A0E;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<C0546Ie> A0D = new SparseArray<>();
    public final SparseArray<C0545Id> A0C = new SparseArray<>();
    public C0429Dl A06 = new C0429Dl();
    public C0429Dl A07 = new C0429Dl();
    public byte[] A0B = new byte[128];
    public final C0552Ik A0F = new C0552Ik(this.A0B, 0, 0);

    public C0430Dm(InterfaceC0417Co interfaceC0417Co, boolean z, boolean z2) {
        this.A0E = interfaceC0417Co;
        this.A0G = z;
        this.A0H = z2;
        A01();
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
        this.A0E.AEH(this.A05, z ? 1 : 0, (int) (this.A02 - this.A04), i, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    public final void A02(long j, int i) {
        boolean z = false;
        if (this.A01 == 9 || (this.A0H && this.A07.A00(this.A06))) {
            if (this.A09) {
                A00(i + ((int) (j - this.A02)));
            }
            this.A04 = this.A02;
            this.A05 = this.A03;
            this.A0A = false;
            this.A09 = true;
        }
        boolean z2 = this.A0A;
        int i2 = this.A01;
        if (i2 == 5 || (this.A0G && i2 == 1 && this.A07.A05())) {
            z = true;
        }
        this.A0A = z2 | z;
    }

    public final void A03(long j, int i, long j2) {
        this.A01 = i;
        this.A03 = j2;
        this.A02 = j;
        if (!this.A0G || this.A01 != 1) {
            if (!this.A0H) {
                return;
            }
            int i2 = this.A01;
            if (i2 != 5 && i2 != 1 && i2 != 2) {
                return;
            }
        }
        C0429Dl c0429Dl = this.A06;
        this.A06 = this.A07;
        this.A07 = c0429Dl;
        this.A07.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A04(C0545Id c0545Id) {
        this.A0C.append(c0545Id.A00, c0545Id);
    }

    public final void A05(C0546Ie c0546Ie) {
        this.A0D.append(c0546Ie.A05, c0546Ie);
    }

    public final void A06(byte[] bArr, int readLength, int i) {
        if (!this.A08) {
            return;
        }
        int i2 = i - readLength;
        byte[] bArr2 = this.A0B;
        int length = bArr2.length;
        int i3 = this.A00;
        if (length < i3 + i2) {
            this.A0B = Arrays.copyOf(bArr2, (i3 + i2) * 2);
        }
        System.arraycopy(bArr, readLength, this.A0B, this.A00, i2);
        this.A00 += i2;
        this.A0F.A08(this.A0B, 0, this.A00);
        if (!this.A0F.A0B(8)) {
            return;
        }
        this.A0F.A06();
        int deltaPicOrderCnt1 = this.A0F.A05(2);
        this.A0F.A07(5);
        if (!this.A0F.A09()) {
            return;
        }
        this.A0F.A04();
        if (!this.A0F.A09()) {
            return;
        }
        int iA04 = this.A0F.A04();
        if (!this.A0H) {
            this.A08 = false;
            this.A07.A03(iA04);
            return;
        }
        if (!this.A0F.A09()) {
            return;
        }
        int iA042 = this.A0F.A04();
        String[] strArr = A0I;
        if (strArr[0].charAt(5) == strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        A0I[6] = "2v7XO";
        int picParameterSetId = this.A0C.indexOfKey(iA042);
        if (picParameterSetId < 0) {
            this.A08 = false;
            return;
        }
        C0545Id ppsData = this.A0C.get(iA042);
        C0546Ie c0546Ie = this.A0D.get(ppsData.A01);
        if (c0546Ie.A09) {
            if (!this.A0F.A0B(2)) {
                return;
            } else {
                this.A0F.A07(2);
            }
        }
        if (!this.A0F.A0B(c0546Ie.A01)) {
            return;
        }
        boolean zA0A = false;
        boolean z = false;
        boolean zA0A2 = false;
        int iA05 = this.A0F.A05(c0546Ie.A01);
        boolean bottomFieldFlagPresent = c0546Ie.A08;
        if (!bottomFieldFlagPresent) {
            boolean bottomFieldFlagPresent2 = this.A0F.A0B(1);
            if (!bottomFieldFlagPresent2) {
                return;
            }
            zA0A = this.A0F.A0A();
            if (zA0A) {
                boolean bottomFieldFlagPresent3 = this.A0F.A0B(1);
                if (!bottomFieldFlagPresent3) {
                    return;
                }
                zA0A2 = this.A0F.A0A();
                z = true;
                String[] strArr2 = A0I;
                if (strArr2[2].length() == strArr2[1].length()) {
                    A0I[4] = "qwcYbvbtciQlsge07t8jnpQbFFEGYRzL";
                }
            }
        }
        boolean z2 = this.A01 == 5;
        int iA043 = 0;
        if (z2) {
            if (!this.A0F.A09()) {
                return;
            } else {
                iA043 = this.A0F.A04();
            }
        }
        int iA052 = 0;
        int iA03 = 0;
        int iA032 = 0;
        int iA033 = 0;
        int picOrderCntLsb = c0546Ie.A04;
        if (picOrderCntLsb == 0) {
            C0552Ik c0552Ik = this.A0F;
            int deltaPicOrderCnt12 = c0546Ie.A03;
            if (!c0552Ik.A0B(deltaPicOrderCnt12)) {
                return;
            }
            C0552Ik c0552Ik2 = this.A0F;
            int deltaPicOrderCnt13 = c0546Ie.A03;
            iA052 = c0552Ik2.A05(deltaPicOrderCnt13);
            if (ppsData.A02 && !zA0A) {
                if (!this.A0F.A09()) {
                    return;
                }
                C0552Ik c0552Ik3 = this.A0F;
                int deltaPicOrderCnt14 = A0I[6].length();
                if (deltaPicOrderCnt14 != 5) {
                    throw new RuntimeException();
                }
                A0I[5] = "uaxcZmcWt6bm8g2eSL";
                iA03 = c0552Ik3.A03();
            }
        } else {
            int picOrderCntLsb2 = c0546Ie.A04;
            if (picOrderCntLsb2 == 1 && !c0546Ie.A07) {
                if (!this.A0F.A09()) {
                    return;
                }
                iA032 = this.A0F.A03();
                if (ppsData.A02 && !zA0A) {
                    if (!this.A0F.A09()) {
                        return;
                    } else {
                        iA033 = this.A0F.A03();
                    }
                }
            }
        }
        this.A07.A04(c0546Ie, deltaPicOrderCnt1, iA04, iA05, iA042, zA0A, z, zA0A2, z2, iA043, iA052, iA03, iA032, iA033);
        this.A08 = false;
    }

    public final boolean A07() {
        return this.A0H;
    }
}
