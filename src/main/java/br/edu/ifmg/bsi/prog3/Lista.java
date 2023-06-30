/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifmg.bsi.prog3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 *
 * @author João
 */
public class Lista<T> implements Iterable<T>{
    public Nodo<T> cabeca;
    public Nodo<T> cauda;
    public int tamanho;

    public Lista() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean isEmpty() {
        return cabeca == null && cauda == null;
    }

    public void adicionarNaCabeca(T dado) {
        Nodo<T> novo = new Nodo<>(dado);
        novo.proximo = this.cabeca;
        this.cabeca = novo;
        tamanho++;
    }
    
    public void adicionarNaCauda(T dado) {
        Nodo<T> novo = new Nodo<>(dado);
        
        if(cabeca == null) {
            this.cabeca = novo;
            this.cauda = novo;
        }else {
            novo.anterior = this.cauda;
            this.cauda.proximo = novo;
            this.cauda = novo;
        }
        tamanho++;
    }
    
    public Nodo buscar(Object key) {
        Nodo atual = cabeca;
        while (atual != null) {
            if (atual.dado.equals(key)) {
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }

     @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            Nodo<T> atual = cabeca;

            @Override
            public boolean hasNext(){
                return atual != null; 
            }

            @Override
            public T next(){
                if(!hasNext()) throw new NoSuchElementException();
                T resultado = atual.dado;
                atual = atual.getProximo();
                return resultado; 
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
        
}




