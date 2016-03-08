package com.simakov_alexey.kursovoi;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

/**
 * Created by alexey.simakov on 08.03.2016.
 */
public class SortExpression {

    public void startSort(){
        List<String> addresses = Arrays.asList(
                "Россия УФО Свердловская область Каменск ул. Иванова д. 13 подъезд 1",
                "Россия ЦФО Липецкая область с.Подгорное ул. Иванова д. 13 подъезд 1",
                "Россия ЦФО Липецкая область г.Липецк ул. Петрова д. 13 подъезд 1",
                "Россия ЦФО Липецкая область г.Липецк ул. Иванова д. 14 подъезд 1",
                "Россия ЦФО Липецкая область г.Липецк ул. Иванова д. 13 подъезд 3",
                "Россия ЦФО Орловская область г.Орел ул. Королева д. 20 подъезд 3",
                "Россия ЦФО Орловская область г.Новосиль ул. Ленина д. 13 подъезд 6",
                "Россия ЦФО Московская область г.Москва ул. Королева д. 99 подъезд 4",
                "Россия ЦФО Курская область г.Курск ул. Цветаева д. 190 подъезд 2",
                "Россия ЦФО Курганская область г.Курск ул. Цветаева д. 1 подъезд 1"
        );
        System.out.println("Изначальный список адресов: ");
        for (String addr : addresses){
            System.out.println(addr);
        }
        System.out.println("Введите строку поиска среди отображенных строк:");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        addresses.sort(new MyComparator(scanner.nextLine()));
        System.out.println("Отсортированный список адресов: ");
        for (String addr : addresses){
            System.out.println(addr);
        }
        System.out.println("Продолжить выполнение программы? [y/n][д/н]");
        if (scanner.nextLine().matches("[nNнН]")) System.exit(0);
    }

    public class MyComparator implements Comparator<String> {

        private String myAddress;

        MyComparator(String myAddress){
            this.myAddress = myAddress;
        }

        public int compare(String o1, String o2) {
            return getLevenshteinDistance(myAddress, o1) - getLevenshteinDistance(myAddress, o2);
        }
    }
}
