package com.company;

public class Main {

    public static void main(String[] args) {



       Hero c1 = new Hero(400, 70, 40);
        System.out.println(c1.getHealth()+ " " + c1.getDamage() + " " + c1.getRegen());




    Boss c2 = new Boss(1000, 40, 30);
                System.out.println(c2.getHealth()+ " " +c2.getDamage()+ " " +c2.getMental());

    }
}
