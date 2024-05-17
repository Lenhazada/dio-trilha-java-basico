import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeroConta = scanner.next();
        verificarNumeroConta(numeroConta);

        try{
            if (numeroConta.length() < 8)
                throw new RuntimeException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
        catch (RuntimeException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            scanner.close();
        }

    }
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8) {
            System.out.println("Numero de conta valido.");
        }
    }
}