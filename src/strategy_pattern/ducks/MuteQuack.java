package strategy_pattern.ducks;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< SILENCE >>");
    }
}
