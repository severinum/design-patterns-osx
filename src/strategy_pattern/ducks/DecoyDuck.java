package strategy_pattern.ducks;

public class DecoyDuck extends  Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quckBehavior = new FakeQuack();
    }

    @Override
    void display() {
        System.out.println("I am just a regular decoy wooden duck");
    }
}
