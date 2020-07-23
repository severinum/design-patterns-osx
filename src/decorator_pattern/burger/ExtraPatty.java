package decorator_pattern.burger;

public class ExtraPatty extends ToppingsDecorator {
    Burger burger;

    public ExtraPatty(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Extra Patty";
    }

    @Override
    public double cost() {
        return burger.cost() + .50;
    }
}
