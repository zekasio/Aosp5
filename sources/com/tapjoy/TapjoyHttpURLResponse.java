package com.tapjoy;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyHttpURLResponse {
    public int contentLength;
    public long date;
    public long expires;
    public Map<String, List<String>> headerFields;
    public String redirectURL;
    public String response;
    public int statusCode;

    public String getHeaderFieldAsString(String str) {
        List<String> list;
        Map<String, List<String>> map = this.headerFields;
        return (map == null || (list = map.get(str)) == null || list.get(0) == null) ? "" : list.get(0);
    }
}
