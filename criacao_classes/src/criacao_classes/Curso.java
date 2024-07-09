package criacao_classes;

import java.util.ArrayList;

public class Curso {
	//--------instanciando propriedades---------------------
	private String nome;
	private ArrayList<Disciplina> disciplinas= new ArrayList<Disciplina>();
	//-----------criando metodos----------------------------
	//metodo construtor:
	public Curso(String nome_curso) {
		this.nome=nome_curso;
	}
	//metodo para incluir uma disciplina:>
	public void Incluir(Disciplina disciplina_incluir) {
		disciplinas.add(disciplina_incluir);
	}
	//metodo para imprimir 
    public void Imprimir() {
        System.out.printf("Curso de %s:\n", nome);
        System.out.println("\tDisciplinas:");
        if (disciplinas.size() > 0) {
            for (Disciplina d: disciplinas) {
                d.Imprimir("\t\t");
            }
        } else {
            System.out.println("\t\t-vazio-");
        }
    }
}
