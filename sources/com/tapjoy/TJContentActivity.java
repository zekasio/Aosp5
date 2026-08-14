package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tapjoy.internal.a;
import com.tapjoy.internal.z6;

/* JADX INFO: loaded from: classes2.dex */
public class TJContentActivity extends Activity {
    public static volatile ContentProducer c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ContentProducer f1663a;
    public boolean b = false;

    public static abstract class AbstractContentProducer implements ContentProducer {
        @Override // com.tapjoy.TJContentActivity.ContentProducer
        public void dismiss(Activity activity) {
        }

        @Override // com.tapjoy.TJContentActivity.ContentProducer
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        }
    }

    public interface ContentProducer {
        void dismiss(Activity activity);

        void onActivityResult(Activity activity, int i, int i2, Intent intent);

        void show(Activity activity);
    }

    public static void start(Context context, ContentProducer contentProducer, boolean z) {
        Intent intent = new Intent(context, (Class<?>) TJContentActivity.class);
        intent.setFlags(276889600);
        intent.putExtra("com.tapjoy.internal.content.producer.id", toIdentityString(contentProducer));
        intent.putExtra("com.tapjoy.internal.content.fullscreen", z);
        synchronized (TJContentActivity.class) {
            c = contentProducer;
            context.startActivity(intent);
        }
    }

    public static String toIdentityString(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + "" + System.identityHashCode(obj);
    }

    public final boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("com.tapjoy.internal.content.producer.id");
        if (stringExtra == null) {
            return false;
        }
        synchronized (TJContentActivity.class) {
            if (c == null || !stringExtra.equals(toIdentityString(c))) {
                return false;
            }
            this.f1663a = c;
            c = null;
            if (intent.getBooleanExtra("com.tapjoy.internal.content.fullscreen", false)) {
                getWindow().setFlags(1024, 1024);
            }
            this.f1663a.show(this);
            return true;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f1663a.onActivityResult(this, i, i2, intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (a(getIntent())) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        ContentProducer contentProducer = this.f1663a;
        if (contentProducer != null) {
            contentProducer.dismiss(this);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (z6.r.n) {
            this.b = true;
            a.a((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        if (this.b) {
            this.b = false;
            a.b(this);
        }
        super.onStop();
    }
}
