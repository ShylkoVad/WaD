package by.teachmeskills.homeworks.hw_03032023.animal;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Cat.jpg", "Meat", 1, new Animal.Boundaries(50, 100), new Animal.Location(7, 15));

        System.out.println(cat);
    }
}
