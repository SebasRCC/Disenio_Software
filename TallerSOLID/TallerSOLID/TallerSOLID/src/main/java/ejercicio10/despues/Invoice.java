package ejercicio10.despues;
/**
 * 
 * @author Sebastián Ramos
 */

public class Invoice  {
    private InvoiceCalculator calculator;
    private InvoicePrinter printer;
    private InvoiceSaver saver;

    public Invoice(InvoiceCalculator calculator, InvoicePrinter printer, InvoiceSaver saver) {
        this.calculator = calculator;
        this.printer = printer;
        this.saver = saver;
    }
    public void generateInvoice() {
        calculator.calculateTotal();
        printer.printInvoice();
        saver.saveToFile("invoice.txt");
    }
    
}
