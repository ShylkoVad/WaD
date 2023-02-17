package by.teachmeskills.homeworks.hw_24022023.Computer;

public class Exsampl {
    public static void main(String[] args) {

        // Создаем объект класса (конкретный компьютер)
//        Computer myCompyter = new Computer(); // вызов default конструктора
        Computer myComputer = new Computer("Intel", 64, 1000); // вызов конструктора с определенными параметрами (9)
//        System.out.println(myCompyter.characteristics()); // передать метод в sout не можем, т.к. characteristics -> void
        myComputer.characteristics(); // вызов метода characteristics у объекта myCompyter (6)
    }

}
