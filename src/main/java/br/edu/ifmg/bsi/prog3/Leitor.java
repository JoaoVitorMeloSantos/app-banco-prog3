/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifmg.bsi.prog3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitor {
    private String nomeArquivo;

    public Leitor(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public ArrayList<String> lerArquivoCSV() {
        ArrayList<String> linhas = new ArrayList<>();
        try {
            
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = bufferedReader.readLine();
            while (linha != null) {
                linhas.add(linha);
                linha = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return linhas;
    }
}
