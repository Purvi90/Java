package j2;

import java.util.Scanner;

public class Function {
    
  public static int calculateProduct(int a, int b){
    return a*b;
  }

  public static void main(Strings[] args) {
      Scanner sc = new Scanner(System.in);
      int a= sc.nextInt();
      int b= sc.nextInt();
      System.out.println("product of two no's :" + calculateProduct(a, b));
  }

}
