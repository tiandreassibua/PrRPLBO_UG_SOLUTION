package ac.id.ukdw;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        Creep creep1 = new Creep("Creep1", 500, 40);
        Creep creep2 = new Creep("Creep2", 500, 40);
        Creep creep3 = new Creep("Creep3", 500, 40);

        LoneDruid loneDruid = new LoneDruid();
        Warlock warlock = new Warlock();
        SpiritBear spiritBear = loneDruid.summon();
        Golem golem = warlock.summon();

        System.out.println("Informasi karakter awal: ");
        loneDruid.showCharacterInfo();
        System.out.println();
        spiritBear.showCharacterInfo();
        System.out.println();
        golem.showCharacterInfo();
        System.out.println();
        warlock.showCharacterInfo();
        System.out.println("=====================================");

//        Battle time!
        creep1.attack(spiritBear);
        creep1.attack(warlock);
        creep1.attack(loneDruid);
        loneDruid.attack(creep1);
        loneDruid.attack(creep1);
        loneDruid.attack(creep1);
        loneDruid.attack(creep1);
        spiritBear.attack(creep2);
        warlock.attack(creep3);
        golem.attack(creep1);
        golem.attack(creep2);

//        The End
        System.out.println("Informasi karakter akhir: ");
        loneDruid.showCharacterInfo();
        System.out.println();
        spiritBear.showCharacterInfo();
        System.out.println();
        golem.showCharacterInfo();

    }
}
