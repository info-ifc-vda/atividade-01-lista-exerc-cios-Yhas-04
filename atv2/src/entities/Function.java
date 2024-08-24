package entities;

public class Function {
    private Double salario;
    private Double watt;


    public Function(Double salario, Double watt) {
        this.salario = salario;
        this.watt = watt;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getWatt() {
        return watt;
    }

    public void setWatt(Double watt) {
        this.watt = watt;
    }

    public Double valorRes(){
        Double res = 0.0;
        res = (salario*0.1)*watt;

        return res;
    }

    public Double valorUn(){
        Double uni = 0.0;
        uni = valorRes()*0.1;

        return uni;
    }

    public String toString() {
        return "O salario recebido é: " +
                salario +
                "\nA quantidade de watss gasta foi: " +
                watt +
                "\nO valor pago pela residencia foi: " +
                valorRes() +
                "\nO valor por unidade foi: " +
                valorUn();


    }



}