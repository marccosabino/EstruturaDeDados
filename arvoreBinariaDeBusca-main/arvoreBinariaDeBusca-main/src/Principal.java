import java.util.Scanner;

public class Principal {
 public static void main(String[] args) {
	 
	Scanner leitor = new Scanner(System.in);
	Arvore objArvore = new Arvore();
	int opcao = 0;

 do {
	 System.out.println("                   ");
	 System.out.println("+-----------------+");
	 System.out.println("|---Menu Opçoes---|");
	 System.out.println("+-----------------+");
	 System.out.println("|---1 - Inserir---|");
	 System.out.println("|-- 2 - Procurar--|");
	 System.out.println("|- 3 - Randomizar-|");
	 System.out.println("|- 4 - Imprimir --|");
	 System.out.println("|--- 5 - Sair ----|");
	 System.out.println("+-----------------+");
	 
	 opcao = leitor.nextInt();
	 
	 if (opcao == 1) {
		 System.out.print("Digite o numero a ser inserido: ");
		 objArvore.inserir(leitor.nextInt());
	 
	 } else if (opcao == 2) {
		 System.out.print("Digite um numero: ");
		 objArvore.buscar(leitor.nextInt());
		 
	 } else if (opcao == 3) {
		 System.out.print("Digite a quantidade de nós: ");
		 opcao = leitor.nextInt();
		 for (int i = 0 ; i < opcao ; i++) {
			 objArvore.inserir((int) (opcao * Math.random()));
		 
		 }
	 }else if (opcao == 4) {
		 objArvore.navegarEmOrdem();
	 }
	 
 } while (opcao !=5);
 
 leitor.close();
 
 
 
 
 
 
 
 }
}
