package by.teachmeskills.homeworks.hw_17022023;

public class Massiv_1 {
    public static void main(String[] args) {
        int n = 10; // длина массива
        double [] randoms = new double[n]; // иницилизация массива

        // i - переменная счетчик
        // randoms.length - длина массива
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = Math.random(); // в каждый i элемент массива кладем рандомное значение
            System.out.println(randoms[i]);

        }

    }
}
