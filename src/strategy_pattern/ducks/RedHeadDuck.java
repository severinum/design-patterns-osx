package strategy_pattern.ducks;

public class RedHeadDuck extends  Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quckBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I am a real Red Head fuck");
    }
}
