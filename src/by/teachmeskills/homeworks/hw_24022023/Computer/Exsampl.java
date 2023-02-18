package by.teachmeskills.homeworks.hw_24022023.Computer;

public class Exsampl {
    public static void main(String[] args) {

        Inclusion myInclusion = new Inclusion(); // создание объекта класса Inclusion
        Computer myComputer = new Computer("Intel", 64, 1000); // Создаем объект класса (конкретный компьютер) (9)

       myComputer.characteristics(); // вызов метода characteristics у объекта myComputer (6)

//        System.out.println(myInclusion.getInput());
//        System.out.println(myInclusion.getRandomOn());
//        myInclusion.printInt();

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
