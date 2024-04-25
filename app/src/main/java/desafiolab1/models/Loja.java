package main.java.desafiolab1.models;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void LojaSemSalario(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + "]";
    }

    public double gastosComSalario(){

        double salario = this.salarioBaseFuncionario;
        int qtdFuncionarios = this.quantidadeFuncionarios;

        if (salario != -1) {
            return salario*qtdFuncionarios;
        } else{
            return -1;
        }
    }

    public String tamanhoDaLoja(){
        int qtdFuncionarios = this.quantidadeFuncionarios;
        String tamanho = "";

        if (qtdFuncionarios < 10) {
            tamanho = "P";
        } else if(qtdFuncionarios >= 10 && qtdFuncionarios <= 30){
            tamanho = "M";
        } else if(qtdFuncionarios >= 31){
            tamanho = "G";
        }

        return tamanho;
    }
}
