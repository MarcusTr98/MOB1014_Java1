
package mob1014.huyentt_pp03261;

public class SinhVienPoly extends SinhVien{
    private int chuyenNganhHep;

    public SinhVienPoly() {
        super();
        this.chuyenNganhHep = 0;
    }

    public SinhVienPoly(String maSV, String hoTen, String chuyenNganh, int chuyenNganhHep) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public int getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    @Override
    public void inThongTin() {
        System.out.printf(" %8s || %20s || %15s || %15s", "MA SV", "TEN SV", "CHUYEN NGANH", "CHUYEN NGANH HEP");
        super.inThongTin();
        System.out.printf("|| %15s \n",chuyenNganhHep == 1 ? "Java" : "C#");
    }

    
    
}
