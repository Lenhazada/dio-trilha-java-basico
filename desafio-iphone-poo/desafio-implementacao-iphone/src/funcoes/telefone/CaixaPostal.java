package funcoes.telefone;

public class CaixaPostal implements AparelhoTelefonico{
    public void ligar(String numero) {
        System.out.println("Ligando");
    }
    public void atender(){
        System.out.println("Atendendo ligação");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
}
