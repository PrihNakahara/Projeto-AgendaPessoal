import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	
	private int qtdAmigos;
	private int qtdConhecidos;
	ArrayList<Pessoa> listPessoa;
	
	public Agenda(int qtdpessoa) {
		listPessoa = new ArrayList<Pessoa>();
		for(int i=0;i<qtdpessoa;i++) {
			int valor = (1 + (int) (Math.random() * 2));
			if (valor == 1) {
				Amigo amigo = new Amigo();
				listPessoa.add(amigo);
			}
			else {
				Conhecido conhecido = new Conhecido();
				listPessoa.add(conhecido);
			}
		}
		addInformacoes();
	}

	public int getQtdAmigos() {
		return qtdAmigos;
	}

	public int getQtdConhecidos() {
		return qtdConhecidos;
	}

	public ArrayList<Pessoa> getListPessoa() {
		return listPessoa;
	}

	public void addInformacoes() {

		for (Pessoa pessoa : listPessoa) {

			if(Amigo.class.equals(pessoa.getClass())) {
				Amigo amigo = (Amigo) pessoa;
				Scanner in = new Scanner(System.in);
				
				System.out.println("***Dados Amigo***");
				System.out.println("Digite o nome:");
				String nome = in.next();
				amigo.setNome(nome);
				System.out.println("Digite a idade:");
				int idade = in.nextInt();
				amigo.setIdade(idade);
				System.out.println("Digite a Data de Anivers�rio:");
				String dtAniversario1 = in.next();
				amigo.setDtAniversario(dtAniversario1);
			}else {
				Conhecido conhecido = (Conhecido) pessoa;
				Scanner in = new Scanner(System.in);
				
				System.out.println("***Dados Conhecido***");
				System.out.println("Digite o nome:");
				String nome = in.next();
				conhecido.setNome(nome);
				System.out.println("Digite a idade:");
				int idade = in.nextInt();
				conhecido.setIdade(idade);
				System.out.println("Digite o E-mail:");
				String email1 = in.next();
				conhecido.setEmail(email1);
			}
		}
		ImprimeAniversarios();
		ImprimeEmails();
	}
	
	public void ImprimeAniversarios() {
		
		int cont = 0;
		
		for (Pessoa pessoa : listPessoa) {
			if(Amigo.class.equals(pessoa.getClass())){
				Amigo amigo = (Amigo) pessoa;
				if (!amigo.getDtAniversario().equals("indefinido")) {
					System.out.println("Todas as Datas de Anivers�rio:");
					System.out.println(amigo.getDtAniversario());
				}
			cont++;
			}
		}
		System.out.println("N�mero de Amigos: "+ cont);
	}
	
	public void ImprimeEmails() {
		
		int cont = 0;
		
		for (Pessoa pessoa : listPessoa) {
			if(Conhecido.class.equals(pessoa.getClass())){
				Conhecido conhecido = (Conhecido) pessoa;
				if (!conhecido.getEmail().equals("indefinido")) {
					System.out.println("Todos os E-mails:");
					System.out.println(conhecido.getEmail());
				}
			cont++;
			}
		}
		System.out.println("N�mero de Conhecidos: "+ cont);
	}
}
