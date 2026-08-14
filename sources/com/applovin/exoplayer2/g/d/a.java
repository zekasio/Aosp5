package com.applovin.exoplayer2.g.d;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.g.d;
import com.applovin.exoplayer2.g.g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f422a = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder b = Charsets.UTF_8.newDecoder();
    private final CharsetDecoder c = Charsets.ISO_8859_1.newDecoder();

    @Override // com.applovin.exoplayer2.g.g
    protected com.applovin.exoplayer2.g.a a(d dVar, ByteBuffer byteBuffer) {
        String strA = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strA == null) {
            return new com.applovin.exoplayer2.g.a(new c(bArr, null, null));
        }
        Matcher matcher = f422a.matcher(strA);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String lowerCase = Ascii.toLowerCase(strGroup);
                lowerCase.hashCode();
                if (lowerCase.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new com.applovin.exoplayer2.g.a(new c(bArr, str, str2));
    }

    private String a(ByteBuffer byteBuffer) {
        try {
            return this.b.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.c.decode(byteBuffer).toString();
                this.c.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.c.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.c.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.b.reset();
            byteBuffer.rewind();
        }
    }
}
