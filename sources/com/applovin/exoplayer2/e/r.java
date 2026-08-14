package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f383a = -1;
    public int b = -1;

    public boolean a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f383a = i2;
        this.b = i3;
        return true;
    }

    public boolean a(com.applovin.exoplayer2.g.a aVar) {
        for (int i = 0; i < aVar.a(); i++) {
            a.InterfaceC0030a interfaceC0030aA = aVar.a(i);
            if (interfaceC0030aA instanceof com.applovin.exoplayer2.g.e.e) {
                com.applovin.exoplayer2.g.e.e eVar = (com.applovin.exoplayer2.g.e.e) interfaceC0030aA;
                if ("iTunSMPB".equals(eVar.b) && a(eVar.c)) {
                    return true;
                }
            } else if (interfaceC0030aA instanceof com.applovin.exoplayer2.g.e.i) {
                com.applovin.exoplayer2.g.e.i iVar = (com.applovin.exoplayer2.g.e.i) interfaceC0030aA;
                if ("com.apple.iTunes".equals(iVar.f433a) && "iTunSMPB".equals(iVar.b) && a(iVar.c)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) ai.a(matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) ai.a(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f383a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f383a == -1 || this.b == -1) ? false : true;
    }
}
