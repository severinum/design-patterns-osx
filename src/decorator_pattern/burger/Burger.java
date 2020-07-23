package decorator_pattern.burger;

public abstract class Burger {
    String description = "<< Unknown Burger >>";
    double price = 0;

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
