package criacao_classes;

public class Pessoa {
	//nome da pessoa do tipo protected string (protegido, acessivel apenas atraves de
	//uma classe que esta herdando a classe onde esta o atributo protegido)
	protected String nome;
	//construtor da classe:
	public Pessoa(String alguem) {
		this.nome = alguem;
	}
	public abstract void imprimir();
	

}
