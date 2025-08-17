import java.util.Scanner;

public class Todo {
	public static void addTarefas(Scanner scanner, String[] lista) {
		System.out.print("Qual tarefa você deseja criar ou alterar? (1 até 5): ");
		int tarefa = scanner.nextInt();
		scanner.nextLine();
		if (tarefa > 5 || tarefa < 1) {
			System.out.println("Entrada inválida.");
		} else { 
			System.out.printf("Insira aqui a tarefa %d: ", tarefa);
			lista[tarefa - 1] = scanner.nextLine();
		}
	}

	public static void mostraMenu() {
		System.out.println("==========Menu==========");
		System.out.println("1 - Adicionar/Alterar Tarefa");
		System.out.println("2 - Listar Tarefas");
		System.out.println("3 - Remover Tarefa");
		System.out.println("0 - Sair");
		System.out.println("========================");
		System.out.print("Sua escolha: ");
	}

	public static void listaTarefas(String[] lista) {
		for (int i = 0; i <= 4; i++) {
			System.out.printf("%d - %s\n",(i + 1),lista[i]);
		}
	}

	public static void apagaTarefa(String[] lista, Scanner scanner) {
		System.out.print("Deseja apagar qual tarefa?: ");
		int paraApagar = scanner.nextInt();
		scanner.nextLine();
		if (paraApagar > 5 || paraApagar < 1) {
			System.out.println("Entrada inválida.");
		} else {
			lista[paraApagar - 1] = "Tarefa não atribuída.";
			System.out.println("Tarefa apagada com sucesso.");
		}
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int escolha = 5;
	String[] lista = new String[5];
	for (int i = 0; i <= 4; i++) {
		lista[i] = "Tarefa não atribuída.";
	}

		while (escolha != 0){
			mostraMenu();
			escolha = sc.nextInt();
			sc.nextLine();
			switch (escolha) {
				case 1:
					addTarefas(sc, lista);	
					break;		
				case 2:
					listaTarefas(lista);
					break;
				case 3:
					apagaTarefa(lista, sc);
					break;
				case 0:
					System.out.println("Obrigado por usar minha lista to-do!");	
					break;
				default :
					System.out.println("Entrada inválida.");
					break;
			}
		}
		sc.close();
	}
}