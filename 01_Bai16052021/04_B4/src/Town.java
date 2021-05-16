public class Town {
    private Family[] families = new Family[100];
    int size = 0;

    public Town() {
    }

    public Town(Family[] families) {
        this.families = families;
    }

    public Family[] getFamilies() {
        return families;
    }

    public void setFamilies(Family[] families) {
        this.families = families;
    }

    public void add(Family family) {
        families[size] = family;
        size++;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(families[i]);
        }
    }
}
