package strategy_pattern.ducks;

public class MallardDuck extends  Duck {

    public MallardDuck() {
        quckBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I am Mallard Duck");
    }
}
