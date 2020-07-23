package strategy_pattern.phone_app;

public class ShareSocialMedia implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("I am sharing it on social media ...");
    }

    @Override
    public void get() {
        System.out.println("I can share on Social Media !!!");
    }
    @Override
    public String getName() {
        return "Social Media Sharing Strategy";
    }

}
