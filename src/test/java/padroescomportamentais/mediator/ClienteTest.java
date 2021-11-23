package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarEmpresa() {
        Cliente cliente = new Cliente();
        assertEquals("Agradecemos seu contato.A Empresa respondeu sua demanda conforme mensagem a seguir." +
                ">>Agradecemos a mensagem:Bom atendimento",
                cliente.elogiarEmpresa("Bom atendimento"));
    }

    @Test
    void deveReclamarEmpresa() {
        Cliente cliente = new Cliente();
        assertEquals("Agradecemos seu contato.A Empresa respondeu sua demanda conforme mensagem a seguir." +
                ">>Agradecemos a mensagem:Atendimendo ruim",
                cliente.reclamarEmpresa("Atendimendo ruim"));
    }

    @Test
    void deveSugerirEmpresa() {
        Cliente cliente = new Cliente();
        assertEquals("Agradecemos seu contato.A Empresa respondeu sua demanda conforme mensagem a seguir." +
                ">>Agradecemos a mensagem:Mais funcionarios",
                cliente.sugerirEmpresa("Mais funcionarios"));
    }

}