package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class hopper extends SubsystemBase {
    public hopper() {}
    public boolean hopperRun = false;

//when whatever button is pressed, run hopperToggle command
    public CommandBase hopperToggle() {
    if (!hopperRun){
        hopperRun = true;
    }
    else {
        hopperRun = false;
    }
    //the hopperRun command needs to be somewhere else, as a *command* command
    /*because it needs to run continuously, and constantly check
    the hopperRun boolean to see if it needs to run motors*/

    return runOnce(
        () -> {
          /* one-time action goes here *///unsure if we actually need this? 
          //i'm going to leave it in case removing it breaks something
        });
  }
   /* public void  hopperRun() {
    if (hopperRun){
        //insert command to run motor(s) here
    }
    else {
        //insert command to stop motor(s) here
    }
    */
  }
}