package com.ramon.deliverylite.persistence;

import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.ramon.deliverylite.profile.UserProfile;

import org.apache.commons.lang3.StringUtils;

public class Datastore {

    public static final String USER_PROFILE = "USER_PROFILE";
    private static final String DECLINED_PROFILE = "DECLINED_PROFILE";
    SharedPreferences preferences;
    Gson gson;

    public Datastore(SharedPreferences preferences, Gson gson) {
        this.gson = gson;
        this.preferences = preferences;
    }


    public String getUserProfileString() {
        return preferences.getString(USER_PROFILE, "");
    }

    public UserProfile getUserProfile(){
        if (!StringUtils.isEmpty(getUserProfileString())){
            return gson.fromJson(getUserProfileString(),UserProfile.class);
        }
        return null;
    }

    public void persistUserProfile(UserProfile profile){
        preferences.edit().putString(USER_PROFILE,gson.toJson(profile)).apply();
    }

    public boolean hasDeclinedProfile() {
        return preferences.getBoolean(DECLINED_PROFILE,false);
    }

    public void persistDeclinedProfile(boolean declined){
        preferences.edit().putBoolean(DECLINED_PROFILE,declined).apply();
    }
}
