
package Lab7;

public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    abstract double getDiem();
    
    public String getHocLuc(){
        String hocLuc = null;
        double diem = getDiem();
        if(diem>=9){
            hocLuc="Xuat Sac";
        }else if(diem>=7.5){
            hocLuc="Gioi";            
        }else if(diem>=6.5){
            hocLuc="Kha";            
        }else if(diem>=5){
            hocLuc="Trung Binh";            
        }else{
            hocLuc="Yeu";
        }
        return hocLuc;
    }
    
    public void xuat(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Nganh: "+nganh);
        System.out.println("Diem: "+getDiem());
        System.out.println("Hoc luc: "+getHocLuc());
    }
}
