package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbza;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbrc zza;

    private final void zza() {
        zzbrc zzbrcVar = this.zza;
        if (zzbrcVar != null) {
            try {
                zzbrcVar.zzv();
            } catch (RemoteException e) {
                zzbza.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                zzbrcVar.zzg(i, i2, intent);
            }
        } catch (Exception e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                if (!zzbrcVar.zzE()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbrc zzbrcVar2 = this.zza;
            if (zzbrcVar2 != null) {
                zzbrcVar2.zzh();
            }
        } catch (RemoteException e2) {
            zzbza.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                zzbrcVar.zzj(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbrc zzbrcVarZzo = zzay.zza().zzo(this);
        this.zza = zzbrcVarZzo;
        if (zzbrcVarZzo == null) {
            zzbza.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbrcVarZzo.zzk(bundle);
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                zzbrcVar.zzl();
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                zzbrcVar.zzn();
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                zzbrcVar.zzo();
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                zzbrcVar.zzp();
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                zzbrcVar.zzq(bundle);
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                zzbrcVar.zzr();
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                zzbrcVar.zzs();
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbrc zzbrcVar = this.zza;
            if (zzbrcVar != null) {
                zzbrcVar.zzt();
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
