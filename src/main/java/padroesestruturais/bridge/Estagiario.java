package padroesestruturais.bridge;

public class Estagiario extends Funcionario {

    public Estagiario(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
