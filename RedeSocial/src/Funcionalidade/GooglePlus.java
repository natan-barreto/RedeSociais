package Funcionalidade;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Google Plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Google Plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Google Plus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no Google Plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Google Plus");
    }
}
