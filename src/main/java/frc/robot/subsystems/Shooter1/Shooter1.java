package frc.robot.subsystems.Shooter1;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.shooter1Cmds.MotorS1;

public class Shooter1 extends SubsystemBase {

    public static final Talon MotorSh1 = new TalonSRX(deviceNumber:45); 
    public static boolean shooterOneShoot = false;
    CommandBase motor1 = new MotorS1();
    public void main(String args[]){

            // stuff goes here - Aaron
            CommandXboxController  exampleCommandController = new CommandXboxController(1);
            exampleCommandController.x().onTrue(motor1);
           

            
            if(shooterOneShoot=false){
                shooterOneShoot=true;
            }
  
            if(shooterOneShoot=true){
                shooterOneShoot=false;
            }
            
    }
//if(u==true){
//
//}
    public static void shoot(){
        if(shooterOneShoot==true){
        
            MotorSh1.set(18);
            System.out.println("Shoot Ball");
        }
       
    }
    public static void stop(){
        if(shooterOneShoot==false) {
            MotorSh1.set(0);  
        } 

}

}