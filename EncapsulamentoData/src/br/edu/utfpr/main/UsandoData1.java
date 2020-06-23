package br.edu.utfpr.main;

import br.edu.utfpr.entidade.Data1;
import br.edu.utfpr.util.ValidaData;
import javax.swing.JOptionPane;

public class UsandoData1 {

    public static void main(String[] args) {

        Data1 data = new Data1();
        ValidaData validaData = new ValidaData();

        while (true) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia"));
            if (validaData.validaDia(dia)) {
                data.setDia(dia);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Dia inválido");
            }
           break;
        }
        while (true) {
            int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mês"));
            if (validaData.validaMes(mes)) {
                data.setMes(mes);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Mês inválido");
            }
            break;
        }

        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano"));
        data.setAno(ano);
        JOptionPane.showMessageDialog(null, "Data: " + data);

    }

//        Data1 data1 = new Data1(dia, mes, ano);
//        System.out.println("Data 1: " + data1);
}
