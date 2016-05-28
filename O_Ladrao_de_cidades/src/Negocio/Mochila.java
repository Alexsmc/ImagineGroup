package Negocio;

public class Mochila {

	private boolean escudo;
	private boolean cotaDeMalha;
	private boolean espada;
	private boolean brocheEscorpiao;
	private boolean anelDeFogo;
	private boolean pulseiraDoInseto;
	private boolean flechaDePrata;
	private boolean facaDeLancamento;
	private boolean elmoComAsas;
	private int provisao;
	
	
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
	public int getProvisao() {
		return provisao;
	}
	public void setProvisao(int provisao) {
		this.provisao = provisao;
	}
	public void usarProvisao(Personagem heroi){
		this.provisao--;
		heroi.setEnergiaAtual(heroi.getEnergiaAtual()+4);
	}
	public boolean isPulseiraDoInseto() {
		return pulseiraDoInseto;
	}
	public void setPulseiraDoInseto(boolean pulseiraDoInseto) {
		this.pulseiraDoInseto = pulseiraDoInseto;
	}
	public boolean isFlechaDePrata() {
		return flechaDePrata;
	}
	public void setFlechaDePrata(boolean flechaDePrata) {
		this.flechaDePrata = flechaDePrata;
	}
	public boolean isFacaDeLancamento() {
		return facaDeLancamento;
	}
	public void setFacaDeLancamento(boolean facaDeLancamento) {
		this.facaDeLancamento = facaDeLancamento;
	}
	public boolean isElmoComAsas() {
		return elmoComAsas;
	}
	public void setElmoComAsas(boolean elmoComAsas) {
		this.elmoComAsas = elmoComAsas;
	}
	
}
