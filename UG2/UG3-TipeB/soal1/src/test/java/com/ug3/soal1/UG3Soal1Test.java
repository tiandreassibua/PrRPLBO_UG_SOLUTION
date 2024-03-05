package com.ug3.soal1;

import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class UG3Soal1Test
{

    private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    UG3Soal1 testFood = new UG3Soal1();

    @BeforeAll
    public static void init() {

    }
    @BeforeEach
    public void setUp() {

        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(System.out);
    }
    private static Stream<Arguments> provideMainTest(){
        return Stream.of(
                Arguments.of("Marie Gold","23-Februari-2023",1.0,10.0,"Nama makanan = " + "Marie Gold" + "\n" +
                        "Tanggal kadaluarsa = " + "23-Februari-2023" + "\n" +
                        "Jumlah(quantity) = " + 1.0+ "\n" +
                        "Berat = " + 10.0 + " gram\n" +
                        "====================================================="),
                Arguments.of("PEPERRO Almond","20-Maret-2024",2.0,30.0,"Nama makanan = " + "PEPERRO Almond" + "\n" +
                        "Tanggal kadaluarsa = " + "20-Maret-2024" + "\n" +
                        "Jumlah(quantity) = " + 2.0+ "\n" +
                        "Berat = " + 30.0 + " gram\n" +
                        "====================================================="),
                Arguments.of("Silverqueen Almond","05-Januari-2024",3.0,30.0,"Nama makanan = " + "Silverqueen Almond" + "\n" +
                        "Tanggal kadaluarsa = " + "05-Januari-2024" + "\n" +
                        "Jumlah(quantity) = " + 3.0+ "\n" +
                        "Berat = " + 30.0 + " gram\n" +
                        "=====================================================")
          
        );

    }
    @ParameterizedTest
    @MethodSource("provideMainTest")
    public void mainTest(String name, String date, double qty, double weight,String expected){
        testFood.foodData(name,date,qty,weight);
        assertEquals(expected,outputStreamCaptor.toString().trim());
        
    }
}
