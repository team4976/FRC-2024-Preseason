package frc.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class Intake extends SubsystemBase {
    static public Intake instance = new Intake();

    Talon rightMotor = new Talon(channel: 1);
    Talon leftMotor = new Talon(channel: 2);

    double rightMotorSpeed = 0;
    double leftMotorSpeed = 0;

    boolean isIntaking = false;


    public void setMotor(double _rightMotorSpeed, double _leftMotorSpeed){
        rightMotorSpeed = _rightMotorSpeed;
        leftMotorSpeed = _leftMotorSpeed;

        rightMotor.set(rightMotorSpeed);
        leftMotor.set(leftMotorSpeed);
    }

    public void IntakeSomething(double motorSpeed){
        setMotor(motorSpeed, motorSpeed);
    }

    public void stop(){
        rightMotor.set(speed: 0.0);
        leftMotor.set(speed: 0.0);
        isIntaking = false;
    }
}


