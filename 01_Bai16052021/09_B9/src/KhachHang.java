public class KhachHang {
    private String hoTen;
    private int soNha;
    private String maSoCongToDien;

    public KhachHang(String hoTen, int soNha, String maSoCongToDien) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSoCongToDien = maSoCongToDien;
    }

    public KhachHang() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongToDien() {
        return maSoCongToDien;
    }

    public void setMaSoCongToDien(String maSoCongToDien) {
        this.maSoCongToDien = maSoCongToDien;
    }

    @Override
    public String toString() {
        return "Khach hang {" +
                "Ho ten: '" + hoTen + '\'' +
                ", so nha: " + soNha +
                ", ma so cong to dien: '" + maSoCongToDien + '\'' +
                '}';
    }
}
