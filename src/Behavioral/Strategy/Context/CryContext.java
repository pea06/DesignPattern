package src.Behavioral.Strategy.Context;

import src.Behavioral.Strategy.Strategy.SoundStrategy;

public class CryContext {
    private SoundStrategy soundStrategy;

    public void cry() {
        soundStrategy.cry();
    }

    public void setSoundStrategy(SoundStrategy soundStrategy) {
        this.soundStrategy = soundStrategy;
    }

}
