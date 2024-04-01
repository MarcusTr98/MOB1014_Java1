
package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1_Lab5 {
    ArrayList<Double> b1= new ArrayList<>();
    public void nhap() { 
        Scanner input = new Scanner(System.in);
        System.out.println("Moi nhap vao so thuc ");
        
        while(true){
            System.out.println("Nhap so: ");
            Double x = input.nextDouble();
            b1.add(x);
            input.nextLine();
            System.out.println("Nhap them (Y/N)? ");
            if(input.nextLine().equals("N")){
                break;
            }
        }
    }
    public void hienThi() {
        System.out.println("---------------");
        for(Double so: b1){
            System.out.println(" "+ so);
        }
    }
    
    public void tinhTong() {
        double tong=0;
        for(Double so: b1){
            tong+=so;
        }
        System.out.println("Tong= "+ tong);
    }
}
