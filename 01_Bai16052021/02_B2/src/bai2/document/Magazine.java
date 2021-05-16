package bai2.document;

public class Magazine extends Document {
    private int releaseNumber;
    private String releaseMonth;

    public Magazine(int id, String publishingCompany, int amount, int releaseNumber, String releaseMonth) {
        super(id, publishingCompany, amount);
        this.releaseNumber = releaseNumber;
        this.releaseMonth = releaseMonth;
    }

    public Magazine() {
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public String getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return "Magazine {" + super.toString() +
                " releaseNumber: " + releaseNumber +
                ", releaseMonth: '" + releaseMonth + '\'' +
                "}";
    }
}
