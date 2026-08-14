package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1438a = UUID.randomUUID().toString();
    private final String b;
    private final Map<String, Object> c;
    private final long d;

    public u(String str, Map<String, String> map, Map<String, Object> map2) {
        this.b = str;
        Map<String, Object> map3 = CollectionUtils.map();
        this.c = map3;
        map3.putAll(map);
        map3.put("applovin_sdk_super_properties", map2);
        this.d = System.currentTimeMillis();
    }

    public String a() {
        return this.b;
    }

    public Map<String, Object> b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public String d() {
        return this.f1438a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.d != uVar.d) {
            return false;
        }
        String str = this.b;
        if (str == null ? uVar.b != null : !str.equals(uVar.b)) {
            return false;
        }
        Map<String, Object> map = this.c;
        if (map == null ? uVar.c != null : !map.equals(uVar.c)) {
            return false;
        }
        String str2 = this.f1438a;
        String str3 = uVar.f1438a;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f1438a;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.b + "', id='" + this.f1438a + "', creationTimestampMillis=" + this.d + ", parameters=" + this.c + '}';
    }
}
