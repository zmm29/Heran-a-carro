package model;

public class Moto extends Veiculo{
	
	public String transmissao;
	public Moto (String pMarca, String pModelo, String pTransmissao) {
		super (pMarca, pModelo);
		
		this.transmissao = pTransmissao;
		setTipo("Moto");
		
	}
	
	public void setTransmissao(String pTransmissao) {
		this.transmissao = pTransmissao;
	}
	public String getTransmissao () {
		return transmissao;
	}

}