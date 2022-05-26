package model;

public class Veiculo {
	private String marca;
	private String modelo;
	private String tipo;
	
	public Veiculo (String pMarca, String pModelo) {
		this.marca = pMarca;
		this.modelo = pModelo;
	}
	
	public void setMarca(String pMarca) {
		this.marca = pMarca;
	}
	
	public void setModelo(String pModelo) {
		this.modelo = pModelo;
	}
	
	public String getMarca () {
		return marca;
	}
	
	public String getModelo () {
		return modelo;
	}
	
	protected void setTipo (int pTipo) {
		this.tipo = pTipo;
	}
	
	public int getTipo () {
		return tipo;
	}

}
