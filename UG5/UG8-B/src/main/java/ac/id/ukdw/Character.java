package ac.id.ukdw;

public abstract class Character {
    protected String name;
    protected int health;
    protected int damage;


    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isDie(){

//        isi kode anda disini
    }

    public void showCharacterInfo() {
//        isi kode anda disini
    }

    public void attacked(int damage) {

//        isi kode anda disini
    }
}
