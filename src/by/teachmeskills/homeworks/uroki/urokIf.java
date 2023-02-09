package by.teachmeskills.homeworks.uroki;

public class urokIf {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("Это оператор if");
        }
        if (x < y && x > 5) {
            System.out.println("Число находится в диапозоне от 5 до " + y);
        }

    }
}
