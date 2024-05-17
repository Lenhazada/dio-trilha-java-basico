package salaTestes;

import funcoes.celular.Iphone;
import funcoes.ipod.ReprodutorMusical;
import funcoes.navegador.NavegadorInternet;
import funcoes.telefone.AparelhoTelefonico;

public class Testes {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        ReprodutorMusical reprodutorMusical = new Iphone();
        NavegadorInternet navegadorInternet = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("");

        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        navegadorInternet.exibirPagina("");

        aparelhoTelefonico.ligar("");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }

}
