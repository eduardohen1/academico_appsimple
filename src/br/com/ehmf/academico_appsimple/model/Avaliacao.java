/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ehmf.academico_appsimple.model;

/**
 *
 * @author duduh
 */
public interface Avaliacao {
    void lancarNota(Aluno aluno, double nota);
    void lancarFalta(Aluno aluno, int faltas);
    boolean aprovarMatricula(Materia materia, Aluno aluno);
}
