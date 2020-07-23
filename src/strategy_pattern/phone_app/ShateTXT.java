package strategy_pattern.phone_app;

public class ShateTXT implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("I am sending it as txt message");
    }

    @Override
    public void get() {
        System.out.println("I can share via TEXT !!!");
    }

    @Override
    public String getName() {
        return "TXT MESSAGE Sharing Strategy";
    }
}
