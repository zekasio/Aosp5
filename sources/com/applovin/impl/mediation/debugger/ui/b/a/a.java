package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.c.b f1069a;
    private final Context o;

    public a(com.applovin.impl.mediation.debugger.b.c.b bVar, Context context) {
        super(c.b.DETAIL);
        this.f1069a = bVar;
        this.o = context;
        this.d = q();
        this.e = r();
    }

    public com.applovin.impl.mediation.debugger.b.c.b f() {
        return this.f1069a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean c() {
        return this.f1069a.a() != b.a.MISSING;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int g() {
        int iO = this.f1069a.o();
        return iO > 0 ? iO : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int a() {
        return c() ? R.drawable.applovin_ic_disclosure_arrow : super.g();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int b() {
        return g.a(R.color.applovin_sdk_disclosureButtonColor, this.o);
    }

    private SpannedString q() {
        return StringUtils.createSpannedString(this.f1069a.i(), c() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
    }

    private SpannedString r() {
        if (!c()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) s());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) t());
        if (this.f1069a.a() == b.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (this.f1069a.d()) {
            if (TextUtils.isEmpty(this.f1069a.j())) {
                return StringUtils.createListItemDetailSpannedString(this.f1069a.e() ? "Retrieving SDK Version..." : "SDK Found", ViewCompat.MEASURED_STATE_MASK);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f1069a.j(), ViewCompat.MEASURED_STATE_MASK));
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString("SDK Missing", SupportMenu.CATEGORY_MASK);
    }

    private SpannedString t() {
        if (this.f1069a.e()) {
            if (!TextUtils.isEmpty(this.f1069a.k())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f1069a.k(), ViewCompat.MEASURED_STATE_MASK));
                if (this.f1069a.f()) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f1069a.l(), ViewCompat.MEASURED_STATE_MASK));
                }
                return new SpannedString(spannableStringBuilder);
            }
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        return StringUtils.createListItemDetailSpannedString("Adapter Missing", SupportMenu.CATEGORY_MASK);
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.d) + ", detailText=" + ((Object) this.e) + ", network=" + this.f1069a + "}";
    }
}
