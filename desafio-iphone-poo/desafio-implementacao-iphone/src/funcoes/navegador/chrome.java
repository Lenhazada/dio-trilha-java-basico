package funcoes.navegador;

public class chrome implements NavegadorInternet{
    public void exibirPagina(String url) {
        System.out.println("Navegador da internet");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }
}
