package by.teachmeskills.homeworks.uroki.Book;

public class Book {
    private String name;
    private String autor;
    private int year;
    public Book(){
    }
    {
        name = "unknown";
        autor = "unknown";
        year = 1;
        System.out.printf("Данный блок инициализации с параметрами %s %s %d\n", name, autor, year);
    }



//    public Book(){
//        name = "unknown";
//        autor = "unknown";
//        year = 1;
//    }
    public Book(String name, String autor, int year){
//        this.name = name;
        this(name);
        this.autor = autor;
        this.year = year;

    }
    public Book (String name){
        this.name = name;
    }

    public void info(){
        System.out.printf("Имя данной книги %s автора %s и года выпуска %d\n", name, autor, year);
    }
    public void info2(){
        System.out.printf("Имя данной книги %s\n", name);
    }

    }
