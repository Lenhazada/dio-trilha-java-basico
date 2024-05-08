public class Main {
    public static void main(String[] args) {
        int hora = 23;

        //operador ternário
        String cumprimento = hora >= 6 && hora < 12 ? "Bom dia" : hora >= 12 && hora < 18 ? "Boa tarde" : "Boa noite";
        System.out.println(cumprimento);

        /*
        * if else padrão
        *if (hora >= 6 && hora < 12)
        *    System.out.println("Bom dia");
        *else if (hora >= 12 && hora < 18)
        *    System.out.println("Boa tarde");
        *else
        *    System.out.println("Boa noite");
        */
    }
}