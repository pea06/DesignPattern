package src.Behavioral.Strategy;

import src.Behavioral.Strategy.Context.CryContext;
import src.Behavioral.Strategy.Strategy.CryStrategy;
import src.Behavioral.Strategy.Strategy.NoCryStrategy;

public class Test {
    public static void main(String[] args) {
        CryContext cry = new Cry();
        CryContext noCry = new NoCry();

        cry.setSoundStrategy(new CryStrategy());
        noCry.setSoundStrategy(new NoCryStrategy());

        cry.cry();
        noCry.cry();

        //noCry의 전략변경
        noCry.setSoundStrategy(new CryStrategy());
        noCry.cry();
    }
}
