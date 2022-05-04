package exercicios_prof_ohata;
import java.util.Scanner;

public class vaga_preferencial {

	public static void main(String[] args) {
		//Titulo do exercicio
		System.out.print("Exercício - Você pode estacionar na vaga preferencial ?\n\n");
		
		//Declaracao de variavei
		int resposta; 
		
		//Declaracao de Scanner que sera usado para entrada de dados
		Scanner input = new Scanner(System.in);
		
		//Entrada de dados de resposta
		System.out.println("Você é um(a) idoso(a) ou uma gestante ou possuí uma deficiência ? \nSim(0)\nNao(1)");
		resposta = input.nextInt();
		
		//Conferindo resposta do usuário
		if (resposta == 0) {
			System.out.println("Você pode estacionar!!!");
		}
		else {
			System.out.println("Você não pode estacionar!!!");
		}
	}
}

