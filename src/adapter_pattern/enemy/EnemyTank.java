package adapter_pattern.enemy;

public class EnemyTank implements EnemyAttacker {
    @Override
    public void fireWeapon() {
        System.out.println("Enemy Tank Makes 20 Points Damage");
    }

    @Override
    public void driveForward() {
        System.out.println("Enemy Tank Moves 5 spaces.");
    }

    @Override
    public void assignDriver(String driver) {
        System.out.println("Enemy Tank have driver : " + driver);
    }
}
