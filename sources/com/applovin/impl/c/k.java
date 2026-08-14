package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f913a;
    private String b;
    private String c;
    private long d = -1;
    private int e = -1;

    private k() {
    }

    public static k a(t tVar, e eVar, p pVar) {
        List<String> listExplode;
        int size;
        long seconds;
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strC = tVar.c();
            if (StringUtils.isValidString(strC)) {
                k kVar = new k();
                kVar.c = strC;
                kVar.f913a = tVar.b().get("id");
                kVar.b = tVar.b().get("event");
                kVar.e = a(kVar.a(), eVar);
                String str = tVar.b().get("offset");
                if (StringUtils.isValidString(str)) {
                    String strTrim = str.trim();
                    if (strTrim.contains("%")) {
                        kVar.e = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                    } else if (strTrim.contains(":") && (size = (listExplode = CollectionUtils.explode(strTrim, ":")).size()) > 0) {
                        int i = size - 1;
                        long j = 0;
                        for (int i2 = i; i2 >= 0; i2--) {
                            String str2 = listExplode.get(i2);
                            if (StringUtils.isNumeric(str2)) {
                                int i3 = Integer.parseInt(str2);
                                if (i2 == i) {
                                    seconds = i3;
                                } else if (i2 == size - 2) {
                                    seconds = TimeUnit.MINUTES.toSeconds(i3);
                                } else if (i2 == size - 3) {
                                    seconds = TimeUnit.HOURS.toSeconds(i3);
                                }
                                j += seconds;
                            }
                        }
                        kVar.d = j;
                        kVar.e = -1;
                    }
                }
                return kVar;
            }
            pVar.L();
            if (!y.a()) {
                return null;
            }
            pVar.L().e("VastTracker", "Unable to create tracker. Could not find URL.");
            return null;
        } catch (Throwable th) {
            pVar.L();
            if (!y.a()) {
                return null;
            }
            pVar.L().b("VastTracker", "Error occurred while initializing", th);
            return null;
        }
    }

    private static int a(String str, e eVar) {
        if (TJAdUnitConstants.String.VIDEO_START.equalsIgnoreCase(str)) {
            return 0;
        }
        if (TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE.equalsIgnoreCase(str)) {
            return 25;
        }
        if (TJAdUnitConstants.String.VIDEO_MIDPOINT.equalsIgnoreCase(str)) {
            return 50;
        }
        if (TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE.equalsIgnoreCase(str)) {
            return 75;
        }
        if (!TJAdUnitConstants.String.VIDEO_COMPLETE.equalsIgnoreCase(str)) {
            return -1;
        }
        if (eVar != null) {
            return eVar.h();
        }
        return 95;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public boolean a(long j, int i) {
        long j2 = this.d;
        boolean z = j2 >= 0;
        boolean z2 = j >= j2;
        int i2 = this.e;
        boolean z3 = i2 >= 0;
        boolean z4 = i >= i2;
        if (z && z2) {
            return true;
        }
        return z3 && z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.d != kVar.d || this.e != kVar.e) {
            return false;
        }
        String str = this.f913a;
        if (str == null ? kVar.f913a != null : !str.equals(kVar.f913a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? kVar.b == null : str2.equals(kVar.b)) {
            return this.c.equals(kVar.c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f913a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode()) * 31;
        long j = this.d;
        return ((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f913a + "', event='" + this.b + "', uriString='" + this.c + "', offsetSeconds=" + this.d + ", offsetPercent=" + this.e + '}';
    }
}
