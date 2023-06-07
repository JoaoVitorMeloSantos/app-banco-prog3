/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifmg.bsi.prog3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author aluno
 */
public class Lista<T> implements Iterable<T>{
    
    private Nodo<T> cabeca;

    public Lista() {
        this.cabeca = null;
    }
    
    public void inserir(Nodo<T> x){
        Nodo<T> cabecaAntiga = cabeca;
        cabeca = x;
        x.proximo = cabecaAntiga;
    }
    
    public Nodo<T> buscar(T dado){
        Nodo<T> aux = cabeca;
        while(aux.dado != null && !aux.dado.equals(dado)){
            aux = aux.proximo;
        }
        return aux;
    }  

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            Nodo<T> atual = cabeca;
            
            public boolean hasNext(){
                return atual != null; 
            }
            
            public T next(){
                if(!hasNext()) throw new NoSuchElementException();
                T resultado = atual.dado;
                atual = atual.proximo;
                return resultado; 
            }
        };
    }
}

class Nodo<T>{
    
    Nodo<T> proximo;
    T dado;

    public Nodo(T dado) {
        this.proximo = null;
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }
}
