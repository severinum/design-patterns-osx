package strategy_pattern.phone_app;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public abstract class PhoneCameraApp {
    ShareStrategy shareStrategy;
    Set<ShareStrategy> sharingStrategies = new HashSet<>();


    public void setSharingStrategy(ShareStrategy sharingStrategy){
        this.shareStrategy = sharingStrategy;
    }

    public void addSharingStrategy(ShareStrategy shareStrategy){
        this.sharingStrategies.add(shareStrategy);
    }

    public Set<ShareStrategy> getSharingStrategies(){
        return this.sharingStrategies;
    }

    public void displaySharingStrategies(){
        if(this.sharingStrategies.size() == 0)
            System.out.println("App does not have any photo sharing options available.");
        else
            for(ShareStrategy strategy: this.sharingStrategies ){
                strategy.get();
            }
    }

    public void share(){
        shareStrategy.share();
    }

    public void take(){
        System.out.println("taking the photo.");
    }

    public void save(){
        System.out.println("Saving the photo.");
    }

    public abstract void edit();
}
