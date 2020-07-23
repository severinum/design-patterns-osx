package decorator_pattern.burger;

public class Tomato extends ToppingsDecorator {
    Burger burger;

    public Tomato(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Tomato";
    }

    @Override
    public double cost() {
        return burger.cost() + .10;
    }
}
