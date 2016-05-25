package Negocio;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Teste {
	private static Scanner r;

	public static void main(String[] args) throws IOException {
		r = new Scanner(System.in);
		Random d = new Random();
		r = new Scanner(System.in);
		Personagem heroi = new Personagem();
		Mochila mochila = new Mochila();
		System.out.println(
				"Olá! Bem Vindo a Cidade dos Ladrões, uma aventura que vai mudar a sua maneira de ver as coisas, hehehe \n"
						+ "Bom, primeiro vamos ao que interessa, apresente-se...");
		System.out.println("Digite o seu nome: ");
		heroi.setNome(r.nextLine());
		System.out.println("Hum... Pois bem " + heroi.getNome() + ".\nEntão, conte-me mais sobre você.\n"
				+ "Vamos ver o quão habilidoso você é... he he he.");
		d = new Random();
		int dado = d.nextInt(6) + 1;
		heroi.setHabilidade(dado);
		System.out.println("Sua habilidade é de " + heroi.getHabilidade() + ". \nEspero que você não se machuque muito"
				+ " he he he...");
		System.out.println("Vejamos o quanto de energia você tem...");
		heroi.setEnergia(d.nextInt(12) + 2);
		heroi.setEnergiaAtual(heroi.getEnergia());
		System.out.println("Sua energia é de: " + heroi.getEnergia()
				+ ". \nCuide bem da energia, se ela chegar a 0, é fim de aventura" + " pra você he he he...");
		System.out.println("Será que você é uma pessoa de sorte? hum... vejamos...");
		heroi.setSorte(d.nextInt(6) + 1);
		heroi.setSorteAtual(heroi.getSorte());
		System.out.println("Sua sorte é de: " + heroi.getSorte()
				+ ". Você poderá fazer testes de sorte em vários momentos da aventura,\n"
				+ "você será submetido a um teste de sorte, e cada vez que você fizer esse teste, \nindependende do resultado o seu poder"
				+ "de sorte diminuirá em 1 ponto, fazendo assim ser cada vez mais difícil passar nos testes futuros. he he he...");
		System.out.println("Essa é a sua ficha, tenha uma ótima aventura, ha ha ha ha....");
		System.out.println(heroi);
		// heroi.usarSorte(heroi.getSorteAtual());
		/*
		 * System.out.println(heroi.getSorteAtual()); Referencia teste = new
		 * Referencia(); Npc nono = new Npc(); nono.setNomeMonstro("Gigante");
		 * nono.setMonstroEner(10); nono.setMonstroHab(6);
		 * System.out.println(nono.toString()); teste.isBattle(heroi, nono);
		 */
		// System.out.println("Sorte atual: " + heroi.getSorteAtual());
		Mundo mundo = new Mundo(heroi, mochila);
		mundo.jogar();

	}
}
