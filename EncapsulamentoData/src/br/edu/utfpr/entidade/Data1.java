package br.edu.utfpr.entidade;

public class Data1 {

    private int dia;
    private int mes;
    private int ano;

    public Data1() {

    }

    public Data1(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
//        if(dia <=31 && dia > 0){
//             this.dia = dia;
//         }else{
//            this.dia = 0;
//        }
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAno();
    }

//    public boolean validaDia(int valor) {
//        return !((valor >= 31) || (valor <= 0));
//    }
//
//    public boolean validaMes(int valor) {
//        return !((valor > 12) || (valor <= 0));
//    }

}
