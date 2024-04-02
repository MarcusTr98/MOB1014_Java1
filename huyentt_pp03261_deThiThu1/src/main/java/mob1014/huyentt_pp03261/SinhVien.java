
package mob1014.huyentt_pp03261;

public class SinhVien {
    private String maSV, hoTen, chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String chuyenNganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    public void inThongTin(){
        //System.out.printf(" %8s || %20s || %15s ", "MA SV", "TEN SV", "CHUYEN NGANH");
        System.out.printf("\n %8s || %20s || %15s ",maSV,hoTen,chuyenNganh);
    };
}
