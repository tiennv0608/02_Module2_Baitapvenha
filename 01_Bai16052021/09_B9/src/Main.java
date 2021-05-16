import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int soLuongBienLai = 0;
        Scanner scanner = new Scanner(System.in);
        QuanLyBienLai quanLyBienLai = new QuanLyBienLai();
        while (soLuongBienLai < 1000) {
            System.out.println("Menu");
            System.out.println("1. Them ho gia dinh");
            System.out.println("2. Xoa ho gia dinh");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Sua thong tin");
            System.out.println("5. Tinh tien dien");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon (0-5):");
            int luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1: {
                    BienLai bienLai = quanLyBienLai.taoBienLai(scanner);
                    System.out.println(bienLai);
                    quanLyBienLai.them(bienLai);
                    soLuongBienLai++;
                    break;
                }
                case 2: {
                    System.out.println("Nhap ma so cong to dien cua ho gia dinh muon xoa");
                    String maSoCongToDien = scanner.nextLine();
                    quanLyBienLai.xoa(maSoCongToDien);
                    break;
                }
                case 3: {
                    quanLyBienLai.hienThi();
                    break;
                }
                case 4: {
                    System.out.println("Nhap ma so cong to dien cua ho gia dinh muon sua thong tin");
                    String maSoCongToDien = scanner.nextLine();
                    quanLyBienLai.sua(maSoCongToDien, scanner);
                    break;
                }
                case 5: {
                    System.out.println("Nhap ma so cong to dien cua ho gia dinh muon tinh tien");
                    String maSoCongToDien = scanner.nextLine();
                    int tienDien = quanLyBienLai.tinhTienDien(maSoCongToDien);
                    System.out.println("Tien dien cua ho gia dinh co ma so cong to dien " + maSoCongToDien + " la " + tienDien);
                    break;
                }
                case 0:{
                    System.exit(0);
                }
                default: {
                    System.out.println("Nhap sai, hay nhap lai");
                    break;
                }
            }
        }
    }
}
