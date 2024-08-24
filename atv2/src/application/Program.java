package application;

import java.util.Scanner;

import entities.Function;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Qual o salario recebido? ");
        Double salario = sc.nextDouble();

        System.out.println("Qual a qtnd de watts gastos?");
        Double watt = sc.nextDouble();

        Function fun = new Function(salario, watt);

        System.out.println(fun.toString());

        sc.close();

    }

}