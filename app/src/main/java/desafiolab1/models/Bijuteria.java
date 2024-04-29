package desafiolab1.models;

public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria() {
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Bijuteria [metaVendas=" + metaVendas + ", getMetaVendas()=" + getMetaVendas() + ", getNome()="
                + getNome() + ", getQuantidadeFuncionarios()=" + getQuantidadeFuncionarios()
                + ", getSalarioBaseFuncionario()=" + getSalarioBaseFuncionario() + ", getEndereco()=" + getEndereco()
                + ", getDataFundacao()=" + getDataFundacao() + ", toString()=" + super.toString()
                + ", gastosComSalario()=" + gastosComSalario() + ", tamanhoDaLoja()=" + tamanhoDaLoja()+ "]";
    }
}
