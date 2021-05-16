public class Nguoi {
    private String hoTen;
    private int tuoi;
    private int soChungMinh;

    public Nguoi(String hoTen, int tuoi, int soChungMinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soChungMinh = soChungMinh;
    }

    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSoChungMinh() {
        return soChungMinh;
    }

    public void setSoChungMinh(int soChungMinh) {
        this.soChungMinh = soChungMinh;
    }

    @Override
    public String toString() {
        return "Ho Ten: '" + hoTen + '\'' +
                ", tuoi: " + tuoi +
                ", so chung minh: " + soChungMinh;
    }
}
