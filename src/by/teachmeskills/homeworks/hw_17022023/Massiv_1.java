package by.teachmeskills.homeworks.hw_17022023;

public class Massiv_1 {
    public static void main(String[] args) {

//        int n = 10; // длина массива
//        double [] randoms = new double[n]; // иницилизация массива

        double[] randoms = new double[]{1, 0, 5, 3, 4}; // иницилизация
        int min = 0;
        int max = 0;
        double sum = 0;
        double multiply = 1;


        // i - переменная счетчик
        // randoms.length - длина массива
        for (int i = 0; i < randoms.length; i++) {

//            randoms[i] = Math.random(); // в каждый i элемент массива кладем рандомное значение
            System.out.print(randoms[i] + " ");
        }
    //           randoms[i] = Math.random(); // в каждый i элемент массива кладем рандомное значение
//            System.out.print(randoms[i] + " ");

        for (int i = 0; i < randoms.length; i++) {
            if (randoms[i] > randoms[max]) { //вычисление индекса для max элемента
                max = i;
            }
            if (randoms[i] < randoms[min]) { //вычисление индекса для min элемента
                min = i;
            }
        }
        System.out.println("\n" + "min = " + randoms[min] + " max = " + randoms[max]);

        for (int i = min  + 1; i < max; i ++) {
            multiply *= randoms[i];
            }
        System.out.println("Произведение " + multiply);

    }
    }





