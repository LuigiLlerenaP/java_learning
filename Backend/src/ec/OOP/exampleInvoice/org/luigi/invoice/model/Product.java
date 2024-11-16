package ec.OOP.exampleInvoice.org.luigi.invoice.model;

public class Product {
    private int code;
    private String nameProduct;
    private double price;
    private  static  int lastCode;

    public Product() {
        this.code = ++ lastCode;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return  code +
                "\t" + nameProduct +
                "\t" + price ;
    }
}
