package Negocio;
import java.util.Random;

public class Batalha {
	private Npc monstro;
	private Personagem personagem;
	
	public Npc getMonstro() {
		return monstro;
	}

	
	public Personagem getPersonagem() {
		return personagem;
	}

	public boolean Batalha(Personagem personagem, Npc monstro){
		
		this.personagem = personagem;
		this.monstro = monstro;
		boolean resultado=true;//em construção...
		
		return resultado;
		
	}
	
	
}
