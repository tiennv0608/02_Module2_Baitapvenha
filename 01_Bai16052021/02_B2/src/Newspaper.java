public class Newspaper extends Document {
    private String releaseDay;

    public Newspaper(int id, String publishingCompany, int amount, String releaseDay) {
        super(id, publishingCompany, amount);
        this.releaseDay = releaseDay;
    }

    public Newspaper() {
    }

    public String getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    @Override
    public String toString() {
        return "Newspaper {" + super.toString() +
                " releaseDay:'" + releaseDay + '\'' +
                "} ";
    }
}
