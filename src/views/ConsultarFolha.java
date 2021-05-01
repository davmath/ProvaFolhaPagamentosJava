package views;

import java.util.Scanner;

import controllers.FuncionarioController;
import models.Folha;
import models.Funcionario;

public class ConsultarFolha {
	private static Folha folha;
	private static Funcionario funcionario;
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		folha = new Folha();
		funcionario = new Funcionario();
		System.out.println("\n".repeat(20));
		System.out.println("\n-- CONSULTAR FOLHA DE PAGAMENTO -- \n");
		System.out.println("Digite o CPF do funcionário:");
		funcionario.setCpf(sc.next());
		
		//SALÁRIO BRUTO
		double salarioBruto =  folha.getHorasT()*folha.getValor();
		System.out.println("SALÁRIO BRUTO = " + salarioBruto);
		
		//IMPOSTO DE RENDA
		
		if (salarioBruto <= 1903.98) {
			System.out.println("IMPOSTO DE RENDA = " + (salarioBruto));
		}
		else if(salarioBruto > 1903.98 && salarioBruto <= 2826.65) {
			System.out.println("IMPOSTO DE RENDA = " + (salarioBruto*0.075));
		}
		else if(salarioBruto > 2826.65 && salarioBruto <= 3751.05) {
			System.out.println("IMPOSTO DE RENDA = " + (salarioBruto*0.15));
		}
		else if(salarioBruto > 3751.05 && salarioBruto <= 4664.68) {
			System.out.println("IMPOSTO DE RENDA = " + (salarioBruto*0.225));
		}
		else if(salarioBruto > 4664.68) {
			System.out.println("IMPOSTO DE RENDA = " + (salarioBruto*0.275));
		}
		
		//INSS
		
		if (salarioBruto <= 1693.72) {
			System.out.println("DESCONTO INSS = " + (salarioBruto * 0.08));
		}
		else if(salarioBruto >1693.72 && salarioBruto <= 2822.90) {
			System.out.println("DESCONTO INSS = " + (salarioBruto * 0.09));
		}
		else if(salarioBruto >2822.90 && salarioBruto <= 5645.80) {
			System.out.println("DESCONTO INSS = " + (salarioBruto * 0.11));
		}
		else {
			System.out.println("DESCONTO INSS = " + (salarioBruto - 621.03));
		}
		
		//FGTS
		
		System.out.println("FGTS = " + (salarioBruto * 0.08));
		
		
		
		
	}
}
