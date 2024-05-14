package com.mygdx.game.PlayerNeeds;

public class Player {
    private static Player instance;
    public String nickname;
    public int health;
    public float x_pos;
    public float y_pos;
    public boolean hasBall;
    public float impactPercentage;
//    public Ball ball;
    public static Player getInstance(){
        if (instance == null){
            instance = new Player();
        }

        return instance;
    }
    private Player(){};
}
