package by.teachmeskills.homeworks.hw_24022023.recursion;

public class RecursionSorting {

    public static void main(String[] args) {

        int numberA;
        int numberB;
        int sum = 0;


        numberA = (int) (Math.random() * (20 + 1) - 10); //рандомные числа от -100 до 100
        numberB = (int) (Math.random() * (20 + 1) - 10); //рандомные числа от -100 до 100

        System.out.println("Число А составляет: " + numberA);
        System.out.println("Число B составляет: " + numberB);

        if (numberA < numberB) {
            for (int i = 0; numberA < numberB; i++) {
                sum = sum + numberA + i;
                System.out.println(sum);
            }
        } else {
            System.out.println("DA");
        }

    }
}
