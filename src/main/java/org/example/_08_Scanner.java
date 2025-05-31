package org.example;

import java.util.Scanner;

public class _08_Scanner {
    public static void main(String[] args) {
        Scanner yas = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = yas.nextInt();

        System.out.println("Your age is: "+ age);
        yas.close(); // kullanılmayan scanner nesenesi kapatılır

        /* kullanıcıdan veri alınacağı zaman kullanılır
        next()	Tek bir kelime okur. Boşluk görünce okuma işlemi durur.
        nextLine()	Bütün satırı okur. Enter tuşuna basılana kadar bekler.
        */
    }

}
