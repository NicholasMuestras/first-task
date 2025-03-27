import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int issueYear;

    public Book(String title, int issueYear, Author author) {
        this.title = title;
        this.issueYear = issueYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;

        return issueYear == book.issueYear && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author.hashCode(), issueYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", issueYear=" + issueYear +
                ", author=" + author.toString() +
                '}';
    }
}
