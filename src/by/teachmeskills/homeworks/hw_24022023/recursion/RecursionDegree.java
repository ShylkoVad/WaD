package by.teachmeskills.homeworks.hw_24022023.recursion;

public class RecursionDegree {
    public static void main(String[] args) {

        int numberN = 16384;

//        numberN = (int) (Math.random() * 100 + 1); //рандомные числа от -100 до 100
        System.out.println("Значение натурального числа N состовляет: " + numberN);
        if (dergee(numberN) == 1) {
            System.out.println("Yes");
        } else
        {
            System.out.println("No");
        }
    }

    static int dergee(double numberN) {
        if (numberN == 1) { // базовый случай
            return 1;
        } else if (numberN > 1 && numberN < 2) {
            return 0;
        } else {
            return dergee(numberN / 2);
        }
    }


}
