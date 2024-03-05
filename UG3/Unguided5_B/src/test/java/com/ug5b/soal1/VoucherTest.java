package com.ug5b.soal1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VoucherTest {

    private Voucher voucher;

    @Before
    public void setUp() {
        voucher = new Voucher();
        voucher.setNominal(100000);
        voucher.buatVoucher();
    }

    @Test
    public void testSetterGetter(){
        assertEquals("VC100000", voucher.getKode());
        assertEquals(100000, voucher.getNominal());

        voucher.setNominal(200000);
        assertEquals(200000, voucher.getNominal());
    }

    @Test
    public void testBuatVoucherWithValidNominal() {
        voucher.setNominal(50000);
        voucher.buatVoucher();
        assertEquals("VC50000", voucher.getKode());
    }

    @Test
    public void testBuatVoucherWithZeroNominal() {
        voucher.setNominal(0);
        voucher.buatVoucher();
        assertEquals("VC", voucher.getKode());
    }

    @Test
    public void testBuatVoucherWithNegativeNominal() {
        voucher.setNominal(-50000);
        voucher.buatVoucher();
        assertEquals("VC", voucher.getKode());
    }
}
