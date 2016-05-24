 package Negocio;
 
 import java.util.Random;
import java.util.Scanner;
 
public class Referencia{
	private String text;
	private int numero;
	private boolean battle;
	private boolean shop;
	private boolean itenfound;
	private String decisao1, decisao2, decisao3, decisao4;
	//private int opcao;
	
	
	public String getDecisao1() {
		return decisao1;
	}


	public void setDecisao1(String decisao1) {
		this.decisao1 = decisao1;
	}


	public String getDecisao2() {
		return decisao2;
	}


	public void setDecisao2(String decisao2) {
		this.decisao2 = decisao2;
	}


	public String getDecisao3() {
		return decisao3;
	}


	public void setDecisao3(String decisao3) {
		this.decisao3 = decisao3;
	}


	public String getDecisao4() {
		return decisao4;
	}


	public void setDecisao4(String decisao4) {
		this.decisao4 = decisao4;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public boolean isBattle(Personagem heroi, Npc monstro) {
		battle = false;
		do{
            		Random d = new Random();
            		int dado1 = d.nextInt(12)+2;
           		System.out.println(monstro.getNomeMonstro() + "Ataca com: " + (dado1 + monstro.getMonstroHab()) + "de Força");
            		int dado2 = d.nextInt(12)+2;
            		System.out.println(heroi.getNome() + "Ataca com " + (dado2 + heroi.getHabilidade()) + "de Força");
            			
			if((heroi.getHabilidade()+dado2)>monstro.getMonstroHab()+dado1){
                		System.out.println("Heroi fere o monstro! "
                			+ "Deseja usar sorte? (y/n)");
                		Scanner escolher = new Scanner(System.in);
                		String lucky = escolher.nextLine();
                		if((lucky=="y")||(lucky=="Y")){
                			boolean resultSorte = (heroi.usarSorte(heroi.getSorteAtual()));
                			if(resultSorte == true){
                				monstro.setMonstroEner(monstro.getMonstroEner()-4);
                			}else{
                				monstro.setMonstroEner(monstro.getMonstroEner()-1);
					}
               			}else{
					monstro.setMonstroEner(monstro.getMonstroEner()-2);	
				}
			}else {
                		System.out.println("Heroi ferido! "
                			+ "Deseja usar sorte? (y/n)");
                		Scanner escolher = new Scanner(System.in);
                		String lucky = escolher.nextLine();
                		if((lucky=="y")||(lucky=="Y")){
                			boolean resultSorte = (heroi.usarSorte(heroi.getSorteAtual()));
                			if(resultSorte == true){
                				heroi.setEnergiaAtual(heroi.getEnergiaAtual()-1);
                			}else{
                				heroi.setEnergiaAtual(heroi.getEnergiaAtual()-3);
					}
               			}else{
					heroi.setEnergiaAtual(heroi.getEnergiaAtual()-2);	
				}
			}
         }while((heroi.getEnergiaAtual()>=0) || (monstro.getMonstroEner()>=0));
         
	if(heroi.getEnergiaAtual()>monstro.getMonstroEner()){
        	System.out.println("Você derrotou a criatura");
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
		String narrativa = text + decisao1 + decisao2 + decisao3;
		return narrativa;
	}

	public void setItenfound(boolean itenfound) {
		this.itenfound = itenfound;
	}

}
