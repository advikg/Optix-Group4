package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  private WPI_TalonFX talonLeftFront = new WPI_TalonFX(Constants.Drivetrain.left_front);
  private WPI_TalonFX talonLeftRear = new WPI_TalonFX(Constants.Drivetrain.left_rear);
  private WPI_TalonFX talonRightFront = new WPI_TalonFX(Constants.Drivetrain.right_front);
  private WPI_TalonFX talonRightRear = new WPI_TalonFX(Constants.Drivetrain.right_rear);
  
  private MotorControllerGroup drivetrainRight = new MotorControllerGroup(talonRightFront, talonRightFront);
  private MotorControllerGroup drivetrainLeft = new MotorControllerGroup(talonLeftFront, talonLeftFront);
  
  public Drivetrain() {
      talonRightFront.setInverted(true);
      talonRightRear.setInverted(true);

      talonRightFront.setNeutralMode(NeutralMode.Coast);
      talonRightRear.setNeutralMode(NeutralMode.Coast);
      talonLeftFront.setNeutralMode(NeutralMode.Coast);
      talonLeftRear.setNeutralMode(NeutralMode.Coast);
  }


  public void tankDrive (double right_speed, double left_speed) {
        drivetrainRight.set(right_speed);
        drivetrainLeft.set(left_speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}