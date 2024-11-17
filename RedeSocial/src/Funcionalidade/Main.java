package Funcionalidade;

import Excecoes.LimiteRedesSociaisException;
import Excecoes.OperacaoInvalidaException;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<RedeSocial> redesSociais = new HashSet<>();

        Facebook facebook = new Facebook();
        Twitter twitter = new Twitter();
        GooglePlus googlePlus = new GooglePlus();
        Instagram instagram = new Instagram();

        try{
            redesSociais.add(facebook);
            redesSociais.add(twitter);
            redesSociais.add(googlePlus);

            Usuario usuario = new Usuario("Natan Barreto", "natan.barreto@gel.inatel.br",redesSociais);

            System.out.println("Usuário criado com sucesso: " + usuario);


            System.out.println("\n--- Demonstrando funcionalidades das redes sociais ---");

            System.out.println("\nNo Facebook:");
            facebook.postarFoto();
            facebook.postarVideo();
            facebook.fazStreaming();

            System.out.println("\nNo Twitter:");
            twitter.postarComentario();
            twitter.curtirPublicacao();
            twitter.compartilhar();

            System.out.println("\nNo GooglePlus:");
            googlePlus.postarVideo();
            googlePlus.curtirPublicacao();
            googlePlus.compartilhar();


            System.out.println("\n--- Executando interações do usuário nas redes sociais ---");
            usuario.usarRedesSociais();
        }
        catch (OperacaoInvalidaException e) {
            System.out.println("Erro ao usar as redes sociais: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

    System.out.println("\n--- Simulando exceção de limite de redes sociais ---");
    HashSet<RedeSocial> muitasRedes = new HashSet<>();

        try {
            muitasRedes.add(facebook);
            muitasRedes.add(twitter);
            muitasRedes.add(googlePlus);
            muitasRedes.add(instagram);
            muitasRedes.add(new Facebook());
            muitasRedes.add(new Instagram());

            Usuario usuario2 = new Usuario("Joãozinho", "joaozinho.java@gel.inatel.br", muitasRedes);
            System.out.println("Usuário 2 criado com sucesso: " + usuario2);
        }
        catch (LimiteRedesSociaisException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}