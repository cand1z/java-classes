package entities;

public class ImportedProduct extends Product {
    private Double customFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice() {
        return super.getPrice() + customFee;
    }

    @Override
    public final String priceTag() {
        return super.getName() + ", R$ " + String.format("%.2f",totalPrice()) + " (Customs fee: R$ " + customFee + ")";
    }
}
