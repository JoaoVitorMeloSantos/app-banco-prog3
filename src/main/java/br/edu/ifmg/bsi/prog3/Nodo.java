/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifmg.bsi.prog3;

/**
 *
 * @author aluno
 */
class Nodo<T>{
    
    Nodo<T> proximo;
    T dado;

    public Nodo(T dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public T getDado() {
        return dado;
    }
}