package frc.robot.commands.shooter1Cmds;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter1.Shooter1;

public class MotorS1 extends CommandBase {

        @Override
        public void execute(){
            Shooter1.shoot();
        }

        @Override
        public boolean isFinished(){
            Shooter1.stop();
            return false;
        }

}