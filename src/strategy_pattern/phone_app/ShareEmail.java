package strategy_pattern.phone_app;

public class ShareEmail implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("I am sending photo via email ...");
    }

    @Override
    public void get() {
        System.out.println("I can share via EMAIL !!!");
    }

    @Override
    public String getName() {
        return "Email Sharing Strategy";
    }
}
