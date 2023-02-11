package by.teachmeskills.homeworks.hw_17022023;

public class Massiw_torn {
    public static void main(String[] args) {

        int line = 5;
//                (int) (Math.random() * (10 + 1)); //рандомные числа от 0 до 10
        int column = 3;
//        (int) (Math.random() * (10 + 1)); //рандомные числа от 0 до 100

        System.out.println("Рандомное число строк матрицы - " + line);


        int[][] randoms = new int[2][10]; // иницилизация массива

        for (int i = 0; i < randoms.length; i++) {
            for (int j = 0; j < randoms.length; j++) {
                randoms[i][j] = (int) (Math.random() * (200 + 1) - 100); //рандомные числа от -100 до 100
                System.out.print(randoms[i][j] + " ");
            }
            System.out.println();
        }
    }
}
