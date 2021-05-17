import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SoPhuc danhSachSoPhuc = new SoPhuc();
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Nhap 1 so phuc");
            System.out.println("2. Hien thi so phuc");
            System.out.println("3. Cong 2 so phuc");
            System.out.println("4. Nhan 2 so phuc");
            System.out.println("0. Exit");
            System.out.println("Nhap lua chon");
            int luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    SoPhuc soPhuc = danhSachSoPhuc.nhapSoPhuc(scanner);
                    danhSachSoPhuc.themSoPhuc(soPhuc);
                    break;
                case 2:
                    danhSachSoPhuc.hienThiSoPhuc();
                    break;
                case 3:
                    System.out.println("Nhap phan thuc cua so phuc 1 muon tinh tong");
                    double phanThuc1 = scanner.nextDouble();
                    int viTri1 = danhSachSoPhuc.timkiem(phanThuc1);
                    System.out.println("Nhap phan thuc cua so phuc 1 muon tinh tong");
                    double phanThuc2 = scanner.nextDouble();
                    int viTri2 = danhSachSoPhuc.timkiem(phanThuc2);
                    SoPhuc soPhuc1 = danhSachSoPhuc.getSoPhucs()[viTri1];
                    SoPhuc soPhuc2 = danhSachSoPhuc.getSoPhucs()[viTri2];
                    SoPhuc tong = danhSachSoPhuc.cong2SoPhuc(soPhuc1, soPhuc2);
                    System.out.println("Tong cua 2 so phuc " + soPhuc1 + " va " + soPhuc2 + " la " + tong);
                    break;
                case 4:
                    System.out.println("Nhap phan thuc cua so phuc 1 muon tinh tich");
                    phanThuc1 = scanner.nextDouble();
                    viTri1 = danhSachSoPhuc.timkiem(phanThuc1);
                    System.out.println("Nhap phan thuc cua so phuc 1 muon tinh tich");
                    phanThuc2 = scanner.nextDouble();
                    viTri2 = danhSachSoPhuc.timkiem(phanThuc2);
                    soPhuc1 = danhSachSoPhuc.getSoPhucs()[viTri1];
                    soPhuc2 = danhSachSoPhuc.getSoPhucs()[viTri2];
                    SoPhuc tich = danhSachSoPhuc.nhan2SoPhuc(soPhuc1,soPhuc2);
                    System.out.println("Tich cua 2 so phuc " + soPhuc1 + " va " + soPhuc2 + " la " + tich);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
