package com.UG8A.main.character;

public abstract class MagicCharacter{
    protected int mana;



    @Override
    public void showCharacterInfo() {
        // isi kode anda disini
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void attacked(int damage) {

       // isi kode anda disini
    }

}
