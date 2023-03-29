package Builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteBuilderTest {

    @Test
    void excecaoParaPacienteSemCodigo() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setNome("Fulano")
                    .setEmail("fulano@teste.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    void excecaoParaPacienteSemNome() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setCodigo(1)
                    .setEmail("fulano@teste.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void pacienteValido() {
        PacienteBuilder pacienteBuilder = new PacienteBuilder();
        Paciente paciente = pacienteBuilder
                .setCodigo(1)
                .setNome("Paciente Válido")
                .setEmail("email@testePaciente.com")
                .build();

        assertNotNull(paciente);
    }
    @Test
    public void testSettersAndGetters() {
        Paciente paciente = new Paciente();
        paciente.setCodigo(123);
        paciente.setNome("Fulano de Tal");
        paciente.setSexo("Masculino");
        paciente.setTipoSanguineo("O+");
        paciente.setConvenioMedico("Unimed");
        paciente.setNomeMae("Ciclana de Tal");
        paciente.setNomePai("Beltrano de Tal");
        paciente.setEnderecoCidade("Cidade Teste");
        paciente.setTelefone("(11) 99999-9999");
        paciente.setEmail("fulano@exemplo.com");
        paciente.setRg("123456789");

        Assertions.assertEquals(123, paciente.getCodigo());
        Assertions.assertEquals("Fulano de Tal", paciente.getNome());
        Assertions.assertEquals("Masculino", paciente.getSexo());
        Assertions.assertEquals("O+", paciente.getTipoSanguineo());
        Assertions.assertEquals("Unimed", paciente.getConvenioMedico());
        Assertions.assertEquals("Ciclana de Tal", paciente.getNomeMae());
        Assertions.assertEquals("Beltrano de Tal", paciente.getNomePai());
        Assertions.assertEquals("Cidade Teste", paciente.getEnderecoCidade());
        Assertions.assertEquals("(11) 99999-9999", paciente.getTelefone());
        Assertions.assertEquals("fulano@exemplo.com", paciente.getEmail());
        Assertions.assertEquals("123456789", paciente.getRg());
    }
}