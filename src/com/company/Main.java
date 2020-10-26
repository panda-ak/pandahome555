package com.company;

public class Main {

    public static void main(String[] args) {


        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(100);
        boss.setTypeDefense("fly");

        System.out.println("Boss: health = " + boss.getHealth() + " | damage = " + boss.getDamage() + " | type defense " + boss.getTypeDefense());

        Hero[] heroes = createHeroes();

        for (int i = 0; i < heroes.length; i++) {
            System.out.println("________________");
            System.out.println("health = " + heroes[i].getHealth());
            System.out.println("damage = " + heroes[i].getDamage());
            System.out.println("regen = " + heroes[i].getRegen());
        }

       }
    public static Hero[] createHeroes (){
        Hero[] heroes = new Hero[3];

        Hero hero1 = new Hero(200, 40);
        Hero hero2 = new Hero(600, 25);
        Hero hero3 = new Hero(400, 70, 30);

        heroes[0] = hero1;
        heroes[1] = hero2;
        heroes[2] = hero3;

        return heroes;
    }
}