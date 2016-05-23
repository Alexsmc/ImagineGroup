package Negocio;

import java.util.ArrayList;

//import Referencias.R001;
//import Referencias.R002;


public class Aventura {

	public static void main(String[] args){
		
	
		Personagem heroi = new Personagem();
		heroi.setNome("Carlos");
		GerenciadorRef mundo = new GerenciadorRef();
		mundo.loadRef(heroi);
		
		/*ArrayList <Referencia> refTest = new ArrayList<Referencia>();
		Referencia rTeste = new Referencia();
		
		rTeste.setText("Testando");
		refTest.add(rTeste);
		System.out.println(rTeste);*/
		
	
	}
}
