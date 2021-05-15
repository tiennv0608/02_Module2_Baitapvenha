public abstract class Document {
    private int id;
    private String publishingCompany;
    private int amount;

    public Document(int id, String publishingCompany, int amount) {
        this.id = id;
        this.publishingCompany = publishingCompany;
        this.amount = amount;
    }

    public Document() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Document " +
                "id:" + id +
                ", publishingCompany: '" + publishingCompany + '\'' +
                ", amount: " + amount;
    }
}
