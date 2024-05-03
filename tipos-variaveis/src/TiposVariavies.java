public class TiposVariavies {
    public static void main(String[] args) {

        // No double para representar milhar não é necessário a utilização do ponto,
        // ou seja, dois mil e quinhentos é ->2500<-
        double salarioMinimo = 2.500;

        //------------------------------------------------------------------------------------------------------------------------

        // No exemplo existe um erro, pois o java fala "não posso adicionar um número de uma variável de outro tamanho
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal;
        short numeroCurto2 = (short)numeroNormal;//no caso é necessária essa representação para o java
        // entender que indiferente da diferença de tamanho de variáveis eu não me importo de perder esses dados
        //------------------------------------------------------------------------------------------------------------------------


        final double VALOR_DE_PI = 3.14;
        // o "final" no começo da variável fala basicamente que o valor nao pode e nem será alterado futuramente

    }
}