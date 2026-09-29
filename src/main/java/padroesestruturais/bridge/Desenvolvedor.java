package padroesestruturais.bridge;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.experiencia.percentualAumento());
    }

}
