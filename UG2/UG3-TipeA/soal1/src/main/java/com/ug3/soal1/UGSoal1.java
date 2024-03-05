package com.ug3.soal1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UGSoal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String name = scanner.nextLine();

        // get current date and time
        // time ada pm dan am
        // format tanggal contoh: 14-Februari-2024

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ssa");
        Date date = new Date();
        String now = formatter.format(date);

        String[] splitNow = now.split(" ");

        UGSoal1 soal1 = new UGSoal1();
        soal1.absen(name, splitNow[0], splitNow[1]);

    }

    public void absen(String name, String date, String time) {
        System.out.println("berhasil absensi");
        System.out.println("Atas nama : " + name);
        System.out.println("Pada tanggal : " + date);
        System.out.println("Pukul : " + time);
    }

}