package kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.tapjoy.TJAdUnitConstants;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UnsignedKt;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", TJAdUnitConstants.String.VIDEO_START, "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1550differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int iM686uintRemainderJ1ME1BU = UnsignedKt.m686uintRemainderJ1ME1BU(i, i3);
        int iM686uintRemainderJ1ME1BU2 = UnsignedKt.m686uintRemainderJ1ME1BU(i2, i3);
        int iUintCompare = UnsignedKt.uintCompare(iM686uintRemainderJ1ME1BU, iM686uintRemainderJ1ME1BU2);
        int iM432constructorimpl = UInt.m432constructorimpl(iM686uintRemainderJ1ME1BU - iM686uintRemainderJ1ME1BU2);
        return iUintCompare >= 0 ? iM432constructorimpl : UInt.m432constructorimpl(iM432constructorimpl + i3);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1551differenceModulosambcqE(long j, long j2, long j3) {
        long jM688ulongRemaindereb3DHEI = UnsignedKt.m688ulongRemaindereb3DHEI(j, j3);
        long jM688ulongRemaindereb3DHEI2 = UnsignedKt.m688ulongRemaindereb3DHEI(j2, j3);
        int iUlongCompare = UnsignedKt.ulongCompare(jM688ulongRemaindereb3DHEI, jM688ulongRemaindereb3DHEI2);
        long jM510constructorimpl = ULong.m510constructorimpl(jM688ulongRemaindereb3DHEI - jM688ulongRemaindereb3DHEI2);
        return iUlongCompare >= 0 ? jM510constructorimpl : ULong.m510constructorimpl(jM510constructorimpl + j3);
    }

    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1553getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return UnsignedKt.uintCompare(i, i2) >= 0 ? i2 : UInt.m432constructorimpl(i2 - m1550differenceModuloWZ9TVnA(i2, i, UInt.m432constructorimpl(i3)));
        }
        if (i3 < 0) {
            return UnsignedKt.uintCompare(i, i2) <= 0 ? i2 : UInt.m432constructorimpl(i2 + m1550differenceModuloWZ9TVnA(i, i2, UInt.m432constructorimpl(-i3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1552getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return UnsignedKt.ulongCompare(j, j2) >= 0 ? j2 : ULong.m510constructorimpl(j2 - m1551differenceModulosambcqE(j2, j, ULong.m510constructorimpl(j3)));
        }
        if (j3 < 0) {
            return UnsignedKt.ulongCompare(j, j2) <= 0 ? j2 : ULong.m510constructorimpl(j2 + m1551differenceModulosambcqE(j, j2, ULong.m510constructorimpl(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
