public class QuanLyKhachSan {
    KhachSan[] danhSach = new KhachSan[50];
    int size = 0;

    public void them(KhachSan khachHang) {
        danhSach[size] = khachHang;
        size++;
    }

    public int timKiem(int soChungMinh) {
        for (int i = 0; i < size; i++) {
            if ((danhSach[i].getKhachHang())[0].getSoChungMinh() == soChungMinh) {
                return i;
            }
        }
        return -1;
    }

    public void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
    }

    public void xoa(int soChungMinh) {
        int index = timKiem(soChungMinh);
        if (index != -1) {
            for (int i = index; i < size; i++) {
                danhSach[i] = danhSach[i + 1];
            }
            size--;
            hienThi();
        } else {
            System.out.println("Khong co khach hang mang so chung minh nay");
        }
    }

    public int tinhTien(int soChungMinh) {
        int vitri = timKiem(soChungMinh);
        int gia = 1;
        if (danhSach[vitri].getLoaiPhong().equals("A")) {
            gia = 500 * danhSach[vitri].getNgayThue();
        } else if (danhSach[vitri].getLoaiPhong().equals("B")) {
            gia = 300 * danhSach[vitri].getNgayThue();
        } else {
            gia = 100 * danhSach[vitri].getNgayThue();
        }
        return gia;
    }
}
