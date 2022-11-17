package frc.robot.subsystems;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.subsystems;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem {
    @Override
    public void periodic() {
        CompressorOn();
    }
    public void CompressorOn() {
        pcmCompressor.enableDigital();
    }

    public void CompressorOff() {
        pcmCompressor.disable();
    }
    // Neo Motor Can Spark Max
    CANSparkMax neoMotorCanSparkMax = new CANSparkMax(0, MotorType.kBrushless);

    public void setNeo(double speed){
        neoMotorCanSparkMax.set(speed);
    }
}
