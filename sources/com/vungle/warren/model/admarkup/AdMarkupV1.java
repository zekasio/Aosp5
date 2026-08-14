package com.vungle.warren.model.admarkup;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class AdMarkupV1 extends AdMarkup implements Serializable {
    private final String eventId;

    @Override // com.vungle.warren.model.admarkup.AdMarkup
    public int getVersion() {
        return 1;
    }

    private AdMarkupV1(String str, String[] strArr) {
        this.eventId = str;
        this.impressions = strArr;
    }

    @Override // com.vungle.warren.model.admarkup.AdMarkup
    public String getEventId() {
        return this.eventId;
    }

    public String toString() {
        return "    AdMarkup {eventId='" + this.eventId + "', impression=" + Arrays.toString(this.impressions) + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.eventId;
        String str2 = ((AdMarkupV1) obj).eventId;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.eventId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.vungle.warren.model.admarkup.AdMarkupV1 fromString(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.gson.GsonBuilder r1 = new com.google.gson.GsonBuilder     // Catch: com.google.gson.JsonSyntaxException -> L63
            r1.<init>()     // Catch: com.google.gson.JsonSyntaxException -> L63
            com.google.gson.Gson r1 = r1.create()     // Catch: com.google.gson.JsonSyntaxException -> L63
            java.lang.Class<com.google.gson.JsonObject> r2 = com.google.gson.JsonObject.class
            java.lang.Object r4 = r1.fromJson(r4, r2)     // Catch: com.google.gson.JsonSyntaxException -> L63
            com.google.gson.JsonObject r4 = (com.google.gson.JsonObject) r4     // Catch: com.google.gson.JsonSyntaxException -> L63
            if (r4 != 0) goto L18
            return r0
        L18:
            java.lang.String r1 = "impression"
            boolean r2 = com.vungle.warren.model.JsonUtil.hasNonNull(r4, r1)
            if (r2 == 0) goto L4b
            com.google.gson.JsonArray r1 = r4.getAsJsonArray(r1)
            boolean r2 = r1.isJsonArray()
            if (r2 == 0) goto L4b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.gson.JsonArray r1 = r1.getAsJsonArray()
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r1.next()
            com.google.gson.JsonElement r3 = (com.google.gson.JsonElement) r3
            java.lang.String r3 = r3.getAsString()
            r2.add(r3)
            goto L37
        L4b:
            r2 = r0
        L4c:
            com.vungle.warren.model.admarkup.AdMarkupV1 r1 = new com.vungle.warren.model.admarkup.AdMarkupV1
            java.lang.String r3 = "event_id"
            java.lang.String r4 = com.vungle.warren.model.JsonUtil.getAsString(r4, r3, r0)
            if (r2 == 0) goto L5f
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L5f:
            r1.<init>(r4, r0)
            return r1
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.admarkup.AdMarkupV1.fromString(java.lang.String):com.vungle.warren.model.admarkup.AdMarkupV1");
    }
}
