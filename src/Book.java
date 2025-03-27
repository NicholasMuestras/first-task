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
}
