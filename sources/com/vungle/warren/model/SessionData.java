package com.vungle.warren.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.utility.HashUtility;

/* JADX INFO: loaded from: classes3.dex */
public class SessionData {
    private static final Gson GSON = new Gson();
    private int sendAttempts;
    public SessionEvent sessionEvent;
    private JsonObject sessionEventJsonObject;

    protected SessionData(String str, int i) {
        this.sessionEventJsonObject = (JsonObject) GSON.fromJson(str, JsonObject.class);
        this.sendAttempts = i;
    }

    private SessionData(SessionEvent sessionEvent, JsonObject jsonObject) {
        this.sessionEvent = sessionEvent;
        this.sessionEventJsonObject = jsonObject;
        jsonObject.addProperty(SessionAttribute.TIMESTAMP.toString(), Long.valueOf(System.currentTimeMillis()));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) obj;
        return this.sessionEvent.equals(sessionData.sessionEvent) && this.sessionEventJsonObject.equals(sessionData.sessionEventJsonObject);
    }

    public void removeEvent(SessionAttribute sessionAttribute) {
        this.sessionEventJsonObject.remove(sessionAttribute.toString());
    }

    public void addAttribute(SessionAttribute sessionAttribute, String str) {
        this.sessionEventJsonObject.addProperty(sessionAttribute.toString(), str);
    }

    public static class Builder {
        SessionEvent event;
        JsonObject jsonObject = new JsonObject();

        public SessionData build() {
            if (this.event == null) {
                throw new IllegalArgumentException("SessionData must have event");
            }
            return new SessionData(this.event, this.jsonObject);
        }

        public Builder setEvent(SessionEvent sessionEvent) {
            this.event = sessionEvent;
            this.jsonObject.addProperty("event", sessionEvent.toString());
            return this;
        }

        public Builder addData(SessionAttribute sessionAttribute, String str) {
            this.jsonObject.addProperty(sessionAttribute.toString(), str);
            return this;
        }

        public Builder addData(SessionAttribute sessionAttribute, int i) {
            this.jsonObject.addProperty(sessionAttribute.toString(), Integer.valueOf(i));
            return this;
        }

        public Builder addData(SessionAttribute sessionAttribute, double d) {
            this.jsonObject.addProperty(sessionAttribute.toString(), Double.valueOf(d));
            return this;
        }

        public Builder addData(SessionAttribute sessionAttribute, boolean z) {
            this.jsonObject.addProperty(sessionAttribute.toString(), Boolean.valueOf(z));
            return this;
        }
    }

    public String getAsJsonString() {
        return GSON.toJson((JsonElement) this.sessionEventJsonObject);
    }

    public String getStringAttribute(SessionAttribute sessionAttribute) {
        JsonElement jsonElement = this.sessionEventJsonObject.get(sessionAttribute.toString());
        if (jsonElement != null) {
            return jsonElement.getAsString();
        }
        return null;
    }

    public String getId() {
        String strSha256 = HashUtility.sha256(getAsJsonString());
        return strSha256 == null ? String.valueOf(getAsJsonString().hashCode()) : strSha256;
    }

    public int getSendAttempts() {
        return this.sendAttempts;
    }

    public int incrementSendAttempt() {
        int i = this.sendAttempts;
        this.sendAttempts = i + 1;
        return i;
    }
}
