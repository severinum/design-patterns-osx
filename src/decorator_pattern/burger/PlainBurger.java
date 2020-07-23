package decorator_pattern.burger;

public class PlainBurger extends Burger {

    public PlainBurger() {
        this.description = "Plain Burger";
    }

    @Override
    public double cost() {
        return 0.80;
    }
}
