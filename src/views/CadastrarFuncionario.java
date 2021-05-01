package views;

import java.util.Scanner;

import controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFuncionario {
	
	private static Scanner sc = new Scanner(System.in);
	private static Funcionario funcionario;
	
	public static void renderizar() {
		System.out.println("\n".repeat(15));
		funcionario = new Funcionario();
		System.out.println("\n-- CADASTRAR FUNCIONÁRIO --\n");
		System.out.println("\nDigite o nome do funcionário:");
		funcionario.setNome(sc.next());
		System.out.println("\nDigite o CPF do funcionário:");
		funcionario.setCpf(sc.next());
		if(FuncionarioController.cadastrar(funcionario)) {
			System.out.println("\nDigite a data de nascimento do funcionário:");
			funcionario.setData(sc.next());
			System.out.println("Funcionário cadastrado com sucesso!");
		}else {
			System.out.println("Esse funcionário já existe!");
		}		

	}
}