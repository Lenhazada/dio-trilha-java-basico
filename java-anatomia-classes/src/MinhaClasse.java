public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Gabriel";
        String segundoNome = "Lenhardt";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "O resultado é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}