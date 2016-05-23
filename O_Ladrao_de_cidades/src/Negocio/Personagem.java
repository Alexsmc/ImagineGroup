package Negocio;
import java.util.Random;

public class Personagem {
	private String nome;
	private int energia; // Vida do personagem;
	private int habilidade; // Poder de força do personagem;
	private int sorte; // O quanto de sorte ele tem;
	private int ouro; // o quanto de ouro lhe possui;
	
	
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
		this.sorte = sorte;  // por definição o personagem tem como sorte a soma de 1d6 + 6;
	}
	public int getOuro() {
		return ouro;
	}
	public void setOuro(int ouro) {
		this.ouro = ouro; // o ouro é conquistado durante a ventura;
	}
	
	public boolean usarSorte(int sorte){
		boolean resultado = false;
		Random d = new Random();
		int dado = d.nextInt(12)+2;
		if(sorte>=dado){
			sorte--;
			resultado = true;
		}else{
			sorte--;
		}
		
		return resultado;
		
	}
	
	
	
}
