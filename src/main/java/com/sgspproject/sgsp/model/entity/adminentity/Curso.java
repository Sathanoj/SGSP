package com.sgspproject.sgsp.model.entity.adminentity;

/**
 *
 * @author jonat
 */
public class Curso {
    private int cursoId;
    private String nome;

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curso{" + "cursoId=" + cursoId + ", nome=" + nome + '}';
    }
}
