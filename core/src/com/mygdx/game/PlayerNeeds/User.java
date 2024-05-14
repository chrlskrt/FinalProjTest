package com.mygdx.game.PlayerNeeds;

public class User {
    private static User instance;
    private int user_id;
    private String username;
    private String password;
    private Player player;
    private Avatar avatar;

    public static User getInstance(){
        if (instance == null){
            instance = new User();
        }

        return instance;
    }
    private User(){};

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}
