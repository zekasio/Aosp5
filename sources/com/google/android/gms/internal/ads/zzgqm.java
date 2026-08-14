package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqi;
import com.google.android.gms.internal.ads.zzgqm;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgqm<MessageType extends zzgqm<MessageType, BuilderType>, BuilderType extends zzgqi<MessageType, BuilderType>> extends zzgon<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgth zzc = zzgth.zzc();

    private final int zza(zzgsp zzgspVar) {
        if (zzgspVar != null) {
            return zzgspVar.zza(this);
        }
        return zzgse.zza().zzb(getClass()).zza(this);
    }

    static zzgqm zzaC(Class cls) {
        Map map = zzb;
        zzgqm zzgqmVar = (zzgqm) map.get(cls);
        if (zzgqmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgqmVar = (zzgqm) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgqmVar == null) {
            zzgqmVar = (zzgqm) ((zzgqm) zzgtq.zzg(cls)).zzb(6, null, null);
            if (zzgqmVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgqmVar);
        }
        return zzgqmVar;
    }

    protected static zzgqm zzaE(zzgqm zzgqmVar, zzgpe zzgpeVar) throws zzgqy {
        zzgpy zzgpyVar = zzgpy.zza;
        zzgpm zzgpmVarZzl = zzgpeVar.zzl();
        zzgqm zzgqmVarZzaD = zzgqmVar.zzaD();
        try {
            zzgsp zzgspVarZzb = zzgse.zza().zzb(zzgqmVarZzaD.getClass());
            zzgspVarZzb.zzh(zzgqmVarZzaD, zzgpn.zzq(zzgpmVarZzl), zzgpyVar);
            zzgspVarZzb.zzf(zzgqmVarZzaD);
            try {
                zzgpmVarZzl.zzz(0);
                zzc(zzgqmVarZzaD);
                zzc(zzgqmVarZzaD);
                return zzgqmVarZzaD;
            } catch (zzgqy e) {
                e.zzh(zzgqmVarZzaD);
                throw e;
            }
        } catch (zzgqy e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgqy(e);
            }
            e.zzh(zzgqmVarZzaD);
            throw e;
        } catch (zzgtf e3) {
            zzgqy zzgqyVarZza = e3.zza();
            zzgqyVarZza.zzh(zzgqmVarZzaD);
            throw zzgqyVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgqy) {
                throw ((zzgqy) e4.getCause());
            }
            zzgqy zzgqyVar = new zzgqy(e4);
            zzgqyVar.zzh(zzgqmVarZzaD);
            throw zzgqyVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgqy) {
                throw ((zzgqy) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgqm zzaF(zzgqm zzgqmVar, byte[] bArr) throws zzgqy {
        zzgqm zzgqmVarZzd = zzd(zzgqmVar, bArr, 0, bArr.length, zzgpy.zza);
        zzc(zzgqmVarZzd);
        return zzgqmVarZzd;
    }

    protected static zzgqm zzaG(zzgqm zzgqmVar, zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        zzgpm zzgpmVarZzl = zzgpeVar.zzl();
        zzgqm zzgqmVarZzaD = zzgqmVar.zzaD();
        try {
            zzgsp zzgspVarZzb = zzgse.zza().zzb(zzgqmVarZzaD.getClass());
            zzgspVarZzb.zzh(zzgqmVarZzaD, zzgpn.zzq(zzgpmVarZzl), zzgpyVar);
            zzgspVarZzb.zzf(zzgqmVarZzaD);
            try {
                zzgpmVarZzl.zzz(0);
                zzc(zzgqmVarZzaD);
                return zzgqmVarZzaD;
            } catch (zzgqy e) {
                e.zzh(zzgqmVarZzaD);
                throw e;
            }
        } catch (zzgqy e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgqy(e);
            }
            e.zzh(zzgqmVarZzaD);
            throw e;
        } catch (zzgtf e3) {
            zzgqy zzgqyVarZza = e3.zza();
            zzgqyVarZza.zzh(zzgqmVarZzaD);
            throw zzgqyVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgqy) {
                throw ((zzgqy) e4.getCause());
            }
            zzgqy zzgqyVar = new zzgqy(e4);
            zzgqyVar.zzh(zzgqmVarZzaD);
            throw zzgqyVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgqy) {
                throw ((zzgqy) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgqm zzaH(zzgqm zzgqmVar, InputStream inputStream, zzgpy zzgpyVar) throws zzgqy {
        zzgpm zzgpmVarZzH = zzgpm.zzH(inputStream, 4096);
        zzgqm zzgqmVarZzaD = zzgqmVar.zzaD();
        try {
            zzgsp zzgspVarZzb = zzgse.zza().zzb(zzgqmVarZzaD.getClass());
            zzgspVarZzb.zzh(zzgqmVarZzaD, zzgpn.zzq(zzgpmVarZzH), zzgpyVar);
            zzgspVarZzb.zzf(zzgqmVarZzaD);
            zzc(zzgqmVarZzaD);
            return zzgqmVarZzaD;
        } catch (zzgqy e) {
            e = e;
            if (e.zzl()) {
                e = new zzgqy(e);
            }
            e.zzh(zzgqmVarZzaD);
            throw e;
        } catch (zzgtf e2) {
            zzgqy zzgqyVarZza = e2.zza();
            zzgqyVarZza.zzh(zzgqmVarZzaD);
            throw zzgqyVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgqy) {
                throw ((zzgqy) e3.getCause());
            }
            zzgqy zzgqyVar = new zzgqy(e3);
            zzgqyVar.zzh(zzgqmVarZzaD);
            throw zzgqyVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgqy) {
                throw ((zzgqy) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zzgqm zzaI(zzgqm zzgqmVar, byte[] bArr, zzgpy zzgpyVar) throws zzgqy {
        zzgqm zzgqmVarZzd = zzd(zzgqmVar, bArr, 0, bArr.length, zzgpyVar);
        zzc(zzgqmVarZzd);
        return zzgqmVarZzd;
    }

    protected static zzgqr zzaJ() {
        return zzgqn.zzf();
    }

    protected static zzgqr zzaK(zzgqr zzgqrVar) {
        int size = zzgqrVar.size();
        return zzgqrVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static zzgqu zzaL() {
        return zzgrl.zzf();
    }

    protected static zzgqv zzaM() {
        return zzgsf.zze();
    }

    protected static zzgqv zzaN(zzgqv zzgqvVar) {
        int size = zzgqvVar.size();
        return zzgqvVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaP(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzaQ(zzgrw zzgrwVar, String str, Object[] objArr) {
        return new zzgsg(zzgrwVar, str, objArr);
    }

    protected static void zzaT(Class cls, zzgqm zzgqmVar) {
        zzgqmVar.zzaS();
        zzb.put(cls, zzgqmVar);
    }

    private static zzgqm zzc(zzgqm zzgqmVar) throws zzgqy {
        if (zzgqmVar == null || zzgqmVar.zzaW()) {
            return zzgqmVar;
        }
        zzgqy zzgqyVarZza = new zzgtf(zzgqmVar).zza();
        zzgqyVarZza.zzh(zzgqmVar);
        throw zzgqyVarZza;
    }

    private static zzgqm zzd(zzgqm zzgqmVar, byte[] bArr, int i, int i2, zzgpy zzgpyVar) throws zzgqy {
        zzgqm zzgqmVarZzaD = zzgqmVar.zzaD();
        try {
            zzgsp zzgspVarZzb = zzgse.zza().zzb(zzgqmVarZzaD.getClass());
            zzgspVarZzb.zzi(zzgqmVarZzaD, bArr, 0, i2, new zzgoq(zzgpyVar));
            zzgspVarZzb.zzf(zzgqmVarZzaD);
            return zzgqmVarZzaD;
        } catch (zzgqy e) {
            e = e;
            if (e.zzl()) {
                e = new zzgqy(e);
            }
            e.zzh(zzgqmVarZzaD);
            throw e;
        } catch (zzgtf e2) {
            zzgqy zzgqyVarZza = e2.zza();
            zzgqyVarZza.zzh(zzgqmVarZzaD);
            throw zzgqyVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgqy) {
                throw ((zzgqy) e3.getCause());
            }
            zzgqy zzgqyVar = new zzgqy(e3);
            zzgqyVar.zzh(zzgqmVarZzaD);
            throw zzgqyVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgqy zzgqyVarZzj = zzgqy.zzj();
            zzgqyVarZzj.zzh(zzgqmVarZzaD);
            throw zzgqyVarZzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgse.zza().zzb(getClass()).zzj(this, (zzgqm) obj);
    }

    public final int hashCode() {
        if (zzaX()) {
            return zzay();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzay = zzay();
        this.zza = iZzay;
        return iZzay;
    }

    public final String toString() {
        return zzgry.zza(this, super.toString());
    }

    protected final zzgqi zzaA() {
        return (zzgqi) zzb(5, null, null);
    }

    public final zzgqi zzaB() {
        zzgqi zzgqiVar = (zzgqi) zzb(5, null, null);
        zzgqiVar.zzaj(this);
        return zzgqiVar;
    }

    final zzgqm zzaD() {
        return (zzgqm) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final /* synthetic */ zzgrv zzaO() {
        return (zzgqi) zzb(5, null, null);
    }

    protected final void zzaR() {
        zzgse.zza().zzb(getClass()).zzf(this);
        zzaS();
    }

    final void zzaS() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzaU(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final void zzaV(zzgpt zzgptVar) throws IOException {
        zzgse.zza().zzb(getClass()).zzm(this, zzgpu.zza(zzgptVar));
    }

    public final boolean zzaW() {
        boolean zBooleanValue = Boolean.TRUE.booleanValue();
        byte bByteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzgse.zza().zzb(getClass()).zzk(this);
        if (!zBooleanValue) {
            return zZzk;
        }
        zzb(2, true != zZzk ? null : this, null);
        return zZzk;
    }

    final boolean zzaX() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    final int zzay() {
        return zzgse.zza().zzb(getClass()).zzb(this);
    }

    protected abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final /* synthetic */ zzgrw zzbf() {
        return (zzgqm) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    final int zzat(zzgsp zzgspVar) {
        if (zzaX()) {
            int iZza = zza(zzgspVar);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zza(zzgspVar);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final int zzaz() {
        int iZza;
        if (zzaX()) {
            iZza = zza(null);
            if (iZza < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
            }
        } else {
            iZza = this.zzd & Integer.MAX_VALUE;
            if (iZza == Integer.MAX_VALUE) {
                iZza = zza(null);
                if (iZza < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza;
            }
        }
        return iZza;
    }
}
