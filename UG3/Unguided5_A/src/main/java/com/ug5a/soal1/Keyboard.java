package com.ug5a.soal1;

public class Keyboard {
    private String merkModel;
    private long harga = 0;

    public String getMerkModel() {
        return merkModel;
    }

    public void setMerkModel(String merkModel) {
        this.merkModel = merkModel;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        if (harga > 0) this.harga = harga;
    }
}
