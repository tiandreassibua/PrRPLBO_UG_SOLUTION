package com.UG8A.main;

import com.UG8A.main.character.hero.DragonKnight;
import com.UG8A.main.character.hero.LegionCommander;
import com.UG8A.main.character.hero.Lina;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private Lina lina;
    private DragonKnight dragonKnight;
    private LegionCommander legionCommander;

    @BeforeEach
    public void setUp() {
        lina = new Lina();
        dragonKnight = new DragonKnight();
        legionCommander = new LegionCommander();
    }

    @Test
    public void testAttack() {
        lina.attack(dragonKnight);
        assertEquals(1780, dragonKnight.getHealth());
        assertTrue(dragonKnight.getHealth() > 0);

        legionCommander.attack(lina);

        legionCommander.attack(lina);

        assertEquals(530, lina.getHealth());


        dragonKnight.attack(legionCommander);

        assertEquals(1135,legionCommander.getHealth());
    }

    @Test
    public void testSkill() {
        assertTrue(lina.skill(dragonKnight));
        assertTrue(lina.skill(dragonKnight));
        assertEquals(0, lina.getMana());
        assertFalse(lina.skill(dragonKnight));
        assertEquals(700, dragonKnight.getHealth());

        dragonKnight.skill();
        assertEquals(700, dragonKnight.getHealth());
        assertTrue(legionCommander.skill(dragonKnight));
    }

    @Test
    void testMana() {
        assertEquals(120, lina.getMana());
        lina.setMana(50);
        assertEquals(50, lina.getMana());
    }


}
