package entidades;

public class AlunoAcademia {
	
	private int identificação;
	private String nome;
	private double peso;
	private double altura;
	private int idade;
	
	public AlunoAcademia() {
		
	}


	public AlunoAcademia(int identificação, String nome, int peso, int altura, int idade) {
		
	}
		
	public int getIdentificação() {
		return identificação;
	}


	public void setIdentificação(int identificação) {
		this.identificação = identificação;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double calculoMedia() {
		double imc;
		imc = (peso/(altura*altura));
		return imc;
	}
		public String toString() {
			return "O aluno: " + nome
			+"\ntem: " + idade + "anos"
			+"\nseu ID: " + idAluno
			+"\ncom altura: " + altura
			+"\n seu IMC: " + calculaIMC();
			
		}

		}
	}
