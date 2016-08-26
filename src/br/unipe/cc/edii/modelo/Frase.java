package br.unipe.cc.edii.modelo;

public class Frase {
    /* Atributos */
	private int quantidade_de_caracteres;
    private int quantidade_de_desculpas;
    
    /* Construtores */
    public Frase(){
    	
    }
    public Frase(int quantidade_de_caracteres, int quantidade_de_desculpas){
    	this.quantidade_de_caracteres = quantidade_de_caracteres;
    	this.quantidade_de_desculpas = quantidade_de_desculpas;
    }

	/* Metodos get's e set's */
    public int get_quantidade_de_caracteres() {
		return quantidade_de_caracteres;
	}

	public void set_quantidade_de_caracteres(int quantidade_de_caracteres) {
		this.quantidade_de_caracteres = quantidade_de_caracteres;
	}

	public int get_quantidade_de_desculpas() {
		return quantidade_de_desculpas;
	}

	public void set_quantidade_de_desculpas(int quantidade_de_desculpas) {
		this.quantidade_de_desculpas = quantidade_de_desculpas;
	}
    
}
