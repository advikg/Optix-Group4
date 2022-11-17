package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    CANSparkMax neoMotorCanSparkMax = new CANSparkMax(0, MotorType.kBrushless);

}
