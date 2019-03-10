import model.Invoice;
import model.InvoicePosition;
import model.Product;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product("ABC123", "TV", 1000.0);
		InvoicePosition position = new InvoicePosition(product);
		Invoice invoice = new Invoice();
		invoice.addPosition(position);
		printoutInvoice(invoice);
	}
		
		private static void printoutInvoice(Invoice invoice){
			System.out.println("|NAZWA\t|ILOSC\t|CENA NETTO\t|CENA BRUTTO\t|STAWKA VAT\t|PODATEK");
			System.out.println("************************************************************************");
			for(InvoicePosition p : invoice.getPositions()){
				System.out.print("|" + p.getProduct().getName() + "\t|");
				System.out.print(p.getCount() + "\t|");
				System.out.print(p.getNettoPrice() + "\t\t|");
				System.out.print(p.getGrossPrice() + "\t\t|");
				System.out.print(p.getTax() + "\t\t|");
				System.out.println(p.getTaxValue());
				System.out.println("------------------------------------------------------------------------");

		}
	}
}
