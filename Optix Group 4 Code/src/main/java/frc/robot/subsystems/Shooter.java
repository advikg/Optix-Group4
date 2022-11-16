// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */
    private WPI_TalonFX talonLeft = new WPI_TalonFX(Constants.Shooter.left_shooter_motor); 
    private WPI_TalonFX talonRight = new WPI_TalonFX(Constants.Shooter.right_shooter_motor);

    private MotorControllerGroup shooter = new MotorControllerGroup(talonLeft, talonRight);

    public Shooter() {
        talonLeft.setInverted(true);
        talonRight.setInverted(false);
    }


    public void set_speed (double speed) {
        shooter.set(speed);
    }
    // methodw are camel cased

}