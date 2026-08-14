package com.applovin.exoplayer2.common.base;

import androidx.core.internal.view.SupportMenu;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class CharMatcher implements Predicate<Character> {
    public abstract boolean matches(char c2);

    public static CharMatcher any() {
        return b.f179a;
    }

    public static CharMatcher none() {
        return w.f198a;
    }

    public static CharMatcher whitespace() {
        return aa.b;
    }

    public static CharMatcher breakingWhitespace() {
        return e.f182a;
    }

    public static CharMatcher ascii() {
        return d.f181a;
    }

    @Deprecated
    public static CharMatcher digit() {
        return f.f183a;
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return n.f190a;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return p.f192a;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return q.f193a;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return s.f195a;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return r.f194a;
    }

    public static CharMatcher javaIsoControl() {
        return o.f191a;
    }

    @Deprecated
    public static CharMatcher invisible() {
        return j.f186a;
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return z.f201a;
    }

    public static CharMatcher is(char c2) {
        return new k(c2);
    }

    public static CharMatcher isNot(char c2) {
        return new m(c2);
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return none();
        }
        if (length == 1) {
            return is(charSequence.charAt(0));
        }
        if (length == 2) {
            return isEither(charSequence.charAt(0), charSequence.charAt(1));
        }
        return new c(charSequence);
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    public static CharMatcher inRange(char c2, char c3) {
        return new i(c2, c3);
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new h(predicate);
    }

    protected CharMatcher() {
    }

    public CharMatcher negate() {
        return new u(this);
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new a(this, charMatcher);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new x(this, charMatcher);
    }

    void setBits(BitSet bitSet) {
        for (int i2 = SupportMenu.USER_MASK; i2 >= 0; i2--) {
            if (matches((char) i2)) {
                bitSet.set(i2);
            }
        }
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int indexIn(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i2, length);
        while (i2 < length) {
            if (matches(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public int countIn(CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (matches(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i2 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    break;
                }
                charArray[iIndexIn - i2] = charArray[iIndexIn];
                iIndexIn++;
            }
            return new String(charArray, 0, iIndexIn - i2);
            i2++;
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public String replaceFrom(CharSequence charSequence, char c2) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c2;
        while (true) {
            iIndexIn++;
            if (iIndexIn < charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    charArray[iIndexIn] = c2;
                }
            } else {
                return new String(charArray);
            }
        }
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i2 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((CharSequence) string, i2, iIndexIn);
            sb.append(charSequence2);
            i2 = iIndexIn + 1;
            iIndexIn = indexIn(string, i2);
        } while (iIndexIn != -1);
        sb.append((CharSequence) string, i2, length2);
        return sb.toString();
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = length - 1;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        return charSequence.subSequence(i2, i3 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!matches(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public String collapseFrom(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (matches(cCharAt)) {
                if (cCharAt != c2 || (i2 != length - 1 && matches(charSequence.charAt(i2 + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i2);
                    sb.append(c2);
                    return finishCollapseFrom(charSequence, i2 + 1, length, c2, sb, true);
                }
                i2++;
            }
            i2++;
        }
        return charSequence.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < length && matches(charSequence.charAt(i3))) {
            i3++;
        }
        int i4 = i2;
        while (i4 > i3 && matches(charSequence.charAt(i4))) {
            i4--;
        }
        if (i3 == 0 && i4 == i2) {
            return collapseFrom(charSequence, c2);
        }
        int i5 = i4 + 1;
        return finishCollapseFrom(charSequence, i3, i5, c2, new StringBuilder(i5 - i3), false);
    }

    private String finishCollapseFrom(CharSequence charSequence, int i2, int i3, char c2, StringBuilder sb, boolean z2) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (!matches(cCharAt)) {
                sb.append(cCharAt);
                z2 = false;
            } else if (!z2) {
                sb.append(c2);
                z2 = true;
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // com.applovin.exoplayer2.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c2) {
        char[] cArr = new char[6];
        cArr[0] = TokenParser.ESCAPE;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    static abstract class g extends CharMatcher {
        g() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return new v(this);
        }
    }

    static abstract class t extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f196a;

        t(String str) {
            this.f196a = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public final String toString() {
            return this.f196a;
        }
    }

    static class v extends u {
        v(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    private static final class b extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f179a = new b();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return true;
        }

        private b() {
            super("CharMatcher.any()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.length() == 0 ? "" : String.valueOf(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return none();
        }
    }

    private static final class w extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final w f198a = new w();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return false;
        }

        private w() {
            super("CharMatcher.none()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return any();
        }
    }

    static final class aa extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f178a = Integer.numberOfLeadingZeros(31);
        static final aa b = new aa();

        aa() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f178a) == c;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i));
            }
        }
    }

    private static final class e extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CharMatcher f182a = new e();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c == 8199) {
                    return false;
                }
                if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
            return true;
        }

        private e() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    private static final class d extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f181a = new d();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return c <= 127;
        }

        d() {
            super("CharMatcher.ascii()");
        }
    }

    private static class y extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f200a;
        private final char[] b;
        private final char[] c;

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        y(String str, char[] cArr, char[] cArr2) {
            this.f200a = str;
            this.b = cArr;
            this.c = cArr2;
            Preconditions.checkArgument(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                Preconditions.checkArgument(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    Preconditions.checkArgument(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            int iBinarySearch = Arrays.binarySearch(this.b, c);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i = (iBinarySearch ^ (-1)) - 1;
            return i >= 0 && c <= this.c[i];
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.f200a;
        }
    }

    private static final class f extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f183a = new f();

        private static char[] a() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }

        private static char[] b() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + '\t');
            }
            return cArr;
        }

        private f() {
            super("CharMatcher.digit()", a(), b());
        }
    }

    private static final class n extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final n f190a = new n();

        private n() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isDigit(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    private static final class p extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final p f192a = new p();

        private p() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLetter(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    private static final class q extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f193a = new q();

        private q() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLetterOrDigit(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    private static final class s extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s f195a = new s();

        private s() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isUpperCase(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    private static final class r extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final r f194a = new r();

        private r() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLowerCase(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    private static final class o extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f191a = new o();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return c <= 31 || (c >= 127 && c <= 159);
        }

        private o() {
            super("CharMatcher.javaIsoControl()");
        }
    }

    private static final class j extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f186a = new j();

        private j() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    private static final class z extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final z f201a = new z();

        private z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    private static class u extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CharMatcher f197a;

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        u(CharMatcher charMatcher) {
            this.f197a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return !this.f197a.matches(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f197a.matchesNoneOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f197a.matchesAllOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f197a.countIn(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f197a.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return this.f197a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.f197a + ".negate()";
        }
    }

    private static final class a extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CharMatcher f177a;
        final CharMatcher b;

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        a(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f177a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f177a.matches(c) && this.b.matches(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f177a.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.and(" + this.f177a + ", " + this.b + ")";
        }
    }

    private static final class x extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CharMatcher f199a;
        final CharMatcher b;

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        x(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f199a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            this.f199a.setBits(bitSet);
            this.b.setBits(bitSet);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f199a.matches(c) || this.b.matches(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.or(" + this.f199a + ", " + this.b + ")";
        }
    }

    private static final class k extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f187a;

        k(char c) {
            this.f187a = c;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return c == this.f187a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.f187a, c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f187a) ? this : none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f187a) ? charMatcher : super.or(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return isNot(this.f187a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(this.f187a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.is('" + CharMatcher.showCharacter(this.f187a) + "')";
        }
    }

    private static final class m extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f189a;

        m(char c) {
            this.f189a = c;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return c != this.f189a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f189a) ? super.and(charMatcher) : charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f189a) ? any() : this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(0, this.f189a);
            bitSet.set(this.f189a + 1, 65536);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return is(this.f189a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.showCharacter(this.f189a) + "')";
        }
    }

    private static l isEither(char c2, char c3) {
        return new l(c2, c3);
    }

    private static final class l extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f188a;
        private final char b;

        l(char c, char c2) {
            this.f188a = c;
            this.b = c2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return c == this.f188a || c == this.b;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(this.f188a);
            bitSet.set(this.b);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.showCharacter(this.f188a) + CharMatcher.showCharacter(this.b) + "\")";
        }
    }

    private static final class c extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char[] f180a;

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        public c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f180a = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Arrays.binarySearch(this.f180a, c) >= 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            for (char c : this.f180a) {
                bitSet.set(c);
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.f180a) {
                sb.append(CharMatcher.showCharacter(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    private static final class i extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f185a;
        private final char b;

        i(char c, char c2) {
            Preconditions.checkArgument(c2 >= c);
            this.f185a = c;
            this.b = c2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f185a <= c && c <= this.b;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(this.f185a, this.b + 1);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.showCharacter(this.f185a) + "', '" + CharMatcher.showCharacter(this.b) + "')";
        }
    }

    private static final class h extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Predicate<? super Character> f184a;

        h(Predicate<? super Character> predicate) {
            this.f184a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f184a.apply(Character.valueOf(c));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Character ch) {
            return this.f184a.apply(Preconditions.checkNotNull(ch));
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f184a + ")";
        }
    }
}
