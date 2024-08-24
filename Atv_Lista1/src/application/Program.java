package application;

import entities.Function;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o 1° lado:");
        double lado1 = sc.nextDouble();
        System.out.println("Qual o 2° lado:");
        double lado2 = sc.nextDouble();
        System.out.println("Qual o 3° lado:");
        double lado3 = sc.nextDouble();
        System.out.println("Qual o 1° angulo");
        Double ang1 = sc.nextDouble();
        System.out.println("Qual o 2° angulo:");
        Double ang2 = sc.nextDouble();
        System.out.println("Qual o 3° angulo:");
        Double ang3 = sc.nextDouble();

        Function fun = new Function(lado1, lado2, lado3, ang1, ang2, ang3);
        System.out.println(fun.toString());

        sc.close();
    }
}
