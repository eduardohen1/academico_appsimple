/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ehmf.academico_appsimple.model;

/**
 *
 * @author duduh
 */
public class Matricula {
    private Aluno aluno;
    private Materia materia;
    private double nota;
    private int faltas;

    public Matricula(Aluno aluno, Materia materia, double nota, int faltas) {
        this.aluno = aluno;
        this.materia = materia;
        this.nota = nota;
        this.faltas = faltas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Aluno: " + aluno.getNome() + ", Matéria: " + materia.getNome() + ", Nota: " + nota + ", Faltas: " + faltas;
    }
    
    
    
}
