package src.Creational.Factory;

public class Test {
    public static void main(String[] args) {
        Product colorTv = ProductFactory.getProduct("colorTv","1001","tv");
        Product digitalClock = ProductFactory.getProduct("digitalClock","1002","clock");
        System.out.println("Factory colorTv :"+colorTv);
        System.out.println("Factory digitalClock :"+digitalClock);
    }
}
