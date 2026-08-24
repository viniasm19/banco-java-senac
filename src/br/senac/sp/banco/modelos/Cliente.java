package br.senac.sp.banco;

public class Cliente {
    public String nome;
    public String cpf;

    // constrututor padrão
    public Cliente() {

    }

    // construtor privado para nome
    private Cliente(String nome) {
        this.nome = nome;
    }

    // construtor com parametros
    public Cliente(String nome, String cpf) {
        // chamando o construtor que recebe apenas nome
        this(nome);
        this.cpf = cpf;
    }
}