package com.ug7.soal2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    private Player p1;
    private Player p2;
    private Ninja n1;
    private Penyihir n2;

    @BeforeEach
    void setUp() throws Exception {
        p1 = new Player("Synd", "synd123");
        p2 = new Player("Pryth", "pryth123");

        n1 = new Ninja(p1);
        n2 = new Penyihir(p2);
    }
    @Test
    void testInitialInfo() {
        assertEquals(100, n1.getHP());
        assertEquals(5000, n1.getMoney());
        assertEquals(0, n1.getWeapon());
        assertFalse(n1.isWalk());

        assertEquals(100, n2.getHP());
        assertEquals(5000, n2.getMoney());
        assertEquals(0, n2.getWeapon());
        assertFalse(n2.isWalk());
    }

    @Test
    void testInvalidNormalAttack() {
        n1.normalAttack(n2);
        assertEquals(100, n2.getHP());
        n2.normalAttack(n1);
        assertEquals(100, n1.getHP());
    }

    @Test
    void testInvalidAbilityAttack() {
        n1.abilityAttack(n2);
        assertEquals(100, n2.getHP());
        n2.abilityAttack(n1);
        assertEquals(100, n1.getHP());
    }

    @Test
    void testBuyWeapon() {
        // Test the buying of invalid weapons of characters
        n1.buyWeapon(2);
        assertEquals(0, n1.getWeapon());
        assertEquals(5000, n1.getMoney());
        n2.buyWeapon(4);
        assertEquals(0, n2.getWeapon());
        assertEquals(5000, n2.getMoney());

        // Test the buying of weapons of characters
        n1.buyWeapon(4);
        assertEquals(4, n1.getWeapon());
        assertEquals(1000, n1.getMoney());
        n2.buyWeapon(3);
        assertEquals(3, n2.getWeapon());
        assertEquals(3000, n2.getMoney());
    }

    @Test
    void testWalk() {
        // Test the walking of characters
        n1.walk(true);
        assertTrue(n1.isWalk());
        n2.walk(true);
        assertTrue(n2.isWalk());
        n1.walk(false);
        assertFalse(n1.isWalk());
        n2.walk(false);
        assertFalse(n2.isWalk());
    }

    @Test
    void testNormalAttack() {
        n1.buyWeapon(4);
        n2.buyWeapon(3);
        n1.normalAttack(n2);
        assertEquals(25, n2.getHP());
        n2.normalAttack(n1);
        assertEquals(75, n1.getHP());
    }

    @Test
    void testWar() {
        n1.buyWeapon(1);
        n2.buyWeapon(2);
        n2.walk(true);
        n2.normalAttack(n1);
        n1.normalAttack(n2);
        n1.normalAttack(n2);
        n2.abilityAttack(n2);
        assertEquals(60, n2.getHP());
        n1.walk(false);
        n1.abilityAttack(n2);
        assertEquals(0, n2.getHP());
        assertEquals(2, n1.getPlayer().getLevel());
    }

}
