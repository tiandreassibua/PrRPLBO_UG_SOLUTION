package com.ug5b.soal1;

public class Voucher {
    private String kode;
    private long nominal;

    void setNominal(long nominal) {
        this.nominal = nominal;
    }

    String getKode() {
        return this.kode;
    }

    long getNominal() {
        return this.nominal;
    }

    void buatVoucher() {
        if (this.nominal > 0) {
            this.kode = "VC" + this.nominal;
        } else {
            this.kode = "VC";
        }
    }
}