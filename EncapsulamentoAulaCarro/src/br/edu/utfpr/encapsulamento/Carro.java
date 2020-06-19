/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.encapsulamento;

/**
 *
 * @author Andreia
 */
public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int velocidade;

    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public String buzinar(){
       return "BEEEEEPPPPP";
    }
    
    public void acelerar(){
       velocidade += 1;
    }
    
    public void desacelerar(){
       velocidade -= 1;
    }
    
    @Override
    public String toString(){
        return "Marca:  " + marca + " Modelo: " + modelo + " Cor: " + cor + " Velocidade: " + velocidade;
    }
}
