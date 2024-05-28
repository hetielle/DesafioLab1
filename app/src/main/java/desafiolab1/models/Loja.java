package desafiolab1.models;

import java.util.Arrays;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(){
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int qtdMax) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qtdMax];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int qtdMax) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qtdMax];
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + ", endereco=" + endereco + ", dataFundacao=" + dataFundacao
                + ", estoqueProdutos=" + Arrays.toString(estoqueProdutos) + "]";
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

    public char tamanhoDaLoja(){
        int qtdFuncionarios = this.quantidadeFuncionarios;
        char tamanho = '\0';

        if (qtdFuncionarios < 10) {
            tamanho = 'P';
        } else if(qtdFuncionarios >= 10 && qtdFuncionarios <= 30){
            tamanho = 'M';
        } else if(qtdFuncionarios >= 31){
            tamanho = 'G';
        }

        return tamanho;
    }

    public String imprimeProdutos() {
        StringBuilder sb = new StringBuilder();
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                sb.append(produto.toString()).append("\n");
            }
        }
        return sb.length() > 0 ? sb.toString() : "Não há produtos";    
    }
    
    public boolean insereProduto(Produto produto) {
        if (this.estoqueProdutos != null) {
            for (int i = 0; i < this.estoqueProdutos.length; i++) {
                if (this.estoqueProdutos[i] == null) {
                    this.estoqueProdutos[i] = produto;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean removeProduto(String nomeProduto) {
        if (this.estoqueProdutos != null) {
            for (int i = 0; i < this.estoqueProdutos.length; i++) {
                Produto produto = this.estoqueProdutos[i];
                if (produto != null && produto.getNome().equals(nomeProduto)) {
                    this.estoqueProdutos[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
}
