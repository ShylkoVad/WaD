package by.teachmeskills.homeworks.hw_24022023.recursion;

public class RecursionSorting {

    public static void main(String[] args) {

        int numberA;
        int numberB;
        int quantityNumber;
<<<<<<< HEAD
=======
        int summ = 0;
>>>>>>> 95fc942 (16/02/2023 16:02 - RecursionArray)


        numberA = (int) (Math.random() * (20 + 1) - 10); //рандомные числа от -100 до 100
        numberB = (int) (Math.random() * (20 + 1) - 10); //рандомные числа от -100 до 100
        quantityNumber = Math.abs((numberA - numberB) + 1);

        System.out.println("Число А составляет: " + numberA);
        System.out.println("Число B составляет: " +numberB);
<<<<<<< HEAD
        System.out.println("Количество чисел: " + quantityNumber);

            }
//            static int sorting (int i) {
//
//
//
//
//            }
=======
//        System.out.println("Количество чисел: " + quantityNumber);

        if (numberA < numberB) {
            for (int i = 0; numberA < numberB ; i ++) {
                summ = summ +  numberA + i;
                System.out.println(summ);

            }

        } else {
            System.out.println("DA");
        }

            }


>>>>>>> 95fc942 (16/02/2023 16:02 - RecursionArray)
}
