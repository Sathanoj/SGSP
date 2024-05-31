package com.sgspproject.sgsp.model.entity.adminentity;

import com.sgspproject.sgsp.model.entity.Professor;
import java.util.List;

/**
 *
 * @author jonat
 */
public class Turma {
    private int id;
    private int numeroAlunos;
    private List<Professor> professor;
    private Curso curso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + id + ", numeroAlunos=" + numeroAlunos + ", professor=" + professor + ", disciplina=" + curso + '}';
    }
    
    
    
}
