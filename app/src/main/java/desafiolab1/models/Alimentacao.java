package desafiolab1.models;

public class Alimentacao extends Loja{

    private Data dataAlvara;

    public Alimentacao() {
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentacao [dataAlvara=" + dataAlvara + ", getDataAlvara()=" + getDataAlvara() + ", getNome()="
                + getNome() + ", getQuantidadeFuncionarios()=" + getQuantidadeFuncionarios()
                + ", getSalarioBaseFuncionario()=" + getSalarioBaseFuncionario() + ", getEndereco()=" + getEndereco()
                + ", getDataFundacao()=" + getDataFundacao() + ", toString()=" + super.toString()
                + ", gastosComSalario()=" + gastosComSalario() + ", tamanhoDaLoja()=" + tamanhoDaLoja()+ "]";
    }
}
