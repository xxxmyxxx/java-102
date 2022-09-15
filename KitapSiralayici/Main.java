import java.util.*;


public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("Satranc", 83, "Stefan Zweig", 1942));
        books.add(new Book("Kucuk Prens", 114, "Antoine de Saint-Exupéry", 1943));
        books.add(new Book("Donusum", 74, "Franz Kafka", 1974));
        books.add(new Book("Fareler ve Insanlar", 111, "John Steinbeck", 1937));
        books.add(new Book("Yabanci", 112, "Albert Camus", 1942));


        for (Book b : books) {
            System.out.println(b.getBookName() + "\t" + b.getPageNumber() + "\t" + b.getAuthorName() + "\t" + b.getReleaseDate());


        }
        System.out.println("------------------------------------------------");

        TreeSet<Book> books1 =new TreeSet<>( new OrderPageComprator());
        books1.addAll(books);
        for (Book f:books1) {
            System.out.println(f.getBookName() + "\t" + f.getPageNumber() + "\t" + f.getAuthorName() + "\t" + f.getReleaseDate());


        }
    }
}




