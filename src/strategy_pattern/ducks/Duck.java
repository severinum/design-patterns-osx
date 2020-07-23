package strategy_pattern.ducks;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quckBehavior;

    public  Duck(){

    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuckBehavior(QuackBehavior quckBehavior){
        this.quckBehavior = quckBehavior;
    }

    abstract void display();

    public void peformFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quckBehavior.quack();
    }

    public void swim(){
        System.out.println("All fucks float, even decoys!");
    }
}
