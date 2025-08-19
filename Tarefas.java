import java.util.Scanner;
import java.util.ArrayList;

public class Tarefas {
	public ArrayList<String> listaDeTarefas = new ArrayList<>();
	public int contagemDeTarefas = 0;
	public String setTask;

	void apagaTarefa(Scanner scanner) {
		System.out.print("Deseja apagar qual tarefa?: ");
		int paraApagar = scanner.nextInt();
		scanner.nextLine();
		if (paraApagar > listaDeTarefas.size() || paraApagar < 1) {
			System.out.println("Entrada inválida.");
		} else {
			listaDeTarefas.remove((paraApagar-1));
			System.out.println("Tarefa apagada com sucesso.");
			contagemDeTarefas--;
		}
	}
	
	void listaTarefas() {
		if (listaDeTarefas.size() == 0) {
			System.out.println("Ainda não há nenhuma tarefa. Que tal adicionar alguma?");
		} else {
			for (int i = 0; i < contagemDeTarefas; i++) {
				System.out.printf("%d - %s\n",(i + 1),listaDeTarefas.get(i));
			}
		}
	}

	void addTarefas(Scanner scanner) {
			System.out.printf("Insira aqui a tarefa %d: ", (contagemDeTarefas + 1));
			setTask = scanner.nextLine();
			listaDeTarefas.add(setTask);
			contagemDeTarefas++;
	}
}