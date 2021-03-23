package questao1e2;

public class Estudante {
	
	private int matricula;
	private String nome;
	private char sexo;
	private boolean bolsista;
	
	public Estudante(int matricula, String nome, char sexo, boolean bolsista) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.bolsista = bolsista;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNomeString(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isBolsista() {
		return bolsista;
	}

	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}
	
	public String toString() {
		return "Número de matrícula: "+matricula+"\nNome: "+nome+"\nSexo: "+sexo+"\nÉ bolsista: "+bolsista;
		
	}
	
	public static void main(String[] args) {
		Estudante e1 = new Estudante(1212121212, "Bruna Silva", 'F', true);
		
		System.out.println(e1);
	}
	
	
	

}
