package com.company;

public class Main {

    public static void main(String[] args) {


        Parsifal <Integer> parsifal = new Parsifal<>();
        System.out.println("Число 4 и 6  =  "+parsifal.addition(4,6));
        System.out.println("Деление 7 и 1 =  "+parsifal.subtract(7,1));
        System.out.println("Процент = "+parsifal.multiplication(9,5));


    }
}
