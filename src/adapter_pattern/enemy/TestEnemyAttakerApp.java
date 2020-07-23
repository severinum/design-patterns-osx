package adapter_pattern.enemy;

import java.util.ArrayList;
import java.util.List;

public class TestEnemyAttakerApp {

    public static void main(String[] args) {
        EnemyTank enemyTank = new EnemyTank();
        EnemySpeedboat enemySpeedboat = new EnemySpeedboat();

        EnemyRobot enemyRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);

        System.out.println("-- ENEMY TANK --");
        enemyTank.driveForward();
        enemyTank.fireWeapon();
        enemyTank.assignDriver("Charlie");


        System.out.println("-- ENEMY SPEEDBOAT --");
        enemySpeedboat.driveForward();
        enemySpeedboat.fireWeapon();
        enemySpeedboat.assignDriver("Charlie");



        System.out.println("-- ENEMY ROBOT (ADAPTEE) --");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
        robotAdapter.assignDriver("Chucky");


        System.out.println(" -------------------- ADDING ALL 3 TO ARRAY LIST ---------------------");
        List<EnemyAttacker> enemies = new ArrayList<>();
        enemies.add(enemyTank);
        enemies.add(enemySpeedboat);
        enemies.add(robotAdapter);

        for(EnemyAttacker attacker: enemies){
            attacker.driveForward();
            attacker.fireWeapon();
            attacker.assignDriver("Brandon Moorey");
            System.out.println("#------#");
        }



    }
}
