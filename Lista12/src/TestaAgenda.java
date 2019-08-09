import java.util.Scanner;

public class TestaAgenda {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantas pessoas vc quer adicionar?");
		int qtdPessoas = in.nextInt();
		Agenda agenda = new Agenda(qtdPessoas);
	}

}
