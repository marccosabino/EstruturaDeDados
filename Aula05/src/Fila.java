public class Fila {
	//Propriedades da classe
	private No cabeca = null;
	
	//Métodos da classe
	public void entrar(int numero) {
		cabeca = new No(numero, cabeca);
		
	}
	public void sair() {
		//Cenário muito fácil: fila vazia
		if(cabeca == null) {
			return;
		}
		
		//Cenário fácil: fila só tem um único nó
		if(cabeca.getProximo() == null) {
			System.out.println(cabeca.getNumero());
			cabeca = null;
			return;
		}
		
		//Cenário difícil: fila tem mais de um nó
		No penultimo = cabeca;
		while (penultimo.getProximo().getProximo() != null) {
			penultimo = penultimo.getProximo();
		}
		System.out.println(penultimo.getProximo().getNumero());
		penultimo.setProximo(null);
	}

}
