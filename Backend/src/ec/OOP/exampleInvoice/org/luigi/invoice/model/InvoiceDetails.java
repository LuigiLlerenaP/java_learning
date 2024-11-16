package ec.OOP.exampleInvoice.org.luigi.invoice.model;

public class InvoiceDetails {
    private int amount;
    private Product product;

    public InvoiceDetails(int amount, Product product) {
        this.amount = amount;
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public  double calculateTax() {
        return  (this.amount * this.product.getPrice());
    }

    @Override
    public String toString() {
        return product.toString() +
                "\t" + amount +
                "\t" + calculateTax();
    }
}
