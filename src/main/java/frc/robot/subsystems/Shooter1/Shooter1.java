package frc.robot.subsystems.Shooter1;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter1 extends SubsystemBase {
    public Shooter1() {}
    public boolean shooterOneShoot = false;
}   
public class Shooter1{
    public void main(String args[]){

            // stuff goes here - Aaron
            CommandXboxController exampleCommandController = new CommandXboxController(1);
            exampleCommandController.x().onTrue();

    }
    
    {
        
    }

}

