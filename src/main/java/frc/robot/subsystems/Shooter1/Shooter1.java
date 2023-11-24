package frc.robot.subsystems.Shooter1;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class Shooter1 extends SubsystemBase {

    public static final Talon MotorSh1 = new TalonSRX(deviceNumber:45); 
    public boolean shooterOneShoot = false;

    public void main(String args[]){

            // stuff goes here - Aaron
            CommandXboxController exampleCommandController = new CommandXboxController(1);
            exampleCommandController.x(shooterOneShoot.onTrue).onTrue(MotorS1,shooterOneShoot = true);
            exampleCommandController.x(shooterOneShoot.onTrue).onTrue(MotorS1);
            

    }

    static public void shoot(){
        MotorSh1.set(18);
        System.out.println("Shoot Ball");

    }

    static public void stop(){
    MotorSh1.set(0);
    }
    
    {
        
    }

}

