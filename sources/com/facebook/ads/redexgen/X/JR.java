package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.games.GamesStatusCodes;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JR {
    public static JR A01;
    public static byte[] A02;
    public static String[] A03 = {"lby1W0wNbQrJZLPqMH4DTOw3yxUdqdf", "kgmV30Pytio8Y45c0SmevPSfJ", "GuqAlZnTPhAyqf6xpABukX78gW1eK", "0NViSQPmvGXLcgxETt4LuQqf8msO5qX", "Lug9XUXTwCkms8e17b8k", "9KOEFfUvG6glq1MfonBkT6Lvp1EWxJyS", "tUrZTe4M4NOwFWRIXhIm4QJOvCAxV", "2InOXM9Ds0dFubkAVSo31GYyY3vE8A8q"};
    public static final String[] A04;
    public static final String[] A05;
    public final SharedPreferences A00;

    public static String A0P(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "rwxiKY1yX8M1uCycGOqUPfCL86zZ3gS";
            strArr[0] = "P38LhqS18Cw18aUWRDVsuYtPAT7MPJu";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 46);
            i4++;
        }
    }

    public static void A0a() {
        A02 = new byte[]{108, 73, 107, 100, 105, 111, 102, 82, 126, 127, 101, 120, 127, 100, 116, 3, 47, 46, 52, 41, 46, 53, 37, 127, 106, 92, 70, 19, 68, 90, 95, 95, 19, 81, 86, 19, 71, 82, 88, 86, 93, 19, 71, 92, 19, 82, 93, 92, 71, 91, 86, 65, 19, 87, 86, 64, 71, 90, 93, 82, 71, 90, 92, 93, Ascii.GS, 6, 17, Ascii.EM, 8, 112, 109, 112, 109, 0, 45, 58, 50, 35, 91, 71, 91, 71, 70, 70, 70, 43, 123, 108, 100, 117, 125, Ascii.FF, 10, 121, 123, 123, 113, 124, 125, 118, 108, 121, 116, 71, 123, 116, 113, 123, 115, 107, 71, 123, 119, 118, 126, 113, 127, 34, 32, 32, 42, 39, 38, 45, 55, 34, 47, Ascii.FS, 32, 47, 42, 32, 40, 48, Ascii.FS, 32, 44, 45, 37, 42, 36, 109, 55, 52, 44, Ascii.FS, 48, 55, 38, 51, Ascii.FS, 32, 34, 45, 32, 38, 47, Ascii.FS, 33, 54, 55, 55, 44, 45, Ascii.FS, 55, 38, 59, 55, Ascii.EM, Ascii.ESC, Ascii.ESC, 17, Ascii.FS, Ascii.GS, Ascii.SYN, Ascii.FF, Ascii.EM, Ascii.DC4, 39, Ascii.ESC, Ascii.DC4, 17, Ascii.ESC, 19, Ascii.VT, 39, Ascii.ESC, Ascii.ETB, Ascii.SYN, Ascii.RS, 17, Ascii.US, 86, Ascii.FF, Ascii.SI, Ascii.ETB, 39, Ascii.VT, Ascii.FF, Ascii.GS, 8, 39, Ascii.ESC, Ascii.ETB, Ascii.SYN, Ascii.RS, 17, 10, Ascii.NAK, 39, Ascii.SUB, Ascii.CR, Ascii.FF, Ascii.FF, Ascii.ETB, Ascii.SYN, 39, Ascii.FF, Ascii.GS, 0, Ascii.FF, 3, 1, 1, Ascii.VT, 6, 7, Ascii.FF, Ascii.SYN, 3, Ascii.SO, 61, 1, Ascii.SO, Ascii.VT, 1, 9, 17, 61, 1, Ascii.CR, Ascii.FF, 4, Ascii.VT, 5, 76, Ascii.SYN, Ascii.NAK, Ascii.CR, 61, 17, Ascii.SYN, 7, Ascii.DC2, 61, 1, Ascii.CR, Ascii.FF, 4, Ascii.VT, Ascii.DLE, Ascii.SI, 3, Ascii.SYN, Ascii.VT, Ascii.CR, Ascii.FF, 68, 70, 70, 76, 65, 64, 75, 81, 68, 73, 122, 70, 73, 76, 70, 78, 86, 122, 70, 74, 75, 67, 76, 66, Ascii.VT, 81, 82, 74, 122, 86, 81, 64, 85, 122, 70, 74, 75, 67, 76, 87, 72, 68, 81, 76, 74, 75, 122, 71, 74, 65, 92, Ascii.RS, Ascii.FS, Ascii.FS, Ascii.SYN, Ascii.ESC, Ascii.SUB, 17, Ascii.VT, Ascii.RS, 19, 32, Ascii.FS, 19, Ascii.SYN, Ascii.FS, Ascii.DC4, Ascii.FF, 32, Ascii.FS, Ascii.DLE, 17, Ascii.EM, Ascii.SYN, Ascii.CAN, 81, Ascii.VT, 8, Ascii.DLE, 32, Ascii.FF, Ascii.VT, Ascii.SUB, Ascii.SI, 32, Ascii.FS, Ascii.DLE, 17, Ascii.EM, Ascii.SYN, Ascii.CR, Ascii.DC2, Ascii.RS, Ascii.VT, Ascii.SYN, Ascii.DLE, 17, 32, Ascii.VT, Ascii.SYN, Ascii.VT, 19, Ascii.SUB, 100, 97, 107, 114, 90, 100, 102, 102, 96, 117, 113, 100, 103, 105, 96, 90, 118, 113, 100, 102, 110, 113, 119, 100, 102, 96, 90, 102, 106, 107, 113, 96, 125, 113, 90, 99, 108, 105, 113, 96, 119, 90, 118, 108, 127, 96, Ascii.ETB, Ascii.DC2, Ascii.CAN, 1, 41, Ascii.ETB, Ascii.NAK, Ascii.NAK, 19, 6, 2, Ascii.ETB, Ascii.DC4, Ascii.SUB, 19, 41, 5, 2, Ascii.ETB, Ascii.NAK, Ascii.GS, 2, 4, Ascii.ETB, Ascii.NAK, 19, 41, Ascii.SUB, 19, Ascii.CAN, 17, 2, Ascii.RS, 63, 58, 48, 41, 1, 63, 48, 58, 44, 49, 55, 58, 1, 63, 50, 50, 49, 41, 1, 50, 49, 63, 58, 1, 58, 43, 44, 55, 48, 57, 1, 45, 54, 49, 41, 55, 48, 57, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 121, 118, 106, 71, 124, 125, 108, 125, 123, 108, 119, 106, 71, 125, 118, 121, 122, 116, 125, Ascii.US, Ascii.SUB, Ascii.DLE, 9, 33, Ascii.US, Ascii.DLE, Ascii.SUB, Ascii.FF, 17, Ascii.ETB, Ascii.SUB, 33, Ascii.US, Ascii.DLE, Ascii.FF, 33, Ascii.SUB, Ascii.ESC, 10, Ascii.ESC, Ascii.GS, 10, 17, Ascii.FF, 33, 10, Ascii.ETB, 19, Ascii.ESC, 17, Ascii.VT, 10, 33, 19, Ascii.CR, 46, 43, 33, 56, Ascii.DLE, 46, 33, 43, 61, 32, 38, 43, Ascii.DLE, 45, 35, 46, 44, 36, 35, 38, 60, 59, 42, 43, Ascii.DLE, 38, 33, 59, 42, 33, 59, Ascii.DLE, 58, 61, 35, Ascii.DLE, 63, 61, 42, 41, 38, 55, 42, 60, 62, 59, 49, 40, 0, 62, 49, 59, 45, 48, 54, 59, 0, 61, 51, 48, 60, 52, 0, 42, 49, 44, 62, 57, 58, 0, 47, 51, 62, 38, 62, 61, 51, 58, 0, 56, 62, 50, 58, 44, 0, 60, 62, 60, 55, 58, 112, 117, 127, 102, 78, 112, 127, 117, 99, 126, 120, 117, 78, 115, 104, 97, 112, 98, 98, 78, 97, 112, 114, 122, 112, 118, 116, 78, 117, 116, 101, 116, 114, 101, 120, 126, 127, 78, 119, 126, 99, 78, 117, 116, 116, 97, 125, 120, 127, 122, 98, 33, 36, 46, 55, Ascii.US, 33, 46, 36, 50, 47, 41, 36, Ascii.US, 35, 33, 35, 40, 37, Ascii.US, 45, 47, 36, 53, 44, 37, Ascii.US, 45, 33, 56, Ascii.US, 51, 41, 58, 37, 5, 0, 10, 19, 59, 5, 10, 0, Ascii.SYN, Ascii.VT, Ascii.CR, 0, 59, 7, 5, 7, Ascii.FF, 1, 59, 9, Ascii.VT, 0, 17, 8, 1, 59, Ascii.SYN, 1, Ascii.DLE, Ascii.SYN, Ascii.GS, 59, 8, Ascii.CR, 9, Ascii.CR, Ascii.DLE, 115, 118, 124, 101, 77, 115, 124, 118, 96, 125, 123, 118, 77, 113, 115, 96, 125, 103, 97, 119, 126, 77, 101, 122, 123, 102, 119, 77, 123, 124, 102, 119, 96, 97, 102, 123, 102, 123, 115, 126, Ascii.FS, Ascii.EM, 19, 10, 34, Ascii.FS, 19, Ascii.EM, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.EM, 34, Ascii.RS, Ascii.DC2, Ascii.DLE, Ascii.CR, Ascii.SI, Ascii.CAN, Ascii.SO, Ascii.SO, 34, Ascii.DC4, Ascii.DLE, Ascii.FS, Ascii.SUB, Ascii.CAN, Ascii.SO, 34, Ascii.EM, 8, Ascii.SI, Ascii.DC4, 19, Ascii.SUB, 34, Ascii.EM, Ascii.DC2, 10, 19, 17, Ascii.DC2, Ascii.FS, Ascii.EM, 69, 64, 74, 83, 123, 69, 74, 64, 86, 75, 77, 64, 123, 64, 65, 66, 69, 81, 72, 80, 123, 69, 87, 87, 65, 80, 123, 84, 86, 65, 72, 75, 69, 64, 123, 87, 77, 94, 65, 123, 70, 93, 80, 65, 87, 97, 100, 110, 119, 95, 97, 110, 100, 114, 111, 105, 100, 95, 100, 105, 115, 97, 98, 108, 101, 95, 112, 108, 97, 121, 97, 98, 108, 101, 95, 112, 114, 101, 99, 97, 99, 104, 101, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 66, 73, 121, 72, 73, 82, 121, 83, 85, 67, 121, 85, 82, 71, 82, 67, 121, 78, 71, 72, 66, 74, 67, 84, 126, 123, 113, 104, 64, 126, 113, 123, 109, 112, 118, 123, 64, 122, 113, 126, 125, 115, 122, 64, 113, 126, 107, 118, 105, 122, 64, 121, 
        106, 113, 113, 122, 115, 125, 120, 114, 107, 67, 125, 114, 120, 110, 115, 117, 120, 67, 121, 100, 115, 67, 108, 112, 125, 101, 121, 110, 67, 127, 125, 127, 116, 121, 67, 113, 125, 100, 67, 111, 117, 102, 121, 55, 50, 56, 33, 9, 55, 56, 50, 36, 57, 63, 50, 9, 48, 55, 63, 58, 9, 55, 50, 9, 58, 57, 55, 50, 9, 57, 56, 9, 50, 63, 37, 61, 9, 51, 36, 36, 57, 36, 37, 80, 85, 95, 70, 110, 80, 95, 85, 67, 94, 88, 85, 110, 87, 80, 88, 93, 110, 94, 95, 110, 70, 84, 83, 71, 88, 84, 70, 110, 84, 67, 67, 94, 67, 66, Ascii.FF, 9, 3, Ascii.SUB, 50, Ascii.FF, 3, 9, Ascii.US, 2, 4, 9, 50, Ascii.VT, 2, Ascii.US, Ascii.SO, 8, 50, 5, Ascii.FF, Ascii.US, 9, Ascii.SUB, Ascii.FF, Ascii.US, 8, 50, Ascii.FF, Ascii.SO, Ascii.SO, 8, 1, 8, Ascii.US, Ascii.FF, Ascii.EM, 4, 2, 3, 120, 125, 119, 110, 70, 120, 119, 125, 107, 118, 112, 125, 70, 113, 112, 125, 124, 70, 111, 112, 125, 124, 118, 105, 107, 118, 126, 107, 124, 106, 106, 70, 120, 119, 112, 116, 120, 109, 112, 118, 119, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 98, 102, 106, 108, 110, 84, 104, 106, 104, 99, 110, 84, 120, 127, 100, 121, 110, 84, 105, 114, 127, 110, 84, 104, 100, 126, 101, 127, 10, Ascii.SI, 5, Ascii.FS, 52, 10, 5, Ascii.SI, Ascii.EM, 4, 2, Ascii.SI, 52, 6, Ascii.SO, 6, 4, Ascii.EM, Ascii.DC2, 52, 4, Ascii.ESC, Ascii.US, Ascii.NAK, Ascii.DLE, Ascii.SUB, 3, 43, Ascii.NAK, Ascii.SUB, Ascii.DLE, 6, Ascii.ESC, Ascii.GS, Ascii.DLE, 43, Ascii.EM, 6, Ascii.ETB, 43, Ascii.GS, Ascii.EM, 4, 6, 17, 7, 7, Ascii.GS, Ascii.ESC, Ascii.SUB, 43, Ascii.DC2, Ascii.ESC, 6, 43, Ascii.SUB, Ascii.NAK, 0, Ascii.GS, 2, 17, 43, 2, Ascii.GS, Ascii.DLE, 17, Ascii.ESC, 43, Ascii.NAK, Ascii.DLE, 7, 43, 2, 70, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 101, 106, 127, 98, 125, 110, 84, 104, 106, 121, 100, 126, 120, 110, 103, 84, 110, 115, 127, 110, 101, 120, 98, 100, 101, 84, 125, 106, 121, 98, 106, 101, 127, 43, 46, 36, 61, Ascii.NAK, 43, 36, 46, 56, 37, 35, 46, Ascii.NAK, 36, 43, 62, 35, 60, 47, Ascii.NAK, 36, 47, 61, Ascii.NAK, 41, 43, 56, 37, 63, 57, 47, 38, Ascii.NAK, 46, 47, 57, 35, 45, 36, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 72, 67, 82, 81, 73, 84, 77, 121, 66, 67, 64, 71, 83, 74, 82, 121, 69, 73, 72, 72, 67, 69, 82, 79, 73, 72, 121, 82, 79, 75, 67, 73, 83, 82, 121, 75, 85, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 118, 125, 108, 111, 119, 106, 115, 71, 124, 125, 126, 121, 109, 116, 108, 71, 106, 125, 121, 124, 71, 108, 113, 117, 125, 119, 109, 108, 71, 117, 107, 103, 98, 104, 113, 89, 103, 104, 98, 116, 105, 111, 98, 89, 104, 99, 114, 113, 105, 116, 109, 89, 98, 99, 96, 103, 115, 106, 114, 89, 116, 99, 114, 116, 111, 99, 117, 89, 104, 115, 107, 124, 121, 115, 106, 66, 124, 115, 121, 111, 114, 116, 121, 66, 115, 120, 105, 106, 114, 111, 118, 66, 121, 120, 123, 124, 104, 113, 105, 66, 105, 117, 111, 114, 105, 105, 113, 120, 66, 105, 116, 112, 120, 114, 104, 105, 66, 112, 110, 56, 61, 55, 46, 6, 56, 55, 61, 43, 54, 48, 61, 6, 55, 60, 45, 46, 54, 43, 50, 6, 61, 60, 63, 56, 44, 53, 45, 6, 45, 48, 52, 60, 54, 44, 45, 6, 52, 42, 86, 83, 89, 64, 104, 86, 89, 83, 69, 88, 94, 83, 104, 88, 67, 68, 91, 104, 82, 89, 86, 85, 91, 82, 83, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 72, 95, 87, 85, 76, 95, 101, 75, 79, 95, 72, 67, 101, 74, 91, 72, 78, 101, 92, 72, 85, 87, 101, 89, 91, 89, 82, 95, 101, 81, 95, 67, 52, 49, 59, 34, 10, 52, 59, 49, 39, 58, 60, 49, 10, 39, 48, 37, 58, 39, 33, 10, 37, 39, 48, 38, 48, 59, 33, 52, 33, 60, 58, 59, 10, 48, 39, 39, 58, 39, 10, 34, 61, 48, 59, 10, 59, 58, 10, 60, 56, 37, 39, 48, 38, 38, 60, 58, 59, Ascii.SO, Ascii.VT, 1, Ascii.CAN, 48, Ascii.SO, 1, Ascii.VT, Ascii.GS, 0, 6, Ascii.VT, 48, Ascii.GS, 10, Ascii.US, 0, Ascii.GS, Ascii.ESC, 48, Ascii.US, Ascii.GS, 10, Ascii.FS, 10, 1, Ascii.ESC, Ascii.SO, Ascii.ESC, 6, 0, 1, 48, 10, Ascii.GS, Ascii.GS, 0, Ascii.GS, Ascii.FS, 48, 6, 1, Ascii.FS, Ascii.ESC, 10, Ascii.SO, Ascii.VT, 48, 0, 9, 48, 6, 1, Ascii.ESC, 10, Ascii.GS, 1, Ascii.SO, 3, 109, 104, 98, 123, 83, 109, 98, 104, 126, 99, 101, 104, 83, 127, 100, 99, 121, 96, 104, 83, 110, 96, 99, 111, 103, 83, 127, 117, 98, 111, 83, 99, 98, 83, 110, 109, 111, 103, 107, 126, 99, 121, 98, 104, 58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 40, 51, 52, 46, 55, 63, 4, 51, 50, 63, 62, 4, 55, 52, 58, 63, 62, 41, 35, 38, 44, 53, Ascii.GS, 35, 44, 38, 48, 45, 43, 38, Ascii.GS, 49, 42, 45, 55, 46, 38, Ascii.GS, 43, 44, 43, 54, Ascii.GS, 55, 44, 49, 41, 43, 50, 50, 35, 32, 46, 39, Ascii.GS, 49, 39, 33, 45, 44, 38, 49, Ascii.GS, 33, 45, 47, 50, 46, 39, 54, 39, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 73, 82, 85, 79, 86, 94, 101, 86, 91, 79, 84, 89, 82, 101, 74, 86, 91, 67, 101, 73, 78, 85, 72, 95, 101, 83, 84, 101, 85, 76, 95, 72, 86, 91, 67, 45, 40, 34, 59, 19, 45, 34, 40, 62, 35, 37, 40, 19, 63, 36, 35, 57, 32, 
        40, 19, 62, 41, 63, 41, 56, 19, 42, 35, 47, 57, 63, 19, 35, 34, 19, 34, 45, 56, 37, 58, 41, 19, 62, 41, 60, 35, 62, 56, 37, 34, 43, 7, 2, 8, 17, 57, 7, 8, 2, Ascii.DC4, 9, Ascii.SI, 2, 57, 19, 4, Ascii.DLE, Ascii.DC4, 5, 41, 44, 38, 63, Ascii.ETB, 41, 38, 44, 58, 39, 33, 44, Ascii.ETB, 61, 59, 45, Ascii.ETB, 43, 41, 43, 32, 45, Ascii.ETB, 37, 39, 44, 61, 36, 45, Ascii.ETB, 46, 39, 58, Ascii.ETB, 33, 37, 41, 47, 45, 59, 114, 119, 125, 100, 76, 114, 125, 119, 97, 124, 122, 119, 76, 102, 96, 118, 76, 96, 103, 118, 114, 126, 122, 125, 116, 76, 122, 126, 114, 116, 118, 76, 119, 118, 112, 124, 119, 122, 125, 116, 122, 127, 117, 108, 68, 122, 117, 127, 105, 116, 114, 127, 68, 108, 115, 114, 111, 126, 119, 114, 104, 111, 126, 127, 68, 114, 117, 111, 126, 117, 111, 68, 110, 105, 119, 68, 107, 105, 126, 125, 114, 99, 126, 104, Ascii.NAK, Ascii.DLE, Ascii.SUB, 3, 43, Ascii.NAK, 7, 7, 17, 0, 43, Ascii.DC2, 17, 0, Ascii.ETB, Ascii.FS, Ascii.GS, Ascii.SUB, 19, 43, 1, Ascii.SUB, Ascii.GS, Ascii.DC2, Ascii.GS, 17, Ascii.DLE, 91, 94, 84, 77, 101, 88, 91, 84, 84, 95, 72, 101, 84, 85, 78, 83, 92, 67, 101, 91, 94, 101, 86, 85, 91, 94, 95, 94, 101, 85, 84, 101, 91, 73, 73, 95, 78, 73, 101, 86, 85, 91, 94, 95, 94, 51, 54, 60, 37, Ascii.CR, 48, 55, 60, 49, 58, 63, 51, 32, 57, Ascii.CR, 32, 55, 34, 61, 32, 38, Ascii.CR, 59, 60, 38, 55, 32, 36, 51, 62, Ascii.CR, 63, 33, 35, 38, 44, 53, Ascii.GS, 32, 46, 45, 33, 41, Ascii.GS, 46, 45, 33, 41, 49, 33, 48, 39, 39, 44, Ascii.SUB, Ascii.US, Ascii.NAK, Ascii.FF, 36, Ascii.CAN, Ascii.ETB, Ascii.DC2, Ascii.CAN, Ascii.DLE, 8, 36, 8, Ascii.RS, Ascii.CAN, Ascii.DC4, Ascii.NAK, Ascii.US, 36, Ascii.CAN, 19, Ascii.SUB, Ascii.NAK, Ascii.NAK, Ascii.RS, Ascii.ETB, 36, Ascii.RS, Ascii.NAK, Ascii.SUB, Ascii.EM, Ascii.ETB, Ascii.RS, Ascii.US, 66, 71, 77, 84, 124, 64, 81, 66, 80, 75, 124, 80, 75, 74, 70, 79, 71, 124, 70, 77, 66, 65, 79, 70, 71, 52, 49, 59, 34, 10, 54, 33, 52, 10, 52, 59, 60, 56, 52, 33, 60, 58, 59, 10, 49, 48, 57, 52, 44, 10, 56, 38, 37, 32, 42, 51, Ascii.ESC, 39, 48, 37, Ascii.ESC, 41, 45, 42, Ascii.ESC, 55, 39, 37, 40, 33, Ascii.ESC, 37, 42, 45, 41, 37, 48, 45, 43, 42, Ascii.ESC, 52, 33, 54, 39, 33, 42, 48, 37, 35, 33, 89, 92, 86, 79, 103, 92, 87, 103, 84, 93, 75, 75, 103, 75, 76, 74, 81, 91, 76, 103, 75, 93, 91, 87, 86, 92, 103, 91, 80, 89, 86, 86, 93, 84, 103, 81, 85, 72, 87, 82, 88, 65, 105, 83, 88, 87, 84, 90, 83, 105, 87, 67, 66, 89, 105, 82, 83, 69, 66, 68, 89, 79, 105, 90, 83, 87, 93, 69, 58, 63, 53, 44, 4, 62, 53, 58, 57, 55, 62, 4, 57, 50, 63, 63, 62, 41, 4, 47, 52, 48, 62, 53, 4, 50, 53, 61, 52, 47, 42, 32, 57, 17, 43, 32, 47, 44, 34, 43, 17, 42, 43, 44, 59, 41, 17, 33, 56, 43, 60, 34, 47, 55, 10, Ascii.SI, 5, Ascii.FS, 52, Ascii.SO, 5, 10, 9, 7, Ascii.SO, 52, Ascii.SO, 19, 4, Ascii.ESC, 7, 10, Ascii.DC2, Ascii.SO, Ascii.EM, 52, 8, 10, 8, 3, Ascii.SO, 65, 68, 78, 87, 127, 69, 78, 65, 66, 76, 69, 127, 69, 88, 79, 80, 76, 65, 89, 69, 82, 127, 67, 65, 67, 72, 69, 127, 70, 79, 82, 127, 68, 83, 76, 94, 91, 81, 72, 96, 90, 81, 94, 93, 83, 90, 96, 90, 71, 80, 79, 83, 94, 70, 90, 77, 96, 73, Ascii.CR, Ascii.CAN, Ascii.GS, Ascii.ETB, Ascii.SO, 38, Ascii.FS, Ascii.ETB, Ascii.CAN, Ascii.ESC, Ascii.NAK, Ascii.FS, 38, Ascii.US, Ascii.FF, Ascii.ETB, Ascii.ETB, Ascii.FS, Ascii.NAK, Ascii.CR, 8, 2, Ascii.ESC, 51, 9, 2, Ascii.CR, Ascii.SO, 0, 9, 51, 5, 2, 0, 5, 2, 9, 51, Ascii.DC4, 51, 3, Ascii.EM, Ascii.CAN, 51, 2, 3, 2, 51, 10, Ascii.EM, 0, 0, Ascii.US, Ascii.SI, Ascii.RS, 9, 9, 2, 51, 3, 2, 51, Ascii.US, 8, 7, 77, 72, 66, 91, 115, 73, 66, 77, 78, 64, 73, 115, 66, 73, 88, 91, 67, 94, 71, Ascii.ESC, Ascii.RS, Ascii.DC4, Ascii.CR, 37, Ascii.US, Ascii.DC4, Ascii.ESC, Ascii.CAN, Ascii.SYN, Ascii.US, 37, 10, 8, Ascii.US, Ascii.SYN, Ascii.NAK, Ascii.ESC, Ascii.RS, 100, 97, 107, 114, 90, 96, 107, 100, 103, 105, 96, 90, 119, 100, 98, 96, 90, 118, 109, 100, 110, 96, 79, 74, 64, 89, 113, 75, 64, 79, 76, 66, 75, 113, 93, 87, 64, 77, 96, 101, 111, 118, 94, 100, 121, 113, 110, 114, 100, 94, 119, 104, 101, 100, 110, 94, 118, 96, 117, 98, 105, 94, 117, 104, 108, 100, Ascii.SI, 10, 0, Ascii.EM, 49, 8, 7, 2, Ascii.SUB, Ascii.VT, Ascii.FS, 49, Ascii.FF, 7, 10, 10, 7, 0, 9, 49, Ascii.SUB, 1, 5, Ascii.VT, 0, Ascii.DC4, 17, Ascii.ESC, 2, 42, 19, Ascii.SUB, 7, Ascii.SYN, Ascii.DLE, 42, 17, Ascii.DLE, 3, Ascii.FS, Ascii.SYN, Ascii.DLE, 42, 6, Ascii.SYN, 7, Ascii.DLE, Ascii.DLE, Ascii.ESC, 42, Ascii.DC4, Ascii.EM, 2, Ascii.DC4, Ascii.FF, 6, 42, Ascii.SUB, Ascii.ESC, 117, 112, 122, 99, 75, 125, 117, 118, 75, 119, 97, 103, 96, 123, 121, 75, 103, 119, 124, 113, 121, 117, 103, 75, 114, 125, 108, 75, 113, 122, 117, 118, 120, 113, 112, 121, 124, 118, 111, 71, 113, 117, 104, 107, 71, 107, 125, 123, 119, 118, 124, 71, 123, 112, 121, 118, 118, 125, 116, 71, 125, 118, 121, 122, 116, 125, 124, 123, 126, 116, 109, 69, 115, 116, 110, 127, 104, 105, 110, 115, 110, 115, 123, 118, 69, 116, 127, 109, 69, 115, 119, 123, 125, 127, 69, 126, 127, 105, 115, 125, 116, 43, 46, 36, 61, Ascii.NAK, 38, 37, 45, Ascii.NAK, 41, 57, Ascii.NAK, 41, 39, 58, 56, 61, 55, 46, 6, 53, 54, 62, 62, 48, 55, 62, 6, 60, 55, 61, 41, 54, 48, 55, 45, 6, 41, 
        43, 60, 63, 48, 33, 109, 104, 98, 123, 83, 98, 109, 120, 101, 122, 105, 83, 111, 109, 126, 99, 121, 127, 105, 96, 83, 111, 99, 97, 124, 109, 111, 120, 83, 120, 100, 126, 105, 127, 100, 99, 96, 104, 10, Ascii.SI, 5, Ascii.FS, 52, 5, 10, Ascii.US, 2, Ascii.GS, Ascii.SO, 52, Ascii.GS, 2, Ascii.SO, Ascii.FS, 52, Ascii.CAN, 5, 10, Ascii.ESC, Ascii.CAN, 3, 4, Ascii.US, 52, 7, 4, Ascii.FF, Ascii.FF, 2, 5, Ascii.FF, 52, Ascii.SO, 5, 10, 9, 7, Ascii.SO, Ascii.SI, 100, 97, 107, 114, 90, 106, 107, 97, 96, 115, 108, 102, 96, 90, 109, 108, 118, 113, 106, 119, 124, 90, 97, 100, 113, 100, 90, 96, 107, 100, 103, 105, 96, 97, 0, 5, Ascii.SI, Ascii.SYN, 62, Ascii.SO, 17, 4, Ascii.SI, 62, 7, 3, 62, 0, 17, 17, 62, 0, Ascii.CR, Ascii.SYN, 0, Ascii.CAN, Ascii.DC2, Ascii.ETB, Ascii.DC2, Ascii.CAN, 1, 41, 6, Ascii.SUB, Ascii.ETB, Ascii.SI, Ascii.ETB, Ascii.DC4, Ascii.SUB, 19, 41, Ascii.NAK, Ascii.SUB, Ascii.US, Ascii.NAK, Ascii.GS, 41, Ascii.ESC, Ascii.ETB, Ascii.SO, 41, Ascii.DC2, 19, Ascii.SUB, Ascii.ETB, Ascii.SI, 41, Ascii.ESC, 5, 52, 49, 59, 34, 10, 37, 57, 52, 44, 52, 55, 57, 48, 10, 49, 60, 38, 52, 55, 57, 48, 10, 39, 48, 56, 58, 33, 48, 10, 58, 59, 10, 59, 48, 33, 34, 58, 39, 62, 10, 57, 58, 38, 38, 81, 84, 94, 71, 111, 64, 92, 81, 73, 81, 82, 92, 85, 67, 111, 92, 95, 87, 87, 89, 94, 87, 111, 85, 94, 81, 82, 92, 85, 84, 115, 118, 124, 101, 77, 98, 126, 115, 107, 115, 112, 126, 119, 97, 77, 124, 119, 101, 77, 118, 119, 97, 123, 117, 124, 61, 56, 50, 43, 3, 44, 48, 61, 37, 61, 62, 48, 57, 47, 3, 47, 52, 51, 43, 3, 57, 50, 56, 63, 61, 46, 56, 71, 66, 72, 81, 121, 86, 84, 67, 74, 73, 71, 66, 121, 79, 72, 82, 67, 84, 85, 82, 79, 82, 79, 71, 74, 121, 66, 95, 72, 71, 75, 79, 69, 121, 81, 67, 68, 80, 79, 67, 81, 99, 102, 108, 117, 93, 114, 112, 103, 110, 109, 99, 102, 93, 108, 99, 118, 107, 116, 103, 93, 102, 123, 108, 99, 111, 107, 97, 93, 117, 103, 96, 116, 107, 103, 117, 58, 63, 53, 44, 4, 43, 41, 62, 55, 52, 58, 63, 4, 41, 45, 4, 63, 34, 53, 58, 54, 50, 56, 4, 44, 62, 57, 45, 50, 62, 44, 121, 124, 118, 111, 71, 104, 106, 125, 110, 125, 118, 108, 71, 104, 116, 121, 97, 121, 122, 116, 125, 71, 121, 109, 108, 119, 71, 123, 116, 113, 123, 115, 34, 39, 45, 52, Ascii.FS, 51, 54, 49, 36, 38, Ascii.FS, 44, 45, Ascii.FS, 119, 114, 112, Ascii.FS, 49, 38, 48, 51, 44, 45, 48, 38, Ascii.EM, Ascii.FS, Ascii.SYN, Ascii.SI, 39, 10, Ascii.GS, Ascii.ESC, Ascii.ETB, Ascii.NAK, 8, Ascii.CR, Ascii.FF, Ascii.GS, 39, Ascii.SUB, Ascii.FF, 39, Ascii.EM, Ascii.RS, Ascii.FF, Ascii.GS, 10, 39, Ascii.GS, 0, Ascii.FF, 10, Ascii.EM, Ascii.VT, 39, Ascii.ESC, Ascii.DLE, Ascii.EM, Ascii.SYN, Ascii.US, Ascii.GS, 94, 91, 81, 72, 96, 77, 73, 96, 93, 74, 89, 89, 90, 77, 96, 92, 87, 90, 92, 84, 96, 90, 81, 94, 93, 83, 90, 91, 44, 41, 35, 58, Ascii.DC2, 63, 59, Ascii.DC2, 61, 33, 44, 52, 47, 44, 46, 38, Ascii.DC2, 46, 63, 44, 62, 37, Ascii.DC2, 43, 44, 33, 33, 47, 44, 46, 38, 32, 37, 47, 54, Ascii.RS, 50, 36, 47, 37, 40, 47, 38, Ascii.RS, 39, 51, 36, 48, 52, 36, 47, 34, 56, Ascii.RS, 34, 32, 49, 49, 40, 47, 38, Ascii.RS, 32, 45, 45, 46, 54, 36, 37, 125, 120, 114, 107, 67, 111, 121, 104, 67, 104, 121, 100, 104, 67, 127, 115, 112, 115, 110, 67, 120, 101, 114, 125, 113, 117, 127, 125, 112, 112, 101, 68, 65, 75, 82, 122, 86, 77, 74, 80, 73, 65, 122, 68, 65, 65, 122, 64, 93, 81, 64, 75, 86, 76, 74, 75, 122, 81, 74, 122, 85, 73, 68, 92, 68, 71, 73, 64, 86, 34, 39, 45, 52, Ascii.FS, 48, 43, 44, 54, 47, 39, Ascii.FS, 32, 47, 38, 34, 49, Ascii.FS, 37, 38, 34, 55, 54, 49, 38, Ascii.FS, 32, 44, 45, 37, 42, 36, Ascii.FS, 44, 45, Ascii.FS, 32, 49, 34, 48, 43, 38, 48, 10, Ascii.SI, 5, Ascii.FS, 52, Ascii.CAN, 3, 4, Ascii.RS, 7, Ascii.SI, 52, 2, Ascii.FF, 5, 4, Ascii.EM, Ascii.SO, 52, Ascii.SI, Ascii.SO, Ascii.CAN, Ascii.US, Ascii.EM, 4, Ascii.DC2, 52, 8, 10, 7, 7, 46, 43, 33, 56, Ascii.DLE, 60, 39, 32, 58, 35, 43, Ascii.DLE, 38, 33, 44, 61, 42, 34, 42, 33, 59, Ascii.DLE, 61, 42, 59, 61, 54, Ascii.DLE, 44, 32, 58, 33, 59, 42, 61, Ascii.DLE, 32, 33, Ascii.DLE, 42, 34, 63, 59, 54, Ascii.DLE, 61, 42, 60, 63, 32, 33, 60, 42, 1, 4, Ascii.SO, Ascii.ETB, 63, 19, 8, Ascii.SI, Ascii.NAK, Ascii.FF, 4, 63, 9, Ascii.SO, 9, Ascii.DC4, 63, 6, Ascii.DC2, Ascii.SI, Ascii.CR, 63, 3, Ascii.SI, Ascii.SO, Ascii.DC4, 5, Ascii.SO, Ascii.DC4, 63, Ascii.DLE, Ascii.DC2, Ascii.SI, Ascii.SYN, 9, 4, 5, Ascii.DC2, 52, 49, 59, 34, 10, 38, 61, 58, 32, 57, 49, 10, 60, 59, 60, 33, 10, 58, 59, 10, 54, 57, 52, 38, 38, 10, 57, 58, 52, 49, 60, 59, 50, 76, 73, 67, 90, 114, 94, 69, 66, 88, 65, 73, 114, 65, 66, 74, 114, 76, 94, 94, 72, 89, 114, 88, 95, 65, Ascii.FF, 9, 3, Ascii.SUB, 50, Ascii.RS, 5, 2, Ascii.CAN, 1, 9, 50, Ascii.GS, Ascii.US, 8, Ascii.SO, 2, 0, Ascii.GS, Ascii.CAN, Ascii.EM, 8, 50, Ascii.SI, 4, 9, 9, 8, Ascii.US, 50, Ascii.EM, 2, 6, 8, 3, 79, 74, 64, 89, 113, 93, 69, 71, 94, 113, 88, 71, 74, 75, 65, 113, 64, 65, 64, 113, 70, 79, 92, 74, 89, 79, 92, 75, 113, 79, 77, 77, 75, 66, 75, 92, 79, 90, 75, 74, 55, 50, 56, 33, 9, 37, 34, 55, 53, 61, 34, 36, 55, 53, 51, 9, 49, 36, 57, 35, 38, 63, 56, 49, 9, 51, 56, 55, 52, 58, 51, 50, 126, 123, 113, 
        104, 64, 108, 102, 113, 124, 64, 126, 121, 107, 122, 109, 64, 126, 123, 64, 115, 112, 126, 123, 3, 6, Ascii.FF, Ascii.NAK, 61, 17, Ascii.ESC, Ascii.FF, 1, 61, 7, Ascii.FF, 6, Ascii.DC2, Ascii.CR, Ascii.VT, Ascii.FF, Ascii.SYN, 61, Ascii.DC2, Ascii.DLE, 7, 4, Ascii.VT, Ascii.SUB, 121, 124, 118, 111, 71, 108, 113, 117, 125, 71, 108, 119, 71, 111, 121, 113, 108, 71, 126, 119, 106, 71, 110, 113, 124, 125, 119, 71, 104, 116, 121, 97, 71, 117, 107, 33, 36, 46, 55, Ascii.US, 52, 41, 45, 37, Ascii.US, 52, 47, Ascii.US, 55, 33, 41, 52, Ascii.US, 38, 47, 50, Ascii.US, 54, 41, 36, 37, 47, Ascii.US, 48, 50, 37, 48, 33, 50, 37, 36, Ascii.US, 45, 51, 104, 109, 103, 126, 86, 125, 96, 100, 108, 102, 124, 125, 86, 123, 108, 126, 104, 123, 109, 108, 109, 86, 127, 96, 109, 108, 102, 7, 2, 8, 17, 57, Ascii.DC2, Ascii.DC4, Ascii.SI, 1, 1, 3, Ascii.DC4, 57, 8, 7, Ascii.DC2, Ascii.SI, Ascii.DLE, 3, 57, Ascii.DC4, 3, 1, Ascii.SI, Ascii.NAK, Ascii.DC2, 3, Ascii.DC4, 57, Ascii.DLE, Ascii.SI, 3, 17, 57, 3, Ascii.DC4, Ascii.DC4, 9, Ascii.DC4, 57, 5, 7, 10, 10, 4, 7, 5, Ascii.CR, 98, 103, 109, 116, 92, 118, 109, 106, 114, 118, 102, 92, 103, 97, 92, 109, 98, 110, 102, 92, 115, 102, 113, 92, 115, 113, 108, 96, 102, 112, 112, 123, 126, 116, 109, 69, 111, 106, 126, 123, 110, 127, 69, 127, 98, 110, 104, 123, 69, 114, 115, 116, 110, 105, 69, 124, 117, 104, 69, 121, 114, 123, 115, 116, 115, 116, 125, 35, 38, 44, 53, Ascii.GS, 55, 49, 39, Ascii.GS, 35, 50, 50, Ascii.GS, 38, 43, 37, 39, 49, 54, Ascii.GS, 35, 50, 43, 96, 101, 111, 118, 94, 116, 114, 100, 94, 98, 96, 98, 105, 100, 101, 94, 100, 121, 100, 98, 116, 117, 110, 115, 94, 103, 110, 115, 94, 111, 100, 117, 118, 110, 115, 106, 106, 111, 101, 124, 84, 126, 120, 110, 84, 104, 106, 104, 99, 110, 111, 84, 110, 115, 110, 104, 126, 127, 100, 121, 84, 98, 101, 84, 104, 106, 104, 99, 110, 84, 102, 106, 101, 106, 108, 110, 121, 69, 64, 74, 83, 123, 81, 87, 65, 123, 86, 77, 84, 84, 72, 65, 123, 69, 74, 77, 73, 69, 80, 77, 75, 74, 83, 86, 92, 69, 109, 71, 65, 87, 109, 65, 87, 81, 71, 64, 87, 109, 71, 64, 91, 109, 66, 83, 64, 65, 87, 64, 115, 118, 124, 101, 77, 100, 123, 118, 119, 125, 77, 97, 119, 113, 125, 124, 118, 77, 113, 122, 115, 124, 124, 119, 126, 77, 119, 124, 115, 112, 126, 119, 118, 125, 105, 104, 115, 110, 115, 104, 125, 104, 121, 67, 120, 117, 111, 125, 126, 112, 121, 120, 54, 34, 35, 56, 37, 56, 35, 54, 35, 50, 8, 50, 57, 54, 53, 59, 50, 51, 74, 69, 64, 74, 66, 78, 92, 72, 91, 77, 118, 93, 64, 68, 76, 118, 68, 90, 48, 60, 62, 125, 53, 50, 48, 54, 49, 60, 60, 56, 125, 50, 55, 32, 125, Ascii.NAK, Ascii.SYN, Ascii.DC2, 7, 6, 1, Ascii.SYN, Ascii.FF, Ascii.DLE, Ascii.FS, Ascii.GS, Ascii.NAK, Ascii.SUB, Ascii.DC4, 57, 61, 58, 61, 57, 33, 57, Ascii.VT, 49, 56, 53, 36, 39, 49, 48, Ascii.VT, 32, 61, 57, 49, Ascii.VT, 53, 50, 32, 49, 38, Ascii.VT, 61, 57, 36, 38, 49, 39, 39, 61, 59, 58, 126, 101, 124, 124, Ascii.CR, Ascii.SUB, Ascii.FF, Ascii.VT, Ascii.CR, Ascii.SYN, Ascii.FS, Ascii.VT, Ascii.SUB, Ascii.ESC, 32, Ascii.ESC, Ascii.RS, Ascii.VT, Ascii.RS, 32, Ascii.SI, Ascii.CR, Ascii.DLE, Ascii.FS, Ascii.SUB, Ascii.FF, Ascii.FF, Ascii.SYN, 17, Ascii.CAN, 32, Ascii.FS, Ascii.DLE, Ascii.DC2, Ascii.GS, Ascii.SYN, 17, Ascii.RS, Ascii.VT, Ascii.SYN, Ascii.DLE, 17, Ascii.FF, 48, 55, 34, 32, 40, Ascii.FS, 55, 49, 34, 32, 38, Ascii.FS, 48, 34, 46, 51, 47, 38, Ascii.FS, 49, 34, 55, 38, 8, Ascii.ETB, Ascii.SUB, Ascii.ESC, 17, 33, Ascii.US, Ascii.DLE, Ascii.SUB, 33, Ascii.ESC, Ascii.DLE, Ascii.SUB, Ascii.GS, Ascii.US, Ascii.FF, Ascii.SUB, 33, Ascii.US, Ascii.VT, 10, 17, Ascii.FF, 17, 10, Ascii.US, 10, Ascii.ESC, Ascii.SI, Ascii.SI, Ascii.SI};
    }

    static {
        A0a();
        A04 = new String[0];
        A05 = new String[]{A0P(86, 5, 14), A0P(65, 9, 115), A0P(74, 12, 88)};
    }

    public JR(Context context) {
        this.A00 = context.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A0P(4500, 31, 125), context), 0);
    }

    public static float A00(Context context) {
        return A0O(context).A2A(A0P(2387, 39, 106), 0.98f);
    }

    public static int A01(Context context) {
        return A0O(context).A2B(A0P(HttpStatus.SC_EXPECTATION_FAILED, 33, 88), 100);
    }

    public static int A02(Context context) {
        return A0O(context).A2B(A0P(2247, 33, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES), 0);
    }

    public static int A03(Context context) {
        return A0O(context).A2B(A0P(2360, 27, 123), -1);
    }

    public static int A04(Context context) {
        return A0O(context).A2B(A0P(731, 37, 74), 3);
    }

    public static int A05(Context context) {
        return A0O(context).A2B(A0P(4482, 18, 7), 0);
    }

    public static int A06(Context context) {
        return A0O(context).A2B(A0P(520, 36, 80), 3000);
    }

    public static int A07(Context context) {
        return A0O(context).A2B(A0P(1399, 50, 8), 30000);
    }

    public static int A08(Context context) {
        return A0O(context).A2B(A0P(1493, 40, 40), 3);
    }

    public static int A09(Context context) {
        return A0O(context).A2B(A0P(1449, 44, 54), GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY);
    }

    public static int A0A(Context context) {
        return A0O(context).A2B(A0P(1533, 48, 51), 100);
    }

    public static int A0B(Context context) {
        return A0O(context).A2B(A0P(1581, 39, 119), 60000);
    }

    public static int A0C(Context context) {
        return A0O(context).A2B(A0P(AuthApiStatusCodes.AUTH_URL_RESOLUTION, 38, 34), 225);
    }

    public static int A0D(Context context) {
        return A0O(context).A2B(A0P(1199, 41, 37), 3145728);
    }

    public static int A0E(Context context) {
        return A0O(context).A2B(A0P(4531, 37, 122), -1);
    }

    public static int A0F(Context context) {
        return A0O(context).A2B(A0P(3141, 32, 88), 2000);
    }

    public static int A0G(Context context) {
        return A0O(context).A2B(A0P(371, 46, 43), -1);
    }

    public static int A0H(Context context) {
        return A0O(context).A2B(A0P(4611, 23, 109), 0);
    }

    public static int A0I(Context context) {
        return A0O(context).A2B(A0P(4045, 35, 54), 3000);
    }

    public static int A0J(Context context) {
        return A0O(context).A2B(A0P(4080, 39, 110), 3000);
    }

    public static int A0K(Context context) {
        return A0O(context).A2B(A0P(1314, 46, 37), 0);
    }

    public static long A0L(Context context) {
        return A0O(context).A2C(A0P(697, 34, 110), 67108864L);
    }

    public static long A0M(Context context) {
        return A0O(context).A2C(A0P(852, 45, 10), 1048576L);
    }

    public static long A0N(Context context) {
        return A0O(context).A2C(A0P(1005, 38, 50), 33554432L);
    }

    public static synchronized JR A0O(Context context) {
        if (A01 == null) {
            A01 = new JR(context);
        }
        return A01;
    }

    public static String A0Q(Context context) {
        return A0O(context).A2D(A0P(2977, 28, 119), A0P(4662, 3, 86));
    }

    public static String A0R(Context context) {
        return A0O(context).A2D(A0P(4020, 25, 76), A0P(4662, 3, 86));
    }

    public static String A0S(Context context) {
        return A0O(context).A2D(A0P(117, 52, 109), A0P(1, 6, 36));
    }

    public static String A0T(Context context) {
        return A0O(context).A2D(A0P(268, 51, 11), A0P(24, 41, 29));
    }

    public static String A0U(Context context) {
        return A0O(context).A2D(A0P(169, 53, 86), A0P(7, 8, 63));
    }

    public static String A0V(Context context) {
        return A0O(context).A2D(A0P(319, 52, 81), A0P(15, 9, 110));
    }

    public static Set<String> A0W(Context context) {
        return A0O(context).A0Z(A0P(556, 44, 97), A04);
    }

    public static Set<String> A0X(Context context) {
        return A0O(context).A0Z(A0P(4572, 39, 81), A05);
    }

    public static Set<String> A0Y(Context context) {
        return A0O(context).A0Z(A0P(2131, 44, 53), A04);
    }

    private Set<String> A0Z(String str, String[] strArr) {
        JSONArray jSONArray;
        String strA2D = A2D(str, null);
        try {
            if (strA2D != null) {
                jSONArray = new JSONArray(strA2D);
            } else {
                jSONArray = new JSONArray((Collection) Arrays.asList(strArr));
            }
            int length = jSONArray.length();
            LinkedHashSet linkedHashSet = new LinkedHashSet(length);
            for (int i = 0; i < length; i++) {
                linkedHashSet.add(jSONArray.getString(i));
            }
            return linkedHashSet;
        } catch (JSONException unused) {
            return new LinkedHashSet();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void A0b(Context context) {
        A0O(context).A00.edit().clear().commit();
    }

    private void A0c(@Nullable String str, @Nullable String str2) throws JSONException {
        if (str == null || str.isEmpty() || str.equals(A0P(91, 2, 121))) {
            return;
        }
        A0d(new JSONObject(str), str2);
    }

    private void A0d(JSONObject jSONObject, @Nullable String key) throws JSONException {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.equals(A0P(93, 24, 54))) {
                A0c(jSONObject.getString(next), next);
            } else {
                String string = next;
                if (key != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(key);
                    String sharedPrefKey = A0P(0, 1, 108);
                    sb.append(sharedPrefKey);
                    sb.append(string);
                    string = sb.toString();
                }
                String sharedPrefKey2 = jSONObject.getString(next);
                editorEdit.putString(string, sharedPrefKey2);
            }
        }
        editorEdit.apply();
    }

    public static boolean A0e(Context context) {
        return A0O(context).A2D(A0P(4634, 28, 80), A0P(4445, 19, 50)).equals(A0P(4464, 18, 121));
    }

    public static boolean A0f(Context context) {
        return A0O(context).A2G(A0P(450, 38, 112), false);
    }

    public static boolean A0g(Context context) {
        return A0O(context).A2G(A0P(3464, 37, 86), false);
    }

    public static boolean A0h(Context context) {
        return A0O(context).A2G(A0P(2494, 29, 117), true);
    }

    public static boolean A0i(Context context) {
        return A0O(context).A2G(A0P(3272, 27, 114), false);
    }

    public static boolean A0j(Context context) {
        return A0O(context).A2G(A0P(808, 44, 83), true);
    }

    public static boolean A0k(Context context) {
        return A0O(context).A2G(A0P(2335, 25, 13), true);
    }

    public static boolean A0l(Context context) {
        return A0O(context).A2G(A0P(3173, 44, 123), true);
    }

    public static boolean A0m(Context context) {
        return A0O(context).A2G(A0P(935, 37, 8), true);
    }

    public static boolean A0n(Context context) {
        return A0O(context).A2G(A0P(2464, 30, 24), false);
    }

    public static boolean A0o(Context context) {
        return A0O(context).A2G(A0P(972, 33, 49), true);
    }

    public static boolean A0p(Context context) {
        return A0O(context).A2G(A0P(2774, 28, 47), false);
    }

    public static boolean A0q(Context context) {
        return A0O(context).A2G(A0P(1043, 40, 120), true);
    }

    public static boolean A0r(Context context) {
        return A0O(context).A2G(A0P(1083, 35, 31), false);
    }

    public static boolean A0s(Context context) {
        return A0O(context).A2G(A0P(2634, 18, 87), false);
    }

    public static boolean A0t(Context context) {
        return A0O(context).A2G(A0P(2861, 35, 58), true);
    }

    public static boolean A0u(Context context) {
        return A0O(context).A2G(A0P(488, 32, 54), false);
    }

    public static boolean A0v(Context context) {
        return A0O(context).A2G(A0P(2802, 25, 64), false);
    }

    public static boolean A0w(Context context) {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        JR jrA0O = A0O(context);
        String strA0P = A0P(2523, 25, 96);
        if (A03[5].charAt(10) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "eVi9wsoxiKuO8fS3Ni664QsxmOwf4Hz";
        strArr[0] = "nOcXZ0DMfofG3U9htYbEeRQSfAelmGW";
        return jrA0O.A2G(strA0P, false);
    }

    public static boolean A0x(Context context) {
        return A0O(context).A2G(A0P(3084, 34, 43), false);
    }

    public static boolean A0y(Context context) {
        return A0O(context).A2G(A0P(1240, 23, 69), false);
    }

    public static boolean A0z(Context context) {
        return A0O(context).A2G(A0P(3043, 41, 69), false);
    }

    public static boolean A10(Context context) {
        return A0O(context).A2G(A0P(2736, 22, 43), false);
    }

    public static boolean A11(Context context) {
        return A0O(context).A2G(A0P(3501, 28, 17), true);
    }

    public static boolean A12(Context context) {
        return A0O(context).A2G(A0P(3529, 31, 99), true);
    }

    public static boolean A13(Context context) {
        return A0O(context).A2G(A0P(3965, 32, 120), false);
    }

    public static boolean A14(Context context) {
        return A0O(context).A2G(A0P(222, 46, 76), false);
    }

    public static boolean A15(Context context) {
        return A0O(context).A2G(A0P(2962, 15, 100), false);
    }

    public static boolean A16(Context context) {
        return A0O(context).A2G(A0P(2426, 38, 22), false);
    }

    public static boolean A17(Context context) {
        return A0O(context).A2G(A0P(2698, 19, 2), true);
    }

    public static boolean A18(Context context) {
        return A0O(context).A2G(A0P(2202, 45, 20), false);
    }

    public static boolean A19(Context context) {
        return A0O(context).A2G(A0P(1620, 25, 25), true);
    }

    public static boolean A1A(Context context) {
        return A0O(context).A2G(A0P(3299, 41, 8), true);
    }

    public static boolean A1B(Context context) {
        return A0O(context).A2G(A0P(2717, 19, 84), true);
    }

    public static boolean A1C(Context context) {
        return A0O(context).A2G(A0P(3340, 35, 44), true);
    }

    public static boolean A1D(Context context) {
        return A0O(context).A2G(A0P(3375, 31, 117), true);
    }

    public static boolean A1E(Context context) {
        return A0O(context).A2G(A0P(3406, 32, 54), true);
    }

    public static boolean A1F(Context context) {
        return A0O(context).A2G(A0P(1645, 45, 20), true);
    }

    public static boolean A1G(Context context) {
        return A0O(context).A2G(A0P(1690, 57, 123), false);
    }

    public static boolean A1H(Context context) {
        return A0O(context).A2G(A0P(1747, 59, 65), true);
    }

    public static boolean A1I(Context context) {
        return A0O(context).A2G(A0P(2896, 32, 54), false);
    }

    public static boolean A1J(Context context) {
        return A0O(context).A2G(A0P(4412, 33, 60), false);
    }

    public static boolean A1K(Context context) {
        return A0O(context).A2G(A0P(3560, 38, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), true);
    }

    public static boolean A1L(Context context) {
        return A0O(context).A2G(A0P(3629, 38, 11), true);
    }

    public static boolean A1M(Context context) {
        return A0O(context).A2G(A0P(3118, 23, 79), true);
    }

    public static boolean A1N(Context context) {
        return A0O(context).A2G(A0P(2280, 21, 108), false);
    }

    public static boolean A1O(Context context) {
        return A0O(context).A2G(A0P(1806, 44, 34), true);
    }

    public static boolean A1P(Context context) {
        return Build.VERSION.SDK_INT >= 16 && A0O(context).A2G(A0P(600, 46, 113), false);
    }

    public static boolean A1Q(Context context) {
        return A0O(context).A2G(A0P(646, 51, 63), true);
    }

    public static boolean A1R(Context context) {
        return A0O(context).A2G(A0P(3667, 43, 109), true);
    }

    public static boolean A1S(Context context) {
        return A0O(context).A2G(A0P(897, 38, 46), false);
    }

    public static boolean A1T(Context context) {
        return A0O(context).A2G(A0P(3217, 30, 30), true);
    }

    public static boolean A1U(Context context) {
        return A0O(context).A2G(A0P(2175, 27, 90), false);
    }

    public static boolean A1V(Context context) {
        return A0O(context).A2G(A0P(1263, 51, 90), false);
    }

    public static boolean A1W(Context context) {
        return A0O(context).A2G(A0P(1118, 40, 67), true);
    }

    public static boolean A1X(Context context) {
        return A0O(context).A2G(A0P(1850, 31, 117), false);
    }

    public static boolean A1Y(Context context) {
        return A0O(context).A2G(A0P(1158, 41, 55), false);
    }

    public static boolean A1Z(Context context) {
        return A0O(context).A2G(A0P(3710, 31, 69), false);
    }

    public static boolean A1a(Context context) {
        return A0O(context).A2G(A0P(3741, 53, 97), false);
    }

    public static boolean A1b(Context context) {
        return A0O(context).A2G(A0P(3794, 38, 78), true);
    }

    public static boolean A1c(Context context) {
        return A0O(context).A2G(A0P(3832, 33, 123), false);
    }

    public static boolean A1d(Context context) {
        return A0O(context).A2G(A0P(1881, 53, 108), false);
    }

    public static boolean A1e(Context context) {
        return A0O(context).A2G(A0P(2827, 34, 91), false);
    }

    public static boolean A1f(Context context) {
        return A0O(context).A2G(A0P(1934, 48, 20), false);
    }

    public static boolean A1g(Context context) {
        return A0O(context).A2G(A0P(3865, 25, 3), false);
    }

    public static boolean A1h(Context context) {
        return A0O(context).A2G(A0P(2301, 34, 85), false);
    }

    public static boolean A1i(Context context) {
        return A0O(context).A2G(A0P(3890, 35, 67), false);
    }

    public static boolean A1j(Context context) {
        return A0O(context).A2G(A0P(3438, 26, 109), false);
    }

    public static boolean A1k(Context context) {
        return A0O(context).A2G(A0P(1982, 51, 98), true);
    }

    public static boolean A1l(Context context) {
        return A0O(context).A2G(A0P(3598, 31, 50), false);
    }

    public static boolean A1m(Context context) {
        return A0O(context).A2G(A0P(3997, 23, 49), true);
    }

    public static boolean A1n(Context context) {
        return A0O(context).A2G(A0P(4119, 27, 39), false);
    }

    public static boolean A1o(Context context) {
        return A0O(context).A2G(A0P(4225, 36, 52), false);
    }

    public static boolean A1p(Context context) {
        return A0O(context).A2G(A0P(2652, 46, 66), true);
    }

    public static boolean A1q(Context context) {
        return A0O(context).A2G(A0P(2928, 34, 52), false);
    }

    public static boolean A1r(Context context) {
        return A0O(context).A2G(A0P(4361, 25, 10), false);
    }

    public static boolean A1s(Context context) {
        return A0O(context).A2G(A0P(4194, 31, 45), false);
    }

    public static boolean A1t(Context context) {
        return A0O(context).A2G(A0P(3925, 40, 0), true);
    }

    public static boolean A1u(Context context) {
        return A0O(context).A2G(A0P(2758, 16, 0), true);
    }

    public static boolean A1v(Context context) {
        return A0O(context).A2G(A0P(4146, 48, 72), false);
    }

    public static boolean A1w(Context context) {
        return A0O(context).A2G(A0P(4261, 23, 108), true);
    }

    public static boolean A1x(Context context) {
        return A0O(context).A2G(A0P(2033, 18, 72), false);
    }

    public static boolean A1y(Context context) {
        return A0O(context).A2G(A0P(2051, 40, 102), false);
    }

    public static boolean A1z(Context context) {
        return A0O(context).A2G(A0P(4284, 36, 47), false);
    }

    public static boolean A20(Context context) {
        return A0O(context).A2G(A0P(4320, 41, 37), true);
    }

    public static boolean A21(Context context) {
        return A0O(context).A2G(A0P(768, 40, 60), false);
    }

    public static boolean A22(Context context) {
        return A0O(context).A2G(A0P(1360, 39, 100), false);
    }

    public static boolean A23(Context context) {
        return A0O(context).A2G(A0P(3247, 25, 60), false);
    }

    public static boolean A24(Context context) {
        return A0O(context).A2G(A0P(4386, 26, 28), true);
    }

    public static boolean A25(Context context) {
        return A0O(context).A2G(A0P(2091, 40, 61), true);
    }

    public static boolean A26(Context context, boolean z) {
        return A28(context, z) && A0O(context).A2G(A0P(2548, 27, 69), false);
    }

    public static boolean A27(Context context, boolean z) {
        return Build.VERSION.SDK_INT >= 21 && A26(context, z) && A0O(context).A2G(A0P(2575, 35, 14), true);
    }

    public static boolean A28(Context context, boolean z) {
        return z && Build.VERSION.SDK_INT >= 19 && A0O(context).A2G(A0P(2610, 24, 17), false);
    }

    public final double A29(String str, double d) {
        String string = this.A00.getString(str, String.valueOf(d));
        if (string != null) {
            try {
                if (string.equals(A0P(4568, 4, 62))) {
                    return d;
                }
                d = Double.parseDouble(string);
                return d;
            } catch (NumberFormatException unused) {
                return d;
            }
        }
        return d;
    }

    public final float A2A(String str, float f) {
        String string = this.A00.getString(str, String.valueOf(f));
        if (string != null) {
            try {
                if (string.equals(A0P(4568, 4, 62))) {
                    return f;
                }
                f = Float.parseFloat(string);
                return f;
            } catch (NumberFormatException unused) {
                return f;
            }
        }
        return f;
    }

    public final int A2B(String str, int i) {
        String string = this.A00.getString(str, String.valueOf(i));
        if (string != null) {
            try {
                if (string.equals(A0P(4568, 4, 62))) {
                    return i;
                }
                i = Integer.parseInt(string);
                return i;
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    public final long A2C(String str, long j) {
        String string = this.A00.getString(str, String.valueOf(j));
        if (string != null) {
            try {
                if (string.equals(A0P(4568, 4, 62))) {
                    return j;
                }
                j = Long.parseLong(string);
                return j;
            } catch (NumberFormatException unused) {
                return j;
            }
        }
        return j;
    }

    public final String A2D(String str, String str2) {
        String string = this.A00.getString(str, str2);
        return (string == null || string.equals(A0P(4568, 4, 62))) ? str2 : string;
    }

    public final void A2E(@Nullable String str) throws JSONException {
        A0c(str, null);
    }

    public final void A2F(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        A0d(jSONObject, null);
    }

    public final boolean A2G(String str, boolean z) {
        String string = this.A00.getString(str, String.valueOf(z));
        if (string != null) {
            boolean zEquals = string.equals(A0P(4568, 4, 62));
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            A03[7] = "2ZyfpebDvRtNljKwQKDVcWpHPVLB6mST";
            return zEquals ? z : Boolean.parseBoolean(string);
        }
        return z;
    }
}
