package by.teachmeskills.homeworks.hw_24022023.recursion;

public class RecursionSorting_2 {

    public static void main(String[] args) {

        int numberA = 0;
        int numberB = 0;
        int summ = 0;

//        numberA = (int) (Math.random() * (20 + 1) - 10); //рандомные числа от -100 до 100
//        numberB = (int) (Math.random() * (20 + 1) - 10); //рандомные числа от -100 до 100

        System.out.println("Число А составляет: " + numberA);
        System.out.println("Число B составляет: " + numberB);

        if (numberA < numberB) {
            for (int i = 0; (numberA + i) <= numberB; i++) {
                summ = numberA + i;
                System.out.print(" " + summ);
            }
            } else if (numberA > numberB) {
            for (int i = 0; (numberB + i) <= numberA; i++) {
                summ = numberA - i;
                System.out.print(" " + summ);
            }
        } else {
           System.out.println("Число A равно числу B");
    }


}
}
