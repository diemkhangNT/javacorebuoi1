package vn.plusplus.Activity;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class activity22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = input.nextInt();
        int chuc = n*10 + n;
        int tram = n*100 + chuc;
        int tong = n + chuc + tram;
        System.out.println(n+" + "+ chuc +" + "+tram+" = " + tong);
    }
}
