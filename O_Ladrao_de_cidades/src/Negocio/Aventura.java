package Negocio;

import java.util.Random;
import java.util.Scanner;

//import Referencias.R001;
//import Referencias.R002;


public class Aventura {

	private static Scanner r;
	private static Random d;

	public static void main(String[] args){
		
		r = new Scanner(System.in);
		Personagem heroi = new Personagem();
		System.out.println("Ol�! Bem Vindo a Cidade dos Ladr�es, uma aventura que vai mudar a sua maneira de ver as coisas, hehehe \n"
				+ "Bom, primeiro vamos ao que interessa, apresente-se...");
		System.out.println("Digite o seu nome: ");
		heroi.setNome(r.nextLine());
		System.out.println("Hum... Pois bem " + heroi.getNome() + "\n Ent�o, conte-me mais sobre voc�\n"
				+ "Vamos ver o qu�o habilidoso voc� �... he he he.");
		d = new Random();
		int dado = d.nextInt(6)+1;
		heroi.setHabilidade(dado);
		System.out.println("Sua habilidade � de " + heroi.getHabilidade() + ". \nEspero que voc� n�o se machuque muito"
				+ "he he he...");
		System.out.println("Vejamos o quanto de energia voc� tem...");
		heroi.setEnergia(10);
		heroi.setSorte(5);
		GerenciadorRef mundo = new GerenciadorRef();
		mundo.loadRef(heroi);
		
	
	}
}
