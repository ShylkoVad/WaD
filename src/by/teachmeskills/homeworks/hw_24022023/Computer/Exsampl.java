package by.teachmeskills.homeworks.hw_24022023.Computer;

public class Exsampl {
    public static void main(String[] args) {

        // Создаем объект класса (конкретный компьютер)
        Computer myCompyter = new Computer();
//        System.out.println(myCompyter.characteristics()); // передать метод в sout не можем, т.к. characteristics -> void
        myCompyter.characteristics(); // вызов метода characteristics у объекта myCompyter (6)
    }

}
