import java.util.Scanner;

public class Todo {

	public static void mostraMenu() {
		System.out.println("==========Menu==========");
		System.out.println("1 - Adicionar tarefa");
		System.out.println("2 - Listar Tarefas");
		System.out.println("3 - Remover Tarefa");
		System.out.println("0 - Sair");
		System.out.println("========================");
		System.out.println("");
		System.out.print("Sua escolha: ");
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Tarefas tarefas = new Tarefas();
	int escolha = 5;

		while (escolha != 0){
			mostraMenu();
			escolha = sc.nextInt();
			System.out.println("");
			sc.nextLine();
			switch (escolha) {
				case 1:
					tarefas.addTarefas(sc);	
					System.out.println("");
					break;		
				case 2:
					System.out.println("");
					System.out.println("=====LISTA DE TAREFAS=====");
					tarefas.listaTarefas();
					System.out.println("==========================");
					System.out.println("");
					break;
				case 3:
					tarefas.apagaTarefa(sc);
					System.out.println("");
					break;
				case 0:
					System.out.println("Obrigado por usar minha lista to-do!");	
					break;
				default:
					System.out.println("");
					System.out.println("Entrada inválida.");
					break;
			}
		}
		sc.close();
	}
}
