package src.Behavioral.Strategy.Strategy;

public class CryStrategy implements SoundStrategy{
    @Override
    public void cry() {
        System.out.println("crying");
    }
}
