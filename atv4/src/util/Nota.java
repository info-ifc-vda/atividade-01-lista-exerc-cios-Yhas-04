package util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Nota {
    private Integer codigo;
    private Integer preco;
    private Integer quantidade;

    public Nota(Integer codigo, Integer quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public Double valorUni(){
        double precoUn=0;
        if(getCodigo()<=10){
            precoUn = 10;
        } else if(getCodigo()==11 ||getCodigo()<=20){
            precoUn = 15;
        } else if (getCodigo()==21 || getCodigo()<=30) {
            precoUn = 20;
        } else if (getCodigo()==31 || getCodigo()<=40) {
            precoUn = 30;
        }return precoUn;
    }
    public Double valorTotal(){
        double precoTotal;
        precoTotal = valorUni()*getQuantidade();
        return precoTotal;
    }
    public Double calcDesconto(){
        double desconto=0;
        if(valorTotal()<=250){
            desconto = (valorTotal()*0.05);
        }else if(valorTotal()==250 || valorTotal()<=500){
            desconto = (valorTotal()*0.1);
        }else if(valorTotal()<=500){
            desconto = (valorTotal()*1.5);
        }
        return desconto;
    }
    public Double precoFinal(){
        double precoFinal=0;
        precoFinal = valorTotal()-calcDesconto();
        return precoFinal;
    }
}
