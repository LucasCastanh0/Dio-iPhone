package br.com.iphone.entity.telefone;

public class Telefone {
    
    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public  void ligar(){
        System.out.println("Ligando...");
    }
    public void atender(){
        System.out.println("Atendendo...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

}
