package com.applovin.impl.a.a.b.a.a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.a.a.a.a f716a;
    private final Context o;

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean c() {
        return true;
    }

    public a(com.applovin.impl.a.a.a.a aVar, Context context) {
        super(c.b.DETAIL);
        this.f716a = aVar;
        this.o = context;
        this.d = q();
        this.e = r();
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f716a.a());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f716a.b());
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString r() {
        return new SpannedString("Displayed " + Utils.getPrettyDate(this.f716a.d(), true));
    }
}
