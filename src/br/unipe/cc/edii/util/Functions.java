package br.unipe.cc.edii.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.unipe.cc.edii.modelo.Frase;

public class Functions {
    public static BufferedReader br_leitor = new BufferedReader(new InputStreamReader(System.in));

	public static int verificacao (Frase[] desculpa, int[][] tabelaVerificadora, int tamanho_atual, int qteFrases, int comprimentoCartao, int posicao) {
        int quantidade_de_desculpas_na_frase = 0;
        
		if (tamanho_atual > comprimentoCartao) { // passou do limite
            return -1000;
        }
        
		if (tamanho_atual == comprimentoCartao) {
            return 0;
        }
        
		if (posicao == qteFrases) { // já viu tudo
            return 0;
        }
        
        if (tabelaVerificadora[tamanho_atual][posicao] > -1) {
            return tabelaVerificadora[tamanho_atual][posicao];
        } else {
            quantidade_de_desculpas_na_frase = Math.max(quantidade_de_desculpas_na_frase, (verificacao(desculpa, tabelaVerificadora, tamanho_atual + desculpa[posicao].get_quantidade_de_caracteres(), qteFrases, comprimentoCartao, posicao+1) + desculpa[posicao].get_quantidade_de_desculpas()));
            quantidade_de_desculpas_na_frase = Math.max(quantidade_de_desculpas_na_frase, (verificacao(desculpa, tabelaVerificadora, tamanho_atual, qteFrases, comprimentoCartao, posicao+1)));
        
            tabelaVerificadora[tamanho_atual][posicao] = quantidade_de_desculpas_na_frase;
        }        

        return quantidade_de_desculpas_na_frase;
    }
	
    public static int leitor_de_dois_digitos() throws IOException {
        int valor_digitado;
        int digitos = 0;
         
        while (true) {
            valor_digitado = br_leitor.read();
            
            if (valor_digitado >= '0' && valor_digitado <= '9'){
            	break;
            }
        }
        
        while (true) {
            digitos = digitos*10 + valor_digitado-'0';
            valor_digitado = br_leitor.read();
            
            if (valor_digitado < '0' || valor_digitado > '9'){
            	break;
            }
        }

        return digitos;
    }

	
}
