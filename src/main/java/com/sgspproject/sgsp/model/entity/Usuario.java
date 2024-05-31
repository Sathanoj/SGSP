package com.sgspproject.sgsp.model.entity;

/**
 *
 * @author jonat
 */
public abstract class Usuario {
    private String nome;
    private String email;
    protected int senha;

    public Usuario(String nome, String email, int senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    abstract void validarSenha(String senha);

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

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", email=" + email + ", senha=" + senha + '}';
    }
    
    
}
