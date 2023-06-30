/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifmg.bsi.prog3;

/**
 *
 * @author aluno
 */
public class Transacao {
    int numeroConta;
    int operacao;
    double valor;
    double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getOperacao() {
        return operacao;
    }
    
    public String getOperacaoString() {
        switch(this.getOperacao()) {
            case 1 -> {
                return "Saque";
            }
            case 2 -> {
                return "Depósito";
            }
            case 4 -> {
                return "Pagamento";
            } 
            default -> {
                return null;
            }
        }
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Transacao(int numeroConta, int operacao, int valor) {
        this.numeroConta = numeroConta;
        this.operacao = operacao;
        this.valor = valor;
    }
    
    public void imprimir(){
        System.out.println("Número da Conta:" + numeroConta);
        System.out.println("----------------------------------------");
        System.out.println("Tipo | Valor | Saldo");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        //System.out.println("Saldo Atual:" + );
    }
  
}
