package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Digite 10 numeros: ");
        for(int i =0;i<10;i++){
            System.out.println("Numero: "+(i+1)+" ");
            int num = sc.nextInt();
            if(num<=3 || num%2!=0 && num%3!=0){
                sum++;
            }
        }
        System.out.println("Quantidade de numeros primos: "+sum);
        sc.close();
    }
}