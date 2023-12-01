package frc.robot.commands.nicks_commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.NicksSubSystem.test_subsystem;

public class nicks_drive_backwards_command extends CommandBase {

  Subsystem subsystem;

  public nicks_drive_backwards_command (SubsystemBase _subsystem){
    addRequirements(_subsystem);
    subsystem = _subsystem;
  }


  @Override
  public void initialize() {
    // Called when the command is initially scheduled.
  }

  
  @Override
  public void execute() {
    // Called every time the scheduler runs while the command is scheduled.
        subsystem.instance.drive(-1);
  }

  
  @Override
  public void end(boolean interrupted) {
    // Called once the command ends or is interrupted.
    subsystem.stop();
  }

  
  @Override
  public boolean isFinished() {
    // Returns true when the command should end.
    return false;
  }
    
}
