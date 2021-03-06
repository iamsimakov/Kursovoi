package com.simakov_alexey.kursovoi;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by alexey.simakov on 08.03.2016.
 */
class TaskTriangle {

    void startTask(){
        System.out.println("Треугольник задан величинами своих углов и " +
                "радиусом описанной окружности. Найти стороны треугольника.\n" +
                "Введите радиус описанной окружности: ");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите угол A в градусах: ");
        double angleA = Double.parseDouble(scanner.nextLine()) * Math.PI / 180.0;
        System.out.println("Введите угол B в градусах: ");
        double angleB = Double.parseDouble(scanner.nextLine()) * Math.PI / 180.0;
        System.out.println("Введите угол C в градусах: ");
        double angleC = Double.parseDouble(scanner.nextLine()) * Math.PI / 180.0;

        System.out.println("Для угла А сторона равна: " + getLength(radius, angleA));
        System.out.println("Для угла B сторона равна: " + getLength(radius, angleB));
        System.out.println("Для угла C сторона равна: " + getLength(radius, angleC));

        System.out.println("Продолжить выполнение программы? [y/n][д/н]");
        if (scanner.nextLine().matches("[nNнН]")) System.exit(0);

    }

    private double getLength(double radius, double angle){
        return 2*Math.sin(angle)*radius;
    }

}
