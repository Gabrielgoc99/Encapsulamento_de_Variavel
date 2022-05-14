package code_smell;

public class Televisao {
        public int canal;
        public int volume;
        public boolean ligada;
        public int tamanho;

    public Televisao(int canal, int volume, boolean ligada, int tamanho){
        this.canal = canal;
        this.volume = volume;
        this.ligada = ligada;
        this.tamanho = tamanho;
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
