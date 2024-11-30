package calculos;

public class Data {
    public String nome;
    public double salario, taxa, percentualSalario, salarioLiq;

    public double AcrescimoDeSalario(double percentualSalario, double salario) {

        double resultado = this.salario / 100 * this.percentualSalario + this.salario;

        return resultado;

    }

    public double SalarioLiquido(double salario, double taxa) {

        double resultado = this.salario - this.taxa;

        return resultado;

    }
}
