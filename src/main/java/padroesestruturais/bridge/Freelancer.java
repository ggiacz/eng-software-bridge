package padroesestruturais.bridge;

public class Freelancer extends Funcionario {

    private int numHoras;

    public Freelancer(float salarioBase) {
        super(salarioBase);
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numHoras * (1 + this.experiencia.percentualAumento());
    }
}
