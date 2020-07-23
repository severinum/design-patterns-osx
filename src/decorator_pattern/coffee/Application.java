package decorator_pattern.coffee;

public class Application {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Soy(beverage);
        beverage = new Milk(beverage);
        beverage = new Whip(beverage);

        System.out.println("Orderd coffee : " + beverage.getDescription() + " $" + beverage.cost());
    }
}
