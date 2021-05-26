package vn.plusplus.Activity;

import java.util.Scanner;

public class activity21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        int a = input.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = input.nextInt();
        int tong = a +b;
        int hieu = a-b;
        int tich = a*b;
        int thuong = a/b;
        int sodu = a%b;
        System.out.println(a+" + "+b + " = " +tong);
        System.out.println(a+" - "+b + " = " +hieu);
        System.out.println(a+" * "+b + " = " +tich);
        System.out.println(a+" / "+b + " = " +thuong);
        System.out.println(a+" % "+b + " = " +sodu);
    }
}
