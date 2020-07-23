package decorator_pattern.burger;

public class Cheese extends ToppingsDecorator {

    Burger burger;

    public Cheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return burger.cost() + 0.10;
    }
}
