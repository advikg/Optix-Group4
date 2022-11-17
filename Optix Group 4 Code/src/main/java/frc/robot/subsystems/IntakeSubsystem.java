package frc.robot.subsystems;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem {
    Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    Compressor phCompressor = new Compressor(1, PneumaticsModuleType.REVPH);

    // Neo Motor Can Spark Max
    CANSparkMax neoMotorCanSparkMax = new CANSparkMax(0, MotorType.kBrushless);

    public void setNeo(double speed){
        neoMotorCanSparkMax.set(speed);
    }

    public void CompressorOn() {
    }
}
