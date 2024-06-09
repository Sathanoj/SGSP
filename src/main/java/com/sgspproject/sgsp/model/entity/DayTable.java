package com.sgspproject.sgsp.model.entity;


/**
 *
 * @author jonat
 */
public class DayTable {
    private String nomeCurso;
    private String idTurma;
    private String nomeProfessor;
    
//    public void showDayTable(Curso curso, Turma turma, Professor professor) {
//        nomeCurso = curso.getNome();
//        idTurma = turma.getId();
//        nomeProfessor = professor.getNome();
//    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    @Override
    public String toString() {
        return "DayTable{" + "nomeCurso=" + nomeCurso + ", idTurma=" + idTurma + ", nomeProfessor=" + nomeProfessor + '}';
    }
}
