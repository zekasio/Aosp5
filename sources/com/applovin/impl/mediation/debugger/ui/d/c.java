package com.applovin.impl.mediation.debugger.ui.d;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class c {
    protected b b;
    protected boolean c;
    protected SpannedString d;
    protected SpannedString e;
    protected String f;
    protected String g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected boolean n;

    public enum b {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);

        private final int g;

        b(int i) {
            this.g = i;
        }

        public int a() {
            return this.g;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return android.R.layout.simple_list_item_1;
            }
            if (this == DETAIL) {
                return R.layout.applovin_debugger_list_item_detail;
            }
            return R.layout.mediation_debugger_list_item_right_detail;
        }
    }

    public static int h() {
        return b.COUNT.a();
    }

    protected c(b bVar) {
        this.h = 0;
        this.i = 0;
        this.j = ViewCompat.MEASURED_STATE_MASK;
        this.k = ViewCompat.MEASURED_STATE_MASK;
        this.l = 0;
        this.m = 0;
        this.b = bVar;
    }

    private c(a aVar) {
        this.h = 0;
        this.i = 0;
        this.j = ViewCompat.MEASURED_STATE_MASK;
        this.k = ViewCompat.MEASURED_STATE_MASK;
        this.l = 0;
        this.m = 0;
        this.b = aVar.f1083a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
    }

    public int i() {
        return this.b.a();
    }

    public int j() {
        return this.b.b();
    }

    public boolean c() {
        return this.c;
    }

    public SpannedString k() {
        return this.d;
    }

    public SpannedString i_() {
        return this.e;
    }

    public String l() {
        return this.f;
    }

    public String m() {
        return this.g;
    }

    public int g() {
        return this.h;
    }

    public int a() {
        return this.i;
    }

    public int n() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public int o() {
        return this.l;
    }

    public int b() {
        return this.m;
    }

    public boolean j_() {
        return this.n;
    }

    public static a p() {
        return a(b.RIGHT_DETAIL);
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f1083a;
        boolean b;
        SpannedString c;
        SpannedString d;
        String e;
        String f;
        int g = 0;
        int h = 0;
        int i = ViewCompat.MEASURED_STATE_MASK;
        int j = ViewCompat.MEASURED_STATE_MASK;
        int k = 0;
        int l = 0;
        boolean m;

        public a(b bVar) {
            this.f1083a = bVar;
        }

        public a a(boolean z) {
            this.b = z;
            return this;
        }

        public a a(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a a(SpannedString spannedString) {
            this.c = spannedString;
            return this;
        }

        public a b(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a b(SpannedString spannedString) {
            this.d = spannedString;
            return this;
        }

        public a c(String str) {
            this.e = str;
            return this;
        }

        public a d(String str) {
            this.f = str;
            return this;
        }

        public a a(int i) {
            this.h = i;
            return this;
        }

        public a b(int i) {
            this.j = i;
            return this;
        }

        public a c(int i) {
            this.l = i;
            return this;
        }

        public a b(boolean z) {
            this.m = z;
            return this;
        }

        public a a(Context context) {
            this.h = R.drawable.applovin_ic_disclosure_arrow;
            this.l = g.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public c a() {
            return new c(this);
        }
    }
}
