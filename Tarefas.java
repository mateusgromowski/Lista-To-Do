import java.util.Scanner;
import java.util.ArrayList;

class Tarefas {
	public ArrayList<String> listaDeTarefas = new ArrayList<>();
	public ArrayList<Boolean> isCompleta = new ArrayList<>();
	public int contagemDeTarefas = 0;
	public int compOuIncomp;

	void apagaTarefa(Scanner scanner) {
		System.out.print("Deseja apagar qual tarefa?: ");
		int paraApagar = scanner.nextInt();
		scanner.nextLine();
		if (paraApagar > listaDeTarefas.size() || paraApagar < 1) {
			System.out.println("Entrada inválida.");
		} else {
			listaDeTarefas.remove(paraApagar - 1);
			isCompleta.remove(paraApagar - 1);
			System.out.println("Tarefa apagada com sucesso.");
			contagemDeTarefas--;
		}
	}
	
	void listaTarefas() {
		if (listaDeTarefas.size() == 0) {
			System.out.println("Ainda não há nenhuma tarefa. Que tal adicionar alguma?");
		} else {
			for (int i = 0; i < contagemDeTarefas; i++) {
				if (isCompleta.get(i)) {
					System.out.printf("%d - %s - Completa\n",(i + 1),listaDeTarefas.get(i));
				} else {
					System.out.printf("%d - %s - Incompleta\n",(i + 1),listaDeTarefas.get(i));
				}
			}
		}
	}

	void addTarefas(Scanner scanner) {
			System.out.printf("Insira aqui a tarefa %d: ", (contagemDeTarefas + 1));
			String setTask = scanner.nextLine();
			listaDeTarefas.add(setTask);
			isCompleta.add(false);
			contagemDeTarefas++;
	}

	void completaTarefa(Scanner scanner) {
		if (listaDeTarefas.size() == 0) {
			System.out.println("Ainda não há nenhuma tarefa. Que tal adicionar alguma?");		
		} else {
			System.out.print("Qual tarefa você deseja marcar como completa?: ");
			compOuIncomp = scanner.nextInt();
			if (compOuIncomp < 1 || listaDeTarefas.size() < (compOuIncomp)) {
				System.out.println("Entrada inválida.");
			} else if (isCompleta.get(compOuIncomp - 1) == true) {
					System.out.println("Essa tarefa já está completa.");
				} else {
					isCompleta.set((compOuIncomp - 1), true);
					System.out.println("Tarefa marcada com sucesso.");
				}
			}
		}
	}

	void marcaIncompleta(Scanner scanner) {
		if (listaDeTarefas.size() == 0) {
			System.out.println("Ainda não há nenhuma tarefa. Que tal adicionar alguma?");		
		} else {
			System.out.print("Qual tarefa você deseja marcar como incompleta?: ");
			compOuIncomp = scanner.nextInt();
			if (compOuIncomp < 1 || listaDeTarefas.size() < (compOuIncomp)) {
				System.out.println("Entrada inválida.");
			} else if (isCompleta.get(compOuIncomp - 1) == false) {
					System.out.println("Essa tarefa já está incompleta.");
				} else {
					isCompleta.set((compOuIncomp - 1), false);
					System.out.println("Tarefa desmarcada com sucesso.");
				}
			}
		}		
	}
}
