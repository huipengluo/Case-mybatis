package com.peng.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class demo02 {
    @Test
    public void demo02(){
        double x = 1 - 9.0 / 10;
        if (Math.abs(x - 0.1) < 0.00001) {
            System.out.println("x is 0.1");
        }
        else{
            System.out.println("x is NOT 0.1");
        }
    }

    @Test
    public void switch1(){
                int option = 5;
                switch (option) {
                    case 1:
                        System.out.println("Selected 1");
                        break;
                    case 2:
                        System.out.println("Selected 2");
                        break;
                    case 3:
                        System.out.println("Selected 3");
                        break;
                    default:
                        System.out.println("no selected");
                        break;

        }

    }

    @Test
    public  void for1(){
        int[] arr = new int[100];
        for(int i=0;i<100;i++){
            int ns= (int) (Math.random()*100);
            arr[i] =ns;
//            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }


}


