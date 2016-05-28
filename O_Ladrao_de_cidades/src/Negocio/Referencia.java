 package Negocio;
 
import java.util.Random;
import java.util.Scanner;
 
public class Referencia{
	private String text;
	private Npc[] monstro;
	private int numero;
	private boolean battle;
	private boolean shop;
	private boolean itenfound;
	private Scanner r;
	//private int opcao;
	
	public String getText() {
		return text;
	}

	public void setMonstro(Npc monstro){
		this.monstro = monstro;
	}
	public void setText(String text) {
		this.text = text;
	}

	public Npc getMonstro() {
		return monstro;
	}

	public void executar(){
		
	}

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public boolean isBattle(Personagem heroi){
		battle = false;
		do{
            		Random d = new Random();
            		int dado1 = d.nextInt(12)+2;
           		System.out.println(monstro.getNomeMonstro() + " Ataca com: " + (dado1 + monstro.getMonstroHab()) + " de Força");
            		int dado2 = d.nextInt(12)+2;
            		System.out.println(heroi.getNome() + " Ataca com " + (dado2 + heroi.getHabilidade()) + " de Força");
            			
			if((heroi.getHabilidade()+dado2)>monstro.getMonstroHab()+dado1){
                		System.out.println("Heroi fere o monstro!\n"
                			+ "Deseja usar sorte? (y/n) Sorte Atual: "+ heroi.getSorteAtual());
                		r = new Scanner(System.in);
                		char lucky = r.nextLine().charAt(0);
                		if((lucky=='y')||(lucky=='Y')){
                			boolean resultSorte = (heroi.usarSorte(heroi.getSorteAtual()));
                			if(resultSorte == true){
                				monstro.setMonstroEner(monstro.getMonstroEner()-4);
                				System.out.println(monstro.getNomeMonstro() + " sofre 4 de dano.");
                				System.out.println("Energia do montro: " + monstro.getMonstroEner());
                			}else{
                				monstro.setMonstroEner(monstro.getMonstroEner()-1);
                				System.out.println(monstro.getNomeMonstro() + " sofre 1 de dano.");
                				System.out.println("Energia do montro: " + monstro.getMonstroEner());
                				}
               			}else{
					monstro.setMonstroEner(monstro.getMonstroEner()-2);
					System.out.println(monstro.getNomeMonstro() + " sofre 2 de dano.");
    				System.out.println("Energia do montro: " + monstro.getMonstroEner());
    			}
			}else if((heroi.getHabilidade()+dado2)==monstro.getMonstroHab()+dado1){
				System.out.println("Ninguém atingido!");
			}else {
                		System.out.println("Heroi ferido!\n"
                			+ "Deseja usar sorte? (y/n) Sorte Atual: "+ heroi.getSorteAtual());
                		r = new Scanner(System.in);
                		char lucky = r.nextLine().charAt(0);
                		if((lucky=='y')||(lucky=='Y')){
                			boolean resultSorte = (heroi.usarSorte(heroi.getSorteAtual()));
                			if(resultSorte == true){
                				heroi.setEnergiaAtual(heroi.getEnergiaAtual()-1);
                				System.out.println(heroi.getNome() + " sofre 1 de dano.");
                				System.out.println("Energia do Heroi: " + heroi.getEnergiaAtual()+"/"+ heroi.getEnergia());
                			}else{
                				heroi.setEnergiaAtual(heroi.getEnergiaAtual()-3);
                				System.out.println(heroi.getNome() + " sofre 3 de dano.");
                				System.out.println("Energia do Heroi: " + heroi.getEnergiaAtual()+"/"+ heroi.getEnergia());
                	}
               			}else{
					heroi.setEnergiaAtual(heroi.getEnergiaAtual()-2);
					System.out.println(heroi.getNome() + " sofre 2 de dano.");
    				System.out.println("Energia do Heroi: " + heroi.getEnergiaAtual()+"/"+ heroi.getEnergia());
    			}
			}
         }while((heroi.getEnergiaAtual()>0) && (monstro.getMonstroEner()>0));
         
	if(heroi.getEnergiaAtual()>monstro.getMonstroEner()){
        	System.out.println("Você derrotou a criatura!");
        	battle = true;
        }
         else{
             System.out.println("Volta pro Dark Souls");
             battle = false;
         }
		return battle;
	}


	public void setBattle(boolean battle) {
		this.battle = battle;
	}


	public boolean isShop() {
		return shop;
	}


	public void setShop(boolean shop) {
		this.shop = shop;
	}


	public boolean isItenfound() {
		return itenfound;
	}
	@Override
	public String toString(){
		String narrativa = text;
		return narrativa;
	}

	public void setItenfound(boolean itenfound) {
		this.itenfound = itenfound;
	}
	
}
