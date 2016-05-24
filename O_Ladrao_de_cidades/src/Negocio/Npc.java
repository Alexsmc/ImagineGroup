package Negocio;

public class Npc {
	private int MonstroHab;
	private int MonstroEner;
	private String NomeMonstro;
		
	public String getNomeMonstro() {
		return NomeMonstro;
	}
	
	public void setNomeMonstro(String nomeMonstro) {
		NomeMonstro = nomeMonstro;
	}
	
	public int getMonstroHab() {
		return MonstroHab;
	}
	
	public void setMonstroHab(int monstroHab) {
		MonstroHab = monstroHab;
	}
	
	public int getMonstroEner() {
		return MonstroEner;
	}
	
	public void setMonstroEner(int monstroEner) {
		MonstroEner = monstroEner;
	}
	
	@Override
	public String toString(){
		String fichaMonstro = NomeMonstro + "\nHabilidade: " + MonstroHab + "\nEnergia " + MonstroEner;
		return fichaMonstro;
	}
}
