
package Lab7;

public class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }
   
    public void xuat(){
        System.out.printf("Chieu dai la: %.2f \n",rong);
        System.out.printf("Chieu rong la: %.2f  \n",dai);
        System.out.printf("Chu vi la: %.2f \n",getChuVi());
        System.out.printf("Dien tich la: %.2f \n",getDienTich());        
    }
    
    public double getDienTich(){
        return dai*rong;
    }
    
    public double getChuVi(){
        return (dai+rong)*2;
    }
    
}
