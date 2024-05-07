package br.com.iphone.entity.camera;

public class Galeria {
    private Foto[] fotos;
    private Video[] videos;

    public Galeria(Foto[] fotos, Video[] videos) {
        this.fotos = fotos;
        this.videos = videos;
    }

    public void exibirVideo(){
        for (Video video : videos) {
            System.out.println(video);
        }
    }
}
