package padroesestruturais.bridge;

public abstract class Funcionario {

    protected Experiencia experiencia;

    protected float salarioBase;

    public Funcionario(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setExperiencia(Experiencia experiencia) {
        this.experiencia = experiencia;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
