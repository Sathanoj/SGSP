package com.sgspproject.sgsp.model.entity;

import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import com.sgspproject.sgsp.model.entity.adminentity.Turma;
import java.util.List;

/**
 *
 * @author jonat
 */
public class Professor {

    private String nome;
    private String email;
    protected int senha;
    private int matricula;
    private List<Curso> cursos;
    private List<Turma> turmas;

    public Professor(String nome, String email, int senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Professor() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", email=" + email + ", senha=" + senha + ", matricula=" + matricula + ", cursos=" + cursos + ", turmas=" + turmas + '}';
    }
}
