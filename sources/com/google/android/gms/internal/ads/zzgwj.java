package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgwj implements Iterator, Closeable, zzamc {
    private static final zzamb zza = new zzgwi("eof ");
    private static final zzgwq zzb = zzgwq.zzb(zzgwj.class);
    protected zzaly zzc;
    protected zzgwk zzd;
    zzamb zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzamb zzambVar = this.zze;
        if (zzambVar == zza) {
            return false;
        }
        if (zzambVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzh.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzamb) this.zzh.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzamb next() {
        zzamb zzambVarZzb;
        zzamb zzambVar = this.zze;
        if (zzambVar != null && zzambVar != zza) {
            this.zze = null;
            return zzambVar;
        }
        zzgwk zzgwkVar = this.zzd;
        if (zzgwkVar == null || this.zzf >= this.zzg) {
            this.zze = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzgwkVar) {
                this.zzd.zze(this.zzf);
                zzambVarZzb = this.zzc.zzb(this.zzd, this);
                this.zzf = this.zzd.zzb();
            }
            return zzambVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzgwp(this.zzh, this);
    }

    public final void zzf(zzgwk zzgwkVar, long j, zzaly zzalyVar) throws IOException {
        this.zzd = zzgwkVar;
        this.zzf = zzgwkVar.zzb();
        zzgwkVar.zze(zzgwkVar.zzb() + j);
        this.zzg = zzgwkVar.zzb();
        this.zzc = zzalyVar;
    }
}
