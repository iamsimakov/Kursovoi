package com.simakov_alexey.kursovoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;

import static org.apache.commons.lang3.StringUtils.*;

/**
 * Created by alexey.simakov on 08.03.2016.
 */
public class TaskSortingExpressions {

    public void startSort(){
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(new File("addresses.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("Файл не найден.");
            return;
        }
        List<String> addresses = new ArrayList<String>();
        while (fileScanner.hasNext()){
            addresses.add(fileScanner.nextLine());
        }
        System.out.println("Изначальный список адресов: ");
        for (String addr : addresses){
            System.out.println(addr);
        }
        System.out.println("Введите строку поиска среди отображенных строк: ");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        Collections.sort(addresses, new MyComparator(scanner.nextLine()));
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
