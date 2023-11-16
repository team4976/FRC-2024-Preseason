package frc.robot.subsystems.Shooter2;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import javax.swing.text.JTextComponent.KeyBinding;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
public class shooter2 extends SubsystemBase{
public static int m_runflywheelid = 30;
    public shooter2(){}
    public static final Talon m_ShooterTalon = new Talon(m_runflywheelid);
    m_runflywheelid.set(ControlMode.PercentOutput,1);
    public void runflywheel(){
m_runflywheel.set();
}
}



    


    

