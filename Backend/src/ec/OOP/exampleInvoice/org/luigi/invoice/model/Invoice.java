package ec.OOP.exampleInvoice.org.luigi.invoice.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
    private int folio ;
    private  String description ;
    private Date dateInvoice ;
    private  Client client ;
    private  InvoiceDetails[] details ;
    private  int indexInvoice ;
    public  static  final  int MAX_ITEMS=12;
    private  static  int lastFolio;

    public Invoice(Client client, String description) {
        this.client = client;
        this.description = description;
        this.details = new InvoiceDetails[MAX_ITEMS];
        this.folio = ++ lastFolio;
        this.dateInvoice = new Date();
    }

    public Date getDateInvoice() {
        return dateInvoice;
    }

    public void setDateInvoice(Date dateInvoice) {
        this.dateInvoice = dateInvoice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public InvoiceDetails[] getDetails() {
        return details;
    }
    public void addDetails(InvoiceDetails details) {
        if (this.indexInvoice < MAX_ITEMS) {
            this .details[this.indexInvoice++] = details;
        }

    }

    public double calculateTotal() {
        double total = 0.0;
        for(int i =0; i < indexInvoice; i++) {
            total += this.details[i].calculateTax();
        }
        return total;
    }

    public String generateDetails() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder("Invoice N: ")
                .append(this.folio)
                .append("\nClient: ")
                .append(this.client.getCompleteName())
                .append("\tNIF: ")
                .append(this.client.getNif())
                .append("\nDescription: ")
                .append(this.description)
                .append("\nInvoice Date: ")
                .append(df.format(this.dateInvoice))
                .append("\n#\tName\t$\tAmount\tTotal: $\n");
        for (int i =0 ; i < indexInvoice ; i++) {
            sb.append(this.details[i].toString())
                    .append("\n");
        }
        sb.append("\n Total Invoice:").append(calculateTotal());
        return sb.toString();
    }

    @Override
    public String toString() {
        return generateDetails();
    }
}
