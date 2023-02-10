package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;




    public class Massiw_two {
        public static void main(String[] args) {

            System.out.print("Введите значение размера квадратного двумерного массива n = ");
            Scanner scanner_n = new Scanner(System.in);
            int n = scanner_n.nextInt();  // длина массива

            int[][] randoms = new int[n][n]; // иницилизация массива

            int unit = 1;
            int zero = 0;

            for (int i = 0; i < randoms.length; i++) {
                for (int j = 0; j < randoms.length; j++) {
                    randoms[i][j] = (int) (Math.random() * (2000 + 1) - 1000); //рандомные числа от -1000 до 1000
                    System.out.print(randoms[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < randoms.length; i++) {
                for (int j = 0; j < randoms.length; j++) {
                    if (randoms[i][j] >= 0) {
                        randoms[i][j] = zero;
                    } else {
                        randoms[i][j] = unit;
                    }

                    System.out.print(randoms[i][j] + " ");
                }
                System.out.println();
            }

//        System.out.println("Вывод значений массива: " + "\n" + Arrays.toString(randoms));
        }

    }

