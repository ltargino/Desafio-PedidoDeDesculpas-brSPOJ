package br.unipe.cc.edii.util;

import br.unipe.cc.edii.modelo.Frase;

public class Functions {
    
	public static int funcao (Frase[] desculpa, int[][] tabelaVerificadora, int tamanhoAtual, int qteFrases, int comprimentoCartao, int posicao) {
        if (tamanhoAtual > comprimentoCartao) { // passou do limite
            return -1000;
        }
        if (tamanhoAtual == comprimentoCartao) {
            return 0;
        }
        if (posicao == qteFrases) { // já viu tudo
            return 0;
        }
        
        int resposta = 0;
        
        if (tabelaVerificadora[tamanhoAtual][posicao] > -1) {
            return tabelaVerificadora[tamanhoAtual][posicao];
        }
        else {
            resposta = Math.max(resposta, (funcao(desculpa, tabelaVerificadora, tamanhoAtual + desculpa[posicao].get_quantidade_de_caracteres(), qteFrases, comprimentoCartao, posicao+1) + desculpa[posicao].get_quantidade_de_desculpas()));
            resposta = Math.max(resposta, (funcao(desculpa, tabelaVerificadora, tamanhoAtual, qteFrases, comprimentoCartao, posicao+1)));
        
            tabelaVerificadora[tamanhoAtual][posicao] = resposta;
        }        

        return resposta;
    }
	
}
