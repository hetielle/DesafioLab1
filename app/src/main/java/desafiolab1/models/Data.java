package desafiolab1.models;

import java.time.Year;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(){
    }

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Alterando para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
    }

    public boolean verificaAnoBissexto(){

        if (Year.isLeap(this.ano)) {
            return true;
        } else{
            return false;
        }
    }

    private boolean validarData(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }
        
        int[] diasPorMes = {31, 28 + (verificaAnoBissexto() ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        return dia <= diasPorMes[mes - 1];
    }
}
