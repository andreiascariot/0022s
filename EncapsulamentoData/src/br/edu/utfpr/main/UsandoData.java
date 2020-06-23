package br.edu.utfpr.main;

import br.edu.utfpr.entidade.Data;
import javax.swing.JOptionPane;

public class UsandoData {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Data data = new Data();
//       data.dia = -12;
//       data.mes = 666;
//       data.ano = 45454;
//        data.setDia(-12);
//        data.setMes(-34);
//        data.setAno(34343);

        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mês: "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano: "));

        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);
        JOptionPane.showMessageDialog(null, "Data = " + data);
//        System.out.println("Dia " + data.getDia());
//        System.out.println("Data: " + data);

        Data data2 = new Data(dia, mes, ano);
        System.out.println("Data 2: " + data2);
    }
}
