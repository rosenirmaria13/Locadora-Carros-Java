import java.util.Scanner;

public class ProcessaLocacao {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		String[] carros= {"0 - Uno", "1 - HB20","2 - Gol", "3 - FordKa","4 - Onix","5 - BMW","6 - Argo", "7 - Toro", "8 - Jeep", "9 - Pulse", "10 - Renault Kwid"};
		System.out.println("Selecione a opção desejada");
		System.out.println("Opção 1: Mostra todos os carros");
		System.out.println("Opção 2: Escolha o número do carro desejado: ");
		System.out.println("Opção 3: Finaliza o programa");
		int opcao = scan.nextInt();
		
		switch (opcao) {
		case 1: {
			for(int i = 0 ; i<carros.length ; i++) {
				System.out.println(carros[i]);}}
		case 2: {
			System.out.println("Opção 2: Escolha o número do carro desejado: ");
			int i = scan.nextInt();
			System.out.println(carros[i]);}
					
		case 3: {
			System.out.println("Finalizar Programa");}
		
		default: {
			System.out.println("A opção escolhida não existe");}
			
			
		}
	

	}
}

