package com.simakov_alexey.kursovoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alexey.simakov on 08.03.2016.
 */
class TaskValueOfFunction{

    void startTask(){
        System.out.println("Вычислить значение функции\n" +
        "F(x) = {\n" +
                    "-x^2 + 3*x + 9, при x <= 3;\n" +
                    "x / (x^2 + 1), при x > 3\n" +
                "}");
        System.out.print("Введите х: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x_str;
        try {
            x_str = reader.readLine();
        } catch (IOException e){
            System.out.println("Ошибка ввода.");
            return;
        }
        double x = Double.parseDouble(x_str);
        double res;
        if ((x - 3.0) >= 0) res = getUpValue(x);
            else res = getDownValue(x);
        System.out.println("Результат равен: " + res);

        System.out.println("Продолжить выполнение программы? [y/n][д/н]");
        try {
            if (reader.readLine().matches("[nNнН]")) System.exit(0);
        } catch(IOException e){
            System.out.println("Ошибка ввода.");
        }
    }

    private double getUpValue(double x){
        return x / (x*x + 1);
    }

    private double getDownValue(double x){
        return -x*x + 3*x + 9;
    }

}
