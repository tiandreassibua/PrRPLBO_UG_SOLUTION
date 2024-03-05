package com.ug3.soal1;

import java.util.Scanner;

public class UG3Soal1 {
    public static void main(String[] args) {
        // panggil function foodData disini
        Makanan food = new Makanan();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama makanan: ");
        food.setName(sc.nextLine());
        
        System.out.print("Masukkan tanggal kadaluarsa: ");
        food.setExpired(sc.nextLine());

        System.out.print("Masukkan jumlah makanan: ");
        food.setQuantity(sc.nextDouble());

        System.out.print("Masukkan berat makanan: ");
        food.setWeight(sc.nextDouble());
        
        foodData(food.getName(), food.getExpired(), food.getQuantity(), food.getWeight());
        sc.close();
    }

    public static void foodData(String name, String expDate, double qty, double weight) {
        System.out.println("\n======= Informasi makanan =======");
        System.out.println("Nama makanan: " + name);
        System.out.println("Tanggal kadaluarsa: " + expDate);
        System.out.println("Jumlah(quantity): " + qty);
        System.out.println("Berat: " + weight + " gram");
        System.out.println("==================================");
    }

}