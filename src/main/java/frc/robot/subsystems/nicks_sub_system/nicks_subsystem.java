package frc.robot.subsystems.nicks_sub_system;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class nicks_subsystem extends SubsystemBase {
    static public nicks_subsystem instance = new test_subsystem();

    Talon motor_Right = new Talon(1);
    Talon motor_Left = new Talon(2);

    double motor_speed_right = 0.0;
    double motor_speed_left = 0.0;

    boolean isMoving = false;
    boolean isBackwards = false;
    boolean isLeft = false;

    public test_subsystem(){
    }

    public void drive(double _motor_speed){
        setMotor(_motor_speed,_motor_speed);
        
    }
    
    public void driveArc(double _motor1_speed, double _motor2_speed){
        setMotor(_motor1_speed,_motor2_speed);
        
    }

    public void setMotor(double _motor_speed_left , double _motor_speed_right){
        motor_speed_left = _motor_speed_left;
        motor_speed_right = _motor_speed_right;

        motor_Left.set(motor_speed_left);
        motor_Right.set(motor_speed_right);


        isMoving = (motor_speed_left != 0 || motor_speed_right != 0);
        isBackwards = (motor_speed_left <= 0) && (motor_speed_left <= 0);
        isLeft = motor_speed_right > motor_speed_left;
    }

    public void stop(){
        motor_Left.set(0.0);
        motor_Right.set(0.0);
        isMoving = false;
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


}
