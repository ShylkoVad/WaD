package by.teachmeskills.homeworks.hw_17022023;

import java.util.Arrays;

public class Massiv_2 {
    public static void main(String[] args) {
        double[] randoms = new double[]{10, 2, 3, 4, 5, 11}; // иницилизация
        System.out.println(Arrays.toString(randoms));

        boolean sorted = false;
        int temp;

        while (!sorted){
            sorted = true;
            for (int i = 0; i < randoms.length - 1; i ++) {
                if (randoms[i] > randoms[i + 1]) {
                    temp = (int) randoms[i];
                    randoms[i] = randoms[i + 1];
                    randoms[i + 1] = temp;
                    sorted = false;



                }
            }


        }
        System.out.println(Arrays.toString(randoms));

    }
}
