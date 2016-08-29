package br.unipe.cc.edii.ui;

import java.io.IOException;
import java.util.ArrayList;

import br.unipe.cc.edii.modelo.Frase;
import br.unipe.cc.edii.util.Functions;


public class Main {
    public static int C; //Número de caracteres para o cartão
    public static int F; //Número de frases para o cartão
    
    public static int[][] tabela_de_verificacao;
    
    public static ArrayList<Integer> respostas = new ArrayList<Integer>();  
    
    public static void main(String[] args) throws IOException {
    	int resposta;
    	
    	C = Functions.leitor_de_dois_digitos();
        F = Functions.leitor_de_dois_digitos();

        while (C != 0 || F != 0) {
            
            Frase[] frases = new Frase[F];
            
            for (int i = 0; i < F; i++) {
                frases[i] = new Frase(Functions.leitor_de_dois_digitos(), Functions.leitor_de_dois_digitos());
            }
            
            tabela_de_verificacao = new int[C][F];
            
            for (int i = 0; i < C; i++) {
                for (int j = 0; j < F; j++) {
                    tabela_de_verificacao[i][j] = -1;
                }
            }
            
            resposta = Functions.verificacao(frases, tabela_de_verificacao, 0, F, C, 0);
            
            respostas.add(resposta);
            
            C = Functions.leitor_de_dois_digitos();
            F = Functions.leitor_de_dois_digitos();    
        }

        for (int i = 0; i < respostas.size(); i++) {
        	System.out.println("Teste " + (i+1) + "\n" + respostas.get(i) + "\n\n");
		}
    }
    
}
