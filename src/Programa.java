import java.util.Scanner;

public class Programa {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		String funcionario;
		String setor;
		double salario;
		int abono;
		double total;
		double soma;
		
		System.out.println("Nome do funcionario: ");
		funcionario = sc.nextLine();
		
		System.out.println("Qual setor do funcionario: ");
		setor = sc.nextLine();
		
		System.out.println("Qual o salario no fuincionario? ");
		salario = sc.nextDouble();
		
		System.out.println("Qual o valor do abono?");
		abono = sc.nextInt();
		
		total = salario * abono / 100;
		soma = salario + total;
		
		
		System.out.println("O " + funcionario + " do setor "+ setor +" teve " + abono + 
				" porcento de aumento em seu salario, no valor de R$  " + total + " totalizando R$ " + soma );
		
		
		
	}

}
