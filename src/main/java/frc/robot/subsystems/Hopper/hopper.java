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
          /*if (!hopperRun){
            hopperRun = true;
        }
        else {
            hopperRun = false;
        }*/
        //xbox toggle command, easier way to do that
        }); 
    }

    public boolean hopperRunning() {
    // this is in the example subsystem. we might want it? 
    return hopperRun;
    }

    @Override
    public void hopperPeriodicRun() {
      if (hopperRun){
        //set motor PercentOutput (?) to [idk what numbers we want here. what is appropriate]
      }
      else {
        //set motor PercentOutput to 0
      }
      //unsure how to format those commands, pretty sure they exist
    }
   
  }