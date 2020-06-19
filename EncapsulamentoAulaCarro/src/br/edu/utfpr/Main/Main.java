/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.Main;

import br.edu.utfpr.encapsulamento.Carro;
import javax.swing.JOptionPane;

/**
 *
 * @author Andreia
 */
public final class Main {

    private Carro gol;

    public int menu() {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada: "
                + "\n[1] Acelerar"
                + "\n[2] Desacelerar "
                + "\n[3] Buzinar "
                + "\n[4] Sair"));
        return op;
    }

    public Main() {

        gol = new Carro();
        gol.setCor("Vermelho");
        gol.setMarca("Volkswagen");
        gol.setModelo("GOL Highline");
        gol.setVelocidade(10);
        //System.out.println(gol.buzinar());
        System.out.println(gol.getVelocidade());
        System.out.println(gol);

        int op = menu();
        while (true) {
            switch (op) {
                case 1:
                    gol.acelerar();
                    System.out.println(gol.getVelocidade());
                    op = menu();
                    break;
                case 2:
                    gol.desacelerar();
                    System.out.println(gol.getVelocidade());
                    op = menu();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, gol.buzinar());
                     op = menu();
                    break;
                case 4:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    op = menu();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Main();

    }
}

//http://docente.ifrn.edu.br/albalopes/semestres-anteriores/2012.1/disciplinas/programacao-orientada-a-objetos-eja/aula-11-introducao-a-p.o.o
//https://www.caelum.com.br/apostila-java-orientacao-objetos/modificadores-de-acesso-e-atributos-de-classe/#controlando-o-acesso
//http://www2.ic.uff.br/~celio/classes/prog2/caelum-java-objetos-fj11.pdf
//https://docente.ifrn.edu.br/ebertonmarinho/disciplinas/programacao-estruturada-e-orientada-a-objetos/unidade-2/Roteiro01.pdf
