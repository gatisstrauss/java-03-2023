package io.codelex.oop.summary;

import java.util.List;

public class Invoice {
    private final Order order;
    private final String invoiceNumber;
    private InvoiceStatus invoiceStatus;
    private double priceWithoutVat;
    private double priceWithVat;

    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        if (order == null || order.getItems().isEmpty()) {
            throw new WrongOrderException("Cannot create invoice with an empty order.");
        }
        this.order = order;
        this.invoiceNumber = invoiceNumber;
        this.invoiceStatus = InvoiceStatus.APPROVED;
        calculate();
    }

    private void calculate() {
        List<SellableThing> items = order.getItems();
        for (SellableThing item : items) {
            if (item != null) {
                priceWithoutVat += item.getPrice();
            }
        }
        double vat = priceWithoutVat * 0.21;
        priceWithVat = priceWithoutVat + vat;
    }

    public void sent() {
        invoiceStatus = InvoiceStatus.SENT;
    }

    public String formattedInvoice() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INVOICE NUMBER: ").append(invoiceNumber).append("\n");
        stringBuilder.append("STATUS: ").append(invoiceStatus).append("\n");

        List<SellableThing> items = order.getItems();
        for (int i = 0; i < items.size(); i++) {
            stringBuilder.append(i + 1).append(". ").append(items.get(i).getFullInfo()).append("\n");
        }

        stringBuilder.append("SUM: ").append(String.format("%.2f EUR", priceWithoutVat)).append("\n");
        stringBuilder.append("VAT (21%): ").append(String.format("%.2f EUR", (priceWithVat - priceWithoutVat))).append("\n");
        stringBuilder.append("TOTAL: ").append(String.format("%.2f EUR", priceWithVat)).append("\n");

        return stringBuilder.toString();
    }
}
