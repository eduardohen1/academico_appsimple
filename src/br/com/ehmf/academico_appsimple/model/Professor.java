/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ehmf.academico_appsimple.model;

/**
 *
 * @author duduh
 */
public class Professor extends Pessoa implements Avaliacao {
    
    private String especialidade;
    
    public Professor(String nome, String cpf, String especialidade){
        super(nome, cpf);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    

    @Override
    public void lancarNota(Aluno aluno, double nota) {
        System.out.println("Nota " + nota + " lançada para o aluno " + aluno.getNome());
    }

    @Override
    public void lancarFalta(Aluno aluno, int faltas) {
        System.out.println(faltas + " faltas lançadas para o aluno " + aluno.getNome());
    }

    @Override
    public boolean aprovarMatricula(Materia materia, Aluno aluno) {
        System.out.println("Aprovando matrícula da matéria " + materia.getNome() + " para o aluno " + aluno.getNome());
        return true;
    }
    
}
