/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.util;

import br.edu.utfpr.entidade.Data;
import javax.swing.JOptionPane;

/**
 *
 * @author Andreia
 */
public class ValidaData {

    Data data = new Data();

    public final boolean validaDia(int valor) {

//            if ((valor > 12) || (valor <= 0)) {
//                return true;
//            } else {
//                return false;
//            }
        return !((valor > 31) || (valor <= 0));

    }

    public final boolean validaMes(int valor) {
        return !((valor > 12) || (valor <= 0));
    }

}
