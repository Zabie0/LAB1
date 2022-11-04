package com.my.FibonacchiNumbers;
import java.util.Arrays;

/**
 *  Клас,що визначає квадратну суму N-членів послідовності Фібоначчі
 *  @author Staryy Vladyslav
 *  @version 1.0
 */
public class FibonacchiNumbers{
    /** Поле розміру масиву чисел Фібоначчі */
    private final int size;
    /** Масив для чисел Фібоначчі */
    private int[] numbers;
    /** Квадратна сума N-членів */
    private long res = 0;
    /** Конструктор створення нового об'єкту*/
    public FibonacchiNumbers(int size) {
        this.size = size;
    }

    /**
     * Метод для наповнення масиву числами Фібоначчі
     * Метод нічого не повертає
     */
    public void fiboNumbers() {
        numbers = new int[this.size];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int f = 0; f + 2 < size; f++) {
            numbers[f + 2] = (numbers[f + 1] + numbers[f]);
        }
    }

    /**
     * Метод для знаходження квадратної суми N перших чисел Фібоначчі
     * Метод нічого не повертає
     */
    public void findSum(){
        for (int j = 0; j < size; j++) {
            res += Math.pow(numbers[j], 2);
        }
    }

    /**
     * Перевантажений метод toString
     * @return Перетворення інформації до типу String
     */
    @Override
    public String toString() {
        return "NumberOfFibonacchi{" +
                "Array of Fibonacchi = " + Arrays.toString(numbers) +
                ",N = " + this.size +
                ", Sum of squared N numbers = " + res +
                '}';
    }
}