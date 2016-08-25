package br.unipe.cc.edii.ui;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	
	public static String linha_de_leitura;
	public static String[] elementos_da_linha_de_leitura;
	
	public static int C = -1; //Número de caracteres que o cartão contem// 8 <= C <= 1000
	public static int F = -1; //Número de frases coletadas// 1 <= F <= 50
	public static int N = -1; //Número de caracteres em uma frase// 8 <= N <= 200
	public static int D = -1; //Número de vezes que a palavra 'Desculpe' aparece na frase// 1 <= D <= 25
	
	public static ArrayList<Integer> valores_de_N = new ArrayList<Integer>();
	public static ArrayList<Integer> valores_de_D = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		while ( ((C < 8) || (C > 1000)) || ((F < 1) || (F > 50)) ){
			linha_de_leitura = scan.nextLine();
			
			elementos_da_linha_de_leitura = linha_de_leitura.split( Pattern.quote(" ") ); 
			
			C = Integer.parseInt(elementos_da_linha_de_leitura[0]);
			F = Integer.parseInt(elementos_da_linha_de_leitura[1]);
			
			if ( ((C < 8) || (C > 1000)) )
				System.out.println("Quantidade de caracteres do cartão é menor que 8 ou maior que 1000, tente novamente.");
			
			if ( ((F < 1) || (F > 50)) )
				System.out.println("Quantidade de frases coletadas é menor que 1 ou maior que 50, tente novamente.");
		}
		
		while ((N != 0) && (D != 0)) {
			linha_de_leitura = scan.nextLine();
			
			elementos_da_linha_de_leitura = linha_de_leitura.split( Pattern.quote(" ") ); 
			
			N = Integer.parseInt(elementos_da_linha_de_leitura[0]);
			D = Integer.parseInt(elementos_da_linha_de_leitura[1]);
			
			if ( ((N < 8) || (N > 200)) && (N > 0))
				System.out.println("Quantidade de caracteres da frase é menor que 8 ou maior que 200, tente novamente.");
			else if ((N > 8) && (N < 200))
				valores_de_N.add(N);
			
			if ( ((D < 1) || (D > 25)) && (D > 0) )
				System.out.println("Quantidade de vezes que a palavra 'Desculpe' aparece na frase é menor que 1 ou maior que 25, tente novamente.");
			else if ((D > 1) && (D < 25))
				valores_de_D.add(D);
		
		}
		
		System.out.println(C);
		System.out.println(F);
		System.out.println(valores_de_N);
		System.out.println(valores_de_D);
		
//		
//		for (int n = 0; n < valores_de_N.size(); n++) {
//			
//			System.out.println(valores_de_N[n]);
//			System.out.println(valores_de_D[n]);
//			
//		}
//		
//		
//		
//		int n = 1;
//		while (){
//			System.out.println("Teste "+n);
//			System.out.println();
//			System.out.println("");
//			n++
//		}
		
		
		
	}
}
