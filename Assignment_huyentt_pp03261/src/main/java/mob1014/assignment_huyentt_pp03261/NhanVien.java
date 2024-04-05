
package mob1014.assignment_huyentt_pp03261;
// lớp trừu tượng
public abstract class NhanVien {
    // protected => làm public class con
    protected String maNV, hoTen, phongBan;
    protected double luong;
    
    // thêm abstract public double thuNhap(){...}; -> và để class khác ghi đè
    abstract double getThuNhap();

    public NhanVien(String maNV, String hoTen, double luong, String phongBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.phongBan = phongBan;
        this.luong = luong;
    }
    
    public double getThueThuNhap(){
        if(luong<9000000){
            return 0;
        }else if(luong<=15000000){
            return (luong-9000000)*.01;
        }else{
            return (6000000*0.1)+(luong-15000000)*0.12;
        }
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
}
