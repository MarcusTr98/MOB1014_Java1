package mob1014.assignment_huyentt_pp03261;
public class TiepThi extends NhanVien{
    private double doanhSo,hoaHong;

    public TiepThi(String maNV, String hoTen, double luong, String phongBan,double doanhSo, double hoaHong) {
        super(maNV, hoTen, luong, phongBan);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }
    
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        return getLuong()+ ( doanhSo*hoaHong/100);
    }
    
}
