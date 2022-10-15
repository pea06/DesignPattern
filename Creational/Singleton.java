package Creational;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        //생성자를 외부에서 호출 하지 못하게 private 으로 지정 한다
    }

    public static Singleton getInstance(){
        return instance;
    }

}
