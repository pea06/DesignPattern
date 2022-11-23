package src.Behavioral.Strategy.Strategy;

public class NoCryStrategy implements SoundStrategy{
    @Override
    public void cry() {
        System.out.println("not crying");
    }
}
