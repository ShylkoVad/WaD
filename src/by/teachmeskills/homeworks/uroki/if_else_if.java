package by.teachmeskills.homeworks.uroki;

public class if_else_if {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        if (d == a) {
            System.out.println("Значение d = " + a);
        } else {
            if (d == b) {
                System.out.println("Значение d = " + b);
            } else {
                if (d == c) {
                    System.out.println("Значение d = " + c);
                } else  {
                    System.out.println("Значению d нет соответствия");
                }
            }
        }
    }
}
