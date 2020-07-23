package decorator_pattern.burger;

public class BurgersOrderingApplication {
    public static void main(String[] args) {

        double orderTotal= 0 ;

        Burger burger = new PlainBurger();
        burger = new ExtraPatty(burger);
        burger = new Cheese(burger);

        System.out.println("Ordered burger : " + burger.getDescription() + " for $" + burger.cost());

        Burger burger1 = new PlainBurger();
        burger1 = new Cheese(burger1);
        burger1 = new Tomato(burger1);

        System.out.println("Ordered burger : " + burger1.getDescription() + " for $" + burger1.cost());

        Burger burger2 = new BigMack();
        burger2 = new Cheese(burger2);
        burger2 = new Tomato(burger2);
        burger2 = new ExtraPatty(burger2);

        System.out.println("Ordered burger : " + burger2.getDescription() + " for $" + burger2.cost());

        orderTotal = burger.cost() + burger1.cost() + burger2.cost();
        System.out.println("Order total : " + orderTotal);
    }
}
