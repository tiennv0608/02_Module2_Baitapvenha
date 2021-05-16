import java.util.Scanner;

public class QuanLyBienLai {
    private BienLai[] bienLais = new BienLai[10000];
    int soLuong = 0;

    public void them(BienLai bienLai) {
        bienLais[soLuong] = bienLai;
        soLuong++;
    }

    public int tim(String maSoCongToDien) {
        for (int i = 0; i < soLuong; i++) {
            if (bienLais[i].getKhachHang().getMaSoCongToDien().equals(maSoCongToDien)){
                return i;
            }
        }
        return -1;
    }
    public void xoa(String maSoCongToDien) {
        int viTri = tim(maSoCongToDien);
        if (viTri != -1) {
            for (int i =viTri;i<soLuong; i++){
                bienLais[i] = bienLais[i+1];
            }
            soLuong --;
            hienThi();
        } else {
            hienThi();
        }
    }

    public void hienThi(){
        for (int i = 0; i<soLuong;i++){
            System.out.println(bienLais[i]);
        }
    }
    public int tinhTienDien(String maSoCongToDien){
        int tienDien = 0;
        int viTri = tim(maSoCongToDien);
        if (viTri != -1){
            tienDien = (bienLais[viTri].getChiSoMoi()-bienLais[viTri].getChiSoCu())*5;
        } else {
            tienDien = 0;
        }
        return tienDien;
    }

    public void sua(String maSoCongToDien, Scanner scanner) {
        int viTri = tim(maSoCongToDien);
        if (viTri!=-1) {
            System.out.println("Nhap thong tin muon sua");
            System.out.println("1. Sua ho ten");
            System.out.println("2. Sua so nha");
            System.out.println("3. Sua ma so cong to dien");
            System.out.println("4. Sua chi so cu");
            System.out.println("5. Sua chi so moi");
            int thongTin = scanner.nextInt();
            scanner.nextLine();
            switch (thongTin){
                case 1:
                    System.out.println("Nhap ho ten muon sua");
                    String hoTen = scanner.nextLine();
                    bienLais[viTri].getKhachHang().setHoTen(hoTen);
                    break;
                case 2:
                    System.out.println("Nhap so nha muon sua");
                    int soNha = scanner.nextInt();
                    scanner.nextLine();
                    bienLais[viTri].getKhachHang().setSoNha(soNha);
                    break;
                case 3:
                    System.out.println("Nhap ma so cong to dien muon sua");
                    String maSo = scanner.nextLine();
                    bienLais[viTri].getKhachHang().setHoTen(maSo);
                    break;
                case 4:
                    System.out.println("Nhap chi so dien cu muon sua");
                    int chiSoCu = scanner.nextInt();
                    scanner.nextLine();
                    bienLais[viTri].setChiSoCu(chiSoCu);
                    break;
                case 5:
                    System.out.println("Nhap chi so moi muon sua");
                    int chiSoMoi = scanner.nextInt();
                    scanner.nextLine();
                    while (chiSoMoi < bienLais[viTri].getChiSoCu()){
                        System.out.println("Chi so moi sai, nhap lai");
                        chiSoMoi = scanner.nextInt();
                        scanner.nextLine();
                    }
                    bienLais[viTri].setChiSoMoi(chiSoMoi);
                    break;
                default:
                    System.out.println("Nhap sai");
            }
            System.out.println(bienLais[viTri]);
        } else {
            System.out.println("Khong tim thay thong tin ho gia dinh can sua");
        }
    }
    public BienLai taoBienLai(Scanner scanner){
        System.out.println("Nhap ho ten");
        String hoTen = scanner.nextLine();
        System.out.println("Nhap so nha");
        int soNha = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ma so cong to dien");
        String maSoCongToDien = scanner.nextLine();
        System.out.println("Nhap chi so dien cu");
        int chiSoCu = scanner.nextInt();
        System.out.println("Nhap chi so dien moi");
        int chiSoMoi = scanner.nextInt();
        scanner.nextLine();
        KhachHang khachHang = new KhachHang(hoTen,soNha,maSoCongToDien);
        BienLai bienLai = new BienLai(khachHang,chiSoCu,chiSoMoi);
        return bienLai;
    }
}
