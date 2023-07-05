public class Book {
    private final String title;
    private final Author author;
    private int yearPublishing;
    public Book(String title, Author author, int yearPublishing) {
        this.title = title;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearPublishing() {
        return yearPublishing;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    public String toString() {
        return "Название " + this.title + " Автор " + this.author + " Год публикации " + this.yearPublishing;
    }
    public boolean equals(Object obj) {
        Book otherBook = (Book) obj;
        return this.yearPublishing == otherBook.yearPublishing;
    }
    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}
