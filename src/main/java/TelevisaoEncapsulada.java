public class TelevisaoEncapsulada {
    private int canal;
    private int volume;
    private boolean ligada;
    private int tamanho;

    public TelevisaoEncapsulada(int canal, int volume, int tamanho, boolean ligada) {
        this.canal = getCanal();
        this.volume = getVolume();
        this.tamanho = getTamanho();
        this.ligada = isLigada();
    }

    public void setCanal(int novoCanal) {
        canal = novoCanal;
    }

    public int getCanal() {
        return canal;
    }

    public void setVolume(int novoVolume) {
        volume = novoVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void setLigada(boolean tvligada) {
        this.ligada = tvligada;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setTamanho(int novoTamanho) {
        tamanho = novoTamanho;
    }

    public int getTamanho() {
        return tamanho;
    }
}


