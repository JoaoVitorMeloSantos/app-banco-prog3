/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifmg.bsi.prog3;

/**
 *
 * @author aluno
 */
public class Banco {

    public static void main(String[] args) {
        Conta c = new Conta(123, 0);
        Lista<Conta> lista = new Lista<>();
        Nodo<Conta> dado = new Nodo<>(c);
        lista.inserir(dado);
        System.out.println(lista.buscar(c).getDado().getNumero());
        
    }
}
