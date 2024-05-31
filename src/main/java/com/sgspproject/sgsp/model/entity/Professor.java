/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgspproject.sgsp.model.entity;

import com.sgspproject.sgsp.model.entity.adminentity.Disciplina;
import com.sgspproject.sgsp.model.entity.adminentity.Turma;
import java.util.List;

/**
 *
 * @author jonat
 */
public class Professor extends Usuario{

    private int matricula;
    private List<Disciplina> disciplinas;
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

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
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
