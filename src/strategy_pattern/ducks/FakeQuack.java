package strategy_pattern.ducks;

public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qfack (fake AF ha ?)");
    }
}
