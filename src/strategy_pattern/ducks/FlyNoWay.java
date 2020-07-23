package strategy_pattern.ducks;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly mate !");
    }
}
