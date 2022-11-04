package com.my.FibonacchiNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = setSize();
        FibonacchiNumbers number = new FibonacchiNumbers(size);
        number.fiboNumbers();
        number.findSum();
        System.out.println(number);
    }
    /**
     *  Метод для встановлення розміру масиву чисел Фібоначчі.
     *  Метод нічого не повертає
     *  @exception IllegalArgumentException Введення некоретного номеру
     */
    public static int setSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of Fibonacchi numbers: ");
        int size = scanner.nextInt();
        if (size <= 0) throw new IllegalArgumentException("You entered an incorrect number!");
        return size;
    }
}