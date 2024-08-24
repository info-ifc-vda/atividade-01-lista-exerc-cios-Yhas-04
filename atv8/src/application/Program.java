package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor a ser pago:");
        double valor = sc.nextDouble();
        System.out.print("Insira o pagamento:");
        double pagamento = sc.nextDouble();

        if(pagamento<valor){
            System.out.println("Pagamento insuficiente!");
            return;
        }
        double troco = pagamento - valor;
        System.out.print("O troco a ser recebido é:"+troco);

        sc.close();
    }
}
