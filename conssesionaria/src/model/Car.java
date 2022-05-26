package model;

public class Car extends Veiculo{
	
	public int numPortas;
	public Car (String pMarca, String pModelo, int pNumPortas) {
		super (pMarca, pModelo);
		
		this.numPortas = pNumPortas;
		setTipo("Carro");
		
		
		
	}
	
	public void setNumPortas(int pNumPortas) {
		this.numPortas = pNumPortas;
	}
	public int getNumPortas () {
		return numPortas;
	}

}
