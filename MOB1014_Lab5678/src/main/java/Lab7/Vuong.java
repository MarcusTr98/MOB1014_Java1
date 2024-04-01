
package Lab7;

public class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
        double rong= canh;
    }
    
    @Override
    public void xuat(){
        System.out.printf("Chieu dai canh la: %.2f \n",rong);
        System.out.printf("Chu vi la: %.2f \n",getChuVi());
        System.out.printf("Dien tich la: %.2f \n",getDienTich());      
    }
}
