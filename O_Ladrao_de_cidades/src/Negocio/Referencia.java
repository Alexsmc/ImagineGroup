package Negocio;

import java.util.HashMap;

public class Referencia extends Aventura{
	private int numero;
	private String texto;
	private HashMap<Character, Referencia> direcoes;
	

	public Referencia(int numero, String texto, Referencia r1) {
		super();
		this.numero = numero;
		this.texto = texto;
		direcoes.put('A', r1);
	}
	
	public Referencia(int numero, String texto) {
		this.numero = numero;
		this.texto = texto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void add(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
