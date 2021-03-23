package questao3;

public class Aluno {
	
	private int frequencia;
	private float n1, n2, n3;
	private float exame;
	
	public Aluno(float n1, float n2, float n3) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	public Aluno(float exame) {
		super();
		this.exame = exame;
	}

	public Aluno(int frequencia) {
		super();
		this.frequencia = frequencia;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float getN3() {
		return n3;
	}

	public void setN3(float n3) {
		this.n3 = n3;
	}

	public float getExame() {
		return exame;
	}

	public void setExame(float exame) {
		this.exame = exame;
	}
	
	public String frequenciaAluno() {
			if(frequencia>=75) {
		return "Frequência maior ou igual a 75%.";
	}
	return "Reprovado por frequência menor que 75%.";
	}
	
	public String calculaNota() {
		float notaFinal = (n1+n2+n2)/3;
		
		if (notaFinal<4) {
			return "Reprovado por nota abaixo de 4.";
			
		}
		else if ((notaFinal>=4) && (notaFinal<7)) {
			return "Vai para exame.";
		}
		else {
			return "Aprovado sem exame.";
		}
	}
	
	public String calculaExame() {
		float notaFinal = (n1+n2+n2)/3;
		float notaFinalExame = (notaFinal+exame)/2;
		
		if (notaFinalExame <6) {
			return "Reprovado pelo exame.";
		}
		else {
			return "Aprovado pelo exame.";
		}
	}
	

}
