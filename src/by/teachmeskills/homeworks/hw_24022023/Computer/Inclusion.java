package by.teachmeskills.homeworks.hw_24022023.Computer;

import java.util.Scanner;

public class Inclusion {

    private int randomOn = (int) (Math.random() * 2 ); //рандомные число от [0 до 1]
    private int randomOf = (int) (Math.random() * 2 ); //рандомные число от [0 до 1]

    public int getRandomOn() {
        return randomOn;
    }
    public int getRandomOf() {
        return randomOf;
    }
    // метод ввода числа
    public int on () {
       Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void printOf () {
        System.out.println(randomOf);
        System.out.print("Ввести число 0 либо 1 для выключения компьютера: ");
        if (on() == randomOf) {
            System.out.println("Компьютер выключен");
        } else {
            System.out.println("Компьютер сгорел");
        }
    }


        public void printInt () {
        System.out.println(randomOn);
        System.out.print("Ввести число 0 либо 1 для запуска компьютера: ");

        if (on() == randomOn) {
            System.out.println("Добро пожаловать в систему");
        } else {
            System.out.println("Комп сгорел");
        }
    }
}

