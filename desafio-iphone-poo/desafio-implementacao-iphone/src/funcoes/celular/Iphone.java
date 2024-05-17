package funcoes.celular;

import funcoes.ipod.ReprodutorMusical;
import funcoes.navegador.NavegadorInternet;
import funcoes.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    public void tocar() {
        System.out.println("Tocando via Iphone");
    }
    public void pausar() {
        System.out.println("Pausando via Iphone");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica via Iphone");
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina via Iphone");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba via Iphone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina via Iphone");
    }
    public void ligar(String numero) {
        System.out.println("Ligando via Iphone");
    }
    public void atender() {
        System.out.println("Atendendo via Iphone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio via Iphone");
    }
}
