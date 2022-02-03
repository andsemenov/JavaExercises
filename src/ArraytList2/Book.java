package ArraytList2;

public class Book {
    private String title, author;
    private int pages;
    public Book(String title, String author, int pages) {
         this.title = title;
         this.author = author;
         this.pages = pages;
     }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
