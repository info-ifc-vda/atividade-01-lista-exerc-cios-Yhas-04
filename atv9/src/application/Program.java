package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int num = sc.nextInt();
            if (num<=3 || num % 2 != 0 && num % 3 != 0) {
                System.out.println("este num é primo!");
            } else {
                System.out.println("nao é primo!");
            }

        sc.close();
    }
}
