package ac.id.ukdw;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Creep creep,creep2;
    private Golem golem;
    private LoneDruid loneDruid;
    private SpiritBear spiritBear;
    private Warlock warlock;




    @BeforeEach
    public void setUp() {
        creep = new Creep("CreepTest",500,40);
        creep2 = new Creep("CreepTest",500,40);
        loneDruid = new LoneDruid();
        warlock = new Warlock();
        spiritBear = loneDruid.summon();
        golem = warlock.summon();
    }

    @Test
    public void testAttack() {
        creep.attack(loneDruid);
        creep.attack(loneDruid);
        assertEquals(1720,loneDruid.getHealth());
        loneDruid.attack(creep);
        loneDruid.attack(creep);
        assertEquals(220,creep.getHealth());
        spiritBear.attack(creep);
        assertEquals(90,creep.getHealth());

        creep.attack(golem);
        assertEquals(960,golem.getHealth());
    }

    @Test
    public void testCharacterIsDie() {
        assertFalse(creep.isDie());
        loneDruid.attack(creep);
        loneDruid.attack(creep);
        spiritBear.attack(creep);
        spiritBear.attack(creep);
        assertTrue(creep.isDie());
        assertFalse(loneDruid.isDie());
        assertFalse(spiritBear.isDie());
    }

    @Test
    public void testUpgradeLevel() {
        loneDruid.setKillCreep(3);
        loneDruid.upgrade();
        assertEquals(1,loneDruid.getLevel());
        assertEquals(0,loneDruid.getKillCreep());
        assertEquals(160,loneDruid.getDamage());
        assertEquals("Lone Druid +"+loneDruid.getLevel(),loneDruid.getName());
        loneDruid.setKillCreep(3);
        loneDruid.upgrade();
        assertEquals(2,loneDruid.getLevel());
        assertEquals(180,loneDruid.getDamage());
        assertEquals("Lone Druid +"+loneDruid.getLevel(),loneDruid.getName());
    }

    @Test
    public void testSummon(){
        assertEquals(1,warlock.getNumOfSummon());
        golem.attack(creep);
        golem.attack(creep);
        golem.attack(creep);
        golem.attack(creep);
        golem.attack(creep);

        golem.attack(creep2);
        golem.attack(creep2);
        golem.attack(creep2);
        golem.attack(creep2);
        golem.attack(creep2);

        assertEquals(2,golem.getKill());
        golem.summon();
        assertEquals(1,golem.getKill());

        assertEquals(loneDruid,spiritBear.getOwner());

    }
}
