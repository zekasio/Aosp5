package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0881Vh implements EG {
    public static String[] A03 = {"TasyJMHsWGEkz863ImR0Q5Lz0Jv5KZRl", "wAvcoPGmhTOD2UdnkI7mjYYyFDdz6tY4", "tIFolEUfJcQQhLLKuuKqSvXZilOQ0d41", "wnba1Mxhk7UAzMMhJxuW", "IqdHVgHf3sWcJ9J53HVfrlZmkyidEDTw", "kUaC4Xj2GLTFGhk3U8FgQLf5h3yptWRi", "yAL9OJMifRSpz7GOwtKlA6RWbWPVLH5t", "1By3yk2Axs3IVYX9txEI"};

    @Nullable
    public C0563Iv A00;
    public final C0551Ij A02 = new C0551Ij();
    public final C0550Ii A01 = new C0550Ii();

    @Override // com.facebook.ads.redexgen.X.EG
    public final Metadata A4h(DJ dj) throws EH {
        if (this.A00 == null || dj.A00 != this.A00.A05()) {
            this.A00 = new C0563Iv(((X2) dj).A00);
            this.A00.A06(((X2) dj).A00 - dj.A00);
        }
        ByteBuffer byteBuffer = dj.A01;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.A02.A0b(bArrArray, iLimit);
        this.A01.A0C(bArrArray, iLimit);
        this.A01.A08(39);
        int size = this.A01.A04(1);
        long j = ((long) size) << 32;
        long ptsAdjustment = this.A01.A04(32);
        long j2 = j | ptsAdjustment;
        this.A01.A08(20);
        int iA04 = this.A01.A04(12);
        int spliceCommandType = this.A01.A04(8);
        SpliceCommand command = null;
        this.A02.A0Z(14);
        if (spliceCommandType == 0) {
            command = new SpliceNullCommand();
        } else if (spliceCommandType == 255) {
            C0551Ij c0551Ij = this.A02;
            if (A03[1].charAt(6) != 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "IAVDgnOrTVyqUqMF0jCb";
            strArr[7] = "AiSzseiiVBo4zRVGAcCm";
            command = PrivateCommand.A00(c0551Ij, iA04, j2);
        } else if (spliceCommandType == 4) {
            command = SpliceScheduleCommand.A00(this.A02);
        } else if (spliceCommandType == 5) {
            command = SpliceInsertCommand.A00(this.A02, j2, this.A00);
        } else if (spliceCommandType == 6) {
            command = TimeSignalCommand.A01(this.A02, j2, this.A00);
        }
        return command == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(command);
    }
}
