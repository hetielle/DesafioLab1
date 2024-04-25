package main.java.desafiolab1.models;

import java.time.Year;

public class Data {

    private int dia;
    private int mes;
    private int ano;

// falta construtor
    
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
}
