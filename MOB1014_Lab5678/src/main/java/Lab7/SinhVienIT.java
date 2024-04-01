
package Lab7;

public abstract class SinhVienIT extends SinhVienPoly{
    protected float diemJava, diemCSS, diemHTML;

    public SinhVienIT(float diemJava, float diemCSS, float diemHTML, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }
    
    @Override
    double getDiem(){
        return (diemJava*2 +diemHTML+diemCSS)/4;
    }
}
