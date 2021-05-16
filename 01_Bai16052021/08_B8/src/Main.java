import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int soLuongTheMuon = 0;
        Scanner scanner = new Scanner(System.in);
        QuanLyTheMuon quanLyTheMuon = new QuanLyTheMuon();
        while (soLuongTheMuon<1000){
            System.out.println("Menu");
            System.out.println("1. Them the muon");
            System.out.println("2. Xoa the muon");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Thoat");
            System.out.println("Nhap lua chon (1-4):");
            int luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon){
                case 1:{
                    TheMuon theMuon = quanLyTheMuon.taoTheMuon(scanner);
                    System.out.println(theMuon);
                    quanLyTheMuon.them(theMuon);
                    soLuongTheMuon++;
                    break;
                }
                case 2:{
                    System.out.println("Nhap ma the muon xoa");
                    String maThe = scanner.nextLine();
                    quanLyTheMuon.xoa(maThe);
                    break;
                }
                case 3:{
                    quanLyTheMuon.hienThi();
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Nhap sai, hay nhap lai");
                    break;
                }
            }
        }
    }
}
