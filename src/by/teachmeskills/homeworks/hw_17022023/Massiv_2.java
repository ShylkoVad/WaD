package by.teachmeskills.homeworks.hw_17022023;

import java.util.Arrays;

public class Massiv_2 {
    public static void main(String[] args) {
//        int[] randoms = new int[]{10, 2, 3, 4, 5, 11}; // иницилизация

        int n = 6;
        double[] randoms = new double[n];


        for (int i = 0; i < randoms.length; i++) {
            randoms[i] =(int) (Math.random()*(2000+1)-1000); //рандомные числа от -1000 до 1000
                    }
        System.out.println("Вывод значений массива: " + "\n" + Arrays.toString(randoms));

       double temp;

        for (int i = 0; i < randoms.length - 1; i++){
                for (int j = 0; j < randoms.length - 1 - i; j ++) {
                if (randoms[j] > randoms[j + 1]) {
                    temp = randoms[j];
                    randoms[j] = randoms[j + 1];
                    randoms[j + 1] = temp;

                }
            }
        }
        System.out.println("Вывод отсортированного массива: " + "\n" +Arrays.toString(randoms));

    }
}
