package com.applovin.exoplayer2.f;

import com.applovin.exoplayer2.f.l;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f410a = new k() { // from class: com.applovin.exoplayer2.f.k$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.f.k
        public final List getDecoderInfos(String str, boolean z, boolean z2) {
            return l.b(str, z, z2);
        }
    };

    List<i> getDecoderInfos(String str, boolean z, boolean z2) throws l.b;
}
