
package mob1014.assignment_huyentt_pp03261;
public class HanhChinh extends NhanVien {

    public HanhChinh(String maNV, String hoTen, double luong, String phongBan) {
        super(maNV, hoTen, luong, phongBan);
    }
    
    @Override
    public double getThuNhap() {
        return getLuong();
    }   
}
