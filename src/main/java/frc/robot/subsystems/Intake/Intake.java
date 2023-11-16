package frc.robot.subsystems.Intake;
import com.ctre.pheonix.motorcontrol.can.TalonSRX;

//How about txt.java
public class Intake {
    public static void main(String args[]) {
        //The lI1 class not to be confused with the Il1, the I1l, or the l1I classes.
        public class lI1 extends CommandBase {
            public final TalonSRX motor1 = new TalonSRX (deviceNumber: 1);

            public lI1() {
        //Your code here
            }
        
            @Override
            public void initialize() {
        //Your code here        
            }
        
            @Override
            public void execute() {
            //Make the motors rotate. One reversed and the other normal
            
            }
        
            @Override
            public boolean isFinished() {
        //Your code here        
            }
        
            @Override
            public void end(boolean interrupted) {
        //Your code here
            }
        }
        
    }
}
