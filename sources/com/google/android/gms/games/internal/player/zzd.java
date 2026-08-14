package com.google.android.gms.games.internal.player;

import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzd {
    public final String name;
    public final String zzbe;
    public final String zzbj;
    public final String zzce;
    public final String zzhz;
    public final String zzia;
    public final String zzib;
    public final String zzic;
    public final String zzid;
    public final String zzie;
    public final String zzif;
    public final String zzig;
    public final String zzih;
    public final String zzii;
    public final String zzij;
    public final String zzik;
    public final String zzil;
    public final String zzim;
    public final String zzin;
    public final String zzio;
    private final String zzip;
    public final String zziq;
    public final String zzir;
    public final String zzis;
    public final String zzit;
    public final String zziu;
    public final String zziv;
    public final String zziw;
    public final String zzix;
    public final String zziy;
    public final String zziz;
    public final String zzja;
    public final String zzjb;

    @Deprecated
    private final String zzjc;

    @Deprecated
    private final String zzjd;

    @Deprecated
    private final String zzje;
    public final String zzjf;
    public final String zzjg;
    public final String zzjh;
    public final String zzji;
    private final String zzjj;
    public final String zzjk;

    public zzd(String str) {
        String strConcat;
        if (TextUtils.isEmpty(null)) {
            this.zzhz = "external_player_id";
            this.zzia = "profile_name";
            this.zzib = "profile_icon_image_uri";
            this.zzic = "profile_icon_image_url";
            this.zzid = "profile_hi_res_image_uri";
            this.zzie = "profile_hi_res_image_url";
            this.zzif = "last_updated";
            this.zzig = "is_in_circles";
            this.zzih = "played_with_timestamp";
            this.zzii = "current_xp_total";
            this.zzij = "current_level";
            this.zzik = "current_level_min_xp";
            this.zzil = "current_level_max_xp";
            this.zzim = "next_level";
            this.zzin = "next_level_max_xp";
            this.zzio = "last_level_up_timestamp";
            this.zzbe = "player_title";
            this.zzip = "has_all_public_acls";
            this.zziq = "is_profile_visible";
            this.zzir = "most_recent_external_game_id";
            this.zzis = "most_recent_game_name";
            this.zzit = "most_recent_activity_timestamp";
            this.zziu = "most_recent_game_icon_uri";
            this.zziv = "most_recent_game_hi_res_uri";
            this.zziw = "most_recent_game_featured_uri";
            this.zzix = "has_debug_access";
            this.zzbj = "gamer_tag";
            this.name = "real_name";
            this.zziy = "banner_image_landscape_uri";
            this.zziz = "banner_image_landscape_url";
            this.zzja = "banner_image_portrait_uri";
            this.zzjb = "banner_image_portrait_url";
            this.zzjc = "gamer_friend_status";
            this.zzjd = "gamer_friend_update_timestamp";
            this.zzje = "is_muted";
            this.zzjf = "total_unlocked_achievements";
            this.zzjg = com.google.android.gms.games.internal.zzd.zzda;
            this.zzjh = com.google.android.gms.games.internal.zzd.zzdb;
            this.zzji = com.google.android.gms.games.internal.zzd.zzdc;
            this.zzjj = "profile_creation_timestamp";
            this.zzce = com.google.android.gms.games.internal.zzd.zzdd;
            strConcat = "friends_list_visibility";
        } else {
            this.zzhz = "null".concat("external_player_id");
            this.zzia = "null".concat("profile_name");
            this.zzib = "null".concat("profile_icon_image_uri");
            this.zzic = "null".concat("profile_icon_image_url");
            this.zzid = "null".concat("profile_hi_res_image_uri");
            this.zzie = "null".concat("profile_hi_res_image_url");
            this.zzif = "null".concat("last_updated");
            this.zzig = "null".concat("is_in_circles");
            this.zzih = "null".concat("played_with_timestamp");
            this.zzii = "null".concat("current_xp_total");
            this.zzij = "null".concat("current_level");
            this.zzik = "null".concat("current_level_min_xp");
            this.zzil = "null".concat("current_level_max_xp");
            this.zzim = "null".concat("next_level");
            this.zzin = "null".concat("next_level_max_xp");
            this.zzio = "null".concat("last_level_up_timestamp");
            this.zzbe = "null".concat("player_title");
            this.zzip = "null".concat("has_all_public_acls");
            this.zziq = "null".concat("is_profile_visible");
            this.zzir = "null".concat("most_recent_external_game_id");
            this.zzis = "null".concat("most_recent_game_name");
            this.zzit = "null".concat("most_recent_activity_timestamp");
            this.zziu = "null".concat("most_recent_game_icon_uri");
            this.zziv = "null".concat("most_recent_game_hi_res_uri");
            this.zziw = "null".concat("most_recent_game_featured_uri");
            this.zzix = "null".concat("has_debug_access");
            this.zzbj = "null".concat("gamer_tag");
            this.name = "null".concat("real_name");
            this.zziy = "null".concat("banner_image_landscape_uri");
            this.zziz = "null".concat("banner_image_landscape_url");
            this.zzja = "null".concat("banner_image_portrait_uri");
            this.zzjb = "null".concat("banner_image_portrait_url");
            this.zzjc = "null".concat("gamer_friend_status");
            this.zzjd = "null".concat("gamer_friend_update_timestamp");
            this.zzje = "null".concat("is_muted");
            this.zzjf = "null".concat("total_unlocked_achievements");
            String strValueOf = String.valueOf(com.google.android.gms.games.internal.zzd.zzda);
            this.zzjg = strValueOf.length() != 0 ? "null".concat(strValueOf) : new String("null");
            String strValueOf2 = String.valueOf(com.google.android.gms.games.internal.zzd.zzdb);
            this.zzjh = strValueOf2.length() != 0 ? "null".concat(strValueOf2) : new String("null");
            String strValueOf3 = String.valueOf(com.google.android.gms.games.internal.zzd.zzdc);
            this.zzji = strValueOf3.length() != 0 ? "null".concat(strValueOf3) : new String("null");
            this.zzjj = "null".concat("profile_creation_timestamp");
            String strValueOf4 = String.valueOf(com.google.android.gms.games.internal.zzd.zzdd);
            this.zzce = strValueOf4.length() != 0 ? "null".concat(strValueOf4) : new String("null");
            strConcat = "null".concat("friends_list_visibility");
        }
        this.zzjk = strConcat;
    }
}
