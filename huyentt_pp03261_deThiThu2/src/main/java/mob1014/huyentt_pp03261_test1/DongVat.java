
package mob1014.huyentt_pp03261_test1;

public class DongVat {
    private String maDongVat, tenDongVat, noiSong;
    private int canNang;
    
    public DongVat() {
    }

    public DongVat(String maDongVat, String tenDongVat, String noiSong, int canNang) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.noiSong = noiSong;
        this.canNang = canNang;
    }

    public String getMaDongVat() {
        return maDongVat;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }
    
    public void inThongTin(){
       System.out.printf("\n%10s || %12s || %15s || %8d ", maDongVat,tenDongVat,noiSong, canNang);
    }
}
