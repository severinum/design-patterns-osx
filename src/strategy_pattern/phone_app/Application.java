package strategy_pattern.phone_app;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        PhoneCameraApp cameraApp = new BasicCameraApp();

        cameraApp.addSharingStrategy(new ShareEmail());
        cameraApp.addSharingStrategy(new ShateTXT());

        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        System.out.println("Number of sharing strategies for Basic Phone App : " + cameraApp.getSharingStrategies().size());
        for(ShareStrategy strategy : cameraApp.getSharingStrategies()){
            System.out.println("\t\tAssigning photo strategy: " + strategy.getName());
            cameraApp.setSharingStrategy(strategy);
            cameraApp.share();
        }

        System.out.println("# ----------------------------------------------------------------- #");

        PhoneCameraApp cameraPlusApp = new CameraPlusApp();

        cameraPlusApp.addSharingStrategy(new ShareEmail());
        cameraPlusApp.addSharingStrategy(new ShateTXT());
        cameraPlusApp.addSharingStrategy(new ShareSocialMedia());

        cameraPlusApp.take();
        cameraPlusApp.edit();
        cameraPlusApp.save();
        System.out.println("Number of sharing strategies for Basic Phone App : " + cameraPlusApp.getSharingStrategies().size());
        for(ShareStrategy strategy : cameraPlusApp.getSharingStrategies()){
            System.out.println("\t\tAssigning photo strategy: " + strategy.getName());
            cameraPlusApp.setSharingStrategy(strategy);
            cameraPlusApp.share();
        }

    }

}
