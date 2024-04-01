package Lab1;

import java.util.Scanner;

public class Lab1 {
    public static void bai1() {
        Scanner sc=new Scanner(System.in);           
        System.out.println("Moi nhap vao ho va ten: ");
        String ten=sc.nextLine();
        System.out.println("Moi nhap vao diem: ");
        double diem=sc.nextDouble();
        System.out.println(ten+" "+diem+" diem");
        //System.out.printf("%s %d diem", ten, (int)diem);
    }
    public static void bai2() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Moi nhap vao canh 1: ");
        double dai=sc.nextDouble();
        System.out.print("Moi nhap vao canh 2: ");
        double rong=sc.nextDouble();
        double cv=(dai+rong)*2, dt=dai*rong;
        System.out.println("Chu vi hinh chu nhat la: "+cv);
        System.out.println("Dien tich hinh chu nhat la: "+dt);
        System.out.println("Canh nho nhat la: "+Math.min(dai,rong));
    }
    public static void bai3() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao canh cua khoi lap phuong: ");
        double canh=sc.nextDouble();
        double tt= Math.pow(canh,3);
        System.out.println("The tich cua khoi lap phuong: "+tt);
    }
    public static void bai4() {
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
