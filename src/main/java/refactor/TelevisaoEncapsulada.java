package refactor;

public class TelevisaoEncapsulada {
    private int canal;
    private int volume;
    private boolean ligada;
    private int tamanho;

    public TelevisaoEncapsulada() {
        this.canal = canal;
        this.volume = volume;
        this.ligada = ligada;
        this.tamanho = tamanho;

    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String statusTelevisao() {
        return "Televisao{" +
                "canal=" + canal +
                ", volume=" + volume +
                ", ligada=" + ligada +
                ", tamanho=" + tamanho +
                '}';
    }
}


