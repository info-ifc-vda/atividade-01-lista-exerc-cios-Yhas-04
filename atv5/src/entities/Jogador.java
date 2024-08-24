package entities;

public class Jogador {
    private int idade;
    private double altura;
    private double peso;

    public Jogador(int idade, double altura, double peso) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}