package Lab1;

import java.util.Scanner;

public class Bai4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi nhap he so a: ");
        int a=sc.nextInt();
        System.out.println("Moi nhap he so b: ");
        int b=sc.nextInt();
        System.out.println("Moi nhap he so c: ");
        int c=sc.nextInt();
        System.out.println("Phuong trinh vua nhap la: "+a+"x^2 +"+b+"x +"+c+" =0");
        double delta=Math.pow(b,2)-4*a*c;
        System.out.println("Delta la: "+delta);
        System.out.printf("Can delta la: %.2f ", Math.sqrt(delta));
    }
}
