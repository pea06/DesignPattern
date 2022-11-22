package src.Creational.Factory;

public class Clock extends Product{

    private String productName;
    private String num;
    private String type;

    public Clock(String productName, String num, String type) {
        this.productName = productName;
        this.num = num;
        this.type = type;
    }

    public String getNameProduct() {
        return this.productName;
    }

    @Override
    public String getNum() {
        return this.num;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
