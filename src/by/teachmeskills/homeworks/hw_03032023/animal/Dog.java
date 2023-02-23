package by.teachmeskills.homeworks.hw_03032023.animal;

public class Dog extends Canine {
    public Dog(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Гав-Гав-Гав!!!");
    }

    @Override
    protected void eat() {
        System.out.println("Собака употребляет в рацион мясо и различный корм");
    }

    @Override
    protected void roam() {
        System.out.println("Собока предпочитает стаю");
    }
}
