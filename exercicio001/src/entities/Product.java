package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(){
    }

    public Product(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public Product(String name, double price){

        this.name = name;
        this.price = price;

    }

    public double totalValorEmEstoque() {
        return price * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void adicionarProdutoEstoque(int quantity) {
        this.quantity += quantity;
    }

    public void removerProdutoEstoque(int quantity) {
        this.quantity -= quantity;
    }

    public String montarString() {

        return name
                + ", $"
                + price
                + ", "
                + quantity
                + " "
                + "unidades, Total: $"
                + totalValorEmEstoque();

    }
}
