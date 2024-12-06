/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ehmf.academico_appsimple;

import br.com.ehmf.academico_appsimple.model.Aluno;
import br.com.ehmf.academico_appsimple.model.Materia;
import br.com.ehmf.academico_appsimple.model.Matricula;
import br.com.ehmf.academico_appsimple.model.Professor;
import br.com.ehmf.academico_appsimple.model.Turma;

/**
 *
 * @author duduh
 */
public class Academico_AppSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iniciando aplicação");
        
        Turma turma1 = new Turma("Turma 4p2024");
        Aluno aluno1 = new Aluno("Fulano da Silva", "123.456.789-00", turma1);
        Professor professor1 = new Professor("Jao Ciclano", "987.654.321-11", "Mestre em Enrolação");
        Materia materia1 = new Materia("Eng Software 1", professor1);
        Matricula matricula1 = new Matricula(aluno1, materia1, 0, 0);
        
        //lançando notas e faltas
        professor1.lancarNota(aluno1, 8.5);
        professor1.lancarFalta(aluno1, 2);
        
        matricula1.setNota(10);
        matricula1.setFaltas(1);
        
        System.out.println(aluno1.toString());
        System.out.println(materia1);
        System.out.println(matricula1);
        
        
    }
    
}
