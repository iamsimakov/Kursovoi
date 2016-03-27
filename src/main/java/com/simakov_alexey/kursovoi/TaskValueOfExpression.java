package com.simakov_alexey.kursovoi;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by alexey.simakov on 08.03.2016.
 */
class TaskValueOfExpression {

    void startTask(){
        System.out.println("Вычислить значение выражения по формуле " +
                "(все переменные принимают действительные значения).\n" +
                "Формула: (x^2 - 7*x + 10) / (x^2 - 8*x + 12)\n" +
                "Введите х:");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        double in = Double.parseDouble(scanner.nextLine());
        System.out.println("Результат вычисления равен: " + getValue(in));
        System.out.println("Продолжить выполнение программы? [y/n][д/н]");
        if (scanner.nextLine().matches("[nNнН]")) System.exit(0);
    }

    private double getValue(double x){
        return (x*x - 7.0*x + 10.0) / (x*x - 8.0*x + 12.0);
    }

}
