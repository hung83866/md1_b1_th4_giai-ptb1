package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        int a = scanner.nextInt();
        System.out.println("nhập b");
        int b = scanner.nextInt();
        if (a == 0) {
          if (b==0){
              System.out.println("phương trình vô số nghiệm");
          }else {
              System.out.println("phương trình vô nghiệm");
          }
        }else {
            int x = -b/a;
            System.out.println("phương trình có 1 nghiệm x = "+ x);
        }
    }
}
