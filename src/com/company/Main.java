package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Введите список A: ");
        listA.add(scannerA.nextLine());
        listA.add(scannerA.nextLine());
        listA.add(scannerA.nextLine());
        listA.add(scannerA.nextLine());
        listA.add(scannerA.nextLine());
        System.out.println(listA);


        System.out.println("________");

        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Введите список B: ");
        listB.add(scannerA.nextLine());
        listB.add(scannerA.nextLine());
        listB.add(scannerA.nextLine());
        listB.add(scannerA.nextLine());
        listB.add(scannerA.nextLine());
        System.out.println(listB);

        System.out.println("________");

        ArrayList<String> listC = new ArrayList<>();
        listC.add(listA.get(0));
        listC.add(listB.get(4));
        listC.add(listA.get(1));
        listC.add(listB.get(3));
        listC.add(listA.get(2));
        listC.add(listB.get(2));
        listC.add(listA.get(3));
        listC.add(listB.get(1));
        listC.add(listA.get(4));
        listC.add(listB.get(0));
        System.out.println(listC);

        listC.sort(Comparator.comparing(String::length));
        Collections.reverse(listC);
        System.out.println(listC);
    }
}
