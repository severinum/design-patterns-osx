package adapter_pattern.enemy;

public class EnemyRobot {

    public void smashWithHands(){
        System.out.println("Enemy Robot Does 15 Damage With Hands");
    }

    public void walkForward(){
        System.out.println("Enemy Robot Walks 6 Spaces Forward");
    }

    public void reactToHuman(String driverName){
        System.out.println("Enemy Robot Jumps Over the " + driverName);
    }
}
