package mob1014.assignment_huyentt_pp03261;
public class TruongPhong extends NhanVien {
    private double trachNhiem;

    public TruongPhong(String maNV, String hoTen, double luong, String phongBan, double trachNhiem) {
        super(maNV, hoTen, luong, phongBan);
        this.trachNhiem = trachNhiem;
    }
    
    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return getLuong()+trachNhiem;
    }
}

