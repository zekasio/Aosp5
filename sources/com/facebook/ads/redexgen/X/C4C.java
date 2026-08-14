package com.facebook.ads.redexgen.X;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4C {
    public static String[] A01 = {"1CU3iw4Trc3qggngkxP7P26jEGLrLZaR", "qcH7HKgKdAybLTWn0rmK7JyCE0S9C8rn", "oNJ0dA1Zpt4CixMfeWT18n5RxX88Y0E3", "FZ8N3xW3PfzdZjJWrErZ2QIuE13XuJtD", "DvPOKoiXqOiYMgjx6IqCziqOSBLzEcJY", "MpMZeZ7xc490HXAXJonG5r1KTyiIoUHH", "NGMd8PbmdSzgSLgNcWdVjgLa", "jY1Ixh6DMe9BpV8yAbg842YJP45AQ2Eb"};
    public final C4B A00;

    public C4C(C4B c4b) {
        this.A00 = c4b;
    }

    private int A00(List<C02023o> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).A00 == 8) {
                if (z) {
                    return size;
                }
            } else {
                z = true;
            }
        }
        return -1;
    }

    private void A01(List<C02023o> list, int i, int i2) {
        C02023o c02023o = list.get(i);
        C02023o nextOp = list.get(i2);
        int i3 = nextOp.A00;
        if (i3 != 1) {
            if (i3 == 2) {
                A03(list, i, c02023o, i2, nextOp);
                return;
            } else {
                if (i3 == 4) {
                    A04(list, i, c02023o, i2, nextOp);
                    return;
                }
                return;
            }
        }
        String[] strArr = A01;
        if (strArr[1].charAt(7) == strArr[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aUQhN9RPINWHdtDS2haQB24BMlUHbr4B";
        strArr2[7] = "XOFwSchhjWWz78nEYYkf12AsjhBhdKRi";
        A02(list, i, c02023o, i2, nextOp);
    }

    private void A02(List<C02023o> list, int i, C02023o c02023o, int i2, C02023o c02023o2) {
        int i3 = 0;
        if (c02023o.A01 < c02023o2.A02) {
            i3 = 0 - 1;
        }
        if (c02023o.A02 < c02023o2.A02) {
            i3++;
        }
        if (c02023o2.A02 <= c02023o.A02) {
            c02023o.A02 += c02023o2.A01;
        }
        if (c02023o2.A02 <= c02023o.A01) {
            c02023o.A01 += c02023o2.A01;
        }
        c02023o2.A02 += i3;
        list.set(i, c02023o2);
        list.set(i2, c02023o);
    }

    private final void A03(List<C02023o> list, int i, C02023o c02023o, int i2, C02023o c02023o2) {
        boolean z;
        C02023o c02023oA9n = null;
        boolean z2 = false;
        if (c02023o.A02 < c02023o.A01) {
            z = false;
            if (c02023o2.A02 == c02023o.A02 && c02023o2.A01 == c02023o.A01 - c02023o.A02) {
                z2 = true;
            }
        } else {
            z = true;
            if (c02023o2.A02 == c02023o.A01 + 1 && c02023o2.A01 == c02023o.A02 - c02023o.A01) {
                z2 = true;
            }
        }
        if (c02023o.A01 < c02023o2.A02) {
            c02023o2.A02--;
        } else if (c02023o.A01 < c02023o2.A02 + c02023o2.A01) {
            c02023o2.A01--;
            c02023o.A00 = 2;
            c02023o.A01 = 1;
            int i3 = c02023o2.A01;
            if (A01[6].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "8AUTweiK2qHuqKAjuAP9RAHRjtqC9cI5";
            strArr[3] = "fxjAamJyQJjVOLb9u9QxKoC9co41mLuZ";
            if (i3 == 0) {
                list.remove(i2);
                this.A00.ADh(c02023o2);
                return;
            }
            return;
        }
        if (c02023o.A02 <= c02023o2.A02) {
            c02023o2.A02++;
        } else if (c02023o.A02 < c02023o2.A02 + c02023o2.A01) {
            c02023oA9n = this.A00.A9n(2, c02023o.A02 + 1, (c02023o2.A02 + c02023o2.A01) - c02023o.A02, null);
            c02023o2.A01 = c02023o.A02 - c02023o2.A02;
        }
        if (z2) {
            list.set(i, c02023o2);
            list.remove(i2);
            this.A00.ADh(c02023o);
            return;
        }
        if (z) {
            if (c02023oA9n != null) {
                if (c02023o.A02 > c02023oA9n.A02) {
                    c02023o.A02 -= c02023oA9n.A01;
                }
                if (c02023o.A01 > c02023oA9n.A02) {
                    c02023o.A01 -= c02023oA9n.A01;
                }
            }
            if (c02023o.A02 > c02023o2.A02) {
                c02023o.A02 -= c02023o2.A01;
            }
            if (c02023o.A01 > c02023o2.A02) {
                c02023o.A01 -= c02023o2.A01;
            }
        } else {
            if (c02023oA9n != null) {
                if (c02023o.A02 >= c02023oA9n.A02) {
                    c02023o.A02 -= c02023oA9n.A01;
                }
                if (c02023o.A01 >= c02023oA9n.A02) {
                    c02023o.A01 -= c02023oA9n.A01;
                }
            }
            if (c02023o.A02 >= c02023o2.A02) {
                c02023o.A02 -= c02023o2.A01;
            }
            if (c02023o.A01 >= c02023o2.A02) {
                c02023o.A01 -= c02023o2.A01;
            }
        }
        list.set(i, c02023o2);
        String[] strArr2 = A01;
        if (strArr2[1].charAt(7) == strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[1] = "R1vl9Esi4EQuoIO0IEs3BYKA9Bp2yfIo";
        strArr3[5] = "ll7MLLjNdpT1F8Cd0W3dCYnGe1w6KT9M";
        if (c02023o.A02 != c02023o.A01) {
            list.set(i2, c02023o);
        } else {
            list.remove(i2);
        }
        if (c02023oA9n != null) {
            list.add(i, c02023oA9n);
        }
    }

    private final void A04(List<C02023o> list, int i, C02023o c02023o, int i2, C02023o c02023o2) {
        C02023o c02023oA9n = null;
        C02023o c02023oA9n2 = null;
        if (c02023o.A01 < c02023o2.A02) {
            c02023o2.A02--;
        } else if (c02023o.A01 < c02023o2.A02 + c02023o2.A01) {
            c02023o2.A01--;
            c02023oA9n = this.A00.A9n(4, c02023o.A02, 1, c02023o2.A03);
        }
        if (c02023o.A02 <= c02023o2.A02) {
            c02023o2.A02++;
        } else if (c02023o.A02 < c02023o2.A02 + c02023o2.A01) {
            int i3 = (c02023o2.A02 + c02023o2.A01) - c02023o.A02;
            c02023oA9n2 = this.A00.A9n(4, c02023o.A02 + 1, i3, c02023o2.A03);
            c02023o2.A01 -= i3;
        }
        list.set(i2, c02023o);
        if (c02023o2.A01 > 0) {
            list.set(i, c02023o2);
        } else {
            list.remove(i);
            this.A00.ADh(c02023o2);
        }
        if (c02023oA9n != null) {
            list.add(i, c02023oA9n);
        }
        if (c02023oA9n2 != null) {
            list.add(i, c02023oA9n2);
        }
    }

    public final void A05(List<C02023o> list) {
        while (true) {
            int iA00 = A00(list);
            if (iA00 != -1) {
                A01(list, iA00, iA00 + 1);
            } else {
                return;
            }
        }
    }
}
