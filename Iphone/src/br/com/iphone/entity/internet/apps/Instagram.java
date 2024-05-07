package br.com.iphone.entity.internet.apps;

import br.com.iphone.interfaces.Camera;

public class Instagram implements Camera {
    private String usuario;
    private String senha;

    public Instagram(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void tirarFoto(){
        System.out.println("Tirando foto via Instagram");
    }

    @Override
    public void gravarVideo(){
        System.out.println("Gravando vídeo via Instagram");
    }
}
