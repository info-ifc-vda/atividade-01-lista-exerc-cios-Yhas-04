package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número para calcular o seu fatorial: ");
        int n = sc.nextInt();
        int aux = n;
        for(int i=1;i<aux;i++){
            n*=i;
        }
        System.out.println(n);
        sc.close();
    }
}