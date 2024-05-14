package com.mygdx.game.PlayerNeeds;

public class Avatar {
    public AvatarHead avatar_head;
    public AvatarBody avatar_body;
    public AvatarColor avatar_color;
    public AvatarOutfit avatar_outift;

    private static Avatar instance;
    private Avatar(){};
    public static Avatar getAvatar(){
        if (instance == null){
            instance = new Avatar();
        }

        return instance;
    };

    public void setAvatar_head(AvatarHead avatar_head) {
        this.avatar_head = avatar_head;
    }

    public void setAvatar_body(AvatarBody avatar_body) {
        this.avatar_body = avatar_body;
    }

    public void setAvatar_color(AvatarColor avatar_color) {
        this.avatar_color = avatar_color;
    }

    public void setAvatar_outift(AvatarOutfit avatar_outift) {
        this.avatar_outift = avatar_outift;
    }
}
