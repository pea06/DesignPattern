package src.Creational.Factory;

public class ProductFactory {
    public static Product getProduct(String productName, String num, String type) {
        if("Tv".equalsIgnoreCase(type)) {
            return new Tv(productName,num,type);
        } else if ("Clock".equalsIgnoreCase(type)) {
            return new Clock(productName,num,type);
        }
        return null;
    }
}
//equalsIgnoreCase : 대소문자 구분없이 문자열을 구분하기 위해 사용