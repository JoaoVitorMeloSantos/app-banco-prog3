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
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Conta(int numero) {
        this.numero = numero;
    }
    
//    public void operacao(int tipo, double valor) {
//        double saldo;
//        
//
//        
//        return saldo;
//    }
    
    public double depositar(double valor){
        this.saldo += valor;
        return this.getSaldo();
    }
    
    public double sacar(double valor){
        this.saldo -= valor;
        return this.getSaldo();
    }
    
    public double pagar(double valor){
        this.saldo -= valor;
        return this.getSaldo();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        return this.numero == other.numero;
    }
    
      

}