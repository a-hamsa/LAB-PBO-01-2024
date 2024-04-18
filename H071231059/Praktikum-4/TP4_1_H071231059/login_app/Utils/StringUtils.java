package login_app.Utils;

import login_app.models.Profile;

public class StringUtils {
    public static String userNickname(Profile profile) { 
        String[] split = profile.getFullname().split("\\s+");
        String nickname = split[0];
        return nickname;
    }
}
