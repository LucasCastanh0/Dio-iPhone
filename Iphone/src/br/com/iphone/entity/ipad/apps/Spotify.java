package br.com.iphone.entity.ipad.apps;

import br.com.iphone.entity.ipad.ReprodutorMusical;

public class Spotify extends ReprodutorMusical{
    public Spotify(String nomeMusica, String artista){
        super(nomeMusica, artista);
    }

    public void tocarMusica(){
        System.out.println("Tocando música no Spotify...");
    }

    public void pausarMusica(){
        System.out.println("Música pausada no Spotify.");
    }

    public void selecionarMusica(){
        System.out.println("Música selecionada no Spotify.");
    }

}
