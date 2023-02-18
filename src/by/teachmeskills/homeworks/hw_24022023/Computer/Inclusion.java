package by.teachmeskills.homeworks.hw_24022023.Computer;

import java.util.Scanner;

public class Inclusion {

    private int random = (int) (Math.random() * 2 ); //рандомные число от [0 до 1]

    public int getRandom() {
        return random;
    }

    // метод ввода числа
    public static int on () {
        System.out.print("Ввести число 0 либо 1 для запуска компьютера: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


        public void printInt () {
//        System.out.println(random);
        if (on() == random) {
            System.out.println("Добро пожаловать в систему");
        } else {
            System.out.println("Комп сгорел");
        }

    }

}

