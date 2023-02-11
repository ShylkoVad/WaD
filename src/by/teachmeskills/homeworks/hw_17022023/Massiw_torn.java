package by.teachmeskills.homeworks.hw_17022023;

public class Massiw_torn {
    public static void main(String[] args) {

        int line = (int) (1 + Math.random() * 9 ); //рандомные числа от (0 до 10] - количество строк
        int column = (int) (1 + Math.random() * 9 ); //рандомные числа от (0 до 10] - то число столбцов которое нельзя привышать

        System.out.println("Рандомное число строк матрицы - " + line);
        System.out.println("Рандомное число столбцов матрицы - " + column);


        int[][] randoms = new int[line][column]; // иницилизация массива

        for (int i = 0; i < randoms.length; i++) {
//            int column_line = 3;
            int column_line = (int) (1 + Math.random() * 9); //рандомные числа от (0 до 10] - количество столбцов в строке
            if (column_line <= column) {
                for (int j = 0; j < column_line; j++) {
                    randoms[i][j] = (int) (Math.random() * (200 + 1) - 100); //рандомные числа от -100 до 100
                    System.out.print(randoms[i][j] + " ");
                }

            }
            System.out.println();
        }

    }
}
