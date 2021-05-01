package views;

import java.util.Scanner;

import controllers.FuncionarioController;
import models.Folha;
import models.Funcionario;

public class CadastrarFolha {
	private static Folha folha;
	private static Funcionario funcionario;
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		folha = new Folha();
		funcionario = new Funcionario();
		System.out.println("\n".repeat(20));
		System.out.println("\n-- CADASTRAR FOLHA DE PAGAMENTO -- \n");
		System.out.println("Digite o CPF do funcion�rio:");
		funcionario.setCpf(sc.next());
		if(FuncionarioController.cadastrar(funcionario)) {
			System.out.println("\nN�o � poss�vel prosseguir. Funcion�rio n�o cadastrado!");
		}
		else {
			System.out.println("**Funcion�rio est� cadastrado! Prossiga com o cadastro da Folha de Pagamento.**\n");
			System.out.println("\nDigite o m�s da folha de pagamento:");
			folha.setMes(sc.nextInt());
			System.out.println("\nDigite o ano da folha de oagamento:");
			folha.setHorasT(sc.nextInt());
			System.out.println("\nDigite o n�mero de horas trabalhadas:");
			folha.setHorasT(sc.nextInt());
			System.out.println("\nDigite o valor da hora:");
			folha.setValor(sc.nextDouble());
			
		}
	}
}
