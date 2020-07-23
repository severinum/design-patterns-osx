package strategy_pattern.ducks;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulatorApplication {

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();

        MallardDuck mallardDuck = new MallardDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();

        QuackBehavior squeak = () -> System.out.println("SQUEAK ! SQUEAK !");
        FlyBehavior cantFly = () -> System.out.println("I can not fly, sorry chaps !");

        RubberDuck rubberDuck = new RubberDuck(cantFly, squeak);
        Duck duck  = new ModelDuck();

        ducks.add(mallardDuck);
        ducks.add(redHeadDuck);
        ducks.add(rubberDuck);
        ducks.add(duck);

        for(Duck d: ducks){
            d.display();
            d.peformFly();
            d.performQuack();
            System.out.println("----------------------------------");
        }
    }
}
