import java.util.Arrays;

public class KhachSan {
//    private static final int LOAI_A = 500;
//    private static final int LOAI_B = 300;
//    private static final int LOAI_C = 100;
    private int ngayThue;
    private String loaiPhong;
    private Nguoi[] khachHang;

    public KhachSan() {
    }

    public KhachSan(int ngayThue, String loaiPhong, Nguoi[] khachHang) {
        this.ngayThue = ngayThue;
        this.loaiPhong = loaiPhong;
        this.khachHang = khachHang;
    }

    public int getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(int ngayThue) {
        this.ngayThue = ngayThue;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public Nguoi[] getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(Nguoi[] khachHang) {
        this.khachHang = khachHang;
    }

    @Override
    public String toString() {
        return  "KhachSan {" +
                "ngayThue: " + ngayThue +
                ", loaiPhong: '" + loaiPhong + '\'' +
                ", khachHang: " + Arrays.toString(khachHang) +
                '}';
    }
}
