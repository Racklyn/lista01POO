public class OrderItem {

    private Product product;
    private int quantity;
    private Double price;
    
    public OrderItem(int quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return product.getName()
            + ", $" + String.format("%.2f", product.getPrice())
            + ", Quantity: " + quantity
            + ", Subtotal: $" + String.format("%.2f", subTotal());
    }

    
}
