package application;

import util.Nota;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o codigo da nota: ");
        int cod = sc.nextInt();
        System.out.print("Insira a quantidade: ");
        int quantidade = sc.nextInt();
        Nota nota = new Nota(cod, quantidade);
        System.out.print("O preço unitario da nota é: "+nota.valorUni());
        System.out.print("\nO preço total é: "+nota.valorTotal());
        System.out.print("\nDesconto: "+nota.calcDesconto());
        System.out.print("\nO preço total após o desconto é: "+nota.precoFinal());
        sc.close();
    }
}
