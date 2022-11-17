package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class IntakeSubsystem {
    DoubleSolenoid DoublePCM = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 1, 2);
    DoubleSolenoid DoublePH = new DoubleSolenoid(9, PneumaticsModuleType.REVPH, 4, 5);
    Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    Compressor phCompressor = new Compressor(1, PneumaticsModuleType.REVPH);
    public Pneumatics () {
        pitchSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.PNEUMATICS_SOLENOID_DEPLOY, Constants.PNEUMATICS_SOLENOID_RETRACT);
    }

    public void CompressorOn() {

    }
}
