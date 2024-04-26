package desafiolab1.models;

import java.time.LocalDate;

public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(){
    }

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", dataValidade=" + dataValidade + "]";
    }

    public boolean estaVencido(Data dataComparacao) {
        
        LocalDate dataDevencimento = LocalDate.of(this.dataValidade.getAno(), this.dataValidade.getMes(), this.dataValidade.getDia());
        LocalDate data = LocalDate.of(dataComparacao.getAno(), dataComparacao.getMes(), dataComparacao.getDia());

        return dataDevencimento.isBefore(data);
    }
}
