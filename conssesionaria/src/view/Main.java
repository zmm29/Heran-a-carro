package view;
import model.Veiculo;
import model.Moto;
import model.Car;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com a tipo: ");	
		String tipo = input.nextLine();
		if (tipo == 1) {
			System.out.println("Entre com a marca: ");
			String marca = input.nextLine();
			System.out.println("Entre com a modelo: ");
			String modelo = input.nextLine();
			System.out.println("Entre com a transmissão: ");
			String transmissao = input.nextLine();
		}else {
			System.out.println("Entre com a marca: ");
			String marca = input.nextLine();
			System.out.println("Entre com a modelo: ");
			String modelo = input.nextLine();
			System.out.println("Entre com a numero de portas: ");
			String numPortas = input.nextLine();
		}
	
		Veiculo veiculo1 = new Veiculo(marca, modelo);
		
		System.out.println(veiculo1.getTipo());
		System.out.println(veiculo1.getMarca());
		System.out.println(veiculo1.getModelo());
		
	}

}
