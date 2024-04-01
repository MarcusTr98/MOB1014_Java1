
package Lab6;

import java.util.Scanner;

public class SinhVien {
    private String ten;
    private String email;
    private String sdt;
    private String cmnd;    
    Scanner input = new Scanner(System.in);
    
    public void xuat(){
        //System.out.printf("Ten sinh vien: %s|Email: %s|SDT: %s|So CMND: %s",ten,email,sdt,cmnd);
        System.out.printf("%18s ||%25s ||%15s ||%15s\n", ten,email,sdt,cmnd);
    }
    public void nhap(){
        do{
            System.out.print("Nhap ten SV: ");
            ten= input.nextLine();
            if(ten == null || ten.equals("")){
                System.out.println("Ho ten khong hop le.");
            }else{
                break;
            }
        }while(true);
        
        KiemTra kt= new KiemTra();
        do{
            System.out.print("Nhap Email: ");
            email= input.nextLine();
            if(kt.Email(email)){
                break;
            }
            System.out.println("Email hop le");
        }while(true);
        
        do{
            System.out.print("Nhap SDT: ");
            sdt= input.nextLine();
            if(kt.Phone(sdt)){
                break;
            }
            System.out.println("SDT hop le");
        }while(true);
        
        do{
            System.out.print("Nhap so CMND: ");
            cmnd= input.nextLine();
            if(kt.CMND(cmnd)){
                break;
            }
            System.out.println("So CMND hop le");
        }while(true); 
    }
    
    public SinhVien() {
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    
}
