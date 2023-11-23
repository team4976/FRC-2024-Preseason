package frc.robot.commands;
import frc.robot.subsystems.hopper; 

public class hopperOn extends CommandBase{
    private hopper Hopper; 
    public hopperOn (hopper h){
         this.Hopper = h; 
         addRequirements(h);
    }

    @Override
    public void initialize(){
        Hopper.hopperOn();
        super.initialize();
    }

    @Override
    public boolean isFinished(){
        return true;
    }
}