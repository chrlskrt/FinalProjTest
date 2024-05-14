package com.mygdx.game.Utils;

public class CurrentUser {
    private static CurrentUser instance;
    private int user_id;
    private String username;
    private String password;

    public static CurrentUser getInstance(){
        if (instance == null){
            instance = new CurrentUser();
        }

        return instance;
    }
    private CurrentUser(){};
}
