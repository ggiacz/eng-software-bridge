package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerTest {

    @Test
    void deveRetornarSalarioFreelancerComJunior() {
        Experiencia experiencia = new Junior();
        Freelancer freelancer = new Freelancer(50.0f);
        freelancer.setExperiencia(experiencia);
        freelancer.setNumHoras(2);
        assertEquals(100.0f, freelancer.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFreelancerComPleno() {
        Experiencia experiencia = new Pleno();
        Freelancer freelancer = new Freelancer(50.0f);
        freelancer.setExperiencia(experiencia);
        freelancer.setNumHoras(2);
        assertEquals(110.0f, freelancer.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFreelancerComSenior() {
        Experiencia experiencia = new Senior();
        Freelancer freelancer = new Freelancer(50.0f);
        freelancer.setExperiencia(experiencia);
        freelancer.setNumHoras(2);
        assertEquals(120.0f, freelancer.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFreelancerComEspecialista() {
        Experiencia experiencia = new Especialista();
        Freelancer freelancer = new Freelancer(50.0f);
        freelancer.setExperiencia(experiencia);
        freelancer.setNumHoras(2);
        assertEquals(130.0f, freelancer.calcularSalario(), 0.01f);
    }

}
