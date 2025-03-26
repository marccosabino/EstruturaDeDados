public class No {	
	//Propriedades da classe
	private int numero = 0;
	private No proximo = null;
	
	//Métodos da classe
	public void entrar(int numero, boolean preferencial) {
		
	}
	
	public No() {
		super();
	}
	
	public No(int numero, No proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
}