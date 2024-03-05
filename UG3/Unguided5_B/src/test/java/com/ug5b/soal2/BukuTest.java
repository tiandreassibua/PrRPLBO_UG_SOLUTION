package com.ug5b.soal2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BukuTest {

    @Test
    public void testInvalidGetter() {

        Buku bukuDummy = new Buku("Introduction to Algorithms", "Ronald Rivest", 50000, 10);
        Buku bukuinvalid = new Buku("The Pragmatic Programmer", "Dave Thomas", -9990, -9);
        assertEquals(0, bukuinvalid.getStok());
        assertEquals(0, bukuinvalid.getHarga());
        assertEquals("The Pragmatic Programmer", bukuinvalid.getJudul());
        assertEquals("Dave Thomas", bukuinvalid.getPenulis());
        assertEquals("NV245102", bukuinvalid.getKode());

        Buku buku = new Buku("Introduction to Algorithms", "Ronald Rivest", 50000, 10);
        assertEquals(10, buku.getStok());
        assertEquals(50000, buku.getHarga());
        assertEquals("Introduction to Algorithms", buku.getJudul());
        assertEquals("Ronald Rivest", buku.getPenulis());
        assertEquals("NV245103", buku.getKode());
    }
}
