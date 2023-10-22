/*
DZ3.2: Дан одномерный массив из 50 элементов. Массив заполнен числами от -50 до 50.
Найти количество отрицательных элементов, количество положительных элементов, количество нулей.
Найти сумму всех положительных элементов и отрицательных элементов отдельно. Найти среднее по массиву.
Массив можно заполнить случайными числами без использования ручного ввода, подумайте + погуглите,
как это сделать.
 */

import java.util.Random;

public class Massiv {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Random random = new Random();
        int pozCount = 0, negCount = 0, pozSum = 0, negSum = 0;
        //Заполнение массива
        System.out.println("\nМассив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50)*2-50;
            if ((i != 25)) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.println();
            }
        }
        //
        for (int j : arr) {
            if (j > 0) {
                pozCount = pozCount + 1;            //Нахождение количества положительных элементов
                pozSum = pozSum + j;           //Нахождение суммы положительных элементов
            } else if (j < 0) {
                negCount = negCount + 1;            //Нахождение количества отрицательных элементов
                negSum = negSum + j;           //Нахождение суммы отрицательных элементов
            }
        }
        //Нахождение количества нулевых элементов
        int nullCount = arr.length - pozCount - negCount;
        //Нахождение среднего
        int average = (pozSum + negSum) / arr.length;
        //Вывод в консоль результатов
        System.out.println("\n\nКоличество элементов\nположительных: " + pozCount + "\nотрицательных: " + negCount +
                "\nнулевых: " + nullCount);
        System.out.println("\nСумма элементов\nположительных: " + pozSum + "\nотрицательных: " + negSum +
                "\n\nСреднее по массиву: " + average);

    }
}