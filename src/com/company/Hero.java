package com.company;

public class Hero {



    private int health;
    private int damage;
    private int regen;

    public Hero(int health, int damage, int regen){

        this.health = health;
        this.damage = damage;
        this.regen = regen;
    }

    public Hero(){
    }
    public int getHealth(){
        return health;
    }
    public int getHealth(int health){
        this.health = health;
        return health;
    }
    public int getDamage(){
        return damage;
    }
    public int getDamage(int damage){
        this.damage = damage;
        return damage;
    }
    public int getRegen(){
        return regen;
    }
    public int getRegen(int regen){
        this.regen = regen;
        return regen;
    }
}
