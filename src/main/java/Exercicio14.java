// IMPORTS

import java.util.Scanner;

public class Exercicio14 {

   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);

      // DECLARATE
      int n;
      int a;
      int result;

      // COLLECT DATA
      System.out.print("NA : ");
      n = sc.nextInt();
      System.out.print("AT : ");
      a = sc.nextInt();

      // OUTPUT
      if (n > a) {
         System.out.println("ERROR");
      } else {
         System.out.println("AGE : " + (a - n));
      }
   }
}
