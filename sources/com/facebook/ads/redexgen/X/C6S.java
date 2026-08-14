package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Message;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6S {

    @Nullable
    public static C6S A07;
    public static final AtomicBoolean A08 = new AtomicBoolean();
    public C6R A00 = new C6R(this, C7G.A00().A03().getLooper());
    public C02656b A01;
    public C02666c A02;
    public List<EnumC02696f> A03;
    public final Context A04;
    public final C6C A05;
    public final EnumC02896z A06;

    public C6S(C6C c6c, Context context) {
        this.A05 = c6c;
        this.A04 = context;
        this.A06 = c6c.A0a();
    }

    public static synchronized C6S A00(Context context, C6C c6c) {
        if (A07 == null) {
            A07 = new C6S(c6c, context);
        }
        return A07;
    }

    private synchronized void A02() {
        A08.set(false);
        this.A03 = new ArrayList();
    }

    public final synchronized void A03() {
        if (this.A01 != null) {
            this.A01.A03(this.A03);
        }
        A02();
    }

    public final synchronized void A04(Map<Integer, C02826s> map, EnumC02866w enumC02866w) {
        A02();
        C6W c6w = new C6W(this.A05, map);
        for (Map.Entry<Integer, C02826s> entry : map.entrySet()) {
            C02826s value = entry.getValue();
            if (value != null && value.A04(enumC02866w)) {
                int iIntValue = entry.getKey().intValue();
                if (iIntValue != 10800) {
                    switch (iIntValue) {
                        case 10810:
                            this.A03.add(EnumC02696f.A04);
                            break;
                        case 10811:
                            this.A03.add(EnumC02696f.A08);
                            break;
                        case 10812:
                            this.A03.add(EnumC02696f.A0A);
                            break;
                        case 10813:
                            this.A03.add(EnumC02696f.A07);
                            break;
                        case 10814:
                            this.A03.add(EnumC02696f.A0B);
                            break;
                        case 10815:
                            this.A03.add(EnumC02696f.A0C);
                            break;
                        case 10816:
                            this.A03.add(EnumC02696f.A0E);
                            break;
                        case 10817:
                            this.A03.add(EnumC02696f.A09);
                            break;
                        case 10818:
                            this.A03.add(EnumC02696f.A06);
                            break;
                        case 10819:
                            this.A03.add(EnumC02696f.A05);
                            break;
                        case 10820:
                            this.A03.add(EnumC02696f.A0D);
                            break;
                    }
                } else {
                    this.A02 = new C02666c(this.A04, c6w, this.A06);
                    A08.set(true);
                }
            }
        }
        this.A01 = new C02656b(this.A04, c6w, this.A06);
        this.A01.A02(this.A03);
        if (!this.A00.getLooper().getThread().isAlive()) {
            this.A00 = new C6R(this, C7G.A00().A03().getLooper());
        }
    }

    public final synchronized boolean A05(MotionEvent motionEvent) {
        if (!A08.get()) {
            return false;
        }
        Message message = new Message();
        message.what = C6Q.A03.ordinal();
        message.obj = motionEvent;
        this.A00.sendMessage(message);
        return true;
    }
}
