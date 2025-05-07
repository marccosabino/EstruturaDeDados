
public class Arvore {
	private No raiz = null;
	
	
	public void buscar(int numero) {
		buscar(raiz, numero);
	
	}
	
	private void buscar(No raiz, int numero) {
		if (raiz == null) {
			System.out.println("Nao achei !!!");
			return;
		}
		
		if (raiz.getNumero() == numero) {
			System.out.println("achei o numero");
			return;
		}
		
		
		if (raiz.getNumero() > numero) {
			
			buscar(raiz.getEsquerda(), numero);
		}else {
			
			buscar(raiz.getDireita(), numero);
		}
		
		
		
	}
	
	
	public void inserir(int numero) {
		raiz = inserir (raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		
		if(raiz == null) {
			return new No(numero, null, null);
		
		}
		
		if (raiz.getNumero() > numero) { 
		raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		
	} else {
		
		raiz.setDireita(inserir(raiz.getDireita(), numero));
	
	}
		
	return raiz;
	
	
	}
	
	public void navegarEmOrdem() {
		navegarEmOrdem(raiz);
	}
	
	
	private void navegarEmOrdem(No raiz) {
		if (raiz == null) {
			return;
		}
		
		navegarEmOrdem(raiz.getEsquerda());
		System.out.print(raiz.getNumero() + ", ");
		navegarEmOrdem(raiz.getDireita());
		
		
	}
	
		
}
