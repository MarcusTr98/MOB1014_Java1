package Lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi nhap vao he so a: ");
        double a= sc.nextDouble();
        System.out.println("Moi nhap vao he so b: ");
        double b= sc.nextDouble();
        System.out.println("Moi nhap vao he so c: ");
        double c= sc.nextDouble();
        System.out.println("Phuong trinh do la: "+a+"x^2+"+b+"x+"+c+"=0");
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Pt vo so nghiem");
                }else{
                    System.out.println("Pt vo nghiem");
                }
            }else{
                double x=-c/b;
                System.out.println("Pt co 1 nghiem x= "+x);
            }
        }else{
            double delta=Math.pow(b,2)-4*a*c;
            System.out.println("Delta = "+delta);
            if(delta<0){
                System.out.println("Pt vo nghiem");
            } else if (delta==0){
                double x= -b/(2*a);
                System.out.println("Pt co nghiem kep: x= "+x);
            }else{
                double x1= (-b-Math.sqrt(delta))/(2*a);
                double x2= (-b+Math.sqrt(delta))/(2*a);
                System.out.printf("Pt có 2 nghiem phan biet x1= %.2f va x2= %.2f", x1,x2);
            }
        }
    }
}
