import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyKhachSan quanLyKhachSan = new QuanLyKhachSan();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm khách hàng:");
            System.out.println("2. Tính tiền");
            System.out.println("3. Xóa khách hàng");
            System.out.println("4. Hiển thị danh sách khách hàng");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn:");
            int luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập số ngày muốn thuê:");
                    int ngayThue = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập loại phòng muốn thuê (A, B hoặc C):");
                    String loaiPhong = scanner.nextLine();
                    System.out.println("Nhập thông tin Khách hàng:");
                    System.out.println("Nhập tên:");
                    String ten = scanner.nextLine();
                    System.out.println("Nhập tuổi:");
                    int tuoi = scanner.nextInt();
                    System.out.println("Nhập số chứng minh");
                    int soChungMinh = scanner.nextInt();
                    scanner.nextLine();
                    Nguoi[] thongTin = new Nguoi[1];
                    Nguoi nguoi = new Nguoi(ten, tuoi, soChungMinh);
                    thongTin[0] = nguoi;
                    KhachSan khachHang = new KhachSan(ngayThue, loaiPhong, thongTin);
                    quanLyKhachSan.them(khachHang);
                    break;
                case 2:
                    System.out.println("Nhập số chứng minh:");
                    soChungMinh = scanner.nextInt();
                    int gia = quanLyKhachSan.tinhTien(soChungMinh);
                    System.out.println(gia);
                    break;
                case 3:
                    System.out.println("Nhập số chứng minh muốn xóa");
                    soChungMinh = scanner.nextInt();
                    quanLyKhachSan.xoa(soChungMinh);
                    break;
                case 4:
                    quanLyKhachSan.hienThi();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai");
                    break;
            }
        }
    }
}
