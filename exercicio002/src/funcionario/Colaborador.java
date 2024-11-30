package funcionario;

import java.util.Locale;
import java.util.Scanner;

import calculos.Data;

public class Colaborador {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Data data = new Data();

        System.out.print("Digite o nome do colaborador: ");
        data.nome = sc.nextLine();

        System.out.print("Digite o salario de " + data.nome + ": ");
        data.salario = sc.nextDouble();

        System.out.print("Digite o valor da taxa: ");
        data.taxa = sc.nextDouble();

        System.out.print("Dados: " + data.nome +  ", " + data.salario);

        System.out.println();
        System.out.print("Digite o percentual de acrescimo no salario: ");
        data.percentualSalario = sc.nextDouble();

        System.out.println();
        double resultado = data.AcrescimoDeSalario(data.percentualSalario, data.salario);
        System.out.println("Salario bruto: R$" + resultado);

        System.out.println();
        resultado = data.SalarioLiquido(data.salario, data.taxa);
        System.out.println("Salario liquido: R$" + resultado);

        sc.close();
    }
}
