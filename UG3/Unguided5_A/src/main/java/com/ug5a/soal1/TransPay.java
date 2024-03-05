package com.ug5a.soal1;

public class TransPay {
    private String nama;
    private long saldo;

    // generate getter setter based on the field
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        if (saldo > 0) this.saldo = saldo;
    }

    public void topUp(long nominal) {
        if (nominal > 0) {
            saldo += nominal;
            System.out.println("Top up berhasil!, jumlah top up Rp " + saldo);
        } else {
            System.out.println("Top up gagal!, jumlah saldo tidak valid");
        }
    }

    public void bayar(int jumlah, Keyboard k) {
        if (jumlah > 0) {
            long total = k.getHarga() * jumlah;
            if (this.getSaldo() < total) {
                System.out.println("Pembelian gagal!, Saldo anda kurang, silahkan melakukan top up!");
                return;
            }

            this.setSaldo(this.getSaldo() - total);
            System.out.println("Pembayaran sukses!, Silahkan mengambil " + k.getMerkModel() + " di counter");
        } else {
            System.out.println("Pembelian gagal!, jumlah keyboard tidak valid");
        }
    }
}
