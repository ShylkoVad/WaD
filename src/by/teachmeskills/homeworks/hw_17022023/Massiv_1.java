package by.teachmeskills.homeworks.hw_17022023;

public class Massiv_1 {
    public static void main(String[] args) {

//        int n = 10; // длина массива
//        double [] randoms = new double[n]; // иницилизация массива

        double[] randoms = new double[]{10, -2, -3, 4, -5, 11}; // иницилизация

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

// Нахождение max и min индексов массива
        for (int i = 0; i < randoms.length; i++) {
            if (randoms[i] > randoms[max]) { //вычисление индекса для max элемента
                max = i;
            }
            if (randoms[i] < randoms[min]) { //вычисление индекса для min элемента
                min = i;
            }
        }
        System.out.println("\n" + "min = " + randoms[min] + " [" + min + "] max = " + randoms[max] + " [" + max + "]");


        // Вычисление произведение элементов между max и min
        System.out.println("Вычисление произведения элементов вектора расположенных между min и max значениями массива:");
        if ((max - min == 1) | (max - min == -1)) {
            System.out.println("Два члена массива находятся рядом и их произведение невозможно высчитать");
        } else {
            if (max < min) {
                for (int i = max + 1; i < min; i++) {
                    multiply = multiply * randoms[i];
                }
                System.out.println("Произведение данных чисел составляет - " + multiply);
            } else {
                for (int i = min + 1; i < max; i++) {
                    multiply = multiply * randoms[i];
                }
                System.out.println("Произведение данных чисел составляет - " + multiply);
            }
        }

//         Вычисление суммы отрицательных элементов векторы расположенных между min и max элементами массива
        System.out.println("Вычисление суммы отрицательных элементов вектора расположенных между min и max значениями массива:");
        if ((max - min == 1) | (max - min == -1)) {
            System.out.println("Два члена массива находятся рядом и их сумму невозможно высчитать");
        } else {
            if (min < max) {
                for (int i = min + 1; i < max; i++) {
                    if (randoms[i] < 0) {
                        sum = sum + randoms[i];
                    }
                }
                System.out.println("Сумма данных чисел состовляет - " + sum);
            } else {
                for (int i = max + 1; i < min; i++) {
                    if (randoms[i] < 0) {
                        sum = sum + randoms[i];
                    }
                }
                System.out.println("Сумма данных чисел состовляет - " + sum);
            }
        }
    }
}









