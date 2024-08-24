package application;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um intervalo de dois números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int aux=0;
        int fatorial = 0;
        if (n1 > n2) {
            aux = n1;
            for (int i = n2; i <= n1; i++) {
                aux *= i;
            }
            fatorial = aux ;
        } else {
            aux = n2;
            for (int i = n1; i <= n2; i++) {
                aux *= i;
            }
            fatorial = aux;
        }
        System.out.println(fatorial);
        sc.close();
    }
}
