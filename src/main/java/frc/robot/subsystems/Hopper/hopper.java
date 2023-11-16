package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class hopper extends SubsystemBase {
    public hopper() {
    public boolean hopperRun = false;
    }
//when whatever button is pressed, run hopperToggle command
    public CommandBase hopperToggle() {

    return runOnceHopper(
        () -> {
          if (!hopperRun){
            hopperRun = true;
        }
        else {
            hopperRun = false;
        }
        }); 
    }

    public boolean hopperRunning() {
    // this is in the example subsystem. we might want it? 
    return hopperRun;
    }

    @Override
    public void hopperPeriodicRun() {
      if (hopperRun){
        //spin motor. unsure what commands do that sorry.
      }
    }
   
  }