package br.unipe.cc.edii.ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import br.unipe.cc.edii.modelo.Frase;
import br.unipe.cc.edii.util.Functions;


public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int C; //Número de caracteres para o cartão
    public static int F; //Número de frases para o cartão
    
    public static int[][] tabela_de_verificacao;
    
    public static ArrayList<Integer> respostas = new ArrayList<Integer>();  
    
    public static void main(String[] args) throws IOException {
        C = leitor(br);
        F = leitor(br);

        while (C != 0 || F != 0) {
            
            Frase[] frases = new Frase[F];
            
            for (int i = 0; i < F; i++) {
                frases[i] = new Frase(leitor(br), leitor(br));
            }
            
            System.out.println(frases);
            
            tabela_de_verificacao = new int[C][F];
            
            for (int i = 0; i < C; i++) {
                for (int j = 0; j < F; j++) {
                    tabela_de_verificacao[i][j] = -1;
                }
            }
            
            System.out.println(tabela_de_verificacao);
            
            int resposta = Functions.funcao(frases, tabela_de_verificacao, 0, F, C, 0);
            
            respostas.add(resposta);
            
            C = leitor(br);
            F = leitor(br);    
        }

        for (int i = 0; i < respostas.size(); i++) {
        	System.out.println("Teste " + (i+1) + "\n" + respostas.get(i) + "\n\n");
		}
    }
    
    static int leitor(BufferedReader br) throws IOException {
        int n;
        int resp = 0;
         
        while (true) {
            n = br.read();
            if (n >= '0' && n <= '9') break;
        }
        while (true) {
            resp = resp*10 + n-'0';
            n = br.read();
            if (n < '0' || n > '9') break;
        }
         
        System.out.println(resp);
        
        return resp;
     
    }
}
