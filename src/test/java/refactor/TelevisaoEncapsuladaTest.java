package refactor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TelevisaoEncapsuladaTest {

    @Test
    void deveRetornarDadosTVEncapsulada() {
        TelevisaoEncapsulada televisaoEncapsulada = new TelevisaoEncapsulada();
        televisaoEncapsulada.setCanal(7);
        televisaoEncapsulada.setVolume(20);
        televisaoEncapsulada.setLigada(true);
        televisaoEncapsulada.setTamanho(55);

        assertEquals("Televisao{" +
                "canal=7" +
                ", volume=20" +
                ", ligada=true" +
                ", tamanho=55" +
                '}', televisaoEncapsulada.statusTelevisao());
    }


}

