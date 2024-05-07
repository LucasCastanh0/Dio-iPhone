package br.com.iphone.entity.ipad.apps;

import br.com.iphone.entity.ipad.ReprodutorMusical;

public class Itunes extends ReprodutorMusical {
    public Itunes(String nomeMusica, String artista){
        super(nomeMusica, artista);
    }

    public void tocarMusica(){
        System.out.println("Tocando música no iTunes...");
    }

    public void pausarMusica(){
        System.out.println("Música pausada no iTunes.");
    }

    public void selecionarMusica(){
        System.out.println("Música selecionada no iTunes.");
    }

}
