import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Lista objLista = new Lista();
		int opcao = 0;
		
		while (opcao != 4) {
			System.out.println("+================+");
			System.out.println("| Menu de Opções |");
			System.out.println("+================+");
			System.out.println("|  1 - Inserir   |");
			System.out.println("|  2 - Excluir   |");
			System.out.println("|  3 - Imprimir  |");
			System.out.println("|  4 - Sair      |");
			System.out.println("|  5 - Explodir  |");
			System.out.println("+================+");
			System.out.println("Digite a sua opção: ");
			opcao = leitor.nextInt();
			
			switch (opcao ) {
			case 1:
				System.out.println("Digite um número: ");
				objLista.inserir(leitor.nextInt());
				break;
				
			case 2:
				System.out.println("Digite um número: ");
				objLista.excluir(leitor.nextInt());
				
			case 3:
				objLista.imprimir();
				break;
				
			case 5:
				for (int i = 0; i < 1000000; i++) {
					objLista.inserir(i);
				}
				break;
			}
		}
		
		leitor.close();
		
	}

}
