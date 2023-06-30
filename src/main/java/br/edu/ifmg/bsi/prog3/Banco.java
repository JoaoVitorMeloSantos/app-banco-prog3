/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifmg.bsi.prog3;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aluno
 */
public class Banco {

    public static void main(String[] args) {
        Lista<Conta> lista = new Lista<>();
        Leitor leitor = new Leitor("C:\\Users\\aluno\\Desktop\\app-banco-prog3/entrada.txt");
        
        ArrayList<String> entrada = leitor.lerArquivoCSV();
        
        for (String linha : entrada) {
            String dadosTransacao[] = linha.split(",");
            Transacao transacao = new Transacao(
                    Integer.parseInt(dadosTransacao[0]),
                    Integer.parseInt(dadosTransacao[1]),
                    Integer.parseInt(dadosTransacao[2])
            );
            
            if(lista.buscar(new Conta(transacao.getNumeroConta())) == null) {
                lista.inserir(new Conta(transacao.getNumeroConta()));
            }
            
            //pegar objeto
                    
        }
        
    }
}
