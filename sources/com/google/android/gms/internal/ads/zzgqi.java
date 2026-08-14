package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqi;
import com.google.android.gms.internal.ads.zzgqm;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgqi<MessageType extends zzgqm<MessageType, BuilderType>, BuilderType extends zzgqi<MessageType, BuilderType>> extends zzgom<MessageType, BuilderType> {
    protected zzgqm zza;
    private final zzgqm zzb;

    protected zzgqi(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzaD();
    }

    private static void zza(Object obj, Object obj2) {
        zzgse.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    /* JADX INFO: renamed from: zzai, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzgqi zzah() {
        zzgqi zzgqiVar = (zzgqi) this.zzb.zzb(5, null, null);
        zzgqiVar.zza = zzan();
        return zzgqiVar;
    }

    public final zzgqi zzaj(zzgqm zzgqmVar) {
        if (!this.zzb.equals(zzgqmVar)) {
            if (!this.zza.zzaX()) {
                zzaq();
            }
            zza(this.zza, zzgqmVar);
        }
        return this;
    }

    public final zzgqi zzak(byte[] bArr, int i, int i2, zzgpy zzgpyVar) throws zzgqy {
        if (!this.zza.zzaX()) {
            zzaq();
        }
        try {
            zzgse.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzgoq(zzgpyVar));
            return this;
        } catch (zzgqy e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgqy.zzj();
        }
    }

    public final MessageType zzal() {
        MessageType messagetype = (MessageType) zzan();
        if (messagetype.zzaW()) {
            return messagetype;
        }
        throw new zzgtf(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.zzgrv
    /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
    public MessageType zzan() {
        if (!this.zza.zzaX()) {
            return (MessageType) this.zza;
        }
        this.zza.zzaR();
        return (MessageType) this.zza;
    }

    protected final void zzap() {
        if (this.zza.zzaX()) {
            return;
        }
        zzaq();
    }

    protected void zzaq() {
        zzgqm zzgqmVarZzaD = this.zzb.zzaD();
        zza(zzgqmVarZzaD, this.zza);
        this.zza = zzgqmVarZzaD;
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final /* synthetic */ zzgrw zzbf() {
        throw null;
    }
}
