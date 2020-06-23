package br.edu.utfpr.main;

import br.edu.utfpr.entidade.Data;
import javax.swing.JOptionPane;

public class UsandoDataValida {

    public static void main(String[] args) {

//        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia: "));
//        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mês: "));
//        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano: "));
        Data data = new Data();
        while (true) {
//        Data data = new Data(dia, mes, ano);
//        var data = new Data(dia, mes, ano);

            data.setDia(Integer.parseInt(JOptionPane.showInputDialog(null, "Dia: ")));
            data.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Mês: ")));
            data.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Ano: ")));

            if (data.validaData()) {
//            System.out.println(data);
//            System.out.println(data.getDia() + " de " 
//                    + data.getMesExtenso() + " de  " + data.getAno());
                System.out.println(data.formataDataExtenso());
                break;
            } else {
                System.out.println("Informe uma data válida.");
            }
        }
    }
}
