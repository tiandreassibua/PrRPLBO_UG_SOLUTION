package ac.id.ukdw;

public abstract class SummonCharacter {

    protected Summoner owner;


    public void setOwner(Summoner owner) {
        this.owner = owner;
    }

    public Summoner getOwner() {
        return owner;
    }
}
