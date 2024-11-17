package Funcionalidade;

public class Twitter extends RedeSocial implements Compartilhamento{
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no Twitter");
    }
}
