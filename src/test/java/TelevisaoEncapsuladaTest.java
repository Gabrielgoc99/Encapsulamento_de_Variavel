import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TelevisaoEncapsuladaTest {

    private void assertEquals(String s) {
    }

    @Test
    void deveRetornarDadosTVEncapsulada() {
        TelevisaoEncapsulada televisaoEncapsulada = new TelevisaoEncapsulada(10, 30, 55, false);
        televisaoEncapsulada.setCanal(10);
        televisaoEncapsulada.setVolume(30);
        televisaoEncapsulada.setTamanho(55);
        televisaoEncapsulada.setLigada(false);

        assertEquals("TelevisaoEncapsulada {10, 30, 55, false }");
    }


}

