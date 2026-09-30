package org.example;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        int[] numbers = {8, 5, 3, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Текущий массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("Выберите действие:");
        System.out.println("Добавить число - 1");
        System.out.println("Удалить число - 2");

        int pick = scanner.nextInt();

        if (pick == 1) {
            System.out.print("Напишите какое число добавить: ");
            int newNum = scanner.nextInt();
            int[] newArray = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }

            newArray[newArray.length - 1] = newNum;
            numbers = newArray;
            System.out.print("Новый массив: ");

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        } else if (pick == 2) {
            System.out.print("Напишите индекс числа для удаления: ");
            int delNum = scanner.nextInt();

            if (delNum < 0 || delNum >= numbers.length) {
                System.out.println("Ошибка: индекс выходит за границы массива");
            } else {
                int[] newArray = new int[numbers.length - 1];

                for (int i = 0; i < delNum; i++) {
                    newArray[i] = numbers[i];
                }

                for (int i = delNum; i < newArray.length; i++) {
                    newArray[i] = numbers[i + 1];
                }
                numbers = newArray;
                System.out.print("Новый массив: ");

                for (int i = 0; i < numbers.length; i++) {
                    System.out.print(numbers[i] + " ");
                }
            }
        } else {
            System.out.println("Неверный выбор. Выберите 1 или 2");
        }
    }
}