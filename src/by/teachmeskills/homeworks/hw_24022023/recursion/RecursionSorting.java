package by.teachmeskills.homeworks.hw_24022023.recursion;

public class RecursionSorting {

    public static void main(String[] args) {

        int numberA;
        int numberB;
        int quantityNumber;


        numberA = (int) (Math.random() * (20 + 1) - 10); //рандомные числа от -100 до 100
        numberB = (int) (Math.random() * (20 + 1) - 10); //рандомные числа от -100 до 100
        quantityNumber = Math.abs((numberA - numberB) + 1);

        System.out.println("Число А составляет: " + numberA);
        System.out.println("Число B составляет: " +numberB);
        System.out.println("Количество чисел: " + quantityNumber);

            }
//            static int sorting (int i) {
//
//
//
//
//            }
}
