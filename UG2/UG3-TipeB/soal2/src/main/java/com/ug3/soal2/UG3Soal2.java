package com.ug3.soal2;
import java.util.Scanner;

public class UG3Soal2 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean isRunning = true;

      while (isRunning) {
         System.out.println("Bilangan Fibonacci dari kata");

         System.out.print("Masukkan input pertama: ");
         String firstWord = scanner.nextLine();

         System.out.print("Masukkan input kedua: ");
         String secondWord = scanner.nextLine();

         fibonacciNumber(firstWord, secondWord);

         System.out.print("\nKeluar dari program (ketikan exit) : ");
         String exit = scanner.nextLine();
         if (exit.equals("exit")) {
            isRunning = false;
            scanner.close();
         }
      }
   }

   public static void fibonacciNumber(
         String firstWord,
         String secondWord

   ) {
      int n = 11;
      int firstNumber = firstWord.length();
      int secondNumber = secondWord.length();
      int nextNumber;
      System.out.println("Bilangan Fibonacci");
      for (int i = 1; i <= n; ++i) {
         System.out.print(firstNumber + " ");
         nextNumber = firstNumber + secondNumber;
         firstNumber = secondNumber;
         secondNumber = nextNumber;
      }
   }
}
