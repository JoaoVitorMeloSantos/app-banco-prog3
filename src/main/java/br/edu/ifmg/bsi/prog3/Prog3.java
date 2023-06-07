/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifmg.bsi.prog3;

/**
 *
 * @author aluno
 */
public class Prog3 {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        Nodo<String> dado = new Nodo<>("oi");
        lista.inserir(dado);
        System.out.println(lista.buscar("oi").getDado());
        
    }
}
