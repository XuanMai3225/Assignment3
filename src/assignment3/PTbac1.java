package assignment3;

import java.util.Scanner;

public class PTbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 1: ax + b = 0");
        System.out.print("nhap a: ");
        float a = scanner.nextFloat();
        System.out.print("nhap b : ");
        float b = scanner.nextFloat();
        if(a == 0){
            if(b == 0){
            System.out.println("Phuong trinh vo so nghiem");
        }else{
            System.out.println("Phuong trinh vo nghiem");
            }
        }else{
                float x = - b / a;
                System.out.println("Nghiem cua phuong trinh la: x = " +x);
            }
        scanner.close();
    }
}

