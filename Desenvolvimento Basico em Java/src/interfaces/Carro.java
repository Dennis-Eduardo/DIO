package interfaces;

public class Carro {
	
	private Integer qPessoas;

	
	
	public Carro(Integer qPessoas) {
		this.qPessoas = qPessoas;
	}



	public Integer getqPessoas() {
		return qPessoas;
	}



	public void setqPessoas(Integer qPessoas) {
		this.qPessoas = qPessoas;
	}
	
	public void addPessoas(int pessoa) {
		this.qPessoas += pessoa;
	}
	
	public void removePessoas(int pessoa) {
		this.qPessoas -= pessoa;
	}
	
	

}
