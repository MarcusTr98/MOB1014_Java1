
package Lab7;

public abstract class SinhVienBiz extends SinhVienPoly{
    protected float marketing, sales;

    public SinhVienBiz(float marketing, float sales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.marketing = marketing;
        this.sales = sales;
    }
    
    @Override
    double getDiem(){
        return (marketing*2 +sales)/3;
    }
}
