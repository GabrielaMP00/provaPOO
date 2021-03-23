package questao3;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		int frequenciaAux;
		float n1Aux, n2Aux, n3Aux, exameAux;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a frequência do aluno? Considere valor entre 0 e 100. ");
		
		frequenciaAux = entrada.nextInt();
		Aluno af = new Aluno(frequenciaAux);
		System.out.println(af.frequenciaAluno());
		
		System.out.println("\nInsira as três notas do(a) aluno(a): ");
		
		n1Aux = entrada.nextFloat();
		n2Aux = entrada.nextFloat();
		n3Aux = entrada.nextFloat();
		Aluno a = new Aluno(n1Aux, n2Aux, n3Aux);
		System.out.println(a.calculaNota());
		
		System.out.println("\nInsira nota do exame: ");
		
		exameAux = entrada.nextFloat();
		Aluno ae = new Aluno(exameAux);
		System.out.println(ae.calculaExame());
		
		entrada.close();
	}

}
