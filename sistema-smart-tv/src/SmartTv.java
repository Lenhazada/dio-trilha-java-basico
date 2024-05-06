public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    // Usado para escolher canal.
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    // Usado para aumentar ou diminuir o valor do canal.
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }


        // Usado para aumentar ou diminuir o volume.
    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }

    // Usado para ligar e desligar a Tv.
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
}