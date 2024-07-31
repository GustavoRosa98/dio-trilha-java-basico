package conta;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		float saldo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem-Vindo ao sistema para cadastro de conta bancária!");
		
		System.out.print("Por favor, informe o seu nome completo: ");
		nomeCliente = scan.nextLine();		

		System.out.print("Por favor, digite o número da conta: ");
		numero = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Por favor, digite o número da agência: ");
		agencia = scan.nextLine();
		
		System.out.print("Por favor, digite o saldo da sua conta: ");
		saldo = scan.nextFloat();
		
		System.out.print("\nOlá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", "
				+ "conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");



	}

}
