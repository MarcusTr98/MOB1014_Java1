
package Lab1;

import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);           
        System.out.println("Moi nhap vao ho va ten: ");
        String ten=sc.nextLine();
        System.out.println("Moi nhap vao diem: ");
        double diem=sc.nextDouble();
        System.out.println(ten+" "+diem+" diem");
        System.out.printf("%s %d diem", ten, (int)diem);
    }
}
