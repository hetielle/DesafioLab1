package desafiolab1.models;

public class Cosmetico extends Loja{

    private double taxaComercializacao;

    public Cosmetico() {
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double taxaComercializacao, int qtdMax) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdMax);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            double taxaComercializacao, int qtdMax) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdMax);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico [taxaComercializacao=" + taxaComercializacao + ", getTaxaComercializacao()="
                + getTaxaComercializacao() + ", getNome()=" + getNome() + ", getQuantidadeFuncionarios()="
                + getQuantidadeFuncionarios() + ", getSalarioBaseFuncionario()=" + getSalarioBaseFuncionario()
                + ", getEndereco()=" + getEndereco() + ", getDataFundacao()=" + getDataFundacao() + ", toString()="
                + super.toString() + ", gastosComSalario()=" + gastosComSalario() + ", tamanhoDaLoja()="
                + tamanhoDaLoja() + "]";
    }
}
