package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class hopper extends SubsystemBase {
    public hopper() {
    public boolean hopperRun = false;
    }
//when whatever button is pressed, run hopperToggle command
    public CommandBase hopperToggle() {
      //this gets moved to the robot constants/container later it's here for now because [???]
      public static final TalonSRX hopperMotor1 = new TalonSRX(41); //41 is the motor id
      public static final TalonSRX hopperMotor2 = new TalonSRX(45);
        
    return runOnceHopper(
        () -> {

        }); 
    }

    public void hopperOn() {
    hopperMotor1.set(ControlMode.PercentOutput, 0.2);
    hopperMotor2.set(ControlMode.PercentOutput, 0.2);
    }
   
  }