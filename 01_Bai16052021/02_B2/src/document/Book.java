package document;

public class Book extends Document {
    private String authorName;
    private int numberOfPage;

    public Book(int id, String publishingCompany, int amount, String authorName, int numberOfPage) {
        super(id, publishingCompany, amount);
        this.authorName = authorName;
        this.numberOfPage = numberOfPage;
    }

    public Book() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Book {" + super.toString() +
                " authorName: '" + authorName + '\'' +
                ", numberOfPage: " + numberOfPage +
                "}";
    }
}
