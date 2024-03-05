package com.ug5b.soal1;

public class SmartCard {
    private String nama;
    private long saldo;

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return this.nama;
    }

    void setSaldo(long nominal) {
        if (nominal > 0) {
            this.saldo = nominal;
        }
    }

    long getSaldo() {
        return this.saldo;
    }

    void topUp(Voucher vch) {
        if ((vch.getKode()).equals("VC")) {
            System.out.println("Kode Voucher: " + vch.getKode() + " || Top up gagal! Kode voucher tidak valid.");
        } else {
            this.saldo = vch.getNominal();
            System.out.println("Kode Voucher: " + vch.getKode() + " || Top up sukses!");
        }
    }
}
