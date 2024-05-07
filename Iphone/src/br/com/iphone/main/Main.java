package br.com.iphone.main;

import br.com.iphone.entity.internet.Email;
import br.com.iphone.entity.internet.Navegador;
import br.com.iphone.entity.internet.apps.Chrome;
import br.com.iphone.entity.internet.apps.Instagram;
import br.com.iphone.entity.internet.apps.Safari;
import br.com.iphone.entity.ipad.ReprodutorMusical;
import br.com.iphone.entity.ipad.apps.Itunes;
import br.com.iphone.entity.ipad.apps.Spotify;
import br.com.iphone.entity.telefone.Contato;
import br.com.iphone.entity.telefone.Telefone;

public class Main {
    public static void main(String[] args) {
        Navegador navegador = null;
        String navegadorEscolhido = "Safari";

        if (navegadorEscolhido.equalsIgnoreCase("Safari")) {
            navegador = new Safari("http://www.google.com");
        }else if (navegadorEscolhido.equalsIgnoreCase("Chrome")) {
            navegador = new Chrome("https://www.google.com");
        } else {
            System.out.println("Navegador não encontrado.");
        }

        if (navegador != null) {
            navegador.exibirPagina();
            navegador.adicionarNovaAba();
            navegador.atualizarPagina();
        }

        Email email = new Email("lucasphelipe@alunos.utfpr.edu.br");
        email.enviarEmail();
        email.excluirEmail();

        ReprodutorMusical reprodutorMusical = null;
        String reprodutorMusicalEscolhido = "Spotify";

        if (reprodutorMusicalEscolhido.equalsIgnoreCase("Spotify")) {
            reprodutorMusical = new Spotify("Máquina do tempo", "Matuê");
        } else if (reprodutorMusicalEscolhido.equalsIgnoreCase("iTunes")) {
            reprodutorMusical = new Itunes("Não Vou Namorar", "DALÃMA, DJ JOÃO PEREIRA, DJ Ws da Igrejinha, Mc Dudu Sk, MC TH DA SERRA");
        }else {
            System.out.println("Reprodutor musical não encontrado.");
        }

        if(reprodutorMusical != null) {
            reprodutorMusical.tocarMusica();
            reprodutorMusical.pausarMusica();
            reprodutorMusical.selecionarMusica();
        }

        Telefone telefone = new Telefone("(11) 9 88725363");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        Contato contato = new Contato("Lucas", "Ribeiro", telefone, email);
        contato.CriarContato();

        Instagram instagram = new Instagram("Lucas", "Algumacoisa123");
        instagram.tirarFoto();
        instagram.gravarVideo();
    }
}