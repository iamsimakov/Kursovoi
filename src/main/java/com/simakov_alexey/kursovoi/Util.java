package com.simakov_alexey.kursovoi;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by alexey.simakov on 08.03.2016.
 */
public class Util {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Здравствуйте, введите, пожалуйста, номер программы для запуска:\n" +
                    "1 - Вычислить значение выражения по формуле (все переменные принимают действительные значения).\n" +
                    "Формула: (x^2 - 7*x + 10) / (x^2 - 8*x + 12)\n\n" +
                    "2 - Треугольник задан величинами своих углов и радиусом описанной окружности. Найти стороны треугольника.\n\n" +
                    "3 - Вычислить значение функции\n" +
                    "F(x) = { \n" +
                    "-x^2 + 3*x + 9, при x <= 3; \n" +
                    "x / (x^2 + 1), при x > 3\n" +
                    "}\n\n" +
                    "4 - В одномерном массиве, вводимом с клавиатуры и состоящем из 10 вещественных элементов, вычислить:\n" +
                    "1) количество элементов массива, равных 0;\n" +
                    "2) сумму элементов массива, расположенных после минимального элемента.\n\n" +
                    "5 - Сортировка адресов в списке в зависимости от введенного адреса по исходному списку. \n\n" +
                    "AnyKey - Выход");

            Scanner scanner = new Scanner(new InputStreamReader(System.in));
            String n = scanner.nextLine();
            switch (n) {
                case "1":
                    new TaskValueOfExpression().startTask();
                    break;
                case "2":
                    new TaskTriangle().startTask();
                    break;
                case "3":
                    new TaskValueOfFunction();
                    break;
                case "4":
                    new TaskAboutArray();
                    break;
                case "5":
                    new SortExpression().startSort();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

}
