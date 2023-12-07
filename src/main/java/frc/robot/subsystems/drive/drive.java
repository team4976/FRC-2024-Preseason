package frc.robot.subsystems;//CommandBase
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

//this is going to be tank drive

//this is a test, i am trying to learn how to do this properly, 
//this needs to be looked over by someone who knows how this works

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class drive extends CommandBase {

    public static final TalonSRX drive1 =new TalonSRX(1);
    public static final TalonSRX drive2 =new TalonSRX(2);
    public static final TalonSRX drive1 =new TalonSRX(3);
    public static final TalonSRX drive2 =new TalonSRX(4);
    public static final TalonSRX drive1 =new TalonSRX(3);
    public static final TalonSRX drive2 =new TalonSRX(4);

    
public void driveForword(){

double setMotorSpeed1 = 0.0;//left
double setMotorSpeed2 = 0.0;//left
double setMotorSpeed3 = 0.0;//left
double setMotorSpeed4 = 0.0;//right
double setMotorSpeed5 = 0.0;//right
double setMotorSpeed6 = 0.0;//right
    
}

boolean driveForwardBoolean, movingBoolean;

@Override
public void initialize(){
    super.initialize();
driveForwardBoolean=true;
}

@Overide
public void execute(){
if (driveForwardBoolean = true){//if the stick is forward the bot will go forward
    
    setMotorSpeed1=1.0;//left
    setMotorSpeed2=1.0;//left
    setMotorSpeed3=1.0;//left
    setMotorSpeed4=1.0;//right
    setMotorSpeed5=1.0;//right
    setMotorSpeed6=1.0;//right
}

if (driveForwardBoolean = false){//if not it will stop moving forward
    
    setMotorSpeed1=0.0;//left
    setMotorSpeed2=0.0;//left
    setMotorSpeed3=0.0;//left
    setMotorSpeed4=0.0;//right
    setMotorSpeed5=0.0;//right
    setMotorSpeed6=0.0;//right
}
    
}


@Override
public boolean isfinished(){

}

@Overide
public void end(boolean interrupted){
driveForwardBoolean=false;//drive forward is false
    
setMotorSpeed1=0.0;//left        the speed of the motors are 0.0, thay are not moving
setMotorSpeed2=0.0;//left
setMotorSpeed3=0.0;//left
setMotorSpeed4=0.0;//right
setMotorSpeed5=0.0;//right
setMotorSpeed6=0.0;//right
}

public void driveLeft(){
    
double setMotorSpeed1 = 0.0;//left
double setMotorSpeed2 = 0.0;//left
double setMotorSpeed3 = 0.0;//left
double setMotorSpeed4 = 0.0;//right
double setMotorSpeed5 = 0.0;//right
double setMotorSpeed6 = 0.0;//right
    
}

    //} this is needed if below is deleted
boolean driveLeftBoolean;

@Override
public void initialize(){
    super.initialize();
driveLeftBoolean=true;
}

@Overide
public void execute(){
if (driveLeftBoolean = true){//if the stick is left it will go left
    
    setMotorSpeed1=1.0;//left
    setMotorSpeed2=1.0;//left
    setMotorSpeed3=1.0;//left
    setMotorSpeed4=0.5;//right
    setMotorSpeed5=0.5;//right
    setMotorSpeed6=0.5;//right
}

if (driveLeftBoolean = false){//if not it will stop moving forward
    
    setMotorSpeed1=0.0;//left
    setMotorSpeed2=0.0;//left
    setMotorSpeed3=0.0;//left
    setMotorSpeed4=0.0;//right
    setMotorSpeed5=0.0;//right
    setMotorSpeed6=0.0;//right
}
    
}


@Override
public boolean isfinished(){

}

@Overide
public void end(boolean interrupted){
movingBoolean=false;//drive forward is false
    
setMotorSpeed1=0.0;//left        the speed of the motors are 0.0, thay are not moving
setMotorSpeed2=0.0;//left
setMotorSpeed3=0.0;//left
setMotorSpeed4=0.0;//right
setMotorSpeed5=0.0;//right
setMotorSpeed6=0.0;//right
}
}
