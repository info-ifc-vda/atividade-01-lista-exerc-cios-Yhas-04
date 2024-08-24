package application;

import entities.Worker;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o numero de horas trabalhadas: ");
        double hoursWorked = sc.nextDouble();
        sc.nextLine();
        System.out.print("Insira o valor por hora: ");
        double valuePerHour = sc.nextDouble();
        sc.nextLine();
        Worker worker = new Worker(valuePerHour, hoursWorked);
        System.out.println("Salario Bruto: " + worker.gross_Salary(valuePerHour, hoursWorked));
        System.out.println("Salario Liquido: " + worker.net_salary());


        sc.close();
    }
}