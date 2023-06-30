/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifmg.bsi.prog3;


import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Banco {

    public static void main(String[] args) {
        Lista<Conta> contas = new Lista<>();
        Leitor leitor = new Leitor("C:\\Users\\João\\app-banco-prog3\\entrada.txt");
        ArrayList<String> entrada = leitor.lerArquivoCSV();
        ArrayList<Transacao> transacoes = new ArrayList<>();
        
        for (String linha : entrada) {
            String dadosTransacao[] = linha.split(",");
            Transacao transacao = new Transacao(Integer.parseInt(dadosTransacao[0]),
                    Integer.parseInt(dadosTransacao[1]),
                    Integer.parseInt(dadosTransacao[2]));
            
            if(contas.buscar(new Conta(transacao.getNumeroConta())) == null) {
                contas.adicionarNaCauda(new Conta(transacao.getNumeroConta()));
            }
            
            Nodo<Conta> NodoConta = contas.buscar(new Conta(transacao.getNumeroConta()));
            Conta conta = NodoConta.dado;
                

            
            double saldo = 0;
            switch(transacao.getOperacao()) {
                case 1 -> {
                    saldo = conta.sacar(transacao.getValor());
                }
                case 2 -> {
                    saldo = conta.depositar(transacao.getValor());
                    
                }
                case 4 -> {
                    saldo = conta.pagar(transacao.getValor());   
                }
            }
            
            transacao.setSaldo(saldo);
            
            transacoes.add(transacao);
        }
        
        for (Conta conta : contas) {        
            System.out.println("Número da conta: " + conta.getNumero());
            System.out.println("----------------------------------------");
            System.out.println("Detalhes das Transações:");
            System.out.println("----------------------------------------");
            System.out.println("Tipo | Valor | Saldo");
            System.out.println("----------------------------------------");
            for (Transacao transacao : transacoes) {
                if(transacao.getNumeroConta() == conta.getNumero()) {
                    System.out.println(transacao.getOperacaoString() + " | " + transacao.getValor() + " | " + transacao.getSaldo());
                }
            }    
            System.out.println("----------------------------------------");
            System.out.println("Saldo Atual: " + conta.getSaldo());
            System.out.println("");
        }

    }
}
