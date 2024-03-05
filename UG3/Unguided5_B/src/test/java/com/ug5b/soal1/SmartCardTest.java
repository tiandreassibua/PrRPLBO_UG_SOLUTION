package com.ug5b.soal1;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartCardTest {

    private SmartCard card;

    @Before
    public void setUp() {
        card = new SmartCard();
        card.setNama("John Doe");
        card.setSaldo(100000);
    }

    @Test
    public void testSetterGetter(){
        assertEquals("John Doe", card.getNama());
        assertEquals(100000, card.getSaldo());
        card.setNama("Jane Doe");
        assertEquals("Jane Doe", card.getNama());
        card.setSaldo(200000);
        assertEquals(200000, card.getSaldo());
    }

    @Test
    public void testTopUpValid() {
        Voucher voucher = new Voucher();
        voucher.setNominal(50000);
        voucher.buatVoucher();

        card.topUp(voucher);
        assertEquals(50000, card.getSaldo());
    }

    @Test
    public void testTopUpInvalid() {
        Voucher voucher = new Voucher();
        voucher.setNominal(-50000);
        voucher.buatVoucher();

        card.topUp(voucher);
        assertEquals(100000, card.getSaldo());
    }

}

