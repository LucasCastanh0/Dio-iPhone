package br.com.iphone.entity.telefone;

import br.com.iphone.entity.internet.Email;

public class Contato {
    private String nome;
    private String sobrenome;
    private Telefone telefone;
    private Email email;

    public Contato (String nome, String sobrenome, Telefone telefone, Email email){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato (String nome, String sobrenome, Telefone telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public void CriarContato(){
        System.out.println("Contato criado.");
    }

}
