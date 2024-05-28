package desafiolab1.models;

public class Informatica extends Loja{
    
    private double seguroEletronicos;

    public Informatica() {
    }

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double seguroEletronicos, int qtdMax) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdMax);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            double seguroEletronicos, int qtdMax) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdMax);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica [seguroEletronicos=" + seguroEletronicos + ", getSeguroEletronicos()="
                + getSeguroEletronicos() + ", getNome()=" + getNome() + ", getQuantidadeFuncionarios()="
                + getQuantidadeFuncionarios() + ", getSalarioBaseFuncionario()=" + getSalarioBaseFuncionario()
                + ", getEndereco()=" + getEndereco() + ", getDataFundacao()=" + getDataFundacao() + ", toString()="
                + super.toString() + ", gastosComSalario()=" + gastosComSalario() + ", tamanhoDaLoja()="
                + tamanhoDaLoja() + "]";
    }

    
}
