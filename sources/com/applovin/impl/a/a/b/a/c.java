package com.applovin.impl.a.a.b.a;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.l;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class c extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.a.a.a.a f720a;
    private p b;
    private TextView c;
    private Button d;

    public void a(com.applovin.impl.a.a.a.a aVar, p pVar) {
        this.f720a = aVar;
        this.b = pVar;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.f720a.a() + " - " + this.f720a.b());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        a();
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.a.a.b.a.c.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c.this.b.af().a(c.this.f720a, c.this, true);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share == menuItem.getItemId()) {
            this.b.af().a(this.f720a, this, false);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private void a() {
        l lVar = new l();
        lVar.a(this.b.af().a(this.f720a));
        String strB = this.b.af().b(this.f720a.c());
        if (strB != null) {
            lVar.a("\nBid Response Preview:\n");
            lVar.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.c = textView;
        textView.setText(lVar.toString());
        this.c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }
}
