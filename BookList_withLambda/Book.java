public class Book {
    private String bookName;
    private int pageNumber;
    private String authorName;
    private int date;


    public Book(String bookName, int pageNumber, String authorName, int date) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.date = date;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;

    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
