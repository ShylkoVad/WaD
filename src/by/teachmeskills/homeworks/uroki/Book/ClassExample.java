package by.teachmeskills.homeworks.uroki.Book;

public class ClassExample {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "Михаил Булгаков", 2023); // объект класса book и вызов конструктора
        Book book1 = new Book();
        Book book2 = new Book("Шумеры");
        book.info(); // вызываем метод info() у объекта book
        book2.info();
//        book2.info2();

    }
}
