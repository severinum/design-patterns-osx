package strategy_pattern.ducks;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quckBehavior = new FakeQuack();
    }

    @Override
    void display() {
        System.out.println("I am a model duck.");
    }
}
