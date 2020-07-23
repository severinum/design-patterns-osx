package strategy_pattern.ducks;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quckBehavior = new Squeak();
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quckBehavior = quackBehavior;
    }

    @Override
    void display() {
        System.out.println("I am a rubber duckie !");
    }
}
