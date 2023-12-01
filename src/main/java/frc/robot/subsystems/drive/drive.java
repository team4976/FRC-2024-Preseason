package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

//this is a test, i am trying to learn how to do this properly, 
//this needs to be looked over by someone who knows how this works
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class drive extends CommandBase {

    public static final TalonSRX drive1 =new TalonSRX(1);//there are 2 moters hooked up to the current
    public static final TalonSRX drive2 =new TalonSRX(2);//drive train from what i saw on the bot

public void driveForword(){



}

boolean driveForwardBoolean;

@Override
public void initialize(){
    super.initialize();
driveForwardBoolean=true;
}

@Overide
public void execute(){
if (driveForwardBoolean = true){
    //move forward stuff
}

if (driveForwardBoolean = false){
    //no move forward stuff
}
}


@Override
public boolean isfinished(){

}

@Overide
public void end(boolean interrupted){
driveForwardBoolean=false;
}

}
