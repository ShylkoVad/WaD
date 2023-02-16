package by.teachmeskills.homeworks.hw_24022023.Computer;

public class Computer {

    // поля класса (2)
    private String cpu; // тип процессора
    private int ram; // объем оперативной памяти
    private int ssd; // объем жесткого диска

    // метод вывода значений (3)
    public void characteristics () {
        System.out.printf("Данный компьютер обладает следующими характеристиками:\n 1.) CPU - %s;\n 2.) RAM - %d Гбайт;\n 3.) SSD - %d Гбайт", cpu, ram, ssd);

    }


}
