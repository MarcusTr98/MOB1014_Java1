
package Lab1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
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
}