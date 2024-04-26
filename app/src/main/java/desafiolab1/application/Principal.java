package desafiolab1.application;

import java.util.Scanner;

import desafiolab1.models.Data;
import desafiolab1.models.Endereco;
import desafiolab1.models.Loja;
import desafiolab1.models.Produto;

public class Principal {
    public static void main(String[] args) {

        Scanner scStr = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Produto produto = new Produto();
        Loja loja = new Loja();

        while (opcao !=3) {
            System.out.println("Selecione o que deseja fazer:\r\n" + //
                                "(1) criar uma loja\r\n" + //
                                "(2) criar um produto\r\n" + //
                                "(3) sair\r");
            
            opcao = sc.nextInt();

            if (opcao==1) {
                System.out.println("Digite o nome da loja");
                loja.setNome(scStr.nextLine());
                System.out.println("Digite a quantidade de funcionários");
                loja.setQuantidadeFuncionarios(sc.nextInt());
                System.out.println("Digite o salário base dos funcionários");
                loja.setSalarioBaseFuncionario(sc.nextDouble());

                Endereco endereco = new Endereco();
                System.out.println("Digite o nome da rua");
                endereco.setNomeDaRua(scStr.nextLine());
                System.out.println("Digite o nome da cidade");
                endereco.setCidade(scStr.nextLine());
                System.out.println("Digite o nome do estado");
                endereco.setEstado(scStr.nextLine());
                System.out.println("Digite o nome do pais");
                endereco.setPais(scStr.nextLine());
                System.out.println("Digite o cep");
                endereco.setCep(scStr.nextLine());
                System.out.println("Digite o numero");
                endereco.setNumero(scStr.nextLine());
                System.out.println("Digite o complemento");
                endereco.setComplemento(scStr.nextLine());

                Data dataFundacao = new Data();
                System.out.println("Digite o dia da data de fundação");
                dataFundacao.setDia(sc.nextInt());
                System.out.println("Digite o mês da data de fundação");
                dataFundacao.setMes(sc.nextInt());
                System.out.println("Digite o ano da data de fundação");
                dataFundacao.setAno(sc.nextInt());

                
                loja.setDataFundacao(dataFundacao);
                loja.setEndereco(endereco);

            } else if(opcao==2){
                System.out.println("Digite o nome do produto");
                produto.setNome(scStr.nextLine());
                System.out.println("Digite o preço");
                produto.setPreco(sc.nextDouble());
                
                Data dataValidade = new Data();
                System.out.println("Digite o dia da data de vencimento");
                dataValidade.setDia(sc.nextInt());
                System.out.println("Digite o mês da data de vencimento");
                dataValidade.setMes(sc.nextInt());
                System.out.println("Digite o ano da data de vencimento");
                dataValidade.setAno(sc.nextInt());

                produto.setDataValidade(dataValidade);
                
            } else if (opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.println("Opção inválida");
            }
        }

        if (produto.estaVencido(new Data(20, 10, 2023))) {
            System.out.println("PRODUTO NÃO VENCIDO");
        } else{
            System.out.println("PRODUTO VENCIDO");

        }

        System.out.println(loja);

        sc.close();
        scStr.close();
    }
}
