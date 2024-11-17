package Funcionalidade;

import Excecoes.LimiteRedesSociaisException;
import Excecoes.OperacaoInvalidaException;

import java.util.HashSet;


public class Usuario{
    private String nome;
    private String email;
    private HashSet<RedeSocial> redesSociais;

    public Usuario(String nome, String email, HashSet<RedeSocial> redesSociais) throws LimiteRedesSociaisException {
        if(redesSociais.size() > 5){
            throw new LimiteRedesSociaisException("Não é permitido adicionar mais de 5 redes sociais!");
        }

        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    public void usarRedesSociais() throws OperacaoInvalidaException {
        if (redesSociais.isEmpty()) {
            throw new OperacaoInvalidaException("O usuário não possui redes sociais cadastradas!");
        }

        int contador = 0;
        for (RedeSocial rede : redesSociais) {
            if (contador == 0) {
                rede.postarFoto();
            } else if (contador == 1) {
                rede.postarVideo();
            } else if (contador == 2) {
                rede.curtirPublicacao();
            }
            contador++;
            if (contador == 3) break;
        }
    }

    @Override
    public String toString() {
        return "Nome = " + this.nome + ", email = " + this.email;
    }
}

