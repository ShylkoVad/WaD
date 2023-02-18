package by.teachmeskills.homeworks.hw_24022023.Computer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Computer {

    // поля класса (2)
    private String cpu; // тип процессора
    private int ram; // объем оперативной памяти
    private int ssd; // объем жесткого диска



    // создание конструктора Computer (8) с параметрами
    public Computer (String cpu, int ram, int ssd) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }

    // метод вывода значений (3)
    public void characteristics () {
        System.out.printf("Данный компьютер обладает следующими характеристиками:\n 1.) CPU - %s;\n 2.) RAM - %d Гбайт;\n 3.) SSD - %d Гбайт\n", cpu, ram, ssd);
//        System.out.printf("Вы ввели число:\n", input);
    }




}
