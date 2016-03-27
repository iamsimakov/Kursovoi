package com.simakov_alexey.kursovoi;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by alexey.simakov on 08.03.2016.
 */
public class Util {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Здравствуйте, введите, пожалуйста, " +
                    "номер программы для запуска:\n" +
                    "1 - Вычислить значение выражения." +
                    "2 - Найти стороны треугольника." +
                    "3 - Вычислить значение функции." +
                    "4 - В одномерном массиве, вводимом с клавиатуры и состоящем из 10 вещественных элементов, вычислить:\n" +
                    "1) количество элементов массива, равных 0;\n" +
                    "2) сумму элементов массива, расположенных после минимального элемента.\n\n" +
                    "5 - Сортировка адресов в списке в зависимости от введенного адреса по исходному списку. \n\n" +
                    "AnyKey - Выход");

            Scanner scanner = new Scanner(new InputStreamReader(System.in));
            int n;
            try {
                n = scanner.nextInt();
            } catch (Exception e){
                System.out.println("Ошибка ввода.");
                continue;
            }
            switch (n) {
                case 1:
                    new TaskValueOfExpression().startTask();
                    break;
                case 2:
                    new TaskTriangle().startTask();
                    break;
                case 3:
                    new TaskValueOfFunction().startTask();
                    break;
                case 4:
                    new TaskAboutArray().startTask();
                    break;
                case 5:
                    new TaskSortingExpressions().startSort();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

}
