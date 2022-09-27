import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book>bookList=new ArrayList<>();
        bookList.add(new Book("Anna karanina 1",123,"Lev tolstoy",1873));
        bookList.add(new Book("Anna karanina 2",400,"Lev tolstoy",1874));
        bookList.add(new Book("Anna karanina 3",94,"Lev tolstoy",1875));
        bookList.add(new Book("Anna karanina 4",13,"Lev tolstoy",1876));
        bookList.add(new Book("Anna karanina 5",235,"Lev tolstoy",1877));
        bookList.add(new Book("Anna karanina 6",88,"Lev tolstoy",1873));
        bookList.add(new Book("Anna karanina 7",132,"Lev tolstoy",1873));
        bookList.add(new Book("Anna karanina 8",34,"Lev tolstoy",1873));
        bookList.add(new Book("Anna karanina 9",826,"Lev tolstoy",1873));
        bookList.add(new Book("Anna karanina 10",623,"Lev tolstoy",1873));

        Map<String,String>bookMap=new HashMap<>();

        bookList.stream().forEach(book -> bookMap.put(book.getBookName(),book.getAuthorName()));
        for(String i : bookMap.keySet()){
            System.out.println("Book Name: "+i+" Author name: "+bookMap.get(i));
        }

        System.out.println("----------------------------------------------------------");

        List<Book> listBook= bookList.stream().filter(book -> book.getPageNumber()>100).toList();
        listBook.stream().forEach(i-> System.out.println("Book Name: "+i.getBookName()+" Page Number : "+i.getPageNumber()));







    }
}
