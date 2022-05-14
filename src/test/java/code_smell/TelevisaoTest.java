package code_smell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TelevisaoTest {

    @Test
    void deveRetornarDadosTV() {
        Televisao televisao = new Televisao(7, 20, true, 55);

        assertEquals("Televisao{" +
                "canal=7" +
                ", volume=20" +
                ", ligada=true" +
                ", tamanho=55" +
                '}', televisao.statusTelevisao());
    }
}

