package frc.robot.subsystems.Intake;
import java.sql.CallableStatement;

import com.ctre.pheonix.motorcontrol.can.TalonSRX;

//How about txt.java
public class Intake {
    public static void main(String args[]) {
        //The lI1 class not to be confused with the Il1, the I1l, or the l1I classes.
        public class lI1 extends CommandBase {
            //These could be moved to constants folder
            //Declared motor, they uses 41 and 45
            public final TalonSRX motor1 = new TalonSRX (deviceNumber: 41);
            public final TalonSRX motor2 = new TalonSRX (deviceNumber: 45);
            public lI1() {
        
            }
        
            @Override
            public void initialize() {
        //Your code here
        //Not being used        
            }
        
            @Override
            public void execute() {
            //Editing motor settings
            public static final TalonSRX m_IntakeTalonLeft = new TalonSRX(41);
            public static final TalonSRX m_IntakeTalonRight = new TalonSRX(45);
            //Declare motors
            m_IntakeTalonRight.setInverted(true);
            //OneInvertedIntakeMotor
            m_IntakeTalonLeft.set(ControlMode.PercentOutput,outputValue: 0.5);
            m_IntakeTalonRight.set(ControlMode.PercentOutput,outputValue: 0.5);
            //Output %
            
            //I still don't know how to turn a motor
            }
        
            @Override
            public boolean isFinished() {
        //Your code here    
        //Unused    
            }
        
            @Override
            public void end(boolean interrupted) {
        //Your code here
        //Unused
            }
        }
        
    }
}
