import java.util.Scanner;

//cria a classe de exceção de erro
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        //Leitura dos parâmetros
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            //Validação se o primeiro parâmetro é maior que o segundo se true ele joga a exception de erro
            if (parametroUm > parametroDois){
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
            }
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois)  throws ParametrosInvalidosException {
        //Mostra quantos valores existem na diferença de um parametro para o outro
        int contagem = parametroDois - parametroUm;

        //For mostra o valor de 0 até o valor resultante da subtração acima
        for (int i = 0; i < contagem; i++){
            System.out.printf("Imprimindo número: %d %n", i+1);
        }
    }
}