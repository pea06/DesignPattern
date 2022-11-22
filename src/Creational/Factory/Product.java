package src.Creational.Factory;

public abstract class Product {

    public abstract String getNameProduct();
    public abstract String getNum();
    public abstract String getType();

    @Override
    public String toString() {
        return "Name= "+this.getNameProduct()+", Num="+this.getNum()+", Type="+this.getType();
    }
}
