package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {

    @Test
    void deveRetornarSalarioDesenvolvedorComJunior() {
        Experiencia experiencia = new Junior();
        Desenvolvedor desenvolvedor = new Desenvolvedor(2000.0f);
        desenvolvedor.setExperiencia(experiencia);
        assertEquals(2000.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioDesenvolvedorComPleno() {
        Experiencia experiencia = new Pleno();
        Desenvolvedor desenvolvedor = new Desenvolvedor(2000.0f);
        desenvolvedor.setExperiencia(experiencia);
        assertEquals(2200.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioDesenvolvedorComSenior() {
        Experiencia experiencia = new Senior();
        Desenvolvedor desenvolvedor = new Desenvolvedor(2000.0f);
        desenvolvedor.setExperiencia(experiencia);
        assertEquals(2400.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioDesenvolvedorComEspecialista() {
        Experiencia experiencia = new Especialista();
        Desenvolvedor desenvolvedor = new Desenvolvedor(2000.0f);
        desenvolvedor.setExperiencia(experiencia);
        assertEquals(2600.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

}
