package adapter_pattern.enemy;

public class EnemySpeedboat implements EnemyAttacker {
    @Override
    public void fireWeapon() {
        System.out.println("Enemy Speedboat Fired a Weapon");
    }

    @Override
    public void driveForward() {
        System.out.println("Enemy Speedboat Goes forward 20 Spaces");
    }

    @Override
    public void assignDriver(String driver) {
        System.out.println("Enemy Speedboat Swims To " + driver);
    }
}
