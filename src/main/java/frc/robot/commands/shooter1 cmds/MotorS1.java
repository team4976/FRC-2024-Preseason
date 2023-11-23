package frc.robot.commands.shooter1cmds.MotorS1.;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorS1 extends
CommandBase {

public MotorS1() {

}

    MotorSh1.set(ControlMode.PercentOutput,0.5);
    
}