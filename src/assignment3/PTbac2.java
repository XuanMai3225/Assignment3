package assignment3;

import java.util.Scanner;

public class PTbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.println("Giai phuong trinh bac 2: ax^2 + bc + c = 0");
          System.out.print("nhap a = ");
          Float a = scanner.nextFloat();
          System.out.print("nhap b = ");
          Float b = scanner.nextFloat();
          System.out.print("nhap c = ");
          Float c = scanner.nextFloat();
          if(a == 0){     //Nếu a = 0, PT thành PT bậc 1
              if(b == 0){
                  if(c == 0){
                      System.out.print("Phuong trinh co vo so nghiem");
                  }else{
                      System.out.print("Phuong trinh vo nghiem");
                  }
              }else{
                  Float x = -c / b;     //b != 0, có thể tính nghiệm PT bậc 1 bằng cách chia -c cho b
                  System.out.println("Nghiem cua phuong trinh la: x = " +x);
              }
          }else{
              //Tinh delta(b^2 -4ac)
              Float delta = b * b - 4 * a * c;
              if(delta < 0){
                  System.out.println("Phuong trinh vo nghiem");
              }else if(delta == 0){
                  Float x = - b / (2 * a);
                  System.out.println("Phuong trinh co nghiem kep: x = " +x);
              }else{    //(delta > 0)
                  //Math.sqrt(delta) được sử dụng để tính căn bậc 2
                  Float n1 = (- b + Math.sqrt(delta)) / (2 * a);
                  Float n2 = (- b - Math.sqrt(delta)) / (2 * a);
                  System.out.println("Phuong trinh co 2 nghiem phan biet:");
                  System.out.println("n1 = " +n1);
                  System.out.println("n2 = " +n2);
              }
          }
        scanner.close();
    }
}
