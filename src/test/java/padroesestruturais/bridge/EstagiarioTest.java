package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstagiarioTest {

    @Test
    void deveRetornarSalarioEstagiarioComJunior() {
        Experiencia experiencia = new Junior();
        Estagiario estagiario = new Estagiario(1000.0f);
        estagiario.setExperiencia(experiencia);
        assertEquals(1000.0f, estagiario.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEstagiarioComPleno() {
        Experiencia experiencia = new Pleno();
        Estagiario estagiario = new Estagiario(1000.0f);
        estagiario.setExperiencia(experiencia);
        assertEquals(1000.0f, estagiario.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEstagiarioComSenior() {
        Experiencia experiencia = new Senior();
        Estagiario estagiario = new Estagiario(1000.0f);
        estagiario.setExperiencia(experiencia);
        assertEquals(1000.0f, estagiario.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEstagiarioComEspecialista() {
        Experiencia experiencia = new Especialista();
        Estagiario estagiario = new Estagiario(1000.0f);
        estagiario.setExperiencia(experiencia);
        assertEquals(1000.0f, estagiario.calcularSalario(), 0.01f);
    }

}
