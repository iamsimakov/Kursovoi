package com.simakov_alexey.kursovoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alexey.simakov on 08.03.2016.
 */
class TaskAboutArray {

    void startTask() {
        System.out.println(
                "В одномерном массиве, вводимом с клавиатуры " +
                "и состоящем из 10 вещественных элементов, вычислить:\n" +
                "1) количество элементов массива, равных 0;\n" +
                "2) сумму элементов массива, расположенных после минимального элемента.");
        System.out.println("Введите элементы массива через запятую: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = reader.readLine();
        } catch (IOException e){
            System.out.println("Ошибка ввода");
            return;
        }
        String[] arr_str = str.split(",");
        if (arr_str.length != 10) {
            System.out.println("Неверное количество элементов.");
            return;
        }
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++){
            arr[i] = Double.parseDouble(arr_str[i]);
        }

        System.out.println("Количество элементов равных 0: " + getZeroElementsCount(arr));
        System.out.println("Сумма элементов после минимального: " + getSumAfterMin(arr));

        System.out.println("Продолжить выполнение программы? [y/n][д/н]");
        try {
            if (reader.readLine().matches("[nNнН]")) System.exit(0);
        } catch(IOException e){
            System.out.println("Ошибка ввода.");
        }

    }

    private int getZeroElementsCount(double[] arr){
        int count = 0;
        for (double a: arr) {
            if (a == 0) {
                count++;
            }
        }
        return count;
    }

    private double getSumAfterMin(double[] arr){
        int minPos = 0;
        double min = arr[0];
        for (int i = 0; i < 10; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minPos = i;
            }
        }
        double sum = 0;
        if (minPos == 9) return 0;
        for (int i = minPos + 1; i < 10; i++){
            sum += arr[i];
        }
        return sum;
    }

}
