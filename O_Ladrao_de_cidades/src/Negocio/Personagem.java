package Negocio;
import java.util.Random;
import java.util.Scanner;

public class Personagem {
	private String nome;
	private int energia; // Vida do personagem;
	private int habilidade; // Poder de força do personagem;
	private int sorte; // O quanto de sorte ele tem;
	private int ouro; // o quanto de ouro lhe possui;
	private int energiaAtual;
	private int sorteAtual;
	private Scanner r;
	
	
	public int getEnergiaAtual() {
		return energiaAtual;
	}
	public void setEnergiaAtual(int energiaAtual) {
		if(energiaAtual>energia){
			this.energiaAtual = energia;
		}else{
			this.energiaAtual = energiaAtual;
		}
	}
	public int getSorteAtual() {
		return sorteAtual;
	}
	public void setSorteAtual(int sorteAtual) {
		if(sorteAtual>sorte){
			this.sorteAtual = sorte;
		}else if(sorteAtual<=1){
			this.sorteAtual=1;
		}else{
			this.sorteAtual = sorteAtual;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) { // O numero entrará ramdomicamente de 2 - 12;
		this.energia = energia + 12; // por definição o personagem tem como energia a soma de 2d6 + 12;
	}
	public int getHabilidade() {
		return habilidade;
	}
	public void setHabilidade(int habilidade) { // O numero entrará ramdomicamente de 1 - 6;
		this.habilidade = habilidade + 6; // por definição o personagem tem como habilidade a soma de 1d6 + 6;
	}
	public int getSorte() {
		return sorte;
	}
	public void setSorte(int sorte) { // O numero entrará ramdomicamente de 1 - 6;
		this.sorte = sorte + 6;  // por definição o personagem tem como sorte a soma de 1d6 + 6;
	}
	public int getOuro() {
		return ouro;
	}
	public void setOuro(int ouro) {
		this.ouro = ouro; // o ouro é conquistado durante a ventura;
	}
	
	public boolean usarSorte(int sorteAtual){
		boolean resultado = false;
		Random d = new Random();
		int dado = d.nextInt(12)+2;
		if(sorteAtual>=dado){
			this.sorteAtual--;
			resultado = true;
		}else{
			this.sorteAtual--;
		}
		
		return resultado;
		
	}
	
	@Override
	public String toString(){
		String ficha = "Nome: " + nome +"\n"
				+ "Habilidade: " + habilidade +"\n"  
				+ "Energia: " + energiaAtual + "/" + energia +"\n"
				+ "Sorte: " + sorteAtual +"/"+ sorte + "\n"
				+ "Ouro: " + ouro + "g";
		return ficha;
	}
	
	public void oferecerProvisao(Mochila mochila, Personagem heroi){
		System.out.println("Energia Atual: " + heroi.getEnergiaAtual() + "/" + heroi.getEnergia());
		System.out.println("Deseja usar provisões? (y/n)"+ "("+ mochila.getProvisao() +")");
		int quantidade=0;
		r = new Scanner(System.in);
		char decisao = r.nextLine().charAt(0);
		if(decisao == 'y'|| decisao == 'Y'){
			if(mochila.getProvisao()<=0){
				System.out.println("Você não tem provisões.");
			}else{
			do{
				System.out.println("Quantas deseja usar? Possui(" + mochila.getProvisao() + ")");
				quantidade = r.nextInt();
			}while(quantidade<=mochila.getProvisao());
				for(int x=0; x<quantidade;x++){
					mochila.usarProvisao(heroi);
					System.out.println("Você Recuperou 4 de energia!");
				}
				System.out.println("Energia: " + heroi.getEnergiaAtual() + "/" + heroi.getEnergia());
			}
		}
	}
}
