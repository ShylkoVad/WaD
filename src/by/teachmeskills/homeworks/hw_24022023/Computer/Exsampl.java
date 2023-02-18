package by.teachmeskills.homeworks.hw_24022023.Computer;

import java.util.Scanner;

public class Exsampl {
    public static void main(String[] args) {

        Inclusion myInclusion = new Inclusion(); // создание объекта класса Inclusion
        // Создаем объект класса (конкретный компьютер)
        Computer myComputer = new Computer("Intel", 64, 1000); // вызов конструктора с определенными параметрами (9)

//        System.out.println(myInclusion.getInput());
        System.out.println(myInclusion.getRandom());
//        myInclusion.printInt();
//        Inclusion.on();
        myInclusion.printInt();


//       if (Inclusion.on() == myInclusion.getRandom()) {
//           myInclusion.printInt(); // вызов метода у объекта Inclusion
//           myComputer.characteristics(); // вызов метода characteristics у объекта myComputer (6)
//       } else {
//           System.out.println("Данные не доступны");
//
//           myInclusion.printInt(); // вызов метода у объекта Inclusion
////           myComputer.characteristics(); // вызов метода characteristics у объекта myComputer (6)
//
//       }


    }


}
