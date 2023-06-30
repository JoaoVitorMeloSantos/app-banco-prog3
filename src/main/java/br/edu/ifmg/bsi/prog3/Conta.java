/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifmg.bsi.prog3;

/**
 *
 * @author aluno
 */
public class Conta {
    private int numero;
    private double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Conta(int numero) {
        this.numero = numero;
    }
    
    public void operacao(String linha) {
        String[] conteudo = linha.split(",");
        int numeroConta = Integer.parseInt(conteudo[0]);
        int operacao = Integer.parseInt(conteudo[1]);
        int valor = Integer.parseInt(conteudo[2]);
        
        this.numero = numeroConta;
        
        switch(operacao) {
            case 1:
                sacar(valor);
            case 2:
                depositar(valor);
            case 3:
                pagar(valor);
        }
    }
    
    public void depositar(int valor){
        this.valor += valor;
    }
    
    public int sacar(int valor){
        this.valor -= valor;
        return valor;
    }
    
    public int pagar(int valor){
        this.valor -= valor;
        return valor;
    }
    
    public boolean equals(Conta c) {
        return numero == c.numero;
    }

}