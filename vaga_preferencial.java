package exercicios_prof_ohata;
import java.util.Scanner;

public class vaga_preferencial {

	public static void main(String[] args) {
		//Titulo do exercicio
		System.out.print("Exerc�cio - Voc� pode estacionar na vaga preferencial ?\n\n");
		
		//Declaracao de variavei
		int resposta; 
		
		//Declaracao de Scanner que sera usado para entrada de dados
		Scanner input = new Scanner(System.in);
		
		//Entrada de dados de resposta
		System.out.println("Voc� � um(a) idoso(a) ou uma gestante ou possu� uma defici�ncia ? \nSim(0)\nNao(1)");
		resposta = input.nextInt();
		
		//Conferindo resposta do usu�rio
		if (resposta == 0) {
			System.out.println("Voc� pode estacionar!!!");
		}
		else {
			System.out.println("Voc� n�o pode estacionar!!!");
		}
	}
}

