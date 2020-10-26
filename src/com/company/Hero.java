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

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth(){
        return health;
    }

    public int getDamage(){
        return damage;
    }

    public int getRegen(){
        return regen;
    }

}
