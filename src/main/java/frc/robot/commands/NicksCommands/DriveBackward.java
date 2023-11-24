package frc.robot.commands.NicksCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.NicksSubSystem.test_subsystem;

public class DriveBackward extends CommandBase {

    @Override
    public void initialize(){
        test_subsystem.instance.drive(-1);
    }
    
}
