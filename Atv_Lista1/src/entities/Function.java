package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class Function {
        private double lado1;
        private double lado2;
        private double lado3;
        private Double ang1;
        private Double ang2;
        private Double ang3;

    public String verificaLado(){
        if(lado1 == lado2 && lado2 == lado3) {
            return "equilatero";
        }else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            return "escaleno";
        }if(lado1 == lado2 && lado1 != lado3 || lado2 == lado1 && lado2 != lado3 || lado3 == lado2 && lado1 != lado3) {
            return "isosceles";
        }
        return "Triangulo invalido";
    }
    public String verificaAngulo(){
        Double soma = ang1 + ang2 + ang3;
        if(soma>180){
            return "invalido";
        }else if(ang1>90||ang2>90||ang3>90){
            return "obtusangulo";
        }else if(ang1<90&&ang2<90&&ang3<90){
            return "acutangulo";
        }else if(ang1==90||ang2==90||ang3==90){
            return "retangulo";
        }
        return "invalido";

    }
public String toString(){
        return "Este triangulo é: " +
                verificaLado() +
                ", e: " +
                verificaAngulo();
}
}
