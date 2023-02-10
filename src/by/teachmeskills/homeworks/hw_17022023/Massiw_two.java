package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;




    public class Massiw_two {
        public static void main(String[] args) {

            System.out.print("Введите значение размера квадратного двумерного массива n = ");
            Scanner scanner_n = new Scanner(System.in);
            int n = scanner_n.nextInt();  // длина массива

            int[][] randoms = new int[n][n]; // иницилизация массива

//            int unit = 1;
//            int zero = 0;

            for (int i = 0; i < randoms.length; i++) {
                for (int j = 0; j < randoms.length; j++) {
                    randoms[i][j] = (int) (Math.random() * (200 + 1) - 100); //рандомные числа от -100 до 100
                    System.out.print(randoms[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < randoms.length; i++) {
                for (int j = 0; j < randoms.length; j++) {
                    double a = randoms[i][j];
                    double b = a / 2;
                    int c = (int) a / 2;

                    if (b == c) {
                        randoms[i][j] = 0;
                    } else {
                        randoms[i][j] = 1;
                    }

                    System.out.print(randoms[i][j] + " ");
                }
                System.out.println();
            }

//        System.out.println("Вывод значений массива: " + "\n" + Arrays.toString(randoms));
        }

    }

