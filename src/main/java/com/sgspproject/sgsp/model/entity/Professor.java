package com.sgspproject.sgsp.model.entity;

import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import com.sgspproject.sgsp.model.entity.adminentity.Turma;
import java.util.List;

/**
 *
 * @author jonat
 */
public class Professor extends Usuario {

    private int matricula;
    private List<Curso> cursos;
    private List<Turma> turmas;

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
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
    
    
    public Professor(String nome, String email, int senha) {
        super(nome, email, senha);
    }

    // Metodos da classe Abstrata
    @Override
    void validarSenha(String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
