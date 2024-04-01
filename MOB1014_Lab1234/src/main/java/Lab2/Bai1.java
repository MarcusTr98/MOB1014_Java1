package Lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi nhap vao he so a: ");
        double a=sc.nextDouble();
        System.out.println("Moi nhap vao he so b: ");
        double b=sc.nextDouble();
        System.out.println("Phuong trinh bac nhat do la: "+a+"x+"+b+"=0");
        if(a==0){
            if(b==0){
                System.out.println("Pt Vô số nghiệm");
            }else{
                System.out.println("Pt Vô nghiệm");
            }
        }else{
            double x=-b/a;
            System.out.println("Pt co nghiem x= "+x);
        }
    }
}
