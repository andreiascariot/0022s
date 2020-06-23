package br.edu.utfpr.entidade;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;

    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public boolean validaDia(int valor) {
        return !((valor >= 31) || (valor <= 0));
    }

    public boolean validaMes(int valor) {
        return !((valor > 12) || (valor <= 0));
    }

    public boolean validaData() {

        if (ano >= 0) {
            if ((mes >= 1) && (mes <= 12)) {
                return dia >= 1 && dia <= 31;
//                 if (dia >= 1 && dia <= 31) {
//                    return true;
//                } else {
//                    return false;
//                }
            }
        }
        return false;
    }

    public String getMesExtenso1() {
        String mesArray[] = {"Janeiro", "Fevereiro", "Março",
            "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
            "Outubro", "Novembro", "Dezembro"};
    
        return mesArray[mes-1];
       
    }

    public String getMesExtenso() {
        String mesExtenso = null;
        switch (this.mes) {
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Março";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
                mesExtenso = "Dezembro";
                break;
        }
        return mesExtenso;
    }

    public String formataDataExtenso() {
        return dia + " de " + getMesExtenso1()
                + " de  " + ano + ".";
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
