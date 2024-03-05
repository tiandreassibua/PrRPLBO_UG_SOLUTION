package com.ug7.soal2;

public class Main {
    public static void main(String[] args) {
        Player P_user1 = new Player("Synd", "synd123");
        Player P_user2 = new Player("Pryth", "pryth123");

        Ninja A_user1 = new Ninja(P_user1);
        Penyihir A_user2 = new Penyihir(P_user2);

        System.out.println("\n========== AWAL ==========");
        A_user1.getInfo();
        A_user2.getInfo();

        System.out.println("\n========== NORMAL ATTACK #1 ==========");
        System.out.print("["+A_user1.getPlayer().getUsername()+"] - ");
        A_user1.normalAttack(A_user2);

        System.out.println("\n========== BELI SENJATA #1 ==========");
        System.out.print("["+A_user1.getPlayer().getUsername()+"] - ");
        A_user1.buyWeapon(2);
        System.out.print("["+A_user2.getPlayer().getUsername()+"] - ");
        A_user2.buyWeapon(4);

        System.out.println("\n========== BELI SENJATA #2 ==========");
        System.out.print("["+A_user1.getPlayer().getUsername()+"] - ");
        A_user1.buyWeapon(1);
        System.out.print("["+A_user2.getPlayer().getUsername()+"] - ");
        A_user2.buyWeapon(3);

        System.out.println("\n========== NORMAL ATTACK #2 ==========");
        System.out.print("["+A_user1.getPlayer().getUsername()+"] - ");
        A_user1.normalAttack(A_user2);
        System.out.print("["+A_user2.getPlayer().getUsername()+"] - ");
        A_user2.normalAttack(A_user1);

        System.out.println("\n========== ABILITY ATTACK #1 ==========");
        System.out.print("["+A_user1.getPlayer().getUsername()+"] - ");
        A_user1.abilityAttack(A_user2);
        System.out.print("["+A_user2.getPlayer().getUsername()+"] - ");
        A_user2.abilityAttack(A_user1);

        System.out.println("\n========== WALKING AND NORMAL ATTACK #1 ==========");
        A_user1.walk(true);
        System.out.print("["+A_user1.getPlayer().getUsername()+"] - ");
        A_user1.normalAttack(A_user2);
        A_user2.walk(true);
        System.out.print("["+A_user2.getPlayer().getUsername()+"] - ");
        A_user2.normalAttack(A_user1);

        System.out.println("\n========== ABILITY ATTACK #2 ==========");
        System.out.print("["+A_user1.getPlayer().getUsername()+"] - ");
        A_user1.abilityAttack(A_user2);
        System.out.print("["+A_user2.getPlayer().getUsername()+"] - ");
        A_user2.abilityAttack(A_user1);

        System.out.println("\n========== WAR #1 ==========");
        System.out.print("["+A_user1.getPlayer().getUsername()+"] - ");
        A_user1.walk(false);
        System.out.print("["+A_user2.getPlayer().getUsername()+"] - ");
        A_user2.walk(false);
        System.out.print("["+A_user1.getPlayer().getUsername()+"] - ");
        A_user1.normalAttack(A_user2);
        System.out.print("["+A_user2.getPlayer().getUsername()+"] - ");
        A_user2.normalAttack(A_user1);
        System.out.print("["+A_user1.getPlayer().getUsername()+"] - ");
        A_user1.abilityAttack(A_user2);

        System.out.println("\n========== AKHIR ==========");
        A_user1.getInfo();
        A_user2.getInfo();

    }
}
