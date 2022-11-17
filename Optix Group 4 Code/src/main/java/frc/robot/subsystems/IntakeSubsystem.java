package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase{
    DoubleSolenoid DoublePCM = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 1, 2);
    DoubleSolenoid DoublePH = new DoubleSolenoid(9, PneumaticsModuleType.REVPH, 4, 5);
    Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    Compressor phCompressor = new Compressor(1, PneumaticsModuleType.REVPH);

    // Neo Motor Can S
    CANSparkMax neoMotorCanSparkMax = new CANSparkMax(0, MotorType.kBrushless);

    public Pneumatics () {
        pitchSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.PNEUMATICS_SOLENOID_DEPLOY, Constants.PNEUMATICS_SOLENOID_RETRACT);
    }

    public void CompressorOn() {

    }
}
