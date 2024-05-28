package desafiolab1.models;

import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;


    public Shopping(){
    }

    public Shopping(String nome, Endereco endereco, int qtdMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdMaxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + "]";
    }
    
    public boolean insereLoja(Loja loja) {
        if (this.lojas != null) {
            for (int i = 0; i < this.lojas.length; i++) {
                if (this.lojas[i] == null) {
                    this.lojas[i] = loja;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        if (this.lojas != null) {
            for (int i = 0; i < this.lojas.length; i++) {
                if (this.lojas[i] != null && this.lojas[i].getNome().equals(nomeLoja)) {
                    this.lojas[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int count = 0;
        if (this.lojas != null) {
            for (Loja loja : this.lojas) {
                if (loja != null) {
                    switch (tipo.toLowerCase()) {
                        case "cosmético":
                            if (loja instanceof Cosmetico) count++;
                            break;
                        case "vestuário":
                            if (loja instanceof Vestuario) count++;
                            break;
                        case "bijuteria":
                            if (loja instanceof Bijuteria) count++;
                            break;
                        case "alimentação":
                            if (loja instanceof Alimentacao) count++;
                            break;
                        case "informática":
                            if (loja instanceof Informatica) count++;
                            break;
                        default:
                            return -1;
                    }
                }
            }
        }
        return count;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCaro = null;
        if (this.lojas != null) {
            for (Loja loja : this.lojas) {
                if (loja instanceof Informatica) {
                    Informatica lojaInformatica = (Informatica) loja;
                    if (lojaMaisCaro == null || lojaInformatica.getSeguroEletronicos() > lojaMaisCaro.getSeguroEletronicos()) {
                        lojaMaisCaro = lojaInformatica;
                    }
                }
            }
        }
        return lojaMaisCaro;
    }
}