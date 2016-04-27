package Negocio;

import java.util.ArrayList;

public class Aventura {
	
	private ArrayList<Referencia> referencias;
	
	public Aventura (){
		ArrayList<Referencia> referencias = new ArrayList<>();
		
		
		Referencia r1 = new Referencia(0, "Oi, tudo bem?");
		Referencia r2 = new Referencia(1, "Sim, tudo", r1);
		r1.add(r2);// estudar isso!
		
		referencias.add(r1);
	}
	
	public static void main(String[] args) {
		Aventura a = new Aventura();
		
		System.out.println(a);
	}

}
