package com.ug5b.soal2;


public class BukuMain {
    public static void main( String[] args ){
        Buku bukuA = new Buku("Cinta itu Alasan Sekaligus Tujuan","Kang Maman",62400,5);
        Buku bukuB = new Buku("Autumn in Paris","Ilana Tan",63200,7);
        Buku bukuC = new Buku("Critical Eleven","Ika Natassa",74400,2);
        System.out.println("\n========== Daftar Buku Gramedia==========\n");
        infoBuku(bukuA);
        infoBuku(bukuB);
        infoBuku(bukuC);

    }
    public static void infoBuku (Buku book){
        String judul = book.getJudul();
        String kode = book.getKode();
        String penulis = book.getPenulis();
        long harga = book.getHarga();
        int stok = book.getStok();

        System.out.println("-----"+judul+"-----");
        System.out.println("Kode: "+kode);
        System.out.println("Penulis: "+penulis);
        System.out.println("Harga: "+harga);
        System.out.println("Stok: "+stok);

    }
}
