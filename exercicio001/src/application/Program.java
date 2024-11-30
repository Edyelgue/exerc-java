package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preço: ");
        double price = sc.nextDouble();

        System.out.print("Quantidade no estoque: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println(product.montarString());

        System.out.println();
        System.out.print("Adicionar estoque: ");
        quantity = sc.nextInt();
        product.adicionarProdutoEstoque(quantity);
        System.out.print("Estoque atualizado: " + product.getQuantity());

        System.out.println();
        System.out.println();

        System.out.print("Remover do estoque: ");
        quantity = sc.nextInt();
        product.removerProdutoEstoque(quantity);
        System.out.print("Estoque atualizado: " + product.getQuantity());
        System.out.println();

        sc.close();
    }
}
