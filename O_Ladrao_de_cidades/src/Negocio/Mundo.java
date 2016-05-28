<<<<<<< HEAD
package Negocio;

import java.util.Scanner;


public class Mundo {
	private Referencia[] referencias = new Referencia[6];
	private Personagem heroi;
	private Mochila mochila;
	private Scanner escolher;
	int escolha;

	public Mundo(Personagem heroi, Mochila mochila){
		this.creatRef();
		this.heroi = heroi;
		this.mochila = mochila;
	}
	private void creatRef() {
		Referencia r0 = new Referencia();
		r0.setText("Você acabou de entrar no mundo, divirta-se");
		r0.setNumero(0);
		this.referencias[0] = r0;

		Referencia r1 = new Referencia();
		r1.setText("Você achou uma espada. Para pegar, digite 1 ou para ignorar digite 2..");
		r1.setNumero(1);
		this.referencias[1] = r1;

		Referencia r2 = new Referencia();
		r2.setText("A mulher lhe abraçou. Você venceu o jogo.");
		r2.setNumero(2);
		this.referencias[2] = r2;

		Referencia r3 = new Referencia();
		r3.setText("Quando você tocou na espada, você ficou congelado. Fim de Jogo!");
		r3.setNumero(3);
		this.referencias[3] = r3;

		Referencia r4 = new Referencia();
		r4.setText("Dobrando a rua você encontra uma mulher bonita. Para falar com ela digite 1, para ignorar digite 2:");
		r4.setNumero(4);
		this.referencias[4] = r4;
		
		Npc monstroR5 = new Npc();
		monstroR5.setNomeMonstro("Arlindo");
		monstroR5.setMonstroHab(10);
		monstroR5.setMonstroEner(12);
		
		Referencia r5 = new Referencia();
		r5.setMonstro(monstroR5);
		r5.setText("Dobrando a rua você encontra um monstro. "+monstroR5.toString()+" SOBREVIVA!!");
		r5.setNumero(5);
		this.referencias[5] = r5;
	}
	
	private Referencia decisao(int escolha, int opc1, int opc2, int opc3){
		
		switch (escolha) {
		case 1:
			return this.referencias[opc1];
		case 2:
			return this.referencias[opc2];
		default:
			return this.referencias[opc3];
		}
	}
	public void jogar(){
		
		escolher = new Scanner(System.in);
		Referencia refAtual = new Referencia();
		int valor=1;
		refAtual = this.referencias[0];
		do {
			System.out.println(refAtual);
			switch (valor) {
			case 1:
				System.out.println(this.referencias[1]);
				do{
					System.out.println("O que você fará?");
					escolha = escolher.nextInt();
				}while((escolha>2)||(escolha<1));
				if (escolha==1) {
					valor = 3;
				}else{
					valor = 4;
				}
				break;
			case 2:
				System.out.println(this.referencias[2]);
				System.exit(0);
				break;
			case 3:
				System.out.println(this.referencias[3]);
				System.exit(0);
				break;
			case 4:
				System.out.println(this.referencias[4]);
				do{
					System.out.println("O que você fará?");
					escolha = escolher.nextInt();
				}while((escolha>2)||(escolha<1));
				if (escolha==1) {
					valor = 2;
				}else{
					valor = 4;
				}
				break;
			default:
				System.out.println(this.referencias[5]);
				break;
			}
		} while (this.heroi.getEnergia()>0);
		/*System.out.println(this.referencias[0]);
		heroi.setOuro(30);
		mochila.setProvisao(10);
		
		System.out.println(this.referencias[1]);
		do{
			System.out.println("O que você fará?");
			escolha = escolher.nextInt();
		}while((escolha>2)||(escolha<1));
		if(escolha==1){
		System.out.println(this.referencias[3].toString());
		System.exit(0);
		}else{
			System.out.println(decisao(escolha, 3, 4, 0).toString());
		}
		do{
			System.out.println("O que você fará?");
			escolha = escolher.nextInt();
		}while((escolha>2)||(escolha<1));
		if(escolha == 1){
			System.out.println(decisao(escolha, 2, 5, 0).toString());
			System.exit(0);
		}else{
			System.out.println(decisao(escolha, 2, 5, 0).toString());
		}
		boolean resultado = this.referencias[5].isBattle(heroi);
		if(resultado==true){
			System.out.println(this.referencias[2].toString());
			System.exit(0);
		}else{
			System.out.println("Você foi derrotado! Fim de Jogo!");
			System.exit(0);
		}*/
	}
}