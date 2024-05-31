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
    private Disciplina disciplina;

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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + id + ", numeroAlunos=" + numeroAlunos + ", professor=" + professor + ", disciplina=" + disciplina + '}';
    }
    
    
    
}
