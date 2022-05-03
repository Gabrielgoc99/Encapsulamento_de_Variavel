import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TelevisaoTest {

    private void assertEquals(String s) {
    }

    @Test
    void deveRetornarDadosTV() {
        Televisao televisao = new Televisao(42, 55, true, 30);

        assertEquals("Televisao {canal=42, tamanho=55, ligada=true, volume=30}");
    }

}

