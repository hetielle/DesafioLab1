package desafiolab1.models;

public class Vestuario extends Loja{

    private boolean produtosImportados;

    public Vestuario() {
    }

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Vestuario [produtosImportados=" + produtosImportados + ", isProdutosImportados()="
                + getProdutosImportados() + ", getNome()=" + getNome() + ", getQuantidadeFuncionarios()="
                + getQuantidadeFuncionarios() + ", getSalarioBaseFuncionario()=" + getSalarioBaseFuncionario()
                + ", getEndereco()=" + getEndereco() + ", getDataFundacao()=" + getDataFundacao() + ", toString()="
                + super.toString() + ", gastosComSalario()=" + gastosComSalario() + ", tamanhoDaLoja()="
                + tamanhoDaLoja()+ "]";
    }
}
