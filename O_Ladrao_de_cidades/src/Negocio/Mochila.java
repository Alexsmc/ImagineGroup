package Negocio;

public class Mochila {

	private boolean escudo;
	private boolean cotaDeMalha;
	private boolean espada;
	private boolean brocheEscorpiao;
	private boolean anelDeFogo;
	
	
	
	public boolean isEscudo(Personagem heroi) {
		if(this.escudo==true){
			heroi.setHabilidade(heroi.getHabilidade()+1);
			return escudo;
		}else{
			heroi.setHabilidade(heroi.getHabilidade()-1);
			return escudo;
		}
		
	}
	public void setEscudo(boolean escudo) {
		this.escudo = escudo;
	}
	public boolean isCotaDeMalha(Personagem heroi) {
		if(this.cotaDeMalha==true){
			heroi.setHabilidade(heroi.getHabilidade()+2);
			return cotaDeMalha;
		}else{
			heroi.setHabilidade(heroi.getHabilidade()-2);
			return cotaDeMalha;
		}
		
	}
	public void setCotaDeMalha(boolean cotaDeMalha) {
		this.cotaDeMalha = cotaDeMalha;
	}
	public boolean isEspada() {
		return espada;
	}
	public void setEspada(boolean espada) {
		this.espada = espada;
	}
	public boolean isBrocheEscorpiao(Personagem heroi) {
		if(this.brocheEscorpiao==true){
			heroi.setEnergiaAtual(heroi.getEnergiaAtual()+1);
		}
		return brocheEscorpiao;
	}
	public void setBrocheEscorpiao(boolean brocheEscorpiao) {
		this.brocheEscorpiao = brocheEscorpiao;
	}
	public boolean isAnelDeFogo() {
		return anelDeFogo;
	}
	public void setAnelDeFogo(boolean anelDeFogo) {
		this.anelDeFogo = anelDeFogo;
	}
	
	
}
