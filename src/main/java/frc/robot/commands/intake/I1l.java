package frc.robot.commands.intake;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class I1l extends CommandBase {
    @Override
    public void execute (){
                //Editing motor settings
            //These could be moved to constants folder
            //Declared motor, they uses 41 and 45
            public   TalonSRX m_IntakeTalonLeft = new TalonSRX(deviceNumber: 41);
            public final  TalonSRX m_IntakeTalonRight = new TalonSRX(deviceNumber: 45);
            //Declare motors
            m_IntakeTalonRight
        
            m_IntakeTalonRight.setInverted(true);
            //OneInvertedIntakeMotor
            m_IntakeTalonLeft.set(ControlMode.PercentOutput,outputValue: 0.5);
            m_IntakeTalonRight.set(ControlMode.PercentOutput,outputValue: 0.5);
            //Output %  
            //I still don't know how to turn a motor
            }
}
    

