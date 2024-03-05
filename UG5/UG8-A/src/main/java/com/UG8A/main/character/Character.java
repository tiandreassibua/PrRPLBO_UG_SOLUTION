package com.UG8A.main.character;

public abstract class Character{
    protected String name;
    protected int health;
    protected int damage;


    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public boolean isDie(){

        // isi kode anda disini
    }

    public void showCharacterInfo() {
        // isi kode anda disini
    }


}
