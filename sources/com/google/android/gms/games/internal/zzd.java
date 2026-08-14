package com.google.android.gms.games.internal;

import com.google.android.gms.internal.games.zzfx;
import com.google.android.gms.internal.games.zzfy;
import kotlin.text.Typography;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzd {
    public static final String zzda;
    public static final String zzdb;
    public static final String zzdc;
    public static final String zzdd;
    private static final String[] zzde;
    private static final String[] zzdf;

    static {
        char[] cArr = new char[27];
        cArr[0] = 175;
        cArr[1] = 171;
        cArr[2] = Typography.nbsp;
        cArr[3] = 184;
        cArr[4] = 158;
        cArr[5] = 179;
        cArr[6] = Typography.registered;
        cArr[7] = 166;
        cArr[8] = 164;
        cArr[9] = 179;
        cArr[10] = Typography.section;
        cArr[11] = 164;
        cArr[12] = Typography.plusMinus;
        cArr[13] = 158;
        cArr[14] = 165;
        cArr[15] = Typography.plusMinus;
        cArr[16] = 168;
        cArr[17] = 164;
        cArr[18] = 173;
        cArr[19] = Typography.pound;
        cArr[20] = 158;
        cArr[21] = 178;
        cArr[22] = 179;
        cArr[23] = Typography.nbsp;
        cArr[24] = 179;
        cArr[25] = 180;
        cArr[26] = 178;
        int i = 0;
        for (int i2 = 27; i < i2; i2 = 27) {
            cArr[i] = (char) (cArr[i] - '?');
            i++;
        }
        zzda = new String(cArr);
        char[] cArr2 = new char[22];
        cArr2[0] = 175;
        cArr2[1] = 171;
        cArr2[2] = Typography.nbsp;
        cArr2[3] = 184;
        cArr2[4] = 158;
        cArr2[5] = 179;
        cArr2[6] = Typography.registered;
        cArr2[7] = 166;
        cArr2[8] = 164;
        cArr2[9] = 179;
        cArr2[10] = Typography.section;
        cArr2[11] = 164;
        cArr2[12] = Typography.plusMinus;
        cArr2[13] = 158;
        cArr2[14] = 173;
        cArr2[15] = 168;
        cArr2[16] = Typography.cent;
        cArr2[17] = 170;
        cArr2[18] = 173;
        cArr2[19] = Typography.nbsp;
        cArr2[20] = 172;
        cArr2[21] = 164;
        for (int i3 = 0; i3 < 22; i3++) {
            cArr2[i3] = (char) (cArr2[i3] - '?');
        }
        zzdb = new String(cArr2);
        char[] cArr3 = new char[33];
        cArr3[0] = 175;
        cArr3[1] = 171;
        cArr3[2] = Typography.nbsp;
        cArr3[3] = 184;
        cArr3[4] = 158;
        cArr3[5] = 179;
        cArr3[6] = Typography.registered;
        cArr3[7] = 166;
        cArr3[8] = 164;
        cArr3[9] = 179;
        cArr3[10] = Typography.section;
        cArr3[11] = 164;
        cArr3[12] = Typography.plusMinus;
        cArr3[13] = 158;
        cArr3[14] = 168;
        cArr3[15] = 173;
        cArr3[16] = 181;
        cArr3[17] = 168;
        cArr3[18] = 179;
        cArr3[19] = Typography.nbsp;
        cArr3[20] = 179;
        cArr3[21] = 168;
        cArr3[22] = Typography.registered;
        cArr3[23] = 173;
        cArr3[24] = 158;
        cArr3[25] = 173;
        cArr3[26] = 168;
        cArr3[27] = Typography.cent;
        cArr3[28] = 170;
        cArr3[29] = 173;
        cArr3[30] = Typography.nbsp;
        cArr3[31] = 172;
        cArr3[32] = 164;
        for (int i4 = 0; i4 < 33; i4++) {
            cArr3[i4] = (char) (cArr3[i4] - '?');
        }
        zzdc = new String(cArr3);
        char[] cArr4 = new char[27];
        cArr4[0] = 173;
        cArr4[1] = 168;
        cArr4[2] = Typography.cent;
        cArr4[3] = 170;
        cArr4[4] = 173;
        cArr4[5] = Typography.nbsp;
        cArr4[6] = 172;
        cArr4[7] = 164;
        cArr4[8] = 158;
        cArr4[9] = Typography.nbsp;
        cArr4[10] = 161;
        cArr4[11] = 180;
        cArr4[12] = 178;
        cArr4[13] = 164;
        cArr4[14] = 158;
        cArr4[15] = Typography.plusMinus;
        cArr4[16] = 164;
        cArr4[17] = 175;
        cArr4[18] = Typography.registered;
        cArr4[19] = Typography.plusMinus;
        cArr4[20] = 179;
        cArr4[21] = 158;
        cArr4[22] = 179;
        cArr4[23] = Typography.registered;
        cArr4[24] = 170;
        cArr4[25] = 164;
        cArr4[26] = 173;
        for (int i5 = 0; i5 < 27; i5++) {
            cArr4[i5] = (char) (cArr4[i5] - '?');
        }
        String str = new String(cArr4);
        zzdd = str;
        zzfy zzfyVarZza = zzfy.zza("external_player_id", "profile_icon_image_id", "profile_hi_res_image_id", "profile_icon_image_uri", "profile_icon_image_url", "profile_hi_res_image_uri", "profile_hi_res_image_url", "profile_name", "last_updated", "is_in_circles", "has_all_public_acls", "has_debug_access", "is_profile_visible", "current_xp_total", "current_level", "current_level_min_xp", "current_level_max_xp", "next_level", "next_level_max_xp", "last_level_up_timestamp", "player_title", "most_recent_external_game_id", "most_recent_game_name", "most_recent_activity_timestamp", "most_recent_game_icon_id", "most_recent_game_icon_uri", "most_recent_game_hi_res_id", "most_recent_game_hi_res_uri", "most_recent_game_featured_id", "most_recent_game_featured_uri", "gamer_tag", "real_name", "banner_image_landscape_id", "banner_image_landscape_uri", "banner_image_landscape_url", "banner_image_portrait_id", "banner_image_portrait_uri", "banner_image_portrait_url", "total_unlocked_achievements", zzda, zzdb, zzdc, "profile_creation_timestamp", str, "friends_list_visibility");
        zzfy zzfyVarZza2 = zzfy.zza("gamer_friend_status", "gamer_friend_update_timestamp", "is_muted");
        zzde = (String[]) zzfyVarZza.toArray(new String[0]);
        zzdf = (String[]) ((zzfx) ((zzfx) new zzfx().zza(zzfyVarZza2)).zza(zzfyVarZza)).zzct().toArray(new String[0]);
    }
}
