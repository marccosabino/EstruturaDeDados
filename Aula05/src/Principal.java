public class Principal {
	public static void main(String[] args) {
		Fila objFila = new Fila();
		System.out.println("====== Fila ======");
		for (int i = 0; i < 10000; i++) {
			objFila.entrar(i);
		}
		for (int i = 0; i < 10000; i++) {
			objFila.sair();
		}
		
		System.out.println();
		System.out.println("====== Pilha ======");
		Pilha objPilha = new Pilha();
		for (int i = 0; i < 100000; i++) {
			objPilha.push(i);
		}
		for (int i = 0; i < 100000; i++) {
			objPilha.pop();
		}
	}

}
