public class TheMuon {
    private String maThe;
    private int ngayMuon;
    private int hanTra;
    private String soHieuSach;
    private SinhVien sinhVien;

    public TheMuon(String maThe, int ngayMuon, int hanTra, String soHieuSach, SinhVien sinhVien) {
        this.maThe = maThe;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
    }

    public TheMuon() {
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getHanTra() {
        return hanTra;
    }

    public void setHanTra(int hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    @Override
    public String toString() {
        return "TheMuon {" +
                "Ma the: '" + maThe + '\'' +
                ", ngay muon: " + ngayMuon +
                ", han tra: " + hanTra +
                ", so hieu sach: '" + soHieuSach + '\'' +
                ", " + sinhVien +
                '}';
    }
}
