package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        MyArrayList<Integer> mal = new MyArrayList<>();
//
//        mal.add(4);
//        mal.add(7);
//        mal.add(2);
//        mal.add(9);
//
//        System.out.println(mal);
//
//        mal.add(1, 99);
//        System.out.println(mal);

//        mal.remove(0);
//        System.out.println(mal);

//        System.out.println(mal.indexOf(9999));

//        mal.remove((Integer) 2);
//        System.out.println(mal);


//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(5);
//        msal.add(3);
//        msal.add(8);
//        msal.add(2);
//        msal.add(9);
//
//        System.out.println(msal);
//
//        System.out.println(msal.binaryFind(9));


        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>();
        for (int i = 0; i < 100000; i++) {
            mal.add(random.nextInt(20));
        }
        long ml = System.currentTimeMillis();
        mal.selectionSort();
        System.out.println("SelectionSort time (Ms) - " + (System.currentTimeMillis()-ml));

        ml = System.currentTimeMillis();
        mal.insertionSort();
        System.out.println("InsertionSort time (Ms) - " + String.valueOf(System.currentTimeMillis()-ml));

        ml = System.currentTimeMillis();
        mal.bubbleSort();
        System.out.println("BubbleSort time (Ms) - " + String.valueOf(System.currentTimeMillis()-ml));
     //   System.out.println(mal);

    }
}
