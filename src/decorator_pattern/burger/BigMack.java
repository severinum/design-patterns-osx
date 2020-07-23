package decorator_pattern.burger;

public class BigMack extends Burger {

    public BigMack() {
        this.description = "Big Mack";
    }

    @Override
    public double cost() {
        return 1.9;
    }
}
