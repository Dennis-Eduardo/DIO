package aplicacao;

import interfaces.Carro;

public class Ex1 {
	
	public static void main(String []args) {
		Carro carro = new Carro(1);
		
		System.out.println(carro.getqPessoas());
		carro.addPessoas(2);
		System.out.println(carro.getqPessoas());
		carro.removePessoas(1);
		System.out.println(carro.getqPessoas());
	}

}
