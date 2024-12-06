/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ehmf.academico_appsimple.model;

/**
 *
 * @author duduh
 */
public class Aluno extends Pessoa {
    private Turma turma;
    
    public Aluno(String nome, String cpf, Turma turma){
        super(nome, cpf);
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return super.toString() + ", Turma: " + this.turma.getNome();
    }
    
    
}
