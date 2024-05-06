public class Sistema {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(37);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Tv esta ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

    }


}
