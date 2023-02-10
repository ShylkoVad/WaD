package by.teachmeskills.homeworks.hw_17022023;

import java.util.Arrays;

public class Massiv_2 {
    public static void main(String[] args) {
        int[] randoms = new int[]{10, 2, 3, 4, 5, 11}; // иницилизация


//        int n = 6;
//        int[] randoms = new int[n];
        System.out.println(Arrays.toString(randoms));

//        for (int i = 0; i < randoms.length; i++) {
//            randoms[i] = Math.random(); // в каждый i элемент массива кладем рандомное значение
//            System.out.print(randoms[i] + " ");
//        }

       int temp;

        for (int i = 0; i < randoms.length - 1; i++){
                for (int j = 0; j < randoms.length - 1 - i; j ++) {
                if (randoms[j] > randoms[j + 1]) {
                    temp = randoms[j];
                    randoms[j] = randoms[j + 1];
                    randoms[j + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(randoms));

    }
}
